package typings.hexoFs.mod

import typings.hexoFs.anon.Escape
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, options: Escape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: Double,
    options: Escape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: Escape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: PathLike,
    options: Escape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
}

