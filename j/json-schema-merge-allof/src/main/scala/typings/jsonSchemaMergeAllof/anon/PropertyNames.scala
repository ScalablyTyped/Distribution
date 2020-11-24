package typings.jsonSchemaMergeAllof.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyNames extends js.Object {
  
  var propertyNames: js.UndefOr[js.Any] = js.native
}
object PropertyNames {
  
  @scala.inline
  def apply(): PropertyNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyNames]
  }
  
  @scala.inline
  implicit class PropertyNamesOps[Self <: PropertyNames] (val x: Self) extends AnyVal {
    
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
    def setPropertyNames(value: js.Any): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyNames: Self = this.set("propertyNames", js.undefined)
  }
}
