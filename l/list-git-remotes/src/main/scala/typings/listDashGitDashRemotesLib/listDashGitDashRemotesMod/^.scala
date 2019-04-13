package typings
package listDashGitDashRemotesLib.listDashGitDashRemotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("list-git-remotes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(callback: Callback): scala.Unit = js.native
  def apply(cwd: java.lang.String, callback: Callback): scala.Unit = js.native
  def sync(): Remotes = js.native
  def sync(cwd: java.lang.String): Remotes = js.native
  def sync(cwd: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): Remotes = js.native
  def sync(options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): Remotes = js.native
}

