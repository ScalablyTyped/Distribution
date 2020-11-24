package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOperationDnsKeyContext extends js.Object {
  
  var newValue: js.UndefOr[SchemaDnsKey] = js.native
  
  var oldValue: js.UndefOr[SchemaDnsKey] = js.native
}
object SchemaOperationDnsKeyContext {
  
  @scala.inline
  def apply(): SchemaOperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationDnsKeyContext]
  }
  
  @scala.inline
  implicit class SchemaOperationDnsKeyContextOps[Self <: SchemaOperationDnsKeyContext] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: SchemaDnsKey): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: SchemaDnsKey): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
