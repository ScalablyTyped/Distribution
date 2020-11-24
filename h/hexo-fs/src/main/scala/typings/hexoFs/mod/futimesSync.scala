package typings.hexoFs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "futimesSync")
@js.native
object futimesSync extends js.Object {
  
  def apply(fd: Double, atime: String, mtime: String): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Date): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Date): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: String): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Double): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): Unit = js.native
}
