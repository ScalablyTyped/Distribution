package typings
package jqueryDotWatermarkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var watermark: Watermark
}

object JQueryStatic {
  @scala.inline
  def apply(watermark: Watermark): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("watermark")(watermark)
    __obj.asInstanceOf[JQueryStatic]
  }
}

