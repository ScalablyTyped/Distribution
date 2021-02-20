package typings.ionic

import typings.ionic.definitionsMod.HookFn
import typings.ionic.definitionsMod.HookInput
import typings.ionic.definitionsMod.HookName
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("ionic/lib/hooks", "Hook")
  @js.native
  abstract class Hook protected () extends StObject {
    def this(e: HookDeps) = this()
    
    val e: HookDeps = js.native
    
    /* protected */ def loadHookFn(p: String): js.Promise[js.UndefOr[HookFn]] = js.native
    
    val name: HookName = js.native
    
    def run(input: HookInput): js.Promise[Unit] = js.native
    
    def script: String = js.native
  }
  
  @JSImport("ionic/lib/hooks", "addHook")
  @js.native
  def addHook(baseDir: String, hooks: js.UndefOr[scala.Nothing], hook: String): js.Array[String] = js.native
  @JSImport("ionic/lib/hooks", "addHook")
  @js.native
  def addHook(baseDir: String, hooks: String, hook: String): js.Array[String] = js.native
  @JSImport("ionic/lib/hooks", "addHook")
  @js.native
  def addHook(baseDir: String, hooks: js.Array[String], hook: String): js.Array[String] = js.native
  
  @JSImport("ionic/lib/hooks", "locateHook")
  @js.native
  def locateHook(baseDir: String, hooks: js.Array[String], hook: String): Double = js.native
  
  @JSImport("ionic/lib/hooks", "removeHook")
  @js.native
  def removeHook(baseDir: String, hooks: js.UndefOr[scala.Nothing], hook: String): js.Array[String] = js.native
  @JSImport("ionic/lib/hooks", "removeHook")
  @js.native
  def removeHook(baseDir: String, hooks: String, hook: String): js.Array[String] = js.native
  @JSImport("ionic/lib/hooks", "removeHook")
  @js.native
  def removeHook(baseDir: String, hooks: js.Array[String], hook: String): js.Array[String] = js.native
  
  @js.native
  trait HookDeps extends StObject {
    
    val config: IConfig = js.native
    
    val project: IProject = js.native
    
    val shell: IShell = js.native
  }
  object HookDeps {
    
    @scala.inline
    def apply(config: IConfig, project: IProject, shell: IShell): HookDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookDeps]
    }
    
    @scala.inline
    implicit class HookDepsMutableBuilder[Self <: HookDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
