package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOneTimeSchedule extends StObject {
  
  /**
    * Required. The desired patch job execution time.
    */
  var executeTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaOneTimeSchedule {
  
  inline def apply(): SchemaOneTimeSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOneTimeSchedule]
  }
  
  extension [Self <: SchemaOneTimeSchedule](x: Self) {
    
    inline def setExecuteTime(value: String): Self = StObject.set(x, "executeTime", value.asInstanceOf[js.Any])
    
    inline def setExecuteTimeNull: Self = StObject.set(x, "executeTime", null)
    
    inline def setExecuteTimeUndefined: Self = StObject.set(x, "executeTime", js.undefined)
  }
}
