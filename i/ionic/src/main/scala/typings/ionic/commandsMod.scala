package typings.ionic

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.namespaceMod.Namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("ionic/commands", "IonicNamespace")
  @js.native
  class IonicNamespace protected () extends Namespace {
    def this(hasEnvProject: IonicEnvironmentDeps) = this()
    
    var _env: IonicEnvironment = js.native
    
    var _project: js.UndefOr[IProject] = js.native
    
    @JSName("env")
    def env_MIonicNamespace: IonicEnvironment = js.native
    
    @JSName("project")
    def project_MIonicNamespace: js.UndefOr[IProject] = js.native
  }
  
  @js.native
  trait IonicEnvironmentDeps extends StObject {
    
    val env: IonicEnvironment = js.native
    
    val project: js.UndefOr[IProject] = js.native
  }
  object IonicEnvironmentDeps {
    
    @scala.inline
    def apply(env: IonicEnvironment): IonicEnvironmentDeps = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicEnvironmentDeps]
    }
    
    @scala.inline
    implicit class IonicEnvironmentDepsMutableBuilder[Self <: IonicEnvironmentDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
}
