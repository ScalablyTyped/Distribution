package typings.grpcGrpcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalityPath extends js.Object {
  
  var localityPath: js.Array[String] = js.native
}
object LocalityPath {
  
  @scala.inline
  def apply(localityPath: js.Array[String]): LocalityPath = {
    val __obj = js.Dynamic.literal(localityPath = localityPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalityPath]
  }
  
  @scala.inline
  implicit class LocalityPathOps[Self <: LocalityPath] (val x: Self) extends AnyVal {
    
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
    def setLocalityPathVarargs(value: String*): Self = this.set("localityPath", js.Array(value :_*))
    
    @scala.inline
    def setLocalityPath(value: js.Array[String]): Self = this.set("localityPath", value.asInstanceOf[js.Any])
  }
}
