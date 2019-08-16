package typings.leafletDashDraw.leafletMod.LocalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  var handlers: DrawHandlers
  var toolbar: typings.leafletDashDraw.leafletMod.LocalizationNs.DrawToolbar
}

object Draw {
  @scala.inline
  def apply(handlers: DrawHandlers, toolbar: typings.leafletDashDraw.leafletMod.LocalizationNs.DrawToolbar): Draw = {
    val __obj = js.Dynamic.literal(handlers = handlers, toolbar = toolbar)
  
    __obj.asInstanceOf[Draw]
  }
}

