package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfileJobConfig extends StObject {
  
  /**
    * Actions to execute at the completion of the job.
    */
  var dataProfileActions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DataProfileAction]] = js.undefined
  
  /**
    * Detection logic for profile generation. Not all template features are used by profiles. FindingLimits, include_quote and exclude_info_types have no impact on data profiling. Multiple templates may be provided if there is data in multiple regions. At most one template must be specified per-region (including "global"). Each region is scanned using the applicable template. If no region-specific template is specified, but a "global" template is specified, it will be copied to that region and used instead. If no global or region-specific template is provided for a region with data, that region's data will not be scanned. For more information, see https://cloud.google.com/dlp/docs/data-profiles#data_residency.
    */
  var inspectTemplates: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The data to scan.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2DataProfileLocation] = js.undefined
  
  /**
    * The project that will run the scan. The DLP service account that exists within this project must have access to all resources that are profiled, and the Cloud DLP API must be enabled.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfileJobConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfileJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfileJobConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfileJobConfig](x: Self) {
    
    inline def setDataProfileActions(value: js.Array[SchemaGooglePrivacyDlpV2DataProfileAction]): Self = StObject.set(x, "dataProfileActions", value.asInstanceOf[js.Any])
    
    inline def setDataProfileActionsUndefined: Self = StObject.set(x, "dataProfileActions", js.undefined)
    
    inline def setDataProfileActionsVarargs(value: SchemaGooglePrivacyDlpV2DataProfileAction*): Self = StObject.set(x, "dataProfileActions", js.Array(value*))
    
    inline def setInspectTemplates(value: js.Array[String]): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplatesNull: Self = StObject.set(x, "inspectTemplates", null)
    
    inline def setInspectTemplatesUndefined: Self = StObject.set(x, "inspectTemplates", js.undefined)
    
    inline def setInspectTemplatesVarargs(value: String*): Self = StObject.set(x, "inspectTemplates", js.Array(value*))
    
    inline def setLocation(value: SchemaGooglePrivacyDlpV2DataProfileLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
