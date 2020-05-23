package typings.ionicUtilsFs.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "chown")
@js.native
object chown extends js.Object {
  def apply(path: String, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

