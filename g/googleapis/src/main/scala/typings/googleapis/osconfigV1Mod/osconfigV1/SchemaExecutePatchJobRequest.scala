package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutePatchJobRequest extends StObject {
  
  /**
    * Description of the patch job. Length of the description is limited to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name for this patch job. This does not have to be unique.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this patch is a dry-run only, instances are contacted but will do nothing.
    */
  var dryRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Duration of the patch job. After the duration ends, the patch job times out.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Instances to patch, either explicitly or filtered by some criteria such as zone or labels.
    */
  var instanceFilter: js.UndefOr[SchemaPatchInstanceFilter] = js.undefined
  
  /**
    * Patch configuration being applied. If omitted, instances are patched using the default configurations.
    */
  var patchConfig: js.UndefOr[SchemaPatchConfig] = js.undefined
  
  /**
    * Rollout strategy of the patch job.
    */
  var rollout: js.UndefOr[SchemaPatchRollout] = js.undefined
}
object SchemaExecutePatchJobRequest {
  
  inline def apply(): SchemaExecutePatchJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutePatchJobRequest]
  }
  
  extension [Self <: SchemaExecutePatchJobRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunNull: Self = StObject.set(x, "dryRun", null)
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInstanceFilter(value: SchemaPatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setPatchConfig(value: SchemaPatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    inline def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    inline def setRollout(value: SchemaPatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
  }
}
