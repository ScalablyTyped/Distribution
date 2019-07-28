package typings.immutabilityDashHelper

import typings.immutabilityDashHelper.Anon_NoInferenceCustomCommandsBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperMod {
  type CustomCommands[T] = T with Anon_NoInferenceCustomCommandsBrand
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityDashHelper.Anon_Toggle[T]
    - typings.immutabilityDashHelper.Anon_Unset[T]
    - typings.immutabilityDashHelper.Anon_Merge[T]
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    * / typings.immutabilityDashHelper.immutabilityDashHelperStrings.ObjectSpec with T
  */
  type ObjectSpec[T, C /* <: CustomCommands[js.Object] */] = (_ObjectSpec[T, C]) | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    */ typings.immutabilityDashHelper.immutabilityDashHelperStrings.ObjectSpec with T)
  /* Rewritten from type alias, can be one of: 
    - typings.immutabilityDashHelper.immutabilityDashHelperMod.ObjectSpec[T, C]
    - typings.immutabilityDashHelper.immutabilityDashHelperMod.SetSpec[js.Any]
    - typings.immutabilityDashHelper.immutabilityDashHelperMod.MapSpec[js.Any, js.Any]
    - typings.immutabilityDashHelper.immutabilityDashHelperMod.ArraySpec[js.Any, C]
    - typings.immutabilityDashHelper.Anon_Set[T]
    - typings.immutabilityDashHelper.Anon_Apply[T]
    - js.Function1[/ * v * / T, T]
    - js.Any
  */
  type Spec[T, C /* <: CustomCommands[js.Object] */] = (_Spec[T, C]) | SetSpec[js.Any] | (MapSpec[js.Any, js.Any]) | (ArraySpec[js.Any, C]) | (js.Function1[/* v */ T, T]) | js.Any | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    */ typings.immutabilityDashHelper.immutabilityDashHelperStrings.ObjectSpec with T)
}
