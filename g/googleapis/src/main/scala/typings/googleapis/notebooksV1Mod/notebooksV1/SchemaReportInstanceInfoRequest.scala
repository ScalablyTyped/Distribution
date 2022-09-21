package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportInstanceInfoRequest extends StObject {
  
  /**
    * The metadata reported to Notebooks API. This will be merged to the instance metadata store
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportInstanceInfoRequest {
  
  inline def apply(): SchemaReportInstanceInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportInstanceInfoRequest]
  }
  
  extension [Self <: SchemaReportInstanceInfoRequest](x: Self) {
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
