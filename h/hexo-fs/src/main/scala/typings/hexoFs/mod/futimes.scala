package typings.hexoFs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "futimes")
@js.native
object futimes extends js.Object {
  
  def apply(fd: Double, atime: String, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Double): typings.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Date): typings.bluebird.mod.^[Unit] = js.native
}
