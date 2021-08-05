package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtext extends StObject {
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var text: String
}
object Subtext {
  
  inline def apply(text: String): Subtext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtext]
  }
  
  extension [Self <: Subtext](x: Self) {
    
    inline def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    inline def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
