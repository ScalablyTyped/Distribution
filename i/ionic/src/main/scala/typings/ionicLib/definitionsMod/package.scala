package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type APIResponseData = js.Object | js.Array[js.Object] | java.lang.String
  type CommandInstanceInfo = atIonicCliDashFrameworkLib.definitionsMod.CommandInstanceInfo[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ]
  type CustomBuildOptions = BuildOptions[ionicLib.ionicLibStrings.custom]
  type CustomServeOptions = ServeOptions
  type FeatureId = ionicLib.ionicLibStrings.`ssl-commands`
  type HookContext = BaseHookContext with HookInput
  type HookFn = js.Function1[/* ctx */ HookContext, js.Promise[scala.Unit]]
  type HydratedCommandMetadata = CommandMetadata with (atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ])
  type Ionic1BuildOptions = BuildOptions[ionicLib.ionicLibStrings.ionic1]
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type NamespaceLocateResult = atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[
    ICommand, 
    INamespace, 
    CommandMetadata, 
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
    CommandMetadataOption
  ]
  type OAuthIdentity = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails}
    */ ionicLib.ionicLibStrings.OAuthIdentity with js.Any
  type PackageVersions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PaginateArgs[T /* <: Response[js.Array[js.Object]] */] = stdLib.Pick[
    PaginatorDeps[T, PaginatorState], 
    ionicLib.ionicLibStrings.reqgen | ionicLib.ionicLibStrings.guard | ionicLib.ionicLibStrings.state | ionicLib.ionicLibStrings.max
  ]
  type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */ scala.Boolean]
  type PaginatorRequestGenerator = js.Function0[js.Promise[ionicLib.Anon_Req]]
  type ResourcesConfig = org.scalablytyped.runtime.StringDictionary[ResourcesPlatform]
  type ResourcesPlatform = org.scalablytyped.runtime.StringDictionary[ionicLib.Anon_Images]
  type SuperAgentRequest = superagentLib.superagentMod.SuperAgentRequest
}
