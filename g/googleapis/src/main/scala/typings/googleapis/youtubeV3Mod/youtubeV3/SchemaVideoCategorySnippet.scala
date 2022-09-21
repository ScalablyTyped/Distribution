package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoCategorySnippet extends StObject {
  
  var assignable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video category's title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoCategorySnippet {
  
  inline def apply(): SchemaVideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoCategorySnippet]
  }
  
  extension [Self <: SchemaVideoCategorySnippet](x: Self) {
    
    inline def setAssignable(value: Boolean): Self = StObject.set(x, "assignable", value.asInstanceOf[js.Any])
    
    inline def setAssignableNull: Self = StObject.set(x, "assignable", null)
    
    inline def setAssignableUndefined: Self = StObject.set(x, "assignable", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
