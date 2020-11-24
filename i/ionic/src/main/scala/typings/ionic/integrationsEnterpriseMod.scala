package typings.ionic

import typings.ionic.anon.PartialReadonlyEnterprise
import typings.ionic.definitionsMod.EnterpriseProjectIntegration
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations/enterprise", JSImport.Namespace)
@js.native
object integrationsEnterpriseMod extends js.Object {
  
  @js.native
  class EnterpriseIntegrationConfig () extends BaseConfig[EnterpriseProjectIntegration] {
    
    def provideDefaults(c: PartialReadonlyEnterprise): EnterpriseProjectIntegration = js.native
  }
  
  @js.native
  class Integration ()
    extends BaseIntegration[EnterpriseProjectIntegration]
       with IntegationUnion {
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: js.UndefOr[scala.Nothing] = js.native
    
    var chooseApp: js.Any = js.native
    
    var chooseAppToLink: js.Any = js.native
    
    @JSName("config")
    def config_MIntegration: EnterpriseIntegrationConfig = js.native
    
    var createNewApp: js.Any = js.native
    
    var getAppClient: js.Any = js.native
    
    var getPK: js.Any = js.native
    
    var registerKey: js.Any = js.native
    
    var updateNPMRC: js.Any = js.native
    
    var validatePK: js.Any = js.native
  }
}
