package typings.ltx.elementMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementJson extends js.Object {
  
  var attrs: StringDictionary[js.Any] = js.native
  
  var children: js.Array[ElementJson | TextNode] = js.native
  
  var name: String = js.native
}
object ElementJson {
  
  @scala.inline
  def apply(attrs: StringDictionary[js.Any], children: js.Array[ElementJson | TextNode], name: String): ElementJson = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementJson]
  }
  
  @scala.inline
  implicit class ElementJsonOps[Self <: ElementJson] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (ElementJson | TextNode)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ElementJson | TextNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
