package typings.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerOptions extends js.Object {
  var computeSha1: Boolean = js.native
  var data: InternalHasteMap = js.native
  var extensions: js.Array[String] = js.native
  var forceNodeFilesystemAPI: Boolean = js.native
  @JSName("ignore")
  var ignore_Original: IgnoreMatcher = js.native
  var mapper: js.UndefOr[Mapper | Null] = js.native
  var rootDir: String = js.native
  var roots: js.Array[String] = js.native
  def ignore(item: String): Boolean = js.native
}

