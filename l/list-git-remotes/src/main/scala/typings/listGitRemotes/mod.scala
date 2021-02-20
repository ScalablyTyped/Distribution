package typings.listGitRemotes

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("list-git-remotes", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Unit = js.native
  @JSImport("list-git-remotes", JSImport.Namespace)
  @js.native
  def apply(cwd: String, callback: Callback): Unit = js.native
  
  @JSImport("list-git-remotes", "sync")
  @js.native
  def sync(): Remotes = js.native
  @JSImport("list-git-remotes", "sync")
  @js.native
  def sync(cwd: js.UndefOr[scala.Nothing], options: ExecSyncOptions): Remotes = js.native
  @JSImport("list-git-remotes", "sync")
  @js.native
  def sync(cwd: String): Remotes = js.native
  @JSImport("list-git-remotes", "sync")
  @js.native
  def sync(cwd: String, options: ExecSyncOptions): Remotes = js.native
  @JSImport("list-git-remotes", "sync")
  @js.native
  def sync(options: ExecSyncOptions): Remotes = js.native
  
  type Callback = js.Function3[
    /* err */ ExecException | Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  
  type Remotes = StringDictionary[String]
}
