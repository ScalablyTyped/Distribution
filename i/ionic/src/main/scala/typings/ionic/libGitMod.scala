package typings.ionic

import typings.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGitMod {
  
  @JSImport("ionic/lib/git", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIonicRemote(param0: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addIonicRemote")(param0.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getIonicRemote(param0: GitUtilDeps, dir: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIonicRemote")(param0.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getTopLevel(param0: GitUtilDeps): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopLevel")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def initializeRepo(param0: GitUtilDeps, dir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeRepo")(param0.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def isGitInstalled(param0: GitUtilDeps): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitInstalled")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isRepoInitialized(dir: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepoInitialized")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def setIonicRemote(param0: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIonicRemote")(param0.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait GitUtilDeps extends StObject {
    
    var shell: IShell
  }
  object GitUtilDeps {
    
    inline def apply(shell: IShell): GitUtilDeps = {
      val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitUtilDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitUtilDeps] (val x: Self) extends AnyVal {
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
