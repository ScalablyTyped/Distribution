package typings.hexoFs.mod

import typings.hexoFs.AnonEscape
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, options: AnonEscape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: Double,
    options: AnonEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: AnonEscape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: PathLike,
    options: AnonEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
}

