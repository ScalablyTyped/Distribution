package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingCriteria extends StObject {
  
  /** The list of values to exclude from targeting. Each value is AND'd together. */
  var exclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  
  /** The list of value to include as part of the targeting. Each value is OR'd together. */
  var inclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  
  /**
    * The key representing the shared targeting criterion. Targeting criteria defined by Google ad servers will begin with GOOG_. Third parties may define their own keys. A list of
    * permissible keys along with the acceptable values will be provided as part of the external documentation.
    */
  var key: js.UndefOr[String] = js.undefined
}
object TargetingCriteria {
  
  inline def apply(): TargetingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingCriteria]
  }
  
  extension [Self <: TargetingCriteria](x: Self) {
    
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
