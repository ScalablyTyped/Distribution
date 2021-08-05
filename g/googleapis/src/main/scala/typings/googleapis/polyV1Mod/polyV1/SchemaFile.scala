package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a file in Poly, which can be a root, resource, or thumbnail
  * file.
  */
trait SchemaFile extends StObject {
  
  /**
    * The MIME content-type, such as `image/png`. For more information, see
    * [MIME
    * types](//developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types).
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The path of the resource file relative to the root file. For root or
    * thumbnail files, this is just the filename.
    */
  var relativePath: js.UndefOr[String] = js.undefined
  
  /**
    * The URL where the file data can be retrieved.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaFile {
  
  inline def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  extension [Self <: SchemaFile](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
