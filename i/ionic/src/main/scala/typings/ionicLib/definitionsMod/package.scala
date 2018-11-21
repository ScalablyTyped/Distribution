package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type APIResponse = APIResponseSuccess | APIResponseError
  type APIResponseData = js.Object | js.Array[js.Object] | java.lang.String
  type AssociationType = ionicLib.ionicLibStrings.github | ionicLib.ionicLibStrings.bitbucket_cloud | ionicLib.ionicLibStrings.bitbucket_server
  type CommandInstanceInfo = atIonicCliDashFrameworkLib.definitionsMod.CommandInstanceInfo[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ]
  type DistTag = ionicLib.ionicLibStrings.testing | ionicLib.ionicLibStrings.canary | ionicLib.ionicLibStrings.latest
  type FeatureId = ionicLib.ionicLibStrings.`ssl-commands`
  type HookContext = BaseHookContext with HookInput
  type HookFn = js.Function1[/* ctx */ HookContext, stdLib.Promise[scala.Unit]]
  type HookInput = BuildHookInput | ServeBeforeHookInput | ServeAfterHookInput
  type HookName = ionicLib.ionicLibStrings.`build:before` | ionicLib.ionicLibStrings.`build:after` | ionicLib.ionicLibStrings.`serve:before` | ionicLib.ionicLibStrings.`serve:after`
  type HttpMethod = ionicLib.ionicLibStrings.GET | ionicLib.ionicLibStrings.POST | ionicLib.ionicLibStrings.PATCH | ionicLib.ionicLibStrings.PUT | ionicLib.ionicLibStrings.DELETE | ionicLib.ionicLibStrings.PURGE | ionicLib.ionicLibStrings.HEAD | ionicLib.ionicLibStrings.OPTIONS
  type HydratedCommandMetadata = CommandMetadata with (atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ])
  type InfoItemGroup = ionicLib.ionicLibStrings.ionic | ionicLib.ionicLibStrings.capacitor | ionicLib.ionicLibStrings.cordova | ionicLib.ionicLibStrings.system | ionicLib.ionicLibStrings.environment
  type IntegrationName = ionicLib.ionicLibStrings.capacitor | ionicLib.ionicLibStrings.cordova
  type Ionic1BuildOptions = BuildOptions[ionicLib.ionicLibStrings.ionic1]
  type KnownPlatform = ionicLib.ionicLibStrings.ios | ionicLib.ionicLibStrings.android | ionicLib.ionicLibStrings.wp8 | ionicLib.ionicLibStrings.windows | ionicLib.ionicLibStrings.browser
  type KnownResourceType = ionicLib.ionicLibStrings.icon | ionicLib.ionicLibStrings.splash
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type NamespaceLocateResult = atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ]
  type NpmClient = ionicLib.ionicLibStrings.yarn | ionicLib.ionicLibStrings.npm
  type OAuthIdentity = ionicLib.ionicLibStrings.OAuthIdentity with js.Any
  type PaginateArgs[T /* <: Response[js.Array[js.Object]] */] = stdLib.Pick[
    PaginatorDeps[T, PaginatorState], 
    ionicLib.ionicLibStrings.reqgen | ionicLib.ionicLibStrings.guard | ionicLib.ionicLibStrings.state | ionicLib.ionicLibStrings.max
  ]
  type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */scala.Boolean]
  type PaginatorRequestGenerator = js.Function0[stdLib.Promise[ionicLib.Anon_Req]]
  type ProjectFile = IProjectConfig | MultiProjectConfig
  type ProjectType = ionicLib.ionicLibStrings.angular | ionicLib.ionicLibStrings.`ionic-angular` | ionicLib.ionicLibStrings.ionic1 | ionicLib.ionicLibStrings.custom
  type RepoAssociation = GithubRepoAssociation | BitbucketCloudRepoAssociation | BitbucketServerRepoAssociation
}
