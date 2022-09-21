package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadFileOptions extends StObject {
  
  var ext: js.UndefOr[String] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  var prefixes: js.UndefOr[js.Array[String]] = js.undefined
  
  var rawBuffer: js.UndefOr[Any] = js.undefined
  
  var syncImport: js.UndefOr[Boolean] = js.undefined
}
object LoadFileOptions {
  
  inline def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  
  extension [Self <: LoadFileOptions](x: Self) {
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
    
    inline def setRawBuffer(value: Any): Self = StObject.set(x, "rawBuffer", value.asInstanceOf[js.Any])
    
    inline def setRawBufferUndefined: Self = StObject.set(x, "rawBuffer", js.undefined)
    
    inline def setSyncImport(value: Boolean): Self = StObject.set(x, "syncImport", value.asInstanceOf[js.Any])
    
    inline def setSyncImportUndefined: Self = StObject.set(x, "syncImport", js.undefined)
  }
}
