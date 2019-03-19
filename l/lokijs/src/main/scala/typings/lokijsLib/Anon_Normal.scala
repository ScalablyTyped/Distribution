package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Normal extends js.Object {
  var serializationMethod: js.UndefOr[lokijsLib.lokijsLibStrings.normal | lokijsLib.lokijsLibStrings.pretty] = js.undefined
}

object Anon_Normal {
  @scala.inline
  def apply(serializationMethod: lokijsLib.lokijsLibStrings.normal | lokijsLib.lokijsLibStrings.pretty = null): Anon_Normal = {
    val __obj = js.Dynamic.literal()
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Normal]
  }
}

