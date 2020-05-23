package typings.ionic

import typings.ionic.capacitorConfigMod.CapacitorConfig
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/capacitor", JSImport.Namespace)
@js.native
object integrationsCapacitorMod extends js.Object {
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: js.UndefOr[scala.Nothing] = js.native
    @JSName("config")
    def config_MIntegration: IntegrationConfig = js.native
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    def getCapacitorCLIVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getConfig(): js.Promise[CapacitorConfig] = js.native
    def installCapacitorCLI(): js.Promise[Unit] = js.native
    def installCapacitorCore(): js.Promise[Unit] = js.native
  }
  
}

