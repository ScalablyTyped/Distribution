package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1MigrationProgressEvent extends StObject {
  
  /** Details for the `PREPARE` step. */
  var prepareStepDetails: js.UndefOr[GoogleDatastoreAdminV1PrepareStepDetails] = js.undefined
  
  /** Details for the `REDIRECT_WRITES` step. */
  var redirectWritesStepDetails: js.UndefOr[GoogleDatastoreAdminV1RedirectWritesStepDetails] = js.undefined
  
  /** The step that is starting. An event with step set to `START` indicates that the migration has been reverted back to the initial pre-migration state. */
  var step: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1MigrationProgressEvent {
  
  inline def apply(): GoogleDatastoreAdminV1MigrationProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1MigrationProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDatastoreAdminV1MigrationProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setPrepareStepDetails(value: GoogleDatastoreAdminV1PrepareStepDetails): Self = StObject.set(x, "prepareStepDetails", value.asInstanceOf[js.Any])
    
    inline def setPrepareStepDetailsUndefined: Self = StObject.set(x, "prepareStepDetails", js.undefined)
    
    inline def setRedirectWritesStepDetails(value: GoogleDatastoreAdminV1RedirectWritesStepDetails): Self = StObject.set(x, "redirectWritesStepDetails", value.asInstanceOf[js.Any])
    
    inline def setRedirectWritesStepDetailsUndefined: Self = StObject.set(x, "redirectWritesStepDetails", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
