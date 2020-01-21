package typings.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "appendFileSync")
@js.native
object appendFileSync extends js.Object {
  def apply(path: String, data: js.Any): Unit = js.native
  def apply(path: String, data: js.Any, options: String): Unit = js.native
  def apply(path: String, data: js.Any, options: AppendFileOptions): Unit = js.native
}

