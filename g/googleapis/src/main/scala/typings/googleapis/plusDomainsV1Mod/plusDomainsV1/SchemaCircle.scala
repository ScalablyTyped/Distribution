package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCircle extends StObject {
  
  /**
    * The description of this circle.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The circle name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the circle.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies this resource as a circle. Value: &quot;plus#circle&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The people in this circle.
    */
  var people: js.UndefOr[`7`] = js.undefined
  
  /**
    * Link to this circle resource
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaCircle {
  
  @scala.inline
  def apply(): SchemaCircle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCircle]
  }
  
  @scala.inline
  implicit class SchemaCircleMutableBuilder[Self <: SchemaCircle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPeople(value: `7`): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
