package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSummariesColumnSettingSummaryOperand
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * If it is false the summary operand will be shown in dropdown but it will not be made calculation
    *
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a format that will be applied to the current summary operant.
    * When this option is not set, the [format](ui.iggrid#options:columns.format) of the column it is in will taken into account.
    * When this option and the column [format](ui.iggrid#options:columns.format) is not set, the regional settings will be taken depending on the [autoFormat](ui.iggrid#options:autoFormat) option.
    * If the column type is not specified in the [autoFormat](ui.iggrid#options:autoFormat) option and no format is set for both column and summary operand, no formatting is applied.
    *
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the order of elements in dropdown. It is recommended to set order of custom operands and to be greater or equal to 5
    *
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /**
    * Text of the summary method which is shown in summary cell
    *
    */
  var rowDisplayLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the custom summary function which should be executed when type is custom
    *
    */
  var summaryCalculator: js.UndefOr[String] = js.undefined
  
  /**
    * Set type of summary operand
    *
    *
    * Valid values:
    * "count" calculate count of result rows for the specified column
    * "min" calculate min of result rows for the specified column
    * "max" calculate max of result rows for the specified column
    * "sum" calculate sum of result rows for the specified column
    * "avg" calculate average of result rows for the specified column
    * "custom" calculate custom function (specified by summaryCalculator property) of result rows for the specified column
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IgGridSummariesColumnSettingSummaryOperand {
  
  @scala.inline
  def apply(): IgGridSummariesColumnSettingSummaryOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSettingSummaryOperand]
  }
  
  @scala.inline
  implicit class IgGridSummariesColumnSettingSummaryOperandMutableBuilder[Self <: IgGridSummariesColumnSettingSummaryOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setRowDisplayLabel(value: String): Self = StObject.set(x, "rowDisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDisplayLabelUndefined: Self = StObject.set(x, "rowDisplayLabel", js.undefined)
    
    @scala.inline
    def setSummaryCalculator(value: String): Self = StObject.set(x, "summaryCalculator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryCalculatorUndefined: Self = StObject.set(x, "summaryCalculator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
