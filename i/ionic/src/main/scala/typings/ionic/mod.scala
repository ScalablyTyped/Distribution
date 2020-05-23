package typings.ionic

import typings.ionic.definitionsMod.APIResponse
import typings.ionic.definitionsMod.IPCMessage
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.executorMod.Executor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ASSETS_DIRECTORY: String = js.native
  val INTEGRATION_NAMES: js.Array[IntegrationName] = js.native
  val PROJECT_FILE: /* "ionic.config.json" */ String = js.native
  val PROJECT_TYPES: js.Array[ProjectType] = js.native
  def generateContext(): js.Promise[IonicContext] = js.native
  def isAPIResponseError(res: js.Any): /* is ionic.ionic/definitions.APIResponseError */ Boolean = js.native
  def isAPIResponseSuccess(res: js.Any): /* is ionic.ionic/definitions.APIResponseSuccess */ Boolean = js.native
  def isApp(app: js.Any): /* is ionic.ionic/definitions.App */ Boolean = js.native
  def isAppAssociation(association: js.Any): /* is ionic.ionic/definitions.AppAssociation */ Boolean = js.native
  def isAppAssociationResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.AppAssociation> */ Boolean = js.native
  def isAppResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.App> */ Boolean = js.native
  def isAppsResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>> */ Boolean = js.native
  def isAuthConnection(connection: js.Any): /* is ionic.ionic/lib/auth.AuthConnection */ Boolean = js.native
  def isAuthConnectionResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/lib/auth.AuthConnection> */ Boolean = js.native
  def isBitbucketCloudRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketCloudRepoAssociation */ Boolean = js.native
  def isBitbucketServerRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketServerRepoAssociation */ Boolean = js.native
  def isCommand(cmd: js.Any): /* is ionic.ionic/definitions.ICommand */ Boolean = js.native
  def isCommandPreRun(cmd: js.Any): /* is ionic.ionic/definitions.CommandPreRun */ Boolean = js.native
  def isCordovaPackageJson(obj: js.Any): /* is ionic.ionic/definitions.CordovaPackageJson */ Boolean = js.native
  def isExitCodeException(err: js.Any): /* is ionic.ionic/definitions.ExitCodeException */ Boolean = js.native
  def isGithubBranch(branch: js.Any): /* is ionic.ionic/definitions.GithubBranch */ Boolean = js.native
  def isGithubBranchListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubBranch>> */ Boolean = js.native
  def isGithubRepo(repo: js.Any): /* is ionic.ionic/definitions.GithubRepo */ Boolean = js.native
  def isGithubRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.GithubRepoAssociation */ Boolean = js.native
  def isGithubRepoListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubRepo>> */ Boolean = js.native
  def isIntegrationName(name: js.Any): /* is ionic.ionic/definitions.IntegrationName */ Boolean = js.native
  def isLogin(login: js.Any): /* is ionic.ionic/definitions.Login */ Boolean = js.native
  def isLoginResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Login> */ Boolean = js.native
  def isMultiProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IMultiProjectConfig */ Boolean = js.native
  def isOAuthLogin(login: js.Any): /* is ionic.ionic/guards.OAuthLogin */ Boolean = js.native
  def isOAuthLoginResponse(res: js.Any): /* is ionic.ionic/definitions.Response<ionic.ionic/guards.OAuthLogin> */ Boolean = js.native
  def isOrg(org_ : js.Any): /* is ionic.ionic/definitions.Org */ Boolean = js.native
  def isProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IProjectConfig */ Boolean = js.native
  def isSSHKey(key: js.Any): /* is ionic.ionic/definitions.SSHKey */ Boolean = js.native
  def isSSHKeyListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>> */ Boolean = js.native
  def isSSHKeyResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SSHKey> */ Boolean = js.native
  def isSecurityProfile(obj: js.Any): /* is ionic.ionic/definitions.SecurityProfile */ Boolean = js.native
  def isSecurityProfileResponse(r: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SecurityProfile> */ Boolean = js.native
  def isSnapshot(snapshot: js.Any): /* is ionic.ionic/definitions.Snapshot */ Boolean = js.native
  def isSnapshotListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>> */ Boolean = js.native
  def isSnapshotResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Snapshot> */ Boolean = js.native
  def isStarterManifest(obj: js.Any): /* is ionic.ionic/definitions.StarterManifest */ Boolean = js.native
  def isSuperAgentError(err: js.Any): /* is ionic.ionic/definitions.SuperAgentError */ Boolean = js.native
  def isTreatableAilment(ailment: js.Any): /* is ionic.ionic/definitions.TreatableAilment */ Boolean = js.native
  def isUser(user: js.Any): /* is ionic.ionic/definitions.User */ Boolean = js.native
  def isUserResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.User> */ Boolean = js.native
  def loadExecutor(ctx: IonicContext, pargv: js.Array[String]): js.Promise[Executor] = js.native
  def receive(msg: IPCMessage): js.Promise[Unit] = js.native
  def run(pargv: js.Array[String]): js.Promise[Unit] = js.native
}

