package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional setting on a PivotGroup that defines buckets for the values in
  * the source data column rather than breaking out each individual value. Only
  * one PivotGroup with a group rule may be added for each column in the source
  * data, though on any given column you may add both a PivotGroup that has a
  * rule and a PivotGroup that does not.
  */
@js.native
trait SchemaPivotGroupRule extends js.Object {
  
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaDateTimeRule] = js.native
  
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[SchemaHistogramRule] = js.native
  
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[SchemaManualRule] = js.native
}
object SchemaPivotGroupRule {
  
  @scala.inline
  def apply(): SchemaPivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupRule]
  }
  
  @scala.inline
  implicit class SchemaPivotGroupRuleOps[Self <: SchemaPivotGroupRule] (val x: Self) extends AnyVal {
    
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
    def setDateTimeRule(value: SchemaDateTimeRule): Self = this.set("dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRule: Self = this.set("dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: SchemaHistogramRule): Self = this.set("histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramRule: Self = this.set("histogramRule", js.undefined)
    
    @scala.inline
    def setManualRule(value: SchemaManualRule): Self = this.set("manualRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualRule: Self = this.set("manualRule", js.undefined)
  }
}
