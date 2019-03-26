package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperMod {
  type CustomCommands[T] = T with immutabilityDashHelperLib.Anon_NoInferenceCustomCommandsBrand
  /* Rewritten from type alias, can be one of: 
    - immutabilityDashHelperLib.ObjectSpec[T, C]
    - immutabilityDashHelperLib.SetSpec[js.Any]
    - immutabilityDashHelperLib.MapSpec[js.Any, js.Any]
    - immutabilityDashHelperLib.ArraySpec[js.Any, C]
    - immutabilityDashHelperLib.Anon_Set[T]
    - immutabilityDashHelperLib.Anon_Apply[T]
    - js.Function1[/ * v * / T, T]
    - js.Any
  */
  type Spec[T, C /* <: CustomCommands[js.Object] */] = (_Spec[T, C]) | immutabilityDashHelperLib.SetSpec[js.Any] | (immutabilityDashHelperLib.MapSpec[js.Any, js.Any]) | (immutabilityDashHelperLib.ArraySpec[js.Any, C]) | (js.Function1[/* v */ T, T]) | js.Any | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with js.Any)
}
