package typings.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocateResult[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val args: js.Array[String]
  val obj: C | N
  val path: js.Array[CommandPathItem[C, N, M, I, O]]
}

object NamespaceLocateResult {
  @scala.inline
  def apply[C, N, M, I, O](args: js.Array[String], obj: C | N, path: js.Array[CommandPathItem[C, N, M, I, O]]): NamespaceLocateResult[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocateResult[C, N, M, I, O]]
  }
}

