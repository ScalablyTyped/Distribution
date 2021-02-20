package typings.hapiHoek

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@hapi/hoek.@hapi/hoek.contain.Options, 'once'> */
  @js.native
  trait OmitOptionsonce extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.native
    
    var only: js.UndefOr[Boolean] = js.native
    
    var part: js.UndefOr[Boolean] = js.native
    
    var symbols: js.UndefOr[Boolean] = js.native
  }
  object OmitOptionsonce {
    
    @scala.inline
    def apply(): OmitOptionsonce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptionsonce]
    }
    
    @scala.inline
    implicit class OmitOptionsonceMutableBuilder[Self <: OmitOptionsonce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      @scala.inline
      def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
