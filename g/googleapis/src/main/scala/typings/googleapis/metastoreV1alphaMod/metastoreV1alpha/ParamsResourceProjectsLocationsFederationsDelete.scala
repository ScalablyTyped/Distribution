package typings.googleapis.metastoreV1alphaMod.metastoreV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFederationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the metastore federation to delete, in the following form:projects/{project_number\}/locations/{location_id\}/federations/{federation_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A request ID. Specify a unique request ID to allow the server to ignore the request if it has completed. The server will ignore subsequent requests that provide a duplicate request ID for at least 60 minutes after the first request.For example, if an initial request times out, followed by another request with the same request ID, the server ignores the second request to prevent the creation of duplicate commitments.The request ID must be a valid UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier#Format) A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFederationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsFederationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFederationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFederationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
