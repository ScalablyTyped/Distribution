package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HybridOptions extends StObject {
  
  /**
    * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * These are labels that each inspection request must include within their 'finding_labels' map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
    */
  var requiredFindingLabelKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
    */
  var tableOptions: js.UndefOr[SchemaGooglePrivacyDlpV2TableOptions] = js.undefined
}
object SchemaGooglePrivacyDlpV2HybridOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HybridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HybridOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HybridOptions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRequiredFindingLabelKeys(value: js.Array[String]): Self = StObject.set(x, "requiredFindingLabelKeys", value.asInstanceOf[js.Any])
    
    inline def setRequiredFindingLabelKeysNull: Self = StObject.set(x, "requiredFindingLabelKeys", null)
    
    inline def setRequiredFindingLabelKeysUndefined: Self = StObject.set(x, "requiredFindingLabelKeys", js.undefined)
    
    inline def setRequiredFindingLabelKeysVarargs(value: String*): Self = StObject.set(x, "requiredFindingLabelKeys", js.Array(value*))
    
    inline def setTableOptions(value: SchemaGooglePrivacyDlpV2TableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
  }
}
