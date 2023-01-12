package typings.ionic

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.libNamespaceMod.Namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("ionic/commands", "IonicNamespace")
  @js.native
  open class IonicNamespace protected () extends Namespace {
    def this(param0: IonicEnvironmentDeps) = this()
    
    /* protected */ var _env: IonicEnvironment = js.native
    
    /* protected */ var _project: js.UndefOr[IProject] = js.native
    
    @JSName("env")
    def env_MIonicNamespace: IonicEnvironment = js.native
    
    @JSName("project")
    def project_MIonicNamespace: js.UndefOr[IProject] = js.native
  }
  
  trait IonicEnvironmentDeps extends StObject {
    
    val env: IonicEnvironment
    
    val project: js.UndefOr[IProject] = js.undefined
  }
  object IonicEnvironmentDeps {
    
    inline def apply(env: IonicEnvironment): IonicEnvironmentDeps = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicEnvironmentDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IonicEnvironmentDeps] (val x: Self) extends AnyVal {
      
      inline def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
}
