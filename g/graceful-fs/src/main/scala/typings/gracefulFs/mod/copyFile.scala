package typings.gracefulFs.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graceful-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  
  def apply(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double, callback: NoParamCallback): Unit = js.native
}
