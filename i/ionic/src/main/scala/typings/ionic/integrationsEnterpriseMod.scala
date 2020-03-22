package typings.ionic

import typings.ionic.definitionsMod.EnterpriseProjectIntegration
import typings.ionic.ionicStrings.`Ionic Enterprise Edition provides premier native solutionsComma UIComma Ampersand support for companies building cross-platform appsDot`
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    var createNewApp: js.Any = js.native
    var getAppClient: js.Any = js.native
    var getPK: js.Any = js.native
    var registerKey: js.Any = js.native
    @JSName("summary")
    val summary_Integration: `Ionic Enterprise Edition provides premier native solutionsComma UIComma Ampersand support for companies building cross-platform appsDot` = js.native
    var updateNPMRC: js.Any = js.native
    var validatePK: js.Any = js.native
    @JSName("config")
    def config_MIntegration(): EnterpriseIntegrationConfig = js.native
  }
  
}

