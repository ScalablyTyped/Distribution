package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.materialUiCore.materialUiCoreStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Overwrite[T, U] = (typings.materialUiCore.mod.Omit[T, java.lang.String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    typings.react.mod.ComponentType[
      (typings.materialUiCore.mod.Omit[
        typings.react.mod._Global_.JSX.LibraryManagedAttributes[_, typings.materialUiCore.mod.PropsOf[_]], 
        java.lang.String
      ]) with AdditionalProps
    ]
  ]
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: java.lang.String */, Removals /* <: java.lang.String */] = (typings.materialUiCore.mod.Omit[C, typings.materialUiCore.materialUiCoreStrings.classes | Removals]) with typings.materialUiCore.withStylesMod.StyledComponentProps[ClassKey] with typings.materialUiCore.AnonClassName
}
