package typings.listGitRemotes

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(cwd: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("list-git-remotes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): Remotes = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Remotes]
  inline def sync(cwd: String): Remotes = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any]).asInstanceOf[Remotes]
  inline def sync(cwd: String, options: ExecSyncOptions): Remotes = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Remotes]
  inline def sync(cwd: Unit, options: ExecSyncOptions): Remotes = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Remotes]
  inline def sync(options: ExecSyncOptions): Remotes = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[Remotes]
  
  type Callback = js.Function3[
    /* err */ ExecException | Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  
  type Remotes = StringDictionary[String]
}
