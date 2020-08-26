package typings.ionicCliFramework.anon

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.CommandPathItem
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aliases[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val aliases: js.Array[String] = js.native
  val command: C = js.native
  val namespace: N = js.native
  val path: js.Array[CommandPathItem[C, N, M, I, O]] = js.native
}

object Aliases {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](
    aliases: js.Array[String],
    command: C,
    namespace: N,
    path: js.Array[CommandPathItem[C, N, M, I, O]]
  ): Aliases[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases[C, N, M, I, O]]
  }
  @scala.inline
  implicit class AliasesOps[Self <: Aliases[_, _, _, _, _], /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (Aliases[C, N, M, I, O])) extends AnyVal {
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
    def setCommand(value: C): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: N): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (CommandPathItem[C, N, M, I, O])*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

