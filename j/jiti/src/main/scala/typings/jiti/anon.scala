package typings.jiti

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Filename {
    
    inline def apply(): Filename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Inlined std.Omit<jiti.jiti/dist/types.TransformOptions, 'source'> */
  trait OmitTransformOptionssourc extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var legacy: js.UndefOr[Boolean] = js.undefined
    
    var retainLines: js.UndefOr[Boolean] = js.undefined
    
    var ts: js.UndefOr[Boolean] = js.undefined
  }
  object OmitTransformOptionssourc {
    
    inline def apply(): OmitTransformOptionssourc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitTransformOptionssourc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitTransformOptionssourc] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    }
  }
}
