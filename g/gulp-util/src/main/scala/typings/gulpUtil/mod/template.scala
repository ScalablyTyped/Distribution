package typings.gulpUtil.mod

import typings.gulpUtil.AnonFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "template")
@js.native
object template extends js.Object {
  def apply(tmpl: String): js.Function1[/* opt */ AnonFile, String] = js.native
  def apply(tmpl: String, opt: AnonFile): String = js.native
}

