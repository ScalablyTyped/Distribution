package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerifyDisplayViewability extends StObject {
  
  /**
    * Target web and app inventory to maximize IAB viewable rate.
    */
  var iab: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target web and app inventory to maximize 100% viewable duration.
    */
  var viewableDuring: js.UndefOr[String | Null] = js.undefined
}
object SchemaDoubleVerifyDisplayViewability {
  
  inline def apply(): SchemaDoubleVerifyDisplayViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerifyDisplayViewability]
  }
  
  extension [Self <: SchemaDoubleVerifyDisplayViewability](x: Self) {
    
    inline def setIab(value: String): Self = StObject.set(x, "iab", value.asInstanceOf[js.Any])
    
    inline def setIabNull: Self = StObject.set(x, "iab", null)
    
    inline def setIabUndefined: Self = StObject.set(x, "iab", js.undefined)
    
    inline def setViewableDuring(value: String): Self = StObject.set(x, "viewableDuring", value.asInstanceOf[js.Any])
    
    inline def setViewableDuringNull: Self = StObject.set(x, "viewableDuring", null)
    
    inline def setViewableDuringUndefined: Self = StObject.set(x, "viewableDuring", js.undefined)
  }
}
