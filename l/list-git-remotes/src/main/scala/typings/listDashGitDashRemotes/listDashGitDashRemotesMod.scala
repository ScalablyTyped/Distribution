package typings.listDashGitDashRemotes

import org.scalablytyped.runtime.StringDictionary
import typings.node.childUnderscoreProcessMod.ExecException
import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("list-git-remotes", JSImport.Namespace)
@js.native
object listDashGitDashRemotesMod extends js.Object {
  def apply(callback: Callback): Unit = js.native
  def apply(cwd: String, callback: Callback): Unit = js.native
  def sync(): Remotes = js.native
  def sync(cwd: String): Remotes = js.native
  def sync(cwd: String, options: ExecSyncOptions): Remotes = js.native
  def sync(options: ExecSyncOptions): Remotes = js.native
  type Callback = js.Function3[
    /* err */ ExecException | Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  type Remotes = StringDictionary[String]
}

