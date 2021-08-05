package typings.ionic

import typings.ionic.anon.PartialReadonlyEnterprise
import typings.ionic.definitionsMod.EnterpriseProjectIntegration
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionic.libIntegrationsMod.IntegrationDeps
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsEnterpriseMod {
  
  @JSImport("ionic/lib/integrations/enterprise", "EnterpriseIntegrationConfig")
  @js.native
  class EnterpriseIntegrationConfig protected () extends BaseConfig[EnterpriseProjectIntegration] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
    
    def provideDefaults(c: PartialReadonlyEnterprise): EnterpriseProjectIntegration = js.native
  }
  
  @JSImport("ionic/lib/integrations/enterprise", "Integration")
  @js.native
  class Integration protected ()
    extends BaseIntegration[EnterpriseProjectIntegration]
       with IntegationUnion {
    def this(e: IntegrationDeps) = this()
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: Unit = js.native
    
    /* private */ var chooseApp: js.Any = js.native
    
    /* private */ var chooseAppToLink: js.Any = js.native
    
    @JSName("config")
    def config_MIntegration: EnterpriseIntegrationConfig = js.native
    
    /* private */ var createNewApp: js.Any = js.native
    
    /* private */ var getAppClient: js.Any = js.native
    
    /* private */ var getPK: js.Any = js.native
    
    /* private */ var registerKey: js.Any = js.native
    
    /* private */ var updateNPMRC: js.Any = js.native
    
    /* private */ var validatePK: js.Any = js.native
  }
}
