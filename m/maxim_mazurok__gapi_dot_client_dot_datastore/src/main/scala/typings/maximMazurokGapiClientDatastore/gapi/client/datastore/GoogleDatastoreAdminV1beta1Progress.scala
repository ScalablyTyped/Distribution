package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1beta1Progress extends StObject {
  
  /** The amount of work that has been completed. Note that this may be greater than work_estimated. */
  var workCompleted: js.UndefOr[String] = js.undefined
  
  /** An estimate of how much work needs to be performed. May be zero if the work estimate is unavailable. */
  var workEstimated: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1beta1Progress {
  
  inline def apply(): GoogleDatastoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDatastoreAdminV1beta1Progress] (val x: Self) extends AnyVal {
    
    inline def setWorkCompleted(value: String): Self = StObject.set(x, "workCompleted", value.asInstanceOf[js.Any])
    
    inline def setWorkCompletedUndefined: Self = StObject.set(x, "workCompleted", js.undefined)
    
    inline def setWorkEstimated(value: String): Self = StObject.set(x, "workEstimated", value.asInstanceOf[js.Any])
    
    inline def setWorkEstimatedUndefined: Self = StObject.set(x, "workEstimated", js.undefined)
  }
}
