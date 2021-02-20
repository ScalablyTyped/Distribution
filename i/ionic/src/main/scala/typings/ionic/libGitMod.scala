package typings.ionic

import typings.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGitMod {
  
  @JSImport("ionic/lib/git", "addIonicRemote")
  @js.native
  def addIonicRemote(hasShell: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/git", "getIonicRemote")
  @js.native
  def getIonicRemote(hasShell: GitUtilDeps, dir: String): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/git", "getTopLevel")
  @js.native
  def getTopLevel(hasShell: GitUtilDeps): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/git", "initializeRepo")
  @js.native
  def initializeRepo(hasShell: GitUtilDeps, dir: String): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/git", "isGitInstalled")
  @js.native
  def isGitInstalled(hasShell: GitUtilDeps): js.Promise[Boolean] = js.native
  
  @JSImport("ionic/lib/git", "isRepoInitialized")
  @js.native
  def isRepoInitialized(dir: String): js.Promise[Boolean] = js.native
  
  @JSImport("ionic/lib/git", "setIonicRemote")
  @js.native
  def setIonicRemote(hasShell: GitUtilDeps, dir: String, url: String): js.Promise[Unit] = js.native
  
  @js.native
  trait GitUtilDeps extends StObject {
    
    var shell: IShell = js.native
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
