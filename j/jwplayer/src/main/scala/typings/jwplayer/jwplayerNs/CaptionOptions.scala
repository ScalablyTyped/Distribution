package typings.jwplayer.jwplayerNs

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
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, backgroundOpacity = backgroundOpacity, color = color, edgeStyle = edgeStyle, fontFamily = fontFamily, fontOpacity = fontOpacity, fontSize = fontSize, windowColor = windowColor, windowOpacity = windowOpacity)
  
    __obj.asInstanceOf[CaptionOptions]
  }
}

