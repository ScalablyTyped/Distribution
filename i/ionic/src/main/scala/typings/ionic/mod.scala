package typings.ionic

import typings.ionic.definitionsMod.APIResponse
import typings.ionic.definitionsMod.IPCMessage
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.ProjectType
import typings.ionic.executorMod.Executor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ionic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def generateContext(): js.Promise[IonicContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateContext")().asInstanceOf[js.Promise[IonicContext]]
  
  inline def isAPIResponseError(res: js.Any): /* is ionic.ionic/definitions.APIResponseError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAPIResponseError")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.APIResponseError */ Boolean]
  
  inline def isAPIResponseSuccess(res: js.Any): /* is ionic.ionic/definitions.APIResponseSuccess */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAPIResponseSuccess")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.APIResponseSuccess */ Boolean]
  
  inline def isApp(app: js.Any): /* is ionic.ionic/definitions.App */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApp")(app.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.App */ Boolean]
  
  inline def isAppAssociation(association: js.Any): /* is ionic.ionic/definitions.AppAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppAssociation")(association.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.AppAssociation */ Boolean]
  
  inline def isAppAssociationResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.AppAssociation> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppAssociationResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.AppAssociation> */ Boolean]
  
  inline def isAppResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.App> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.App> */ Boolean]
  
  inline def isAppsResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppsResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>> */ Boolean]
  
  inline def isAuthConnection(connection: js.Any): /* is ionic.ionic/lib/auth.AuthConnection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthConnection")(connection.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/lib/auth.AuthConnection */ Boolean]
  
  inline def isAuthConnectionResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/lib/auth.AuthConnection> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthConnectionResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/lib/auth.AuthConnection> */ Boolean]
  
  inline def isBitbucketCloudRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketCloudRepoAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBitbucketCloudRepoAssociation")(association.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.BitbucketCloudRepoAssociation */ Boolean]
  
  inline def isBitbucketServerRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.BitbucketServerRepoAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBitbucketServerRepoAssociation")(association.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.BitbucketServerRepoAssociation */ Boolean]
  
  inline def isCommand(cmd: js.Any): /* is ionic.ionic/definitions.ICommand */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommand")(cmd.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.ICommand */ Boolean]
  
  inline def isCommandPreRun(cmd: js.Any): /* is ionic.ionic/definitions.CommandPreRun */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandPreRun")(cmd.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.CommandPreRun */ Boolean]
  
  inline def isCordovaPackageJson(obj: js.Any): /* is ionic.ionic/definitions.CordovaPackageJson */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCordovaPackageJson")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.CordovaPackageJson */ Boolean]
  
  inline def isExitCodeException(err: js.Any): /* is ionic.ionic/definitions.ExitCodeException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExitCodeException")(err.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.ExitCodeException */ Boolean]
  
  inline def isGithubBranch(branch: js.Any): /* is ionic.ionic/definitions.GithubBranch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGithubBranch")(branch.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.GithubBranch */ Boolean]
  
  inline def isGithubBranchListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubBranch>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGithubBranchListResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubBranch>> */ Boolean]
  
  inline def isGithubRepo(repo: js.Any): /* is ionic.ionic/definitions.GithubRepo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGithubRepo")(repo.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.GithubRepo */ Boolean]
  
  inline def isGithubRepoAssociation(association: js.Any): /* is ionic.ionic/definitions.GithubRepoAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGithubRepoAssociation")(association.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.GithubRepoAssociation */ Boolean]
  
  inline def isGithubRepoListResponse(res: js.Any): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubRepo>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGithubRepoListResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.GithubRepo>> */ Boolean]
  
  inline def isIntegrationName(name: js.Any): /* is ionic.ionic/definitions.IntegrationName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationName")(name.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.IntegrationName */ Boolean]
  
  inline def isLogin(login: js.Any): /* is ionic.ionic/definitions.Login */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogin")(login.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Login */ Boolean]
  
  inline def isLoginResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Login> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoginResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Login> */ Boolean]
  
  inline def isMultiProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IMultiProjectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiProjectConfig")(configFile.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.IMultiProjectConfig */ Boolean]
  
  inline def isOAuthLogin(login: js.Any): /* is ionic.ionic/guards.OAuthLogin */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOAuthLogin")(login.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/guards.OAuthLogin */ Boolean]
  
  inline def isOAuthLoginResponse(res: js.Any): /* is ionic.ionic/definitions.Response<ionic.ionic/guards.OAuthLogin> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOAuthLoginResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/guards.OAuthLogin> */ Boolean]
  
  inline def isOrg(org_ : js.Any): /* is ionic.ionic/definitions.Org */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrg")(org_.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Org */ Boolean]
  
  inline def isProjectConfig(configFile: js.Any): /* is ionic.ionic/definitions.IProjectConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProjectConfig")(configFile.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.IProjectConfig */ Boolean]
  
  inline def isSSHKey(key: js.Any): /* is ionic.ionic/definitions.SSHKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSHKey")(key.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.SSHKey */ Boolean]
  
  inline def isSSHKeyListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSHKeyListResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>> */ Boolean]
  
  inline def isSSHKeyResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SSHKey> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSHKeyResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SSHKey> */ Boolean]
  
  inline def isSecurityProfile(obj: js.Any): /* is ionic.ionic/definitions.SecurityProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSecurityProfile")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.SecurityProfile */ Boolean]
  
  inline def isSecurityProfileResponse(r: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SecurityProfile> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSecurityProfileResponse")(r.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.SecurityProfile> */ Boolean]
  
  inline def isSnapshot(snapshot: js.Any): /* is ionic.ionic/definitions.Snapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSnapshot")(snapshot.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Snapshot */ Boolean]
  
  inline def isSnapshotListResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSnapshotListResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>> */ Boolean]
  
  inline def isSnapshotResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Snapshot> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSnapshotResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.Snapshot> */ Boolean]
  
  inline def isStarterManifest(obj: js.Any): /* is ionic.ionic/definitions.StarterManifest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStarterManifest")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.StarterManifest */ Boolean]
  
  inline def isSuperAgentError(err: js.Any): /* is ionic.ionic/definitions.SuperAgentError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperAgentError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.SuperAgentError */ Boolean]
  
  inline def isTreatableAilment(ailment: js.Any): /* is ionic.ionic/definitions.TreatableAilment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTreatableAilment")(ailment.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.TreatableAilment */ Boolean]
  
  inline def isUser(user: js.Any): /* is ionic.ionic/definitions.User */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUser")(user.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.User */ Boolean]
  
  inline def isUserResponse(res: APIResponse): /* is ionic.ionic/definitions.Response<ionic.ionic/definitions.User> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserResponse")(res.asInstanceOf[js.Any]).asInstanceOf[/* is ionic.ionic/definitions.Response<ionic.ionic/definitions.User> */ Boolean]
  
  inline def loadExecutor(ctx: IonicContext, pargv: js.Array[String]): js.Promise[Executor] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadExecutor")(ctx.asInstanceOf[js.Any], pargv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Executor]]
  
  inline def receive(msg: IPCMessage): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("receive")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def run(pargv: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
