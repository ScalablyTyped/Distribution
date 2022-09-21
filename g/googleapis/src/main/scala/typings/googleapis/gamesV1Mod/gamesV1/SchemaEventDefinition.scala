package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventDefinition extends StObject {
  
  /**
    * A list of events that are a child of this event.
    */
  var childEvents: js.UndefOr[js.Array[SchemaEventChild]] = js.undefined
  
  /**
    * Description of what this event represents.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name to display for the event.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the event.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base URL for the image that represents the event.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the icon image being returned is a default image, or is game-provided.
    */
  var isDefaultImageUrl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#eventDefinition`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The visibility of event being tracked in this definition.
    */
  var visibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventDefinition {
  
  inline def apply(): SchemaEventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventDefinition]
  }
  
  extension [Self <: SchemaEventDefinition](x: Self) {
    
    inline def setChildEvents(value: js.Array[SchemaEventChild]): Self = StObject.set(x, "childEvents", value.asInstanceOf[js.Any])
    
    inline def setChildEventsUndefined: Self = StObject.set(x, "childEvents", js.undefined)
    
    inline def setChildEventsVarargs(value: SchemaEventChild*): Self = StObject.set(x, "childEvents", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setIsDefaultImageUrl(value: Boolean): Self = StObject.set(x, "isDefaultImageUrl", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultImageUrlNull: Self = StObject.set(x, "isDefaultImageUrl", null)
    
    inline def setIsDefaultImageUrlUndefined: Self = StObject.set(x, "isDefaultImageUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
