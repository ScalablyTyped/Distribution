package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSharedTargeting extends StObject {
  
  /**
    * The list of values to exclude from targeting. Each value is AND'd together.
    */
  var exclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.undefined
  
  /**
    * The list of value to include as part of the targeting. Each value is OR'd together.
    */
  var inclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.undefined
  
  /**
    * The key representing the shared targeting criterion.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaSharedTargeting {
  
  inline def apply(): SchemaSharedTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedTargeting]
  }
  
  extension [Self <: SchemaSharedTargeting](x: Self) {
    
    inline def setExclusions(value: js.Array[SchemaTargetingValue]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: SchemaTargetingValue*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setInclusions(value: js.Array[SchemaTargetingValue]): Self = StObject.set(x, "inclusions", value.asInstanceOf[js.Any])
    
    inline def setInclusionsUndefined: Self = StObject.set(x, "inclusions", js.undefined)
    
    inline def setInclusionsVarargs(value: SchemaTargetingValue*): Self = StObject.set(x, "inclusions", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
