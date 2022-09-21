package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1MigrationProgressEvent extends StObject {
  
  /**
    * Details for the `PREPARE` step.
    */
  var prepareStepDetails: js.UndefOr[SchemaGoogleDatastoreAdminV1PrepareStepDetails] = js.undefined
  
  /**
    * Details for the `REDIRECT_WRITES` step.
    */
  var redirectWritesStepDetails: js.UndefOr[SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails] = js.undefined
  
  /**
    * The step that is starting. An event with step set to `START` indicates that the migration has been reverted back to the initial pre-migration state.
    */
  var step: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1MigrationProgressEvent {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1MigrationProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1MigrationProgressEvent]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1MigrationProgressEvent](x: Self) {
    
    inline def setPrepareStepDetails(value: SchemaGoogleDatastoreAdminV1PrepareStepDetails): Self = StObject.set(x, "prepareStepDetails", value.asInstanceOf[js.Any])
    
    inline def setPrepareStepDetailsUndefined: Self = StObject.set(x, "prepareStepDetails", js.undefined)
    
    inline def setRedirectWritesStepDetails(value: SchemaGoogleDatastoreAdminV1RedirectWritesStepDetails): Self = StObject.set(x, "redirectWritesStepDetails", value.asInstanceOf[js.Any])
    
    inline def setRedirectWritesStepDetailsUndefined: Self = StObject.set(x, "redirectWritesStepDetails", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
