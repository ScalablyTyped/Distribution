package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type CommandLineInputs = js.Array[java.lang.String]
  type CommandMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[C]]
  type CommandOptionType = stdLib.StringConstructor | stdLib.BooleanConstructor
  type CommandPathItem[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Tuple2[java.lang.String, C | N]
  type Footnote = TextFootnote | LinkFootnote
  type HydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = M with (atIonicCliDashFrameworkLib.Anon_Aliases[I, N, O, M, C])
  type HydratedCommandMetadataOption[O /* <: CommandMetadataOption */] = stdLib.Readonly[stdLib.Required[O]]
  type ICommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = atIonicCliDashFrameworkLib.utilsObjectMod.AliasedMap[java.lang.String, CommandMapGetter[C, N, M, I, O]]
  type INamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = atIonicCliDashFrameworkLib.utilsObjectMod.AliasedMap[java.lang.String, NamespaceMapGetter[C, N, M, I, O]]
  type NamespaceMapGetter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] = js.Function0[js.Promise[N]]
  type NamespaceMetadata = Metadata
  type ParsedArg = js.UndefOr[java.lang.String | scala.Boolean | scala.Null | js.Array[java.lang.String]]
  type Validator = js.Function2[
    /* input */ js.UndefOr[java.lang.String], 
    /* key */ js.UndefOr[java.lang.String], 
    atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibNumbers.`true` | java.lang.String
  ]
}
