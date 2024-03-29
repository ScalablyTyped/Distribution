package typings.ionic

import typings.ionic.anon.PartialReadonlyProjectInt
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IIntegration
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.ionicStrings.capacitor
import typings.ionic.ionicStrings.cordova
import typings.ionic.ionicStrings.enterprise
import typings.ionic.libIntegrationsCapacitorMod.Integration
import typings.ionicCliFramework.libConfigMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsMod {
  
  /* note: abstract class */ @JSImport("ionic/lib/integrations", "BaseIntegration")
  @js.native
  open class BaseIntegration[T /* <: ProjectIntegration */] protected ()
    extends StObject
       with IIntegration[T] {
    def this(e: IntegrationDeps) = this()
    
    /* protected */ val e: IntegrationDeps = js.native
    
    def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
  }
  /* static members */
  object BaseIntegration {
    
    @JSImport("ionic/lib/integrations", "BaseIntegration")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromName(deps: IntegrationDeps, name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromName")(deps.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IIntegration[ProjectIntegration]]]
    
    inline def createFromName_capacitor(deps: IntegrationDeps, name: capacitor): js.Promise[Integration] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromName")(deps.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Integration]]
    
    inline def createFromName_cordova(deps: IntegrationDeps, name: cordova): js.Promise[typings.ionic.libIntegrationsCordovaMod.Integration] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromName")(deps.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ionic.libIntegrationsCordovaMod.Integration]]
    
    inline def createFromName_enterprise(deps: IntegrationDeps, name: enterprise): js.Promise[typings.ionic.libIntegrationsEnterpriseMod.Integration] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromName")(deps.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ionic.libIntegrationsEnterpriseMod.Integration]]
  }
  
  @JSImport("ionic/lib/integrations", "INTEGRATION_NAMES")
  @js.native
  val INTEGRATION_NAMES: js.Array[IntegrationName] = js.native
  
  @JSImport("ionic/lib/integrations", "IntegrationConfig")
  @js.native
  open class IntegrationConfig protected () extends BaseConfig[ProjectIntegration] {
    def this(p: String) = this()
    def this(p: String, param1: BaseConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyProjectInt): ProjectIntegration = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.libIntegrationsCapacitorMod.Integration
    - typings.ionic.libIntegrationsCordovaMod.Integration
    - typings.ionic.libIntegrationsEnterpriseMod.Integration
  */
  trait IntegationUnion extends StObject
  
  trait IntegrationDeps extends StObject {
    
    val config: IConfig
    
    val log: ILogger
    
    val project: IProject
    
    val shell: IShell
  }
  object IntegrationDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: IProject, shell: IShell): IntegrationDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegrationDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntegrationDeps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntegrationOptions extends StObject {
    
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object IntegrationOptions {
    
    inline def apply(): IntegrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntegrationOptions] (val x: Self) extends AnyVal {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
