package typings.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceChainContext extends js.Object {
  
  var getter: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[Boolean] = js.native
  
  var property: js.UndefOr[Boolean] = js.native
  
  var setter: js.UndefOr[Boolean] = js.native
  
  var value: js.Any = js.native
}
object InstanceChainContext {
  
  @scala.inline
  def apply(value: js.Any): InstanceChainContext = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceChainContext]
  }
  
  @scala.inline
  implicit class InstanceChainContextOps[Self <: InstanceChainContext] (val x: Self) extends AnyVal {
    
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetter(value: Boolean): Self = this.set("getter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetter: Self = this.set("getter", js.undefined)
    
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setProperty(value: Boolean): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setSetter(value: Boolean): Self = this.set("setter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
  }
}
