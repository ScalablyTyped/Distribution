package typings.hapiHoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@hapi/hoek.@hapi/hoek.contain.Options, 'once'> */
  trait OmitOptionsonce extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var only: js.UndefOr[Boolean] = js.undefined
    
    var part: js.UndefOr[Boolean] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
  }
  object OmitOptionsonce {
    
    inline def apply(): OmitOptionsonce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptionsonce]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptionsonce] (val x: Self) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
