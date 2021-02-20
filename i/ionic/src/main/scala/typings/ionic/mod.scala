package typings.ionic

import typings.ionic.definitionsMod.APIResponse
import typings.ionic.definitionsMod.IPCMessage
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.executorMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ionic", "ASSETS_DIRECTORY")
  @js.native
  val ASSETS_DIRECTORY: String = js.native
  
  @JSImport("ionic", "INTEGRATION_NAMES")
  @js.native
  val INTEGRATION_NAMES: js.Array[IntegrationName] = js.native
  
  @JSImport("ionic", "PROJECT_FILE")
  @js.native
  val PROJECT_FILE: /* "ionic.config.json" */ String = js.native
  
  @JSImport("ionic", "PROJECT_TYPES")
  @js.native
  val PROJECT_TYPES: js.Array[ProjectType] = js.native
  
  @JSImport("ionic", "generateContext")
  @js.native
  def generateContext(): js.Promise[IonicContext] = js.native
  
  @JSImport("ionic", "isAPIResponseError")
  @js.native
  def isAPIResponseError(res: js.Any): /* is ionic.ionic/definitions.APIResponseError */ Boolean = js.native
  
  @JSImport("ionic", "isAPIResponseSuccess")
  @js.native
  def isAPIResponseSuccess(res: js.Any): /* is ionic.ionic/definitions.APIResponseSuccess */ Boolean = js.native
  
  @JSImport("ionic", "isApp")
  @js.native
  def isApp(app: js.Any): /* is ionic.ionic/definitions.App */ Boolean = js.native
  
  @JSImport("ionic", "isAppAssociation")
  @js.native
  def isAppAssociation(association: js.Any): /* is ionic.ionic/definitions.AppAssociation */ Boolean = js.native
  
  @JSImport("ionic", "isAppAssociationResponse")
  @js.native
  def isAppAssociationResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.AppAssociation> */ Boolean = js.native
  
  @JSImport("ionic", "isAppResponse")
  @js.native
  def isAppResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.App> */ Boolean = js.native
  
  @JSImport("ionic", "isAppsResponse")
  @js.native
  def isAppsResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>> */ Boolean = js.native
  
  @JSImport("ionic", "isAuthConnection")
  @js.native
  def isAuthConnection(connection: js.Any): /* is ionic.ionic/lib/auth.AuthConnection */ Boolean = js.native
  
  @JSImport("ionic", "isAuthConnectionResponse")
  @js.native
  def isAuthConnectionResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/lib/auth.AuthConnection> */ Boolean = js.native
  
  @JSImport("ionic", "isBitbucketCloudRepoAssociation")
  @js.native
  def isBitbucketCloudRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketCloudRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic", "isBitbucketServerRepoAssociation")
  @js.native
  def isBitbucketServerRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketServerRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic", "isCommand")
  @js.native
  def isCommand(cmd: js.Any): /* is ionic.ionic/definitions.ICommand */ Boolean = js.native
  
  @JSImport("ionic", "isCommandPreRun")
  @js.native
  def isCommandPreRun(cmd: js.Any): /* is ionic.ionic/definitions.CommandPreRun */ Boolean = js.native
  
  @JSImport("ionic", "isCordovaPackageJson")
  @js.native
  def isCordovaPackageJson(obj: js.Any): /* is ionic.ionic/definitions.CordovaPackageJson */ Boolean = js.native
  
  @JSImport("ionic", "isExitCodeException")
  @js.native
  def isExitCodeException(err: js.Any): /* is ionic.ionic/definitions.ExitCodeException */ Boolean = js.native
  
  @JSImport("ionic", "isGithubBranch")
  @js.native
  def isGithubBranch(branch: js.Any): /* is ionic.ionic/definitions.GithubBranch */ Boolean = js.native
  
  @JSImport("ionic", "isGithubBranchListResponse")
  @js.native
  def isGithubBranchListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubBranch>> */ Boolean = js.native
  
  @JSImport("ionic", "isGithubRepo")
  @js.native
  def isGithubRepo(repo: js.Any): /* is ionic.ionic/definitions.GithubRepo */ Boolean = js.native
  
  @JSImport("ionic", "isGithubRepoAssociation")
  @js.native
  def isGithubRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.GithubRepoAssociation */ Boolean = js.native
  
  @JSImport("ionic", "isGithubRepoListResponse")
  @js.native
  def isGithubRepoListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubRepo>> */ Boolean = js.native
  
  @JSImport("ionic", "isIntegrationName")
  @js.native
  def isIntegrationName(name: js.Any): /* is ionic.ionic/definitions.IntegrationName */ Boolean = js.native
  
  @JSImport("ionic", "isLogin")
  @js.native
  def isLogin(login: js.Any): /* is ionic.ionic/definitions.Login */ Boolean = js.native
  
  @JSImport("ionic", "isLoginResponse")
  @js.native
  def isLoginResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Login> */ Boolean = js.native
  
  @JSImport("ionic", "isMultiProjectConfig")
  @js.native
  def isMultiProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IMultiProjectConfig */ Boolean = js.native
  
  @JSImport("ionic", "isOAuthLogin")
  @js.native
  def isOAuthLogin(login: js.Any): /* is ionic.ionic/guards.OAuthLogin */ Boolean = js.native
  
  @JSImport("ionic", "isOAuthLoginResponse")
  @js.native
  def isOAuthLoginResponse(res: js.Any): /* is ionic.ionic/definitions.Response<ionic.ionic/guards.OAuthLogin> */ Boolean = js.native
  
  @JSImport("ionic", "isOrg")
  @js.native
  def isOrg(org_ : js.Any): /* is ionic.ionic/definitions.Org */ Boolean = js.native
  
  @JSImport("ionic", "isProjectConfig")
  @js.native
  def isProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IProjectConfig */ Boolean = js.native
  
  @JSImport("ionic", "isSSHKey")
  @js.native
  def isSSHKey(key: js.Any): /* is ionic.ionic/definitions.SSHKey */ Boolean = js.native
  
  @JSImport("ionic", "isSSHKeyListResponse")
  @js.native
  def isSSHKeyListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>> */ Boolean = js.native
  
  @JSImport("ionic", "isSSHKeyResponse")
  @js.native
  def isSSHKeyResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SSHKey> */ Boolean = js.native
  
  @JSImport("ionic", "isSecurityProfile")
  @js.native
  def isSecurityProfile(obj: js.Any): /* is ionic.ionic/definitions.SecurityProfile */ Boolean = js.native
  
  @JSImport("ionic", "isSecurityProfileResponse")
  @js.native
  def isSecurityProfileResponse(r: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SecurityProfile> */ Boolean = js.native
  
  @JSImport("ionic", "isSnapshot")
  @js.native
  def isSnapshot(snapshot: js.Any): /* is ionic.ionic/definitions.Snapshot */ Boolean = js.native
  
  @JSImport("ionic", "isSnapshotListResponse")
  @js.native
  def isSnapshotListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>> */ Boolean = js.native
  
  @JSImport("ionic", "isSnapshotResponse")
  @js.native
  def isSnapshotResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Snapshot> */ Boolean = js.native
  
  @JSImport("ionic", "isStarterManifest")
  @js.native
  def isStarterManifest(obj: js.Any): /* is ionic.ionic/definitions.StarterManifest */ Boolean = js.native
  
  @JSImport("ionic", "isSuperAgentError")
  @js.native
  def isSuperAgentError(err: js.Any): /* is ionic.ionic/definitions.SuperAgentError */ Boolean = js.native
  
  @JSImport("ionic", "isTreatableAilment")
  @js.native
  def isTreatableAilment(ailment: js.Any): /* is ionic.ionic/definitions.TreatableAilment */ Boolean = js.native
  
  @JSImport("ionic", "isUser")
  @js.native
  def isUser(user: js.Any): /* is ionic.ionic/definitions.User */ Boolean = js.native
  
  @JSImport("ionic", "isUserResponse")
  @js.native
  def isUserResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.User> */ Boolean = js.native
  
  @JSImport("ionic", "loadExecutor")
  @js.native
  def loadExecutor(ctx: IonicContext, pargv: js.Array[String]): js.Promise[Executor] = js.native
  
  @JSImport("ionic", "receive")
  @js.native
  def receive(msg: IPCMessage): js.Promise[Unit] = js.native
  
  @JSImport("ionic", "run")
  @js.native
  def run(pargv: js.Array[String]): js.Promise[Unit] = js.native
}
