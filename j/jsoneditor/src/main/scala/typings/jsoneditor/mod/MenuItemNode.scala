package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemNode extends StObject {
  
  var path: js.Array[String]
  
  var paths: js.Array[js.Array[String]]
  
  var `type`: MenuItemNodeType
}
object MenuItemNode {
  
  @scala.inline
  def apply(path: js.Array[String], paths: js.Array[js.Array[String]], `type`: MenuItemNodeType): MenuItemNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemNode]
  }
  
  @scala.inline
  implicit class MenuItemNodeMutableBuilder[Self <: MenuItemNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: js.Array[String]*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MenuItemNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
