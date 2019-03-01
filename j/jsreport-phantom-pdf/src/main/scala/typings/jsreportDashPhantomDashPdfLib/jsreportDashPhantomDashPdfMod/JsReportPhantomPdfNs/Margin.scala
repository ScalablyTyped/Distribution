package typings
package jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.JsReportPhantomPdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var bottom: scala.Double | java.lang.String
  var left: scala.Double | java.lang.String
  var right: scala.Double | java.lang.String
  var top: scala.Double | java.lang.String
}

object Margin {
  @scala.inline
  def apply(
    bottom: scala.Double | java.lang.String,
    left: scala.Double | java.lang.String,
    right: scala.Double | java.lang.String,
    top: scala.Double | java.lang.String
  ): Margin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
}

