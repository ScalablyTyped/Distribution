package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetryPolicy extends StObject {
  
  /**
    * The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
    */
  var maximumBackoff: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
    */
  var minimumBackoff: js.UndefOr[String | Null] = js.undefined
}
object SchemaRetryPolicy {
  
  inline def apply(): SchemaRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetryPolicy]
  }
  
  extension [Self <: SchemaRetryPolicy](x: Self) {
    
    inline def setMaximumBackoff(value: String): Self = StObject.set(x, "maximumBackoff", value.asInstanceOf[js.Any])
    
    inline def setMaximumBackoffNull: Self = StObject.set(x, "maximumBackoff", null)
    
    inline def setMaximumBackoffUndefined: Self = StObject.set(x, "maximumBackoff", js.undefined)
    
    inline def setMinimumBackoff(value: String): Self = StObject.set(x, "minimumBackoff", value.asInstanceOf[js.Any])
    
    inline def setMinimumBackoffNull: Self = StObject.set(x, "minimumBackoff", null)
    
    inline def setMinimumBackoffUndefined: Self = StObject.set(x, "minimumBackoff", js.undefined)
  }
}
