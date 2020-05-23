package typings.jsonSchemaMergeAllof.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  @JSName("$id")
  var $id: js.UndefOr[js.Any] = js.undefined
}

object Id {
  @scala.inline
  def apply($id: js.Any = null): Id = {
    val __obj = js.Dynamic.literal()
    if ($id != null) __obj.updateDynamic("$id")($id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

