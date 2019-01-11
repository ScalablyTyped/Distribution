package typings
package lockfileLib.lockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lockfile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* isLocked */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def check(
    path: java.lang.String,
    opts: lockfileLib.lockfileMod.Options,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* isLocked */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def checkSync(path: java.lang.String): scala.Boolean = js.native
  def checkSync(path: java.lang.String, opts: lockfileLib.lockfileMod.Options): scala.Boolean = js.native
  def lock(path: java.lang.String, callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def lock(
    path: java.lang.String,
    opts: lockfileLib.lockfileMod.Options,
    callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def lockSync(path: java.lang.String): scala.Unit = js.native
  def lockSync(path: java.lang.String, opts: lockfileLib.lockfileMod.Options): scala.Unit = js.native
  def unlock(path: java.lang.String, callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def unlockSync(path: java.lang.String): scala.Unit = js.native
}

