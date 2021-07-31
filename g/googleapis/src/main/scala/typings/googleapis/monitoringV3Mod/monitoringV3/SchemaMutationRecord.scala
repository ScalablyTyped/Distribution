package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change made to a configuration.
  */
trait SchemaMutationRecord extends StObject {
  
  /**
    * When the change occurred.
    */
  var mutateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user making the change.
    */
  var mutatedBy: js.UndefOr[String] = js.undefined
}
object SchemaMutationRecord {
  
  @scala.inline
  def apply(): SchemaMutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutationRecord]
  }
  
  @scala.inline
  implicit class SchemaMutationRecordMutableBuilder[Self <: SchemaMutationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMutateTime(value: String): Self = StObject.set(x, "mutateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutateTimeUndefined: Self = StObject.set(x, "mutateTime", js.undefined)
    
    @scala.inline
    def setMutatedBy(value: String): Self = StObject.set(x, "mutatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutatedByUndefined: Self = StObject.set(x, "mutatedBy", js.undefined)
  }
}
