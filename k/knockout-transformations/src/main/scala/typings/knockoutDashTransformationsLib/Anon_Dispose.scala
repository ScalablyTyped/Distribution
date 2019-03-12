package typings
package knockoutDashTransformationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose[TResult] extends js.Object {
  var mappedValue: TResult
  def dispose(): scala.Unit
}

object Anon_Dispose {
  @scala.inline
  def apply[TResult](dispose: () => scala.Unit, mappedValue: TResult): Anon_Dispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dispose[TResult]]
  }
}

