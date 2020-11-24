package typings.materialUiCore.reactHelpersMod

import typings.materialUiCore.anon.StandardPropsnevernever
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedMuiElement extends js.Object {
  
  var key: String | Double | Null = js.native
  
  var props: StandardPropsnevernever = js.native
  
  var `type`: NamedMuiComponent = js.native
}
object NamedMuiElement {
  
  @scala.inline
  def apply(props: StandardPropsnevernever, `type`: NamedMuiComponent): NamedMuiElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedMuiElement]
  }
  
  @scala.inline
  implicit class NamedMuiElementOps[Self <: NamedMuiElement] (val x: Self) extends AnyVal {
    
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
    def setProps(value: StandardPropsnevernever): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NamedMuiComponent): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
}
