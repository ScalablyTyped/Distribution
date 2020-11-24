package typings.ionicCore.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteNode extends RouteEntry {
  
  var children: RouteTree = js.native
}
object RouteNode {
  
  @scala.inline
  def apply(children: RouteTree, id: String, path: js.Array[String]): RouteNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteNode]
  }
  
  @scala.inline
  implicit class RouteNodeOps[Self <: RouteNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: RouteNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: RouteTree): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
