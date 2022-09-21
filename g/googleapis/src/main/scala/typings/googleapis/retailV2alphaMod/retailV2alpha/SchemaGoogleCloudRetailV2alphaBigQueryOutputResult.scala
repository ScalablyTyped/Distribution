package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaBigQueryOutputResult extends StObject {
  
  /**
    * The ID of a BigQuery Dataset.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of a BigQuery Table.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaBigQueryOutputResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaBigQueryOutputResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaBigQueryOutputResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaBigQueryOutputResult](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
