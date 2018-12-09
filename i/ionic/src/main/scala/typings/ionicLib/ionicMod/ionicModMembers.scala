package typings
package ionicLib.ionicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic", JSImport.Namespace)
@js.native
object ionicModMembers extends js.Object {
  val ASSETS_DIRECTORY: java.lang.String = js.native
  val INTEGRATION_NAMES: js.Array[ionicLib.definitionsMod.IntegrationName] = js.native
  val PROJECT_FILE: /* ionic.config.json */ java.lang.String = js.native
  val PROJECT_TYPES: js.Array[ionicLib.definitionsMod.ProjectType] = js.native
  def generateContext(): js.Promise[ionicLib.definitionsMod.IonicContext] = js.native
  def isAPIResponseError(res: js.Any): /* is APIResponseError */scala.Boolean = js.native
  def isAPIResponseSuccess(res: js.Any): /* is APIResponseSuccess */scala.Boolean = js.native
  def isApp(app: js.Any): /* is App */scala.Boolean = js.native
  def isAppAssociation(association: js.Any): /* is AppAssociation */scala.Boolean = js.native
  def isAppAssociationResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isAppResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isAppsResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isAuthConnection(connection: js.Any): /* is AuthConnection */scala.Boolean = js.native
  def isAuthConnectionResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isBitbucketCloudRepoAssociation(association: js.Any): /* is BitbucketCloudRepoAssociation */scala.Boolean = js.native
  def isBitbucketServerRepoAssociation(association: js.Any): /* is BitbucketServerRepoAssociation */scala.Boolean = js.native
  def isCommand(cmd: js.Any): /* is ICommand */scala.Boolean = js.native
  def isCommandPreRun(cmd: js.Any): /* is CommandPreRun */scala.Boolean = js.native
  def isCordovaPackageJson(obj: js.Any): /* is CordovaPackageJson */scala.Boolean = js.native
  def isExitCodeException(err: js.Any): /* is ExitCodeException */scala.Boolean = js.native
  def isGithubBranch(branch: js.Any): /* is GithubBranch */scala.Boolean = js.native
  def isGithubBranchListResponse(res: js.Any): /* is Response */scala.Boolean = js.native
  def isGithubRepo(repo: js.Any): /* is GithubRepo */scala.Boolean = js.native
  def isGithubRepoAssociation(association: js.Any): /* is GithubRepoAssociation */scala.Boolean = js.native
  def isGithubRepoListResponse(res: js.Any): /* is Response */scala.Boolean = js.native
  def isIntegrationName(name: js.Any): /* is IntegrationName */scala.Boolean = js.native
  def isLogin(login: js.Any): /* is Login */scala.Boolean = js.native
  def isLoginResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isMultiProjectConfig(configFile: js.Any): /* is IMultiProjectConfig */scala.Boolean = js.native
  def isOAuthLogin(login: js.Any): /* is OAuthLogin */scala.Boolean = js.native
  def isOAuthLoginResponse(res: js.Any): /* is Response */scala.Boolean = js.native
  def isOrg(org: js.Any): /* is Org */scala.Boolean = js.native
  def isProjectConfig(configFile: js.Any): /* is IProjectConfig */scala.Boolean = js.native
  def isSSHKey(key: js.Any): /* is SSHKey */scala.Boolean = js.native
  def isSSHKeyListResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isSSHKeyResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isSecurityProfile(obj: js.Any): /* is SecurityProfile */scala.Boolean = js.native
  def isSecurityProfileResponse(r: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isSnapshot(snapshot: js.Any): /* is Snapshot */scala.Boolean = js.native
  def isSnapshotListResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isSnapshotResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def isStarterManifest(obj: js.Any): /* is StarterManifest */scala.Boolean = js.native
  def isSuperAgentError(err: js.Any): /* is SuperAgentError */scala.Boolean = js.native
  def isTreatableAilment(ailment: js.Any): /* is TreatableAilment */scala.Boolean = js.native
  def isUser(user: js.Any): /* is User */scala.Boolean = js.native
  def isUserResponse(res: ionicLib.definitionsMod.APIResponse): /* is Response */scala.Boolean = js.native
  def loadExecutor(ctx: ionicLib.definitionsMod.IonicContext, pargv: js.Array[java.lang.String]): js.Promise[ionicLib.libExecutorMod.Executor] = js.native
  def receive(msg: ionicLib.definitionsMod.IPCMessage): js.Promise[scala.Unit] = js.native
  def run(pargv: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
}

