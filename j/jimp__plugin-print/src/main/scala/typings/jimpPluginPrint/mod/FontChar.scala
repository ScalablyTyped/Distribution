package typings.jimpPluginPrint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontChar extends js.Object {
  var chnl: Double
  var height: Double
  var id: Double
  var page: Double
  var width: Double
  var x: Double
  var xadvance: Double
  var xoffset: Double
  var y: Double
  var yoffset: Double
}

object FontChar {
  @scala.inline
  def apply(
    chnl: Double,
    height: Double,
    id: Double,
    page: Double,
    width: Double,
    x: Double,
    xadvance: Double,
    xoffset: Double,
    y: Double,
    yoffset: Double
  ): FontChar = {
    val __obj = js.Dynamic.literal(chnl = chnl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontChar]
  }
}

