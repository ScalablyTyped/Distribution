package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTransitTableTransitTimeRowTransitTimeValue extends js.Object {
  
  /**
    * Must be greater than or equal to minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Transit time range (min-max) in business days. 0 means same day delivery,
    * 1 means next day delivery.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}
object SchemaTransitTableTransitTimeRowTransitTimeValue {
  
  @scala.inline
  def apply(): SchemaTransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRowTransitTimeValue]
  }
  
  @scala.inline
  implicit class SchemaTransitTableTransitTimeRowTransitTimeValueOps[Self <: SchemaTransitTableTransitTimeRowTransitTimeValue] (val x: Self) extends AnyVal {
    
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
    def setMaxTransitTimeInDays(value: Double): Self = this.set("maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTransitTimeInDays: Self = this.set("maxTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = this.set("minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTransitTimeInDays: Self = this.set("minTransitTimeInDays", js.undefined)
  }
}
