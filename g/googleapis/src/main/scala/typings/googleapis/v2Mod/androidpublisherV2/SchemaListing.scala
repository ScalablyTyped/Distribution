package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListing extends StObject {
  
  /**
    * Full description of the app; this may be up to 4000 characters in length.
    */
  var fullDescription: js.UndefOr[String] = js.native
  
  /**
    * Language localization code (for example, &quot;de-AT&quot; for Austrian
    * German).
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Short description of the app (previously known as promo text); this may
    * be up to 80 characters in length.
    */
  var shortDescription: js.UndefOr[String] = js.native
  
  /**
    * App&#39;s localized title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * URL of a promotional YouTube video for the app.
    */
  var video: js.UndefOr[String] = js.native
}
object SchemaListing {
  
  @scala.inline
  def apply(): SchemaListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListing]
  }
  
  @scala.inline
  implicit class SchemaListingMutableBuilder[Self <: SchemaListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
