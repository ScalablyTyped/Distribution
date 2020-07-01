package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "safeLoad")
@js.native
object safeLoad extends js.Object {
  def apply(str: String): js.UndefOr[String | js.Object] = js.native
  def apply(str: String, opts: LoadOptions): js.UndefOr[String | js.Object] = js.native
}

