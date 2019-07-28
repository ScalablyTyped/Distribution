package typings.lockfile.lockfileMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lockfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(path: String, callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]): Unit = js.native
  def check(
    path: String,
    opts: Options,
    callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]
  ): Unit = js.native
  def checkSync(path: String): Boolean = js.native
  def checkSync(path: String, opts: Options): Boolean = js.native
  def lock(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def lock(path: String, opts: Options, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def lockSync(path: String): Unit = js.native
  def lockSync(path: String, opts: Options): Unit = js.native
  def unlock(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def unlockSync(path: String): Unit = js.native
}

