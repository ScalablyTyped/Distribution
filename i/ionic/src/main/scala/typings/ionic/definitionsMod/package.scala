package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type APIResponseData = js.Object | js.Array[js.Object] | java.lang.String
  type CommandInstanceInfo = typings.ionicCliFramework.definitionsMod.CommandInstanceInfo[
    typings.ionic.definitionsMod.ICommand, 
    typings.ionic.definitionsMod.INamespace, 
    typings.ionic.definitionsMod.CommandMetadata, 
    typings.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typings.ionic.definitionsMod.CommandMetadataOption
  ]
  type CustomBuildOptions = typings.ionic.definitionsMod.BuildOptions[typings.ionic.ionicStrings.custom]
  type CustomServeOptions = typings.ionic.definitionsMod.ServeOptions
  type FeatureId = typings.ionic.ionicStrings.`ssl-commands`
  type HookContext = typings.ionic.definitionsMod.BaseHookContext with typings.ionic.definitionsMod.HookInput
  type HookFn = js.Function1[/* ctx */ typings.ionic.definitionsMod.HookContext, js.Promise[scala.Unit]]
  type HydratedCommandMetadata = typings.ionic.definitionsMod.CommandMetadata with (typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata[
    typings.ionic.definitionsMod.ICommand, 
    typings.ionic.definitionsMod.INamespace, 
    typings.ionic.definitionsMod.CommandMetadata, 
    typings.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typings.ionic.definitionsMod.CommandMetadataOption
  ])
  type Ionic1BuildOptions = typings.ionic.definitionsMod.BuildOptions[typings.ionic.ionicStrings.ionic1]
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type NamespaceLocateResult = typings.ionicCliFramework.definitionsMod.NamespaceLocateResult[
    typings.ionic.definitionsMod.ICommand, 
    typings.ionic.definitionsMod.INamespace, 
    typings.ionic.definitionsMod.CommandMetadata, 
    typings.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typings.ionic.definitionsMod.CommandMetadataOption
  ]
  type OAuthIdentity = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails}
    */ typings.ionic.ionicStrings.OAuthIdentity with js.Any
  type PackageVersions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PaginateArgs[T /* <: typings.ionic.definitionsMod.Response[js.Array[js.Object]] */] = typings.std.Pick[
    typings.ionic.definitionsMod.PaginatorDeps[T, typings.ionic.definitionsMod.PaginatorState], 
    typings.ionic.ionicStrings.reqgen | typings.ionic.ionicStrings.guard | typings.ionic.ionicStrings.state | typings.ionic.ionicStrings.max
  ]
  type PaginatorGuard[T /* <: typings.ionic.definitionsMod.Response[js.Array[js.Object]] */] = js.Function1[
    /* res */ typings.ionic.definitionsMod.APIResponseSuccess, 
    /* is T */ scala.Boolean
  ]
  type PaginatorRequestGenerator = js.Function0[js.Promise[typings.ionic.AnonReq]]
  type ResourcesConfig = org.scalablytyped.runtime.StringDictionary[typings.ionic.definitionsMod.ResourcesPlatform]
  type ResourcesPlatform = org.scalablytyped.runtime.StringDictionary[typings.ionic.AnonImages]
  type SuperAgentRequest = typings.superagent.mod.SuperAgentRequest
}
