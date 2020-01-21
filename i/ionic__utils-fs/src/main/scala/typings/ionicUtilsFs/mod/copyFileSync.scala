package typings.ionicUtilsFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "copyFileSync")
@js.native
object copyFileSync extends js.Object {
  /**
    * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation.
    * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
    */
  def apply(src: PathLike, dest: PathLike): Unit = js.native
  def apply(src: PathLike, dest: PathLike, flags: Double): Unit = js.native
}

