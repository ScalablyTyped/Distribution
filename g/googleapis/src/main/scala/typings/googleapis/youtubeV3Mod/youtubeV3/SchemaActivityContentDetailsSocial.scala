package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivityContentDetailsSocial extends StObject {
  
  /**
    * The author of the social network post.
    */
  var author: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An image of the post's author.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the social network post.
    */
  var referenceUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
  
  /**
    * The name of the social network.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaActivityContentDetailsSocial {
  
  inline def apply(): SchemaActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsSocial]
  }
  
  extension [Self <: SchemaActivityContentDetailsSocial](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
    
    inline def setReferenceUrlNull: Self = StObject.set(x, "referenceUrl", null)
    
    inline def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
    
    inline def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
