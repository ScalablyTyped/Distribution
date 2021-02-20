package typings.ionic

import typings.ionic.anon.PartialReadonlyProjectInt
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IIntegration
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.integrationsCapacitorMod.Integration
import typings.ionic.ionicStrings.capacitor
import typings.ionic.ionicStrings.cordova
import typings.ionic.ionicStrings.enterprise
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsMod {
  
  @JSImport("ionic/lib/integrations", "BaseIntegration")
  @js.native
  abstract class BaseIntegration[T /* <: ProjectIntegration */] protected () extends IIntegration[T] {
    def this(e: IntegrationDeps) = this()
    
    val e: IntegrationDeps = js.native
    
    def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
  }
  /* static members */
  object BaseIntegration {
    
    @JSImport("ionic/lib/integrations", "BaseIntegration.createFromName")
    @js.native
    def createFromName(deps: IntegrationDeps, name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
    @JSImport("ionic/lib/integrations", "BaseIntegration.createFromName")
    @js.native
    def createFromName_capacitor(deps: IntegrationDeps, name: capacitor): js.Promise[Integration] = js.native
    @JSImport("ionic/lib/integrations", "BaseIntegration.createFromName")
    @js.native
    def createFromName_cordova(deps: IntegrationDeps, name: cordova): js.Promise[typings.ionic.integrationsCordovaMod.Integration] = js.native
    @JSImport("ionic/lib/integrations", "BaseIntegration.createFromName")
    @js.native
    def createFromName_enterprise(deps: IntegrationDeps, name: enterprise): js.Promise[typings.ionic.integrationsEnterpriseMod.Integration] = js.native
  }
  
  @JSImport("ionic/lib/integrations", "INTEGRATION_NAMES")
  @js.native
  val INTEGRATION_NAMES: js.Array[IntegrationName] = js.native
  
  @JSImport("ionic/lib/integrations", "IntegrationConfig")
  @js.native
  class IntegrationConfig protected () extends BaseConfig[ProjectIntegration] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyProjectInt): ProjectIntegration = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.integrationsCapacitorMod.Integration
    - typings.ionic.integrationsCordovaMod.Integration
    - typings.ionic.integrationsEnterpriseMod.Integration
  */
  trait IntegationUnion extends StObject
  
  @js.native
  trait IntegrationDeps extends StObject {
    
    val config: IConfig = js.native
    
    val log: ILogger = js.native
    
    val project: IProject = js.native
    
    val shell: IShell = js.native
  }
  object IntegrationDeps {
    
    @scala.inline
    def apply(config: IConfig, log: ILogger, project: IProject, shell: IShell): IntegrationDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntegrationDeps]
    }
    
    @scala.inline
    implicit class IntegrationDepsMutableBuilder[Self <: IntegrationDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntegrationOptions extends StObject {
    
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object IntegrationOptions {
    
    @scala.inline
    def apply(): IntegrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationOptions]
    }
    
    @scala.inline
    implicit class IntegrationOptionsMutableBuilder[Self <: IntegrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
