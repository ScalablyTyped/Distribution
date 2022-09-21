package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDailyCycle extends StObject {
  
  /**
    * Output only. Duration of the time window, set by service producer.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time within the day to start the operations.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaDailyCycle {
  
  inline def apply(): SchemaDailyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDailyCycle]
  }
  
  extension [Self <: SchemaDailyCycle](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setStartTime(value: SchemaTimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
