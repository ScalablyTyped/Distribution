package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceLocateResult[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
  
  val args: js.Array[String] = js.native
  
  val obj: C | N = js.native
  
  val path: js.Array[CommandPathItem[C, N, M, I, O]] = js.native
}
object NamespaceLocateResult {
  
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](args: js.Array[String], obj: C | N, path: js.Array[CommandPathItem[C, N, M, I, O]]): NamespaceLocateResult[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocateResult[C, N, M, I, O]]
  }
  
  @scala.inline
  implicit class NamespaceLocateResultMutableBuilder[Self <: NamespaceLocateResult[_, _, _, _, _], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self with (NamespaceLocateResult[C, N, M, I, O])) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setObj(value: C | N): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (CommandPathItem[C, N, M, I, O])*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
