package typings.handlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecompileOptions
  extends StObject
     with CompileOptions {
  
  var destName: js.UndefOr[String] = js.undefined
  
  var srcName: js.UndefOr[String] = js.undefined
}
object PrecompileOptions {
  
  inline def apply(): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecompileOptions]
  }
  
  extension [Self <: PrecompileOptions](x: Self) {
    
    inline def setDestName(value: String): Self = StObject.set(x, "destName", value.asInstanceOf[js.Any])
    
    inline def setDestNameUndefined: Self = StObject.set(x, "destName", js.undefined)
    
    inline def setSrcName(value: String): Self = StObject.set(x, "srcName", value.asInstanceOf[js.Any])
    
    inline def setSrcNameUndefined: Self = StObject.set(x, "srcName", js.undefined)
  }
}
