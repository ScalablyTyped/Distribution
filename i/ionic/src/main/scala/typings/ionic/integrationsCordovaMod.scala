package typings.ionic

import typings.ionic.cordovaConfigMod.CordovaConfig
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.libIntegrationsMod.BaseIntegration
import typings.ionic.libIntegrationsMod.IntegationUnion
import typings.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations/cordova", JSImport.Namespace)
@js.native
object integrationsCordovaMod extends js.Object {
  
  val SUPPORTED_PROJECT_TYPES: js.Array[ProjectType] = js.native
  
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    
    @JSName("archiveUrl")
    val archiveUrl_Integration: /* "https://d2ql0qc7j8u4b2.cloudfront.net/integration-cordova.tar.gz" */ String = js.native
    
    @JSName("config")
    def config_MIntegration: IntegrationConfig = js.native
    
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    
    def getConfig(): js.Promise[js.UndefOr[CordovaConfig]] = js.native
    
    def getCordovaPlatformVersions(): js.Promise[String] = js.native
    
    def getCordovaPluginVersions(): js.Promise[String] = js.native
    
    def getCordovaVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIOSDeployVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getIOSSimVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def getXcodebuildVersion(): js.Promise[js.UndefOr[String]] = js.native
    
    def requireConfig(): js.Promise[CordovaConfig] = js.native
  }
}
