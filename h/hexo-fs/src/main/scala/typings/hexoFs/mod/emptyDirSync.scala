package typings.hexoFs.mod

import typings.hexoFs.AnonExclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "emptyDirSync")
@js.native
object emptyDirSync extends js.Object {
  def apply(path: String): String | js.Array[String] = js.native
  def apply(path: String, options: DirectoryOptions with AnonExclude): String | js.Array[String] = js.native
  def apply(path: String, options: DirectoryOptions with AnonExclude, parent: String): String | js.Array[String] = js.native
}

