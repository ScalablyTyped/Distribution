package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCoverPhoto extends StObject {
  
  /**
    * True if the cover photo is the default cover photo; false if the cover photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Metadata about the cover photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The URL of the cover photo.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaCoverPhoto {
  
  inline def apply(): SchemaCoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCoverPhoto]
  }
  
  extension [Self <: SchemaCoverPhoto](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
