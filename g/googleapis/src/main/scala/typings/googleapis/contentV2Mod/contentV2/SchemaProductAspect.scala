package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductAspect extends StObject {
  
  /**
    * Deprecated.
    */
  var aspectName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated.
    */
  var destinationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated.
    */
  var intention: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductAspect {
  
  inline def apply(): SchemaProductAspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAspect]
  }
  
  extension [Self <: SchemaProductAspect](x: Self) {
    
    inline def setAspectName(value: String): Self = StObject.set(x, "aspectName", value.asInstanceOf[js.Any])
    
    inline def setAspectNameNull: Self = StObject.set(x, "aspectName", null)
    
    inline def setAspectNameUndefined: Self = StObject.set(x, "aspectName", js.undefined)
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameNull: Self = StObject.set(x, "destinationName", null)
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    inline def setIntentionNull: Self = StObject.set(x, "intention", null)
    
    inline def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
