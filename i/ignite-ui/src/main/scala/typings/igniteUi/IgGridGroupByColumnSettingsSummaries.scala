package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridGroupByColumnSettingsSummaries
  extends /**
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
  var customSummary: js.UndefOr[String | js.Function] = js.native
  
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
  var summaryFunction: js.UndefOr[String] = js.native
  
  /**
    * Specifies the summary text that will be shown before the value
    *
    */
  var text: js.UndefOr[String] = js.native
}
object IgGridGroupByColumnSettingsSummaries {
  
  @scala.inline
  def apply(): IgGridGroupByColumnSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByColumnSettingsSummaries]
  }
  
  @scala.inline
  implicit class IgGridGroupByColumnSettingsSummariesOps[Self <: IgGridGroupByColumnSettingsSummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomSummary(value: String | js.Function): Self = this.set("customSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSummary: Self = this.set("customSummary", js.undefined)
    
    @scala.inline
    def setSummaryFunction(value: String): Self = this.set("summaryFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryFunction: Self = this.set("summaryFunction", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
