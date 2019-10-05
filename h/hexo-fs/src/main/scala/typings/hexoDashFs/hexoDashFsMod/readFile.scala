package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.hexoDashFs.Anon_EncodingEscape
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double): ^[String] = js.native
  def apply(path: Double, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): ^[String] = js.native
  def apply(path: Double, options: Anon_EncodingEscape): ^[String] = js.native
  def apply(
    path: Double,
    options: Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): ^[String] = js.native
  def apply(path: PathLike): ^[String] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]): ^[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingEscape): ^[String] = js.native
  def apply(
    path: PathLike,
    options: Anon_EncodingEscape,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]
  ): ^[String] = js.native
}

