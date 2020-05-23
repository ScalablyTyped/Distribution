package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.WriteFileOptions
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: String, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Double, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Buffer, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Buffer, data: js.Any, options: String): js.Promise[Unit] = js.native
  def apply(
    file: Buffer,
    data: js.Any,
    options: String,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Buffer, data: js.Any, options: WriteFileOptions): js.Promise[Unit] = js.native
  def apply(
    file: Buffer,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

