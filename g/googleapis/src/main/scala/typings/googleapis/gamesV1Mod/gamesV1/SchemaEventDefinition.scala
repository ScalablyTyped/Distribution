package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event definition resource.
  */
trait SchemaEventDefinition extends StObject {
  
  /**
    * A list of events that are a child of this event.
    */
  var childEvents: js.UndefOr[js.Array[SchemaEventChild]] = js.undefined
  
  /**
    * Description of what this event represents.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name to display for the event.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the event.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The base URL for the image that represents the event.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isDefaultImageUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventDefinition.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The visibility of event being tracked in this definition. Possible values
    * are:   - &quot;REVEALED&quot;: This event should be visible to all users.
    * - &quot;HIDDEN&quot;: This event should only be shown to users that have
    * recorded this event at least once.
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object SchemaEventDefinition {
  
  @scala.inline
  def apply(): SchemaEventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventDefinition]
  }
  
  @scala.inline
  implicit class SchemaEventDefinitionMutableBuilder[Self <: SchemaEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildEvents(value: js.Array[SchemaEventChild]): Self = StObject.set(x, "childEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildEventsUndefined: Self = StObject.set(x, "childEvents", js.undefined)
    
    @scala.inline
    def setChildEventsVarargs(value: SchemaEventChild*): Self = StObject.set(x, "childEvents", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setIsDefaultImageUrl(value: Boolean): Self = StObject.set(x, "isDefaultImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultImageUrlUndefined: Self = StObject.set(x, "isDefaultImageUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
