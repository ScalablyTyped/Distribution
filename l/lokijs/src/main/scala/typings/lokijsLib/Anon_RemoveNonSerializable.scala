package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveNonSerializable extends js.Object {
  var removeNonSerializable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RemoveNonSerializable {
  @scala.inline
  def apply(removeNonSerializable: js.UndefOr[scala.Boolean] = js.undefined): Anon_RemoveNonSerializable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeNonSerializable)) __obj.updateDynamic("removeNonSerializable")(removeNonSerializable)
    __obj.asInstanceOf[Anon_RemoveNonSerializable]
  }
}

