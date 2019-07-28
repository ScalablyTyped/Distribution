package typings.listDashGitDashRemotes.listDashGitDashRemotesMod

import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("list-git-remotes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(callback: Callback): Unit = js.native
  def apply(cwd: String, callback: Callback): Unit = js.native
  def sync(): Remotes = js.native
  def sync(cwd: String): Remotes = js.native
  def sync(cwd: String, options: ExecSyncOptions): Remotes = js.native
  def sync(options: ExecSyncOptions): Remotes = js.native
}

