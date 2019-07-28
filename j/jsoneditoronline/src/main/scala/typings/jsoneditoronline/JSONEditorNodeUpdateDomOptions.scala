package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorNodeUpdateDomOptions extends js.Object {
  var recurse: js.UndefOr[Boolean] = js.undefined
  var updateIndexes: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorNodeUpdateDomOptions {
  @scala.inline
  def apply(recurse: js.UndefOr[Boolean] = js.undefined, updateIndexes: js.UndefOr[Boolean] = js.undefined): JSONEditorNodeUpdateDomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (!js.isUndefined(updateIndexes)) __obj.updateDynamic("updateIndexes")(updateIndexes)
    __obj.asInstanceOf[JSONEditorNodeUpdateDomOptions]
  }
}

