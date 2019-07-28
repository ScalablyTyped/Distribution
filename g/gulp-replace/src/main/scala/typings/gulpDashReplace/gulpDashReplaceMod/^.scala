package typings.gulpDashReplace.gulpDashReplaceMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-replace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pattern: String, replacement: String | Replacer): ReadWriteStream = js.native
  def apply(pattern: String, replacement: String | Replacer, opts: Options): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: String | Replacer): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: String | Replacer, opts: Options): ReadWriteStream = js.native
}

