package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  var edit: String
  var editDisabled: String
  var remove: String
  var removeDisabled: String
}

object Edit {
  @scala.inline
  def apply(edit: String, editDisabled: String, remove: String, removeDisabled: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], editDisabled = editDisabled.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeDisabled = removeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
}

