package typings.hoganJs.mod

import typings.hoganJs.anon.HoganOptionsasStringfalse
import typings.hoganJs.anon.HoganOptionsasStringtrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hogan.js", "compile")
@js.native
object compile extends js.Object {
  def apply(text: String): String = js.native
  def apply(text: String, options: HoganOptionsasStringfalse): HoganTemplate = js.native
  def apply(text: String, options: HoganOptionsasStringtrue): String = js.native
  def apply(text: String, options: HoganOptions): HoganTemplate | String = js.native
}

