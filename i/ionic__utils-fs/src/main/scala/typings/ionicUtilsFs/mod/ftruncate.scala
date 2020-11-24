package typings.ionicUtilsFs.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "ftruncate")
@js.native
object ftruncate extends js.Object {
  
  def apply(fd: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(fd: Double, len: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
