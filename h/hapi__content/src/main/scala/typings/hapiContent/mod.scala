package typings.hapiContent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disposition(): ContentDisposition = ^.asInstanceOf[js.Dynamic].applyDynamic("disposition")().asInstanceOf[ContentDisposition]
  inline def disposition(header: String): ContentDisposition = ^.asInstanceOf[js.Dynamic].applyDynamic("disposition")(header.asInstanceOf[js.Any]).asInstanceOf[ContentDisposition]
  
  inline def `type`(): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("type")().asInstanceOf[ContentType]
  inline def `type`(header: String): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(header.asInstanceOf[js.Any]).asInstanceOf[ContentType]
  
  trait ContentDisposition extends StObject {
    
    var filename: String
    
    var name: String
  }
  object ContentDisposition {
    
    inline def apply(filename: String, name: String): ContentDisposition = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDisposition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentDisposition] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType extends StObject {
    
    var boundary: js.UndefOr[String] = js.undefined
    
    var charset: js.UndefOr[String] = js.undefined
    
    var mime: String
  }
  object ContentType {
    
    inline def apply(mime: String): ContentType = {
      val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
