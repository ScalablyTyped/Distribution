package typings.hexoFs.mod

import typings.hexoFs.AnonEncodingEscape
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: Double, options: AnonEncodingEscape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: Double,
    options: AnonEncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): typings.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: AnonEncodingEscape): typings.bluebird.mod.^[String] = js.native
  def apply(
    path: PathLike,
    options: AnonEncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): typings.bluebird.mod.^[String] = js.native
}

