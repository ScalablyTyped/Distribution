package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
  import typings.ionic.Anon_Images
  import typings.ionic.Anon_Req
  import typings.ionic.ionicStrings.`ssl-commands`
  import typings.ionic.ionicStrings.custom
  import typings.ionic.ionicStrings.guard
  import typings.ionic.ionicStrings.ionic1
  import typings.ionic.ionicStrings.max
  import typings.ionic.ionicStrings.reqgen
  import typings.ionic.ionicStrings.state
  import typings.std.Pick

  type APIResponseData = js.Object | js.Array[js.Object] | String
  type CommandInstanceInfo = typings.atIonicCliDashFramework.definitionsMod.CommandInstanceInfo[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  type CustomBuildOptions = BuildOptions[custom]
  type CustomServeOptions = ServeOptions
  type FeatureId = `ssl-commands`
  type HookContext = BaseHookContext with HookInput
  type HookFn = js.Function1[/* ctx */ HookContext, js.Promise[Unit]]
  type HydratedCommandMetadata = CommandMetadata with (typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption])
  type Ionic1BuildOptions = BuildOptions[ionic1]
  type LogFn = js.Function1[/* msg */ String, Unit]
  type NamespaceLocateResult = typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  type OAuthIdentity = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails}
    */ typings.ionic.ionicStrings.OAuthIdentity with js.Any
  type PackageVersions = StringDictionary[String]
  type PaginateArgs[T /* <: Response[js.Array[js.Object]] */] = Pick[PaginatorDeps[T, PaginatorState], reqgen | guard | state | max]
  type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */ Boolean]
  type PaginatorRequestGenerator = js.Function0[js.Promise[Anon_Req]]
  type ResourcesConfig = StringDictionary[ResourcesPlatform]
  type ResourcesPlatform = StringDictionary[Anon_Images]
  type SuperAgentRequest = typings.superagent.superagentMod.SuperAgentRequest
}
