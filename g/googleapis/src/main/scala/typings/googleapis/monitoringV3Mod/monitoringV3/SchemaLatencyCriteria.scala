package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLatencyCriteria extends StObject {
  
  /**
    * Good service is defined to be the count of requests made to this service that return in no more than threshold.
    */
  var threshold: js.UndefOr[String | Null] = js.undefined
}
object SchemaLatencyCriteria {
  
  inline def apply(): SchemaLatencyCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLatencyCriteria]
  }
  
  extension [Self <: SchemaLatencyCriteria](x: Self) {
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
