package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "open")
@js.native
object open extends js.Object {
  def apply(path: PathLike, flags: String): ^[Double] = js.native
  def apply(path: PathLike, flags: String, mode: String): ^[Double] = js.native
  def apply(path: PathLike, flags: String, mode: Double): ^[Double] = js.native
  def apply(path: PathLike, flags: Double): ^[Double] = js.native
  def apply(path: PathLike, flags: Double, mode: String): ^[Double] = js.native
  def apply(path: PathLike, flags: Double, mode: Double): ^[Double] = js.native
}

