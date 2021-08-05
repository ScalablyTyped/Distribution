package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only photo. A picture shown next to the person&#39;s
  * name to help others recognize the person.
  */
trait SchemaPhoto extends StObject {
  
  /**
    * True if the photo is a default photo; false if the photo is a
    * user-provided photo.
    */
  var default: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Metadata about the photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The URL of the photo. You can change the desired size by appending a
    * query parameter `sz=`&lt;var&gt;size&lt;/var&gt; at the end of the url.
    * Example:
    * `https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50`
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaPhoto {
  
  inline def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  
  extension [Self <: SchemaPhoto](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
