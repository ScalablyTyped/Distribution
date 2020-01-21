package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.WriteOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "outputJson")
@js.native
object outputJson extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, options: WriteOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

