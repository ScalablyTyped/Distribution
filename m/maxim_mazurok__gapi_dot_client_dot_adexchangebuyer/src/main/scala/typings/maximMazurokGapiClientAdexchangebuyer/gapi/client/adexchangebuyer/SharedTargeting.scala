package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedTargeting extends StObject {
  
  /** The list of values to exclude from targeting. Each value is AND'd together. */
  var exclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  
  /** The list of value to include as part of the targeting. Each value is OR'd together. */
  var inclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  
  /** The key representing the shared targeting criterion. */
  var key: js.UndefOr[String] = js.undefined
}
object SharedTargeting {
  
  inline def apply(): SharedTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedTargeting] (val x: Self) extends AnyVal {
    
    inline def setExclusions(value: js.Array[TargetingValue]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: TargetingValue*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setInclusions(value: js.Array[TargetingValue]): Self = StObject.set(x, "inclusions", value.asInstanceOf[js.Any])
    
    inline def setInclusionsUndefined: Self = StObject.set(x, "inclusions", js.undefined)
    
    inline def setInclusionsVarargs(value: TargetingValue*): Self = StObject.set(x, "inclusions", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
