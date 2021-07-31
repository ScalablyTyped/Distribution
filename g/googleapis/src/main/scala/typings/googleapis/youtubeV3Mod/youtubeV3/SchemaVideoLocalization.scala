package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Localized versions of certain video properties (e.g. title).
  */
trait SchemaVideoLocalization extends StObject {
  
  /**
    * Localized version of the video&#39;s description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Localized version of the video&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaVideoLocalization {
  
  @scala.inline
  def apply(): SchemaVideoLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoLocalization]
  }
  
  @scala.inline
  implicit class SchemaVideoLocalizationMutableBuilder[Self <: SchemaVideoLocalization] (val x: Self) extends AnyVal {
    
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
