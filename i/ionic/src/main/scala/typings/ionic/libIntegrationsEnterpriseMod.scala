package typings.ionic

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseConfig
import typings.ionic.definitionsMod.EnterpriseProjectIntegration
import typings.ionic.ionicStrings.`Ionic Enterprise Edition provides premier native solutions, UI, & support for companies building cross-platform appsDOT`
import typings.ionic.libIntegrationsEnterpriseMod.EnterpriseIntegrationConfig
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/enterprise", JSImport.Namespace)
@js.native
object libIntegrationsEnterpriseMod extends js.Object {
  @js.native
  class EnterpriseIntegrationConfig () extends BaseConfig[EnterpriseProjectIntegration]
  
  @js.native
  class Integration ()
    extends BaseIntegration[EnterpriseProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: js.UndefOr[scala.Nothing] = js.native
    var chooseApp: js.Any = js.native
    var chooseAppToLink: js.Any = js.native
    var createNewApp: js.Any = js.native
    var getAppClient: js.Any = js.native
    var getPK: js.Any = js.native
    var registerKey: js.Any = js.native
    @JSName("summary")
    val summary_Integration: `Ionic Enterprise Edition provides premier native solutions, UI, & support for companies building cross-platform appsDOT` = js.native
    var updateNPMRC: js.Any = js.native
    var validatePK: js.Any = js.native
    @JSName("config")
    def config_MIntegration(): EnterpriseIntegrationConfig = js.native
  }
  
}

