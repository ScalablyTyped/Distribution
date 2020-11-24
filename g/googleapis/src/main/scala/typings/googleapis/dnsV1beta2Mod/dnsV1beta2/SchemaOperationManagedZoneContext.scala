package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOperationManagedZoneContext extends js.Object {
  
  var newValue: js.UndefOr[SchemaManagedZone] = js.native
  
  var oldValue: js.UndefOr[SchemaManagedZone] = js.native
}
object SchemaOperationManagedZoneContext {
  
  @scala.inline
  def apply(): SchemaOperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationManagedZoneContext]
  }
  
  @scala.inline
  implicit class SchemaOperationManagedZoneContextOps[Self <: SchemaOperationManagedZoneContext] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: SchemaManagedZone): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: SchemaManagedZone): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
