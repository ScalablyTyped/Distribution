package typings.gulpDashReplace.gulpDashReplaceMod

import typings.node.NodeJS.ReadWriteStream
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-replace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pattern: String, replacement: String): ReadWriteStream = js.native
  def apply(pattern: String, replacement: String, opts: Options): ReadWriteStream = js.native
  def apply(pattern: String, replacement: Replacer): ReadWriteStream = js.native
  def apply(pattern: String, replacement: Replacer, opts: Options): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: String): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: String, opts: Options): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: Replacer): ReadWriteStream = js.native
  def apply(pattern: RegExp, replacement: Replacer, opts: Options): ReadWriteStream = js.native
}

