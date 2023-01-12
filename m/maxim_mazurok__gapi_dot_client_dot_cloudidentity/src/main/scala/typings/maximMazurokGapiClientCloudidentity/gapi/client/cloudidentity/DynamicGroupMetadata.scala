package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicGroupMetadata extends StObject {
  
  /** Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups. */
  var queries: js.UndefOr[js.Array[DynamicGroupQuery]] = js.undefined
  
  /** Output only. Status of the dynamic group. */
  var status: js.UndefOr[DynamicGroupStatus] = js.undefined
}
object DynamicGroupMetadata {
  
  inline def apply(): DynamicGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicGroupMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicGroupMetadata] (val x: Self) extends AnyVal {
    
    inline def setQueries(value: js.Array[DynamicGroupQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: DynamicGroupQuery*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setStatus(value: DynamicGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
