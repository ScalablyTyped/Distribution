package typings.jscodeshift.coreMod

import typings.jscodeshift.jsxelementMod.MappingMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mappings extends js.Object {
  
  var JSXElement: MappingMethods = js.native
}
object Mappings {
  
  @scala.inline
  def apply(JSXElement: MappingMethods): Mappings = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
  
  @scala.inline
  implicit class MappingsOps[Self <: Mappings] (val x: Self) extends AnyVal {
    
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
    def setJSXElement(value: MappingMethods): Self = this.set("JSXElement", value.asInstanceOf[js.Any])
  }
}
