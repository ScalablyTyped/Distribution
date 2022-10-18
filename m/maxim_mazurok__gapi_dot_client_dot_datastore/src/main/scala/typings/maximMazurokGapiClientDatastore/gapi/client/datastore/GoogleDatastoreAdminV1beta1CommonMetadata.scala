package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1beta1CommonMetadata extends StObject {
  
  /** The time the operation ended, either successfully or otherwise. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The client-assigned labels which were provided when the operation was created. May also include additional labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The type of the operation. Can be used as a filter in ListOperationsRequest. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** The time that work began on the operation. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The current state of the Operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1beta1CommonMetadata {
  
  inline def apply(): GoogleDatastoreAdminV1beta1CommonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1CommonMetadata]
  }
  
  extension [Self <: GoogleDatastoreAdminV1beta1CommonMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
