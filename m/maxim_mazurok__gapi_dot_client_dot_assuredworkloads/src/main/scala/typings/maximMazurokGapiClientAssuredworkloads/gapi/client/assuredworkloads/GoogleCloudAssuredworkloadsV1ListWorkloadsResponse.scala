package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1ListWorkloadsResponse extends StObject {
  
  /** The next page token. Return empty if reached the last page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of Workloads under a given parent. */
  var workloads: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsV1Workload]] = js.undefined
}
object GoogleCloudAssuredworkloadsV1ListWorkloadsResponse {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1ListWorkloadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1ListWorkloadsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssuredworkloadsV1ListWorkloadsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloads(value: js.Array[GoogleCloudAssuredworkloadsV1Workload]): Self = StObject.set(x, "workloads", value.asInstanceOf[js.Any])
    
    inline def setWorkloadsUndefined: Self = StObject.set(x, "workloads", js.undefined)
    
    inline def setWorkloadsVarargs(value: GoogleCloudAssuredworkloadsV1Workload*): Self = StObject.set(x, "workloads", js.Array(value*))
  }
}
