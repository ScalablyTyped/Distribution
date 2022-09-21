package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansRestoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The RestorePlan within which to create the Restore. Format: `projects/x/locations/x/restorePlans/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestore] = js.undefined
  
  /**
    * Required. The client-provided short name for the Restore resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of Restores in this RestorePlan.
    */
  var restoreId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansRestoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansRestoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansRestoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansRestoresCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRestore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRestoreId(value: String): Self = StObject.set(x, "restoreId", value.asInstanceOf[js.Any])
    
    inline def setRestoreIdUndefined: Self = StObject.set(x, "restoreId", js.undefined)
  }
}
