package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapOption extends StObject {
  
  var outputSourceFiles: js.UndefOr[Boolean] = js.undefined
  
  var sourceMapBasepath: js.UndefOr[String] = js.undefined
  
  var sourceMapFileInline: js.UndefOr[Boolean] = js.undefined
  
  var sourceMapRootpath: js.UndefOr[String] = js.undefined
  
  var sourceMapURL: js.UndefOr[String] = js.undefined
}
object SourceMapOption {
  
  inline def apply(): SourceMapOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOption]
  }
  
  extension [Self <: SourceMapOption](x: Self) {
    
    inline def setOutputSourceFiles(value: Boolean): Self = StObject.set(x, "outputSourceFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputSourceFilesUndefined: Self = StObject.set(x, "outputSourceFiles", js.undefined)
    
    inline def setSourceMapBasepath(value: String): Self = StObject.set(x, "sourceMapBasepath", value.asInstanceOf[js.Any])
    
    inline def setSourceMapBasepathUndefined: Self = StObject.set(x, "sourceMapBasepath", js.undefined)
    
    inline def setSourceMapFileInline(value: Boolean): Self = StObject.set(x, "sourceMapFileInline", value.asInstanceOf[js.Any])
    
    inline def setSourceMapFileInlineUndefined: Self = StObject.set(x, "sourceMapFileInline", js.undefined)
    
    inline def setSourceMapRootpath(value: String): Self = StObject.set(x, "sourceMapRootpath", value.asInstanceOf[js.Any])
    
    inline def setSourceMapRootpathUndefined: Self = StObject.set(x, "sourceMapRootpath", js.undefined)
    
    inline def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    inline def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
  }
}
