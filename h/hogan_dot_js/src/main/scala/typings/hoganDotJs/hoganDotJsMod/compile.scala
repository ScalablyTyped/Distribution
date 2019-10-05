package typings.hoganDotJs.hoganDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hogan.js", "compile")
@js.native
object compile extends js.Object {
  def apply(text: String): HoganTemplate | String = js.native
  def apply(text: String, options: HoganOptions): HoganTemplate | String = js.native
}

