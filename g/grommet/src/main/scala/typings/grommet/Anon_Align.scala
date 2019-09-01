package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: String
  var border: String
  var fill: String
  var pad: Anon_HorizontalVertical
  var verticalAlign: String
}

object Anon_Align {
  @scala.inline
  def apply(align: String, border: String, fill: String, pad: Anon_HorizontalVertical, verticalAlign: String): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, border = border, fill = fill, pad = pad, verticalAlign = verticalAlign)
  
    __obj.asInstanceOf[Anon_Align]
  }
}

