package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionOptions extends js.Object {
  var backgroundColor: String
  var backgroundOpacity: Double
  var color: String
  var edgeStyle: String
  var fontFamily: String
  var fontOpacity: Double
  var fontSize: Double
  var windowColor: String
  var windowOpacity: Double
}

object CaptionOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    backgroundOpacity: Double,
    color: String,
    edgeStyle: String,
    fontFamily: String,
    fontOpacity: Double,
    fontSize: Double,
    windowColor: String,
    windowOpacity: Double
  ): CaptionOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundOpacity = backgroundOpacity.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], edgeStyle = edgeStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontOpacity = fontOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowOpacity = windowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionOptions]
  }
}

