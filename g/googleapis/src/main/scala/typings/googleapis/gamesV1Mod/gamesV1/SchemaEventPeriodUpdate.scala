package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventPeriodUpdate extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodUpdate.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The time period being covered by this update.
    */
  var timePeriod: js.UndefOr[SchemaEventPeriodRange] = js.native
  
  /**
    * The updates being made for this time period.
    */
  var updates: js.UndefOr[js.Array[SchemaEventUpdateRequest]] = js.native
}
object SchemaEventPeriodUpdate {
  
  @scala.inline
  def apply(): SchemaEventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventPeriodUpdate]
  }
  
  @scala.inline
  implicit class SchemaEventPeriodUpdateOps[Self <: SchemaEventPeriodUpdate] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: SchemaEventPeriodRange): Self = this.set("timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePeriod: Self = this.set("timePeriod", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: SchemaEventUpdateRequest*): Self = this.set("updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaEventUpdateRequest]): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}
