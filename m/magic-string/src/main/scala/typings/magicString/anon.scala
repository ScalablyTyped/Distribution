package typings.magicString

import typings.magicString.mod.MagicString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: MagicString
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    inline def apply(content: MagicString): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: MagicString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Inlined std.Partial<magic-string.magic-string.SourceMapOptions> */
  trait PartialSourceMapOptions extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var hires: js.UndefOr[Boolean] = js.undefined
    
    var includeContent: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object PartialSourceMapOptions {
    
    inline def apply(): PartialSourceMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSourceMapOptions]
    }
    
    extension [Self <: PartialSourceMapOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHires(value: Boolean): Self = StObject.set(x, "hires", value.asInstanceOf[js.Any])
      
      inline def setHiresUndefined: Self = StObject.set(x, "hires", js.undefined)
      
      inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
