package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Click-through override.
  */
trait SchemaCompanionClickThroughOverride extends StObject {
  
  /**
    * Click-through URL of this companion click-through override.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.undefined
  
  /**
    * ID of the creative for this companion click-through override.
    */
  var creativeId: js.UndefOr[String] = js.undefined
}
object SchemaCompanionClickThroughOverride {
  
  inline def apply(): SchemaCompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanionClickThroughOverride]
  }
  
  extension [Self <: SchemaCompanionClickThroughOverride](x: Self) {
    
    inline def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
  }
}
