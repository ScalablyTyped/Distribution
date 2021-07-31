package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRowDimensionValue extends StObject {
  
  /** The localized string representation of the value. If unspecified, the display label should be derived from the value. */
  var displayLabel: js.UndefOr[String] = js.undefined
  
  /** Dimension value in the format specified in the report's spec Dimension enum. */
  var value: js.UndefOr[String] = js.undefined
}
object ReportRowDimensionValue {
  
  @scala.inline
  def apply(): ReportRowDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRowDimensionValue]
  }
  
  @scala.inline
  implicit class ReportRowDimensionValueMutableBuilder[Self <: ReportRowDimensionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
