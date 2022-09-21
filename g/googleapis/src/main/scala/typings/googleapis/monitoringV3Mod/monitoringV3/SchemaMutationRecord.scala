package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMutationRecord extends StObject {
  
  /**
    * When the change occurred.
    */
  var mutateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the user making the change.
    */
  var mutatedBy: js.UndefOr[String | Null] = js.undefined
}
object SchemaMutationRecord {
  
  inline def apply(): SchemaMutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutationRecord]
  }
  
  extension [Self <: SchemaMutationRecord](x: Self) {
    
    inline def setMutateTime(value: String): Self = StObject.set(x, "mutateTime", value.asInstanceOf[js.Any])
    
    inline def setMutateTimeNull: Self = StObject.set(x, "mutateTime", null)
    
    inline def setMutateTimeUndefined: Self = StObject.set(x, "mutateTime", js.undefined)
    
    inline def setMutatedBy(value: String): Self = StObject.set(x, "mutatedBy", value.asInstanceOf[js.Any])
    
    inline def setMutatedByNull: Self = StObject.set(x, "mutatedBy", null)
    
    inline def setMutatedByUndefined: Self = StObject.set(x, "mutatedBy", js.undefined)
  }
}
