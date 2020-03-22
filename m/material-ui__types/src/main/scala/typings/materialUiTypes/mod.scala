package typings.materialUiTypes

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod._Global_.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.materialUiTypes.materialUiTypesStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    ComponentType[
      (Omit[LibraryManagedAttributes[_, ComponentProps[_]], String]) with AdditionalProps
    ]
  ]
}

