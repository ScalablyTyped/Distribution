package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSeason extends js.Object {
  
  /**
    * Inclusive end date of the recurrence period.
    */
  var end: js.UndefOr[SchemaMonthDay] = js.native
  
  /**
    * Optionally present list of prorations for the season. Each proration is a
    * one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing
    * information.
    */
  var prorations: js.UndefOr[js.Array[SchemaProrate]] = js.native
  
  /**
    * Inclusive start date of the recurrence period.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.native
}
object SchemaSeason {
  
  @scala.inline
  def apply(): SchemaSeason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeason]
  }
  
  @scala.inline
  implicit class SchemaSeasonOps[Self <: SchemaSeason] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: SchemaMonthDay): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setProrationsVarargs(value: SchemaProrate*): Self = this.set("prorations", js.Array(value :_*))
    
    @scala.inline
    def setProrations(value: js.Array[SchemaProrate]): Self = this.set("prorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProrations: Self = this.set("prorations", js.undefined)
    
    @scala.inline
    def setStart(value: SchemaMonthDay): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
