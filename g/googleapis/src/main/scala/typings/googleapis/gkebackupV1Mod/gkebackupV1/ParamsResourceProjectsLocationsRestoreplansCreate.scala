package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location within which to create the RestorePlan. Format: `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestorePlan] = js.undefined
  
  /**
    * Required. The client-provided short name for the RestorePlan resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of RestorePlans in this location
    */
  var restorePlanId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRestorePlan): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRestorePlanId(value: String): Self = StObject.set(x, "restorePlanId", value.asInstanceOf[js.Any])
    
    inline def setRestorePlanIdUndefined: Self = StObject.set(x, "restorePlanId", js.undefined)
  }
}
