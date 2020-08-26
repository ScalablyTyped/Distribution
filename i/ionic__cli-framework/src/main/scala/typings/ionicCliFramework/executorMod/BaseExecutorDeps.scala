package typings.ionicCliFramework.executorMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseExecutorDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val namespace: N = js.native
  val stderr: js.UndefOr[WriteStream] = js.native
  val stdout: js.UndefOr[WriteStream] = js.native
}

object BaseExecutorDeps {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](namespace: N): BaseExecutorDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class BaseExecutorDepsOps[Self <: BaseExecutorDeps[_, _, _, _, _], /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (BaseExecutorDeps[C, N, M, I, O])) extends AnyVal {
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
    def setNamespace(value: N): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
  
}

