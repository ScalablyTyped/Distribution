package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaceActionTypeMetadata extends StObject {
  
  /**
    * The localized display name for the attribute, if available; otherwise, the English display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The place action type.
    */
  var placeActionType: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaceActionTypeMetadata {
  
  inline def apply(): SchemaPlaceActionTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceActionTypeMetadata]
  }
  
  extension [Self <: SchemaPlaceActionTypeMetadata](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPlaceActionType(value: String): Self = StObject.set(x, "placeActionType", value.asInstanceOf[js.Any])
    
    inline def setPlaceActionTypeNull: Self = StObject.set(x, "placeActionType", null)
    
    inline def setPlaceActionTypeUndefined: Self = StObject.set(x, "placeActionType", js.undefined)
  }
}
