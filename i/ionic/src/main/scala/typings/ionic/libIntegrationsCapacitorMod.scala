package typings.ionic

import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.libIntegrationsCapacitorConfigMod.CapacitorConfig
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionic.libIntegrationsMod.IntegrationConfig
import typings.ionic.libIntegrationsMod.IntegrationDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCapacitorMod {
  
  @JSImport("ionic/lib/integrations/capacitor", "Integration")
  @js.native
  open class Integration protected ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    def this(e: IntegrationDeps) = this()
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: Unit = js.native
    
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
