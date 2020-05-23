package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.materialUiCore.materialUiCoreStrings.ConsistentWith with org.scalablytyped.runtime.TopLevel[js.Any]
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Overwrite[T, U] = (typings.materialUiCore.mod.Omit[T, /* keyof U */ java.lang.String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    typings.react.mod.ComponentType[
      (typings.materialUiCore.mod.Omit[
        typings.react.mod.global.JSX.LibraryManagedAttributes[_, typings.materialUiCore.mod.PropsOf[_]], 
        /* keyof InjectedProps */ java.lang.String
      ]) with AdditionalProps
    ]
  ]
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: java.lang.String */, Removals /* <: /* keyof C */ java.lang.String */] = (typings.materialUiCore.mod.Omit[C, typings.materialUiCore.materialUiCoreStrings.classes | Removals]) with typings.materialUiCore.withStylesMod.StyledComponentProps[ClassKey] with typings.materialUiCore.anon.ClassName
}
