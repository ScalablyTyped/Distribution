package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteJobsByFilterRequest extends StObject {
  
  /**
    * Optional. If set to true, this call waits for all processing steps to complete before the job is cleaned up. Otherwise, the call returns while some steps are still taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Restrictions on the scope of the delete request.
    */
  var filter: js.UndefOr[SchemaFilter] = js.undefined
}
object SchemaDeleteJobsByFilterRequest {
  
  inline def apply(): SchemaDeleteJobsByFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteJobsByFilterRequest]
  }
  
  extension [Self <: SchemaDeleteJobsByFilterRequest](x: Self) {
    
    inline def setDisableFastProcess(value: Boolean): Self = StObject.set(x, "disableFastProcess", value.asInstanceOf[js.Any])
    
    inline def setDisableFastProcessNull: Self = StObject.set(x, "disableFastProcess", null)
    
    inline def setDisableFastProcessUndefined: Self = StObject.set(x, "disableFastProcess", js.undefined)
    
    inline def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
