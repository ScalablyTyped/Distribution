package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportRowDimensionValue extends js.Object {
  
  /** The localized string representation of the value. If unspecified, the display label should be derived from the value. */
  var displayLabel: js.UndefOr[String] = js.native
  
  /** Dimension value in the format specified in the report's spec Dimension enum. */
  var value: js.UndefOr[String] = js.native
}
object ReportRowDimensionValue {
  
  @scala.inline
  def apply(): ReportRowDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRowDimensionValue]
  }
  
  @scala.inline
  implicit class ReportRowDimensionValueOps[Self <: ReportRowDimensionValue] (val x: Self) extends AnyVal {
    
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
    def setDisplayLabel(value: String): Self = this.set("displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabel: Self = this.set("displayLabel", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
