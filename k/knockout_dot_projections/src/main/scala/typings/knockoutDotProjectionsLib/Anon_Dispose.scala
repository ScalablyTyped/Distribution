package typings
package knockoutDotProjectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose[TResult] extends js.Object {
  var mappedValue: TResult
  def dispose(): scala.Unit
}

object Anon_Dispose {
  @scala.inline
  def apply[TResult](dispose: js.Function0[scala.Unit], mappedValue: TResult): Anon_Dispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = dispose, mappedValue = mappedValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dispose[TResult]]
  }
}

