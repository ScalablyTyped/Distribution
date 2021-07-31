package typings.ionic

import typings.ionic.definitionsMod.HookFn
import typings.ionic.definitionsMod.HookInput
import typings.ionic.definitionsMod.HookName
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("ionic/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def addHook(baseDir: String, hooks: String, hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def addHook(baseDir: String, hooks: js.Array[String], hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def addHook(baseDir: String, hooks: Unit, hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def locateHook(baseDir: String, hooks: js.Array[String], hook: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("locateHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def removeHook(baseDir: String, hooks: String, hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def removeHook(baseDir: String, hooks: js.Array[String], hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def removeHook(baseDir: String, hooks: Unit, hook: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(baseDir.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait HookDeps extends StObject {
    
    val config: IConfig
    
    val project: IProject
    
    val shell: IShell
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
