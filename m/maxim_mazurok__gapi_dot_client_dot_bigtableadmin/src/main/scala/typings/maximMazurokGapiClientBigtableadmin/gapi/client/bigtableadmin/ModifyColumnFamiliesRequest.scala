package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyColumnFamiliesRequest extends js.Object {
  
  /**
    * Required. Modifications to be atomically applied to the specified table's families. Entries are applied in order, meaning that earlier modifications can be masked by later ones (in
    * the case of repeated updates to the same family, for example).
    */
  var modifications: js.UndefOr[js.Array[Modification]] = js.native
}
object ModifyColumnFamiliesRequest {
  
  @scala.inline
  def apply(): ModifyColumnFamiliesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyColumnFamiliesRequest]
  }
  
  @scala.inline
  implicit class ModifyColumnFamiliesRequestOps[Self <: ModifyColumnFamiliesRequest] (val x: Self) extends AnyVal {
    
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
    def setModificationsVarargs(value: Modification*): Self = this.set("modifications", js.Array(value :_*))
    
    @scala.inline
    def setModifications(value: js.Array[Modification]): Self = this.set("modifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifications: Self = this.set("modifications", js.undefined)
  }
}
