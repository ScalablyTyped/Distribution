package typings.leafletDashDraw.leafletMod.LocalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  var handlers: EditHandlers
  var toolbar: typings.leafletDashDraw.leafletMod.LocalizationNs.EditToolbar
}

object Edit {
  @scala.inline
  def apply(handlers: EditHandlers, toolbar: typings.leafletDashDraw.leafletMod.LocalizationNs.EditToolbar): Edit = {
    val __obj = js.Dynamic.literal(handlers = handlers, toolbar = toolbar)
  
    __obj.asInstanceOf[Edit]
  }
}

