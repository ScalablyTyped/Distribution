package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFontWeight extends js.Object {
  var color: Anon_DarkLightString
  var fontWeight: Double
  var hover: Anon_TextDecoration
  var textDecoration: String
}

object Anon_ColorFontWeight {
  @scala.inline
  def apply(
    color: Anon_DarkLightString,
    fontWeight: Double,
    hover: Anon_TextDecoration,
    textDecoration: String
  ): Anon_ColorFontWeight = {
    val __obj = js.Dynamic.literal(color = color, fontWeight = fontWeight, hover = hover, textDecoration = textDecoration)
  
    __obj.asInstanceOf[Anon_ColorFontWeight]
  }
}

