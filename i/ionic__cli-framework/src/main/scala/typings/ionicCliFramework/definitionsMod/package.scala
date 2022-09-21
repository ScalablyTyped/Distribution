package typings.ionicCliFramework.definitionsMod

import typings.ionicCliFramework.anon.Aliases
import typings.ionicCliFramework.ionicCliFrameworkBooleans.`true`
import typings.ionicUtilsObject.mod.AliasedMap
import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CommandLineInputs = js.Array[String]

type CommandMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[C]]

type CommandOptionType = StringConstructor | BooleanConstructor

type CommandPathItem[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Tuple2[String, C | N]

type HydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = M & (Aliases[C, N, M, I, O])

type ICommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = AliasedMap[String, CommandMapGetter[C, N, M, I, O]]

type INamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = AliasedMap[String, NamespaceMapGetter[C, N, M, I, O]]

type NamespaceMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[N]]

type NamespaceMetadata = Metadata

type ParsedArg = js.UndefOr[String | Boolean | Null | js.Array[String]]

type Validator = js.Function2[/* input */ js.UndefOr[String], /* key */ js.UndefOr[String], `true` | String]
