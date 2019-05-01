package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperMod {
  type CustomCommands[T] = T with immutabilityDashHelperLib.Anon_NoInferenceCustomCommandsBrand
  /* Rewritten from type alias, can be one of: 
    - immutabilityDashHelperLib.Anon_Toggle[T]
    - immutabilityDashHelperLib.Anon_Unset[T]
    - immutabilityDashHelperLib.Anon_Merge[T]
    - / * import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    * / immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with T
  */
  type ObjectSpec[T, C /* <: CustomCommands[js.Object] */] = (_ObjectSpec[T, C]) | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    */ immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with T)
  /* Rewritten from type alias, can be one of: 
    - ObjectSpec[T, C]
    - SetSpec[js.Any]
    - MapSpec[js.Any, js.Any]
    - ArraySpec[js.Any, C]
    - immutabilityDashHelperLib.Anon_Set[T]
    - immutabilityDashHelperLib.Anon_Apply[T]
    - js.Function1[/ * v * / T, T]
    - js.Any
  */
  type Spec[T, C /* <: CustomCommands[js.Object] */] = (_Spec[T, C]) | SetSpec[js.Any] | (MapSpec[js.Any, js.Any]) | (ArraySpec[js.Any, C]) | (js.Function1[/* v */ T, T]) | js.Any | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    */ immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with T)
}
