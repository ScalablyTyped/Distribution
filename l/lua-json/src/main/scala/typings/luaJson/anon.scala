package typings.luaJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Eol extends StObject {
    
    var eol: js.UndefOr[String] = js.undefined
    
    var singleQuote: js.UndefOr[Boolean] = js.undefined
    
    var spaces: js.UndefOr[Double] = js.undefined
  }
  object Eol {
    
    inline def apply(): Eol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Eol]
    }
    
    extension [Self <: Eol](x: Self) {
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
      
      inline def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
      
      inline def setSpaces(value: Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}
