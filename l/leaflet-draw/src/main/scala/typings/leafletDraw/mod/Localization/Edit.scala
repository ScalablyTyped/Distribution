package typings.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  var handlers: EditHandlers
  var toolbar: EditToolbar
}

object Edit {
  @scala.inline
  def apply(handlers: EditHandlers, toolbar: EditToolbar): Edit = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
}

