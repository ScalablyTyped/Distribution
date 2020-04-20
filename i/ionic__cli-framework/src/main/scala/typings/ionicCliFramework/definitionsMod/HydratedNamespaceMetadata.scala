package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<std.Readonly<@ionic/cli-framework.@ionic/cli-framework/definitions.NamespaceMetadata>> */
trait HydratedNamespaceMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val aliases: js.Array[String]
  var description: String
  var footnotes: js.Array[Footnote]
  var groups: js.Array[String]
  var name: String
  val namespace: N
  var summary: String
}

object HydratedNamespaceMetadata {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
    aliases: js.Array[String],
    description: String,
    footnotes: js.Array[Footnote],
    groups: js.Array[String],
    name: String,
    namespace: N,
    summary: String
  ): HydratedNamespaceMetadata[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydratedNamespaceMetadata[C, N, M, I, O]]
  }
}

