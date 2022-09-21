package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSummariesColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Enables disables summaries for the column
    *
    */
  var allowSummaries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Check defaultSummaryOperands
    *
    */
  var summaryOperands: js.UndefOr[js.Array[IgGridSummariesColumnSettingSummaryOperand]] = js.undefined
}
object IgGridSummariesColumnSetting {
  
  inline def apply(): IgGridSummariesColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSetting]
  }
  
  extension [Self <: IgGridSummariesColumnSetting](x: Self) {
    
    inline def setAllowSummaries(value: Boolean): Self = StObject.set(x, "allowSummaries", value.asInstanceOf[js.Any])
    
    inline def setAllowSummariesUndefined: Self = StObject.set(x, "allowSummaries", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setSummaryOperands(value: js.Array[IgGridSummariesColumnSettingSummaryOperand]): Self = StObject.set(x, "summaryOperands", value.asInstanceOf[js.Any])
    
    inline def setSummaryOperandsUndefined: Self = StObject.set(x, "summaryOperands", js.undefined)
    
    inline def setSummaryOperandsVarargs(value: IgGridSummariesColumnSettingSummaryOperand*): Self = StObject.set(x, "summaryOperands", js.Array(value*))
  }
}
