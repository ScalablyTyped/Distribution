package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderCheckGap extends js.Object {
  var border: Anon_ColorWidth
  var check: Anon_RadiusString
  var gap: String
  var hover: Anon_BorderAnonColorAnonDarkLightString
  var size: String
}

object Anon_BorderCheckGap {
  @scala.inline
  def apply(
    border: Anon_ColorWidth,
    check: Anon_RadiusString,
    gap: String,
    hover: Anon_BorderAnonColorAnonDarkLightString,
    size: String
  ): Anon_BorderCheckGap = {
    val __obj = js.Dynamic.literal(border = border, check = check, gap = gap, hover = hover, size = size)
  
    __obj.asInstanceOf[Anon_BorderCheckGap]
  }
}

