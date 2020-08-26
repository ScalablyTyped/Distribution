package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<std.Readonly<@ionic/cli-framework.@ionic/cli-framework/definitions.NamespaceMetadata>> */
@js.native
trait HydratedNamespaceMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val aliases: js.Array[String] = js.native
  var description: String = js.native
  var footnotes: js.Array[Footnote] = js.native
  var groups: js.Array[String] = js.native
  var name: String = js.native
  val namespace: N = js.native
  var summary: String = js.native
}

object HydratedNamespaceMetadata {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](
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
  @scala.inline
  implicit class HydratedNamespaceMetadataOps[Self <: HydratedNamespaceMetadata[_, _, _, _, _], /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (HydratedNamespaceMetadata[C, N, M, I, O])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFootnotesVarargs(value: Footnote*): Self = this.set("footnotes", js.Array(value :_*))
    @scala.inline
    def setFootnotes(value: js.Array[Footnote]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: N): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

