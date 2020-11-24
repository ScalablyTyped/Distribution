package typings.materialUiTypes

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.materialUiTypes.materialUiTypesStrings.ConsistentWith with TopLevel[js.Any]
  
  type GenerateStringUnion[T] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: true extends T[Key]? Key : never}[keyof T] */ js.Any, 
    String
  ]
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OverridableStringUnion[T, U] = GenerateStringUnion[Overwrite[T, U]]
  
  type Overwrite[T, U] = (Omit[T, /* keyof U */ String]) with U
  
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    ComponentType[
      (Omit[LibraryManagedAttributes[_, ComponentProps[_]], /* keyof InjectedProps */ String]) with AdditionalProps
    ]
  ]
}
