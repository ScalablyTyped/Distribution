package typings.isexe.isexeMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isexe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = js.native
  def apply(path: String, options: Options): js.Promise[Boolean] = js.native
  def apply(
    path: String,
    options: Options,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = js.native
}

