package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightOptions extends StObject {
  
  var prefix: js.UndefOr[String] = js.undefined
}
object HighlightOptions {
  
  inline def apply(): HighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightOptions]
  }
  
  extension [Self <: HighlightOptions](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
