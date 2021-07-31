package typings.ionic

import typings.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGitMod {
  
  @JSImport("ionic/lib/git", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addIonicRemote(hasShell: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addIonicRemote")(hasShell.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getIonicRemote(hasShell: GitUtilDeps, dir: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIonicRemote")(hasShell.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @scala.inline
  def getTopLevel(hasShell: GitUtilDeps): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopLevel")(hasShell.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @scala.inline
  def initializeRepo(hasShell: GitUtilDeps, dir: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeRepo")(hasShell.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def isGitInstalled(hasShell: GitUtilDeps): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isGitInstalled")(hasShell.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def isRepoInitialized(dir: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepoInitialized")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def setIonicRemote(hasShell: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIonicRemote")(hasShell.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait GitUtilDeps extends StObject {
    
    var shell: IShell
  }
  object GitUtilDeps {
    
    @scala.inline
    def apply(shell: IShell): GitUtilDeps = {
      val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitUtilDeps]
    }
    
    @scala.inline
    implicit class GitUtilDepsMutableBuilder[Self <: GitUtilDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
