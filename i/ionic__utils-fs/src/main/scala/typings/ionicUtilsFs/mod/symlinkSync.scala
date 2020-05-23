package typings.ionicUtilsFs.mod

import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "symlinkSync")
@js.native
object symlinkSync extends js.Object {
  def apply(target: PathLike, path: PathLike): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
}

