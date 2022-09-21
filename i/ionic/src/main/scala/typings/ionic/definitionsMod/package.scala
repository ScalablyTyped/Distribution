package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.anon.Images
import typings.ionic.anon.Req
import typings.ionic.ionicStrings.`ssl-commands`
import typings.ionic.ionicStrings.custom
import typings.ionic.ionicStrings.ionic1
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type APIResponseData = js.Object | js.Array[js.Object] | String

type CommandInstanceInfo = typings.ionicCliFramework.definitionsMod.CommandInstanceInfo[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]

type CustomBuildOptions = BuildOptions[custom]

type CustomServeOptions = ServeOptions

type FeatureId = `ssl-commands`

type HookContext = BaseHookContext & HookInput

type HookFn = js.Function1[/* ctx */ HookContext, js.Promise[Unit]]

type HydratedCommandMetadata = CommandMetadata & (typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption])

type Ionic1BuildOptions = BuildOptions[ionic1]

type LogFn = js.Function1[/* msg */ String, Unit]

type NamespaceLocateResult = typings.ionicCliFramework.definitionsMod.NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]

type PackageVersions = StringDictionary[String]

type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */ Boolean]

type PaginatorRequestGenerator = js.Function0[js.Promise[Req]]

type ResourcesConfig = StringDictionary[ResourcesPlatform]

type ResourcesPlatform = StringDictionary[Images]

type SuperAgentRequest = typings.superagent.mod.SuperAgentRequest
