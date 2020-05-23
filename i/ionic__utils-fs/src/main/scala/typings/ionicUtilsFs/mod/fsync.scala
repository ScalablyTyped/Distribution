package typings.ionicUtilsFs.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "fsync")
@js.native
object fsync extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

