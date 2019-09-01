package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Anon_AlignPad
  var footer: Anon_Align
  var header: Anon_Align
}

object Anon_Body {
  @scala.inline
  def apply(body: Anon_AlignPad, footer: Anon_Align, header: Anon_Align): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, footer = footer, header = header)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

