package typings.materialUiTypes

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    }}}
    */
  @js.native
  trait ConsistentWith[DecorationTargetProps, InjectedProps] extends StObject
  
  type GenerateStringUnion[T] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: true extends T[Key]? Key : never}[keyof T] */ js.Any, 
    String
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, K>> : never
    }}}
    */
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OverridableStringUnion[T, U] = GenerateStringUnion[Overwrite[T, U]]
  
  type Overwrite[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ Any, 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[Any, ComponentProps[Any]], 
        /* keyof InjectedProps */ String
      ]) & AdditionalProps
    ]
  ]
}
