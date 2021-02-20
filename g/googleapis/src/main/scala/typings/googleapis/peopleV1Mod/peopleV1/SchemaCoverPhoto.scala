package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only cover photo. A large image shown on the
  * person&#39;s profile page that represents who they are or what they care
  * about.
  */
@js.native
trait SchemaCoverPhoto extends StObject {
  
  /**
    * True if the cover photo is the default cover photo; false if the cover
    * photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  
  /**
    * Metadata about the cover photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The URL of the cover photo.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaCoverPhoto {
  
  @scala.inline
  def apply(): SchemaCoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCoverPhoto]
  }
  
  @scala.inline
  implicit class SchemaCoverPhotoMutableBuilder[Self <: SchemaCoverPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
