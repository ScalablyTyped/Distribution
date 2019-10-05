package typings.lockfile.lockfileMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lockfile", "check")
@js.native
object check extends js.Object {
  def apply(path: String, callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]): Unit = js.native
  def apply(
    path: String,
    opts: Options,
    callback: js.Function2[/* err */ Error | Null, /* isLocked */ Boolean, Unit]
  ): Unit = js.native
}

