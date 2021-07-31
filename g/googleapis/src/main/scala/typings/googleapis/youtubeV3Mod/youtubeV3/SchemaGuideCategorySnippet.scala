package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a guide category.
  */
trait SchemaGuideCategorySnippet extends StObject {
  
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the guide category.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGuideCategorySnippet {
  
  @scala.inline
  def apply(): SchemaGuideCategorySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuideCategorySnippet]
  }
  
  @scala.inline
  implicit class SchemaGuideCategorySnippetMutableBuilder[Self <: SchemaGuideCategorySnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
