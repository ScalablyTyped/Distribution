package typings.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  @JSName("$id")
  var $id: js.UndefOr[js.Any] = js.undefined
}

object AnonId {
  @scala.inline
  def apply($id: js.Any = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if ($id != null) __obj.updateDynamic("$id")($id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

