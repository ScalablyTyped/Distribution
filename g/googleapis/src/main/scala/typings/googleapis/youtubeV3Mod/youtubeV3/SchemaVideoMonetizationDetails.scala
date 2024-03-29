package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoMonetizationDetails extends StObject {
  
  /**
    * The value of access indicates whether the video can be monetized or not.
    */
  var access: js.UndefOr[SchemaAccessPolicy] = js.undefined
}
object SchemaVideoMonetizationDetails {
  
  inline def apply(): SchemaVideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoMonetizationDetails]
  }
  
  extension [Self <: SchemaVideoMonetizationDetails](x: Self) {
    
    inline def setAccess(value: SchemaAccessPolicy): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
