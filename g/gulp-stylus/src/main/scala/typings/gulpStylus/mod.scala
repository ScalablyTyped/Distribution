package typings.gulpStylus

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(options: Options): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-stylus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var `include css`: js.UndefOr[Boolean] = js.undefined
    
    var linenos: js.UndefOr[Boolean] = js.undefined
    
    var rawDefine: js.UndefOr[VariableDefinitions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def `setInclude css`(value: Boolean): Self = StObject.set(x, "include css", value.asInstanceOf[js.Any])
      
      inline def `setInclude cssUndefined`: Self = StObject.set(x, "include css", js.undefined)
      
      inline def setLinenos(value: Boolean): Self = StObject.set(x, "linenos", value.asInstanceOf[js.Any])
      
      inline def setLinenosUndefined: Self = StObject.set(x, "linenos", js.undefined)
      
      inline def setRawDefine(value: VariableDefinitions): Self = StObject.set(x, "rawDefine", value.asInstanceOf[js.Any])
      
      inline def setRawDefineUndefined: Self = StObject.set(x, "rawDefine", js.undefined)
    }
  }
  
  type VariableDefinitions = StringDictionary[Any]
}
