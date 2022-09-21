package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HybridFindingDetails extends StObject {
  
  /**
    * Details about the container where the content being inspected is from.
    */
  var containerDetails: js.UndefOr[SchemaGooglePrivacyDlpV2Container] = js.undefined
  
  /**
    * Offset in bytes of the line, from the beginning of the file, where the finding is located. Populate if the item being scanned is only part of a bigger item, such as a shard of a file and you want to track the absolute position of the finding.
    */
  var fileOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels to represent user provided metadata about the data being inspected. If configured by the job, some key values may be required. The labels associated with `Finding`'s produced by hybrid inspection. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Offset of the row for tables. Populate if the row(s) being scanned are part of a bigger dataset and you want to keep track of their absolute position.
    */
  var rowOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys. If not known ahead of time, can also be set within each inspect hybrid call and the two will be merged. Note that identifying_fields will only be stored to BigQuery, and only if the BigQuery action has been included.
    */
  var tableOptions: js.UndefOr[SchemaGooglePrivacyDlpV2TableOptions] = js.undefined
}
object SchemaGooglePrivacyDlpV2HybridFindingDetails {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HybridFindingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HybridFindingDetails]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HybridFindingDetails](x: Self) {
    
    inline def setContainerDetails(value: SchemaGooglePrivacyDlpV2Container): Self = StObject.set(x, "containerDetails", value.asInstanceOf[js.Any])
    
    inline def setContainerDetailsUndefined: Self = StObject.set(x, "containerDetails", js.undefined)
    
    inline def setFileOffset(value: String): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    inline def setFileOffsetNull: Self = StObject.set(x, "fileOffset", null)
    
    inline def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRowOffset(value: String): Self = StObject.set(x, "rowOffset", value.asInstanceOf[js.Any])
    
    inline def setRowOffsetNull: Self = StObject.set(x, "rowOffset", null)
    
    inline def setRowOffsetUndefined: Self = StObject.set(x, "rowOffset", js.undefined)
    
    inline def setTableOptions(value: SchemaGooglePrivacyDlpV2TableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
  }
}
