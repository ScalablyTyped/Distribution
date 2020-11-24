package typings.ionicUtilsFs.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "lutimes")
@js.native
object lutimes extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Date, callback: NoParamCallback): Unit = js.native
}
