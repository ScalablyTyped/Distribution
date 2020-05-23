package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.WriteFileOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "outputFile")
@js.native
object outputFile extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}

