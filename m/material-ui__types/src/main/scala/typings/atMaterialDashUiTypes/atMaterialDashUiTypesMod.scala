package typings.atMaterialDashUiTypes

import typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod._Global_.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/types", JSImport.Namespace)
@js.native
object atMaterialDashUiTypesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait And[A, B, C] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait IsAny[T] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait Or[A, B, C] extends js.Object
  
  type CoerceEmptyInterface[T] = T | js.Object
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.atMaterialDashUiTypes.atMaterialDashUiTypesStrings.ConsistentWith with js.Any
  type IsEmptyInterface[T] = And[`false` | `true`, `false` | `true`, `true` | `false`]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[ComponentType[js.Object], ComponentProps[ComponentType[js.Object]]], 
        String
      ]) with AdditionalProps
    ]
  ]
}

