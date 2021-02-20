package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Playlist localization setting
  */
@js.native
trait SchemaPlaylistLocalization extends StObject {
  
  /**
    * The localized strings for playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The localized strings for playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPlaylistLocalization {
  
  @scala.inline
  def apply(): SchemaPlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistLocalization]
  }
  
  @scala.inline
  implicit class SchemaPlaylistLocalizationMutableBuilder[Self <: SchemaPlaylistLocalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
