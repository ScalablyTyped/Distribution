package typings.hexoFs.mod

import typings.hexoFs.AnonEncodingFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: js.Any): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: String, data: js.Any, options: AnonEncodingFlag): typings.bluebird.mod.^[Unit] = js.native
  def apply(
    path: String,
    data: js.Any,
    options: AnonEncodingFlag,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): typings.bluebird.mod.^[Unit] = js.native
}

