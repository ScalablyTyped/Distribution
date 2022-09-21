package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLevelDetails extends StObject {
  
  /**
    * The name that should be used when referring to this level.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLevelDetails {
  
  inline def apply(): SchemaLevelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLevelDetails]
  }
  
  extension [Self <: SchemaLevelDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
