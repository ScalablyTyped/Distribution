package typings.ionic

import typings.ionic.definitionsMod.APIResponse
import typings.ionic.definitionsMod.IntegrationName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardsMod {
  
  @JSImport("ionic/guards", "INTEGRATION_NAMES")
  @js.native
  val INTEGRATION_NAMES: js.Array[IntegrationName] = js.native
  
  @JSImport("ionic/guards", "isAPIResponseError")
  @js.native
  def isAPIResponseError(res: js.Any): /* is ionic.ionic/definitions.APIResponseError */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAPIResponseSuccess")
  @js.native
  def isAPIResponseSuccess(res: js.Any): /* is ionic.ionic/definitions.APIResponseSuccess */ Boolean = js.native
  
  @JSImport("ionic/guards", "isApp")
  @js.native
  def isApp(app: js.Any): /* is ionic.ionic/definitions.App */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAppAssociation")
  @js.native
  def isAppAssociation(association: js.Any): /* is ionic.ionic/definitions.AppAssociation */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAppAssociationResponse")
  @js.native
  def isAppAssociationResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.AppAssociation> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAppResponse")
  @js.native
  def isAppResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.App> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAppsResponse")
  @js.native
  def isAppsResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAuthConnection")
  @js.native
  def isAuthConnection(connection: js.Any): /* is ionic.ionic/lib/auth.AuthConnection */ Boolean = js.native
  
  @JSImport("ionic/guards", "isAuthConnectionResponse")
  @js.native
  def isAuthConnectionResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/lib/auth.AuthConnection> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isBitbucketCloudRepoAssociation")
  @js.native
  def isBitbucketCloudRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketCloudRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic/guards", "isBitbucketServerRepoAssociation")
  @js.native
  def isBitbucketServerRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketServerRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic/guards", "isCommand")
  @js.native
  def isCommand(cmd: js.Any): /* is ionic.ionic/definitions.ICommand */ Boolean = js.native
  
  @JSImport("ionic/guards", "isCommandPreRun")
  @js.native
  def isCommandPreRun(cmd: js.Any): /* is ionic.ionic/definitions.CommandPreRun */ Boolean = js.native
  
  @JSImport("ionic/guards", "isCordovaPackageJson")
  @js.native
  def isCordovaPackageJson(obj: js.Any): /* is ionic.ionic/definitions.CordovaPackageJson */ Boolean = js.native
  
  @JSImport("ionic/guards", "isExitCodeException")
  @js.native
  def isExitCodeException(err: js.Any): /* is ionic.ionic/definitions.ExitCodeException */ Boolean = js.native
  
  @JSImport("ionic/guards", "isGithubBranch")
  @js.native
  def isGithubBranch(branch: js.Any): /* is ionic.ionic/definitions.GithubBranch */ Boolean = js.native
  
  @JSImport("ionic/guards", "isGithubBranchListResponse")
  @js.native
  def isGithubBranchListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubBranch>> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isGithubRepo")
  @js.native
  def isGithubRepo(repo: js.Any): /* is ionic.ionic/definitions.GithubRepo */ Boolean = js.native
  
  @JSImport("ionic/guards", "isGithubRepoAssociation")
  @js.native
  def isGithubRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.GithubRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic/guards", "isGithubRepoListResponse")
  @js.native
  def isGithubRepoListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubRepo>> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isIntegrationName")
  @js.native
  def isIntegrationName(name: js.Any): /* is ionic.ionic/definitions.IntegrationName */ Boolean = js.native
  
  @JSImport("ionic/guards", "isLogin")
  @js.native
  def isLogin(login: js.Any): /* is ionic.ionic/definitions.Login */ Boolean = js.native
  
  @JSImport("ionic/guards", "isLoginResponse")
  @js.native
  def isLoginResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Login> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isMultiProjectConfig")
  @js.native
  def isMultiProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IMultiProjectConfig */ Boolean = js.native
  
  @JSImport("ionic/guards", "isOAuthLogin")
  @js.native
  def isOAuthLogin(login: js.Any): /* is ionic.ionic/guards.OAuthLogin */ Boolean = js.native
  
  @JSImport("ionic/guards", "isOAuthLoginResponse")
  @js.native
  def isOAuthLoginResponse(res: js.Any): /* is ionic.ionic/definitions.Response<ionic.ionic/guards.OAuthLogin> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isOrg")
  @js.native
  def isOrg(org_ : js.Any): /* is ionic.ionic/definitions.Org */ Boolean = js.native
  
  @JSImport("ionic/guards", "isProjectConfig")
  @js.native
  def isProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IProjectConfig */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSSHKey")
  @js.native
  def isSSHKey(key: js.Any): /* is ionic.ionic/definitions.SSHKey */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSSHKeyListResponse")
  @js.native
  def isSSHKeyListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSSHKeyResponse")
  @js.native
  def isSSHKeyResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SSHKey> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSecurityProfile")
  @js.native
  def isSecurityProfile(obj: js.Any): /* is ionic.ionic/definitions.SecurityProfile */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSecurityProfileResponse")
  @js.native
  def isSecurityProfileResponse(r: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SecurityProfile> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSnapshot")
  @js.native
  def isSnapshot(snapshot: js.Any): /* is ionic.ionic/definitions.Snapshot */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSnapshotListResponse")
  @js.native
  def isSnapshotListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSnapshotResponse")
  @js.native
  def isSnapshotResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Snapshot> */ Boolean = js.native
  
  @JSImport("ionic/guards", "isStarterManifest")
  @js.native
  def isStarterManifest(obj: js.Any): /* is ionic.ionic/definitions.StarterManifest */ Boolean = js.native
  
  @JSImport("ionic/guards", "isSuperAgentError")
  @js.native
  def isSuperAgentError(err: js.Any): /* is ionic.ionic/definitions.SuperAgentError */ Boolean = js.native
  
  @JSImport("ionic/guards", "isTreatableAilment")
  @js.native
  def isTreatableAilment(ailment: js.Any): /* is ionic.ionic/definitions.TreatableAilment */ Boolean = js.native
  
  @JSImport("ionic/guards", "isUser")
  @js.native
  def isUser(user: js.Any): /* is ionic.ionic/definitions.User */ Boolean = js.native
  
  @JSImport("ionic/guards", "isUserResponse")
  @js.native
  def isUserResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.User> */ Boolean = js.native
  
  @js.native
  trait OAuthLogin extends StObject {
    
    var redirect_url: String = js.native
  }
  object OAuthLogin {
    
    @scala.inline
    def apply(redirect_url: String): OAuthLogin = {
      val __obj = js.Dynamic.literal(redirect_url = redirect_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthLogin]
    }
    
    @scala.inline
    implicit class OAuthLoginMutableBuilder[Self <: OAuthLogin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect_url(value: String): Self = StObject.set(x, "redirect_url", value.asInstanceOf[js.Any])
    }
  }
}
