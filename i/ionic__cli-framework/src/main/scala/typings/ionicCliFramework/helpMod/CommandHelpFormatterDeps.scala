package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val command: C = js.native
  val location: NamespaceLocateResult[C, N, M, I, O] = js.native
  /**
    * Provide extra context with hydrated command metadata. If not provided,
    * `command.getMetadata()` is called.
    */
  val metadata: js.UndefOr[HydratedCommandMetadata[C, N, M, I, O]] = js.native
}

object CommandHelpFormatterDeps {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](command: C, location: NamespaceLocateResult[C, N, M, I, O]): CommandHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpFormatterDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CommandHelpFormatterDepsOps[Self <: CommandHelpFormatterDeps[_, _, _, _, _], /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (CommandHelpFormatterDeps[C, N, M, I, O])) extends AnyVal {
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
    def setCommand(value: C): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setMetadata(value: HydratedCommandMetadata[C, N, M, I, O]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

