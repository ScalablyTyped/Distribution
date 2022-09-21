package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvaluateAnnotationStoreRequest extends StObject {
  
  /**
    * The BigQuery table where the server writes the output. BigQueryDestination requires the `roles/bigquery.dataEditor` and `roles/bigquery.jobUser` Cloud IAM roles.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination] = js.undefined
  
  /**
    * Optional. InfoType mapping for `eval_store`. Different resources can map to the same infoType. For example, `PERSON_NAME`, `PERSON`, `NAME`, and `HUMAN` are different. To map all of these into a single infoType (such as `PERSON_NAME`), specify the following mapping: ``` info_type_mapping["PERSON"] = "PERSON_NAME" info_type_mapping["NAME"] = "PERSON_NAME" info_type_mapping["HUMAN"] = "PERSON_NAME" ``` Unmentioned infoTypes, such as `DATE`, are treated as identity mapping. For example: ``` info_type_mapping["DATE"] = "DATE" ``` InfoTypes are case-insensitive.
    */
  var evalInfoTypeMapping: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Similar to `eval_info_type_mapping`, infoType mapping for `golden_store`.
    */
  var goldenInfoTypeMapping: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The Annotation store to use as ground truth, in the format of `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/annotationStores/{annotation_store_id\}`.
    */
  var goldenStore: js.UndefOr[String | Null] = js.undefined
  
  var infoTypeConfig: js.UndefOr[SchemaInfoTypeConfig] = js.undefined
}
object SchemaEvaluateAnnotationStoreRequest {
  
  inline def apply(): SchemaEvaluateAnnotationStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvaluateAnnotationStoreRequest]
  }
  
  extension [Self <: SchemaEvaluateAnnotationStoreRequest](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setEvalInfoTypeMapping(value: StringDictionary[String]): Self = StObject.set(x, "evalInfoTypeMapping", value.asInstanceOf[js.Any])
    
    inline def setEvalInfoTypeMappingNull: Self = StObject.set(x, "evalInfoTypeMapping", null)
    
    inline def setEvalInfoTypeMappingUndefined: Self = StObject.set(x, "evalInfoTypeMapping", js.undefined)
    
    inline def setGoldenInfoTypeMapping(value: StringDictionary[String]): Self = StObject.set(x, "goldenInfoTypeMapping", value.asInstanceOf[js.Any])
    
    inline def setGoldenInfoTypeMappingNull: Self = StObject.set(x, "goldenInfoTypeMapping", null)
    
    inline def setGoldenInfoTypeMappingUndefined: Self = StObject.set(x, "goldenInfoTypeMapping", js.undefined)
    
    inline def setGoldenStore(value: String): Self = StObject.set(x, "goldenStore", value.asInstanceOf[js.Any])
    
    inline def setGoldenStoreNull: Self = StObject.set(x, "goldenStore", null)
    
    inline def setGoldenStoreUndefined: Self = StObject.set(x, "goldenStore", js.undefined)
    
    inline def setInfoTypeConfig(value: SchemaInfoTypeConfig): Self = StObject.set(x, "infoTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeConfigUndefined: Self = StObject.set(x, "infoTypeConfig", js.undefined)
  }
}
