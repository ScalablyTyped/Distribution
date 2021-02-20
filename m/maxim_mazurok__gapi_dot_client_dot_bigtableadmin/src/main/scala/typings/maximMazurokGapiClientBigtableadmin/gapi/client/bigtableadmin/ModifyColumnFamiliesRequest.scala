package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyColumnFamiliesRequest extends StObject {
  
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
  implicit class ModifyColumnFamiliesRequestMutableBuilder[Self <: ModifyColumnFamiliesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifications(value: js.Array[Modification]): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
    
    @scala.inline
    def setModificationsVarargs(value: Modification*): Self = StObject.set(x, "modifications", js.Array(value :_*))
  }
}
