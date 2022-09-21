package typings.jss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGenerateIdOptions extends StObject {
  
  var minify: js.UndefOr[Boolean] = js.undefined
}
object CreateGenerateIdOptions {
  
  inline def apply(): CreateGenerateIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGenerateIdOptions]
  }
  
  extension [Self <: CreateGenerateIdOptions](x: Self) {
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
  }
}
