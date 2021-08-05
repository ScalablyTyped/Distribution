package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridGroupByColumnSettingsSummaries
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies a custom summary function, which is called for each group, it should return the custom summary result.It takes as argument object with the following signature: {dataRecords: [], array: [], key: "", allGroupData: []} where,
    * dataRecords - array of grouped (for the [data view](ig.datasource#methods:dataView)) data records,
    * array - array of cell values for the specified column,
    * key - key of the grouped column,
    * allGroupData - array of data records for the group(for the whole data source - not only for the data view)
    *
    *
    * Valid values:
    * "string" the name of the function as a string located in the global window object.
    * "function" which will be used for calculating the summary value.
    */
  var customSummary: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * the summary function key
    *
    *
    * Valid values:
    * "avg" average summary function
    * "min" minimum summary function
    * "max" maximum summary function
    * "sum" sum summary function
    * "count" count summary function
    * "custom" custom summary summary function
    */
  var summaryFunction: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the summary text that will be shown before the value
    *
    */
  var text: js.UndefOr[String] = js.undefined
}
object IgGridGroupByColumnSettingsSummaries {
  
  inline def apply(): IgGridGroupByColumnSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByColumnSettingsSummaries]
  }
  
  extension [Self <: IgGridGroupByColumnSettingsSummaries](x: Self) {
    
    inline def setCustomSummary(value: String | js.Function): Self = StObject.set(x, "customSummary", value.asInstanceOf[js.Any])
    
    inline def setCustomSummaryUndefined: Self = StObject.set(x, "customSummary", js.undefined)
    
    inline def setSummaryFunction(value: String): Self = StObject.set(x, "summaryFunction", value.asInstanceOf[js.Any])
    
    inline def setSummaryFunctionUndefined: Self = StObject.set(x, "summaryFunction", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
