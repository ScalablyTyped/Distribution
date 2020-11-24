package typings.iitc.inteltypesMod.Intel

import typings.iitc.anon.Markup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlextContainer extends js.Object {
  
  var plext: Markup = js.native
}
object PlextContainer {
  
  @scala.inline
  def apply(plext: Markup): PlextContainer = {
    val __obj = js.Dynamic.literal(plext = plext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlextContainer]
  }
  
  @scala.inline
  implicit class PlextContainerOps[Self <: PlextContainer] (val x: Self) extends AnyVal {
    
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
    def setPlext(value: Markup): Self = this.set("plext", value.asInstanceOf[js.Any])
  }
}
