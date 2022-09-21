package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupplansCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The client-provided short name for the BackupPlan resource. This name must: - be between 1 and 63 characters long (inclusive) - consist of only lower-case ASCII letters, numbers, and dashes - start with a lower-case letter - end with a lower-case letter or number - be unique within the set of BackupPlans in this location
    */
  var backupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The location within which to create the BackupPlan. Format: `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBackupPlan] = js.undefined
}
object ParamsResourceProjectsLocationsBackupplansCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupplansCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupplansCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupplansCreate](x: Self) {
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "backupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanIdUndefined: Self = StObject.set(x, "backupPlanId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBackupPlan): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
