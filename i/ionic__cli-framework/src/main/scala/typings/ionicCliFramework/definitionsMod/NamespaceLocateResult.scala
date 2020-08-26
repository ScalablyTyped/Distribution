package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceLocateResult[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val args: js.Array[String] = js.native
  val obj: C | N = js.native
  val path: js.Array[CommandPathItem[C, N, M, I, O]] = js.native
}

object NamespaceLocateResult {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](args: js.Array[String], obj: C | N, path: js.Array[CommandPathItem[C, N, M, I, O]]): NamespaceLocateResult[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocateResult[C, N, M, I, O]]
  }
  @scala.inline
  implicit class NamespaceLocateResultOps[Self <: NamespaceLocateResult[_, _, _, _, _], /* <: typings.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typings.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typings.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (NamespaceLocateResult[C, N, M, I, O])) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setObj(value: C | N): Self = this.set("obj", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: (CommandPathItem[C, N, M, I, O])*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

