package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quotesMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/quotes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQuote(quotes: Quotes_, depth: Double, open: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuote")(quotes.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/quotes", "quotes")
  @js.native
  val quotes: IPropertyListDescriptor[Quotes_] = js.native
  
  trait QUOTE extends StObject {
    
    var close: String
    
    var open: String
  }
  object QUOTE {
    
    inline def apply(close: String, open: String): QUOTE = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[QUOTE]
    }
    
    extension [Self <: QUOTE](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  type Quotes_ = js.Array[QUOTE] | Null
}
