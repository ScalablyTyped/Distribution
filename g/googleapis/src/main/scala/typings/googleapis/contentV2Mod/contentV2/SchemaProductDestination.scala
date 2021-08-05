package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDestination extends StObject {
  
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the destination is required, excluded or should be validated.
    */
  var intention: js.UndefOr[String] = js.undefined
}
object SchemaProductDestination {
  
  inline def apply(): SchemaProductDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDestination]
  }
  
  extension [Self <: SchemaProductDestination](x: Self) {
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setIntention(value: String): Self = StObject.set(x, "intention", value.asInstanceOf[js.Any])
    
    inline def setIntentionUndefined: Self = StObject.set(x, "intention", js.undefined)
  }
}
