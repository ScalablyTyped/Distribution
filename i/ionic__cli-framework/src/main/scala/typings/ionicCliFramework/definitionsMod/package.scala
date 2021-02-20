package typings.ionicCliFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object definitionsMod {
  
  type CommandLineInputs = js.Array[java.lang.String]
  
  type CommandMapGetter[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[C]]
  
  type CommandOptionType = typings.std.StringConstructor | typings.std.BooleanConstructor
  
  type CommandPathItem[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Tuple2[java.lang.String, C | N]
  
  type HydratedCommandMetadata[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = M with (typings.ionicCliFramework.anon.Aliases[C, N, M, I, O])
  
  type HydratedCommandMetadataOption[O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typings.std.Required[O]
  
  type ICommandMap[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typings.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typings.ionicCliFramework.definitionsMod.CommandMapGetter[C, N, M, I, O]
  ]
  
  type INamespaceMap[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typings.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typings.ionicCliFramework.definitionsMod.NamespaceMapGetter[C, N, M, I, O]
  ]
  
  type NamespaceMapGetter[C /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[N]]
  
  type NamespaceMetadata = typings.ionicCliFramework.definitionsMod.Metadata
  
  type ParsedArg = js.UndefOr[java.lang.String | scala.Boolean | scala.Null | js.Array[java.lang.String]]
  
  type Validator = js.Function2[
    /* input */ js.UndefOr[java.lang.String], 
    /* key */ js.UndefOr[java.lang.String], 
    typings.ionicCliFramework.ionicCliFrameworkBooleans.`true` | java.lang.String
  ]
}
