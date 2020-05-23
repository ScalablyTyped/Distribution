package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.WriteResult
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double, buffer: Buffer): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): js.Promise[WriteResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: Double): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
  def apply(fd: Double, data: js.Any, offset: Double, encoding: String): js.Promise[WriteResult] = js.native
  def apply(
    fd: Double,
    data: js.Any,
    offset: Double,
    encoding: String,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* str */ String, Unit]
  ): Unit = js.native
}

