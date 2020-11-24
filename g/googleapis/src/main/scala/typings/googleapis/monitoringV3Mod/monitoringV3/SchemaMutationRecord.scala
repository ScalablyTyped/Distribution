package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change made to a configuration.
  */
@js.native
trait SchemaMutationRecord extends js.Object {
  
  /**
    * When the change occurred.
    */
  var mutateTime: js.UndefOr[String] = js.native
  
  /**
    * The email address of the user making the change.
    */
  var mutatedBy: js.UndefOr[String] = js.native
}
object SchemaMutationRecord {
  
  @scala.inline
  def apply(): SchemaMutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutationRecord]
  }
  
  @scala.inline
  implicit class SchemaMutationRecordOps[Self <: SchemaMutationRecord] (val x: Self) extends AnyVal {
    
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
    def setMutateTime(value: String): Self = this.set("mutateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutateTime: Self = this.set("mutateTime", js.undefined)
    
    @scala.inline
    def setMutatedBy(value: String): Self = this.set("mutatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatedBy: Self = this.set("mutatedBy", js.undefined)
  }
}
