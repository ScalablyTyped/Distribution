package typings
package jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod

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
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Margin]
  }
}

