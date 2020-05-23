package typings.ionicUtilsFs.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "fchmod")
@js.native
object fchmod extends js.Object {
  def apply(fd: Double, mode: String): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

