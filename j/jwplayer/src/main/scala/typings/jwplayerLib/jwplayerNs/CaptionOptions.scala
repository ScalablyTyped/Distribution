package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionOptions extends js.Object {
  var backgroundColor: java.lang.String
  var backgroundOpacity: scala.Double
  var color: java.lang.String
  var edgeStyle: java.lang.String
  var fontFamily: java.lang.String
  var fontOpacity: scala.Double
  var fontSize: scala.Double
  var windowColor: java.lang.String
  var windowOpacity: scala.Double
}

object CaptionOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    backgroundOpacity: scala.Double,
    color: java.lang.String,
    edgeStyle: java.lang.String,
    fontFamily: java.lang.String,
    fontOpacity: scala.Double,
    fontSize: scala.Double,
    windowColor: java.lang.String,
    windowOpacity: scala.Double
  ): CaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("backgroundOpacity")(backgroundOpacity)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("edgeStyle")(edgeStyle)
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontOpacity")(fontOpacity)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("windowColor")(windowColor)
    __obj.updateDynamic("windowOpacity")(windowOpacity)
    __obj.asInstanceOf[CaptionOptions]
  }
}

