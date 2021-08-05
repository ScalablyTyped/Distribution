package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductAspect extends StObject {
  
  /**
    * The name of the aspect.
    */
  var aspectName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the destination. Leave out to apply to all destinations.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the aspect is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.undefined
}
object SchemaProductAspect {
  
  inline def apply(): SchemaProductAspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAspect]
  }
  
  extension [Self <: SchemaProductAspect](x: Self) {
    
    inline def setAspectName(value: String): Self = StObject.set(x, "aspectName", value.asInstanceOf[js.Any])
    
    inline def setAspectNameUndefined: Self = StObject.set(x, "aspectName", js.undefined)
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    inline def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
