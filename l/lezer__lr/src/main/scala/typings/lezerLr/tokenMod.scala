package typings.lezerLr

import typings.lezerLr.stackMod.Stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("@lezer/lr/dist/token", "CachedToken")
  @js.native
  open class CachedToken () extends StObject {
    
    var context: Double = js.native
    
    var end: Double = js.native
    
    var extended: Double = js.native
    
    var lookAhead: Double = js.native
    
    var mask: Double = js.native
    
    var start: Double = js.native
    
    var value: Double = js.native
  }
  
  @JSImport("@lezer/lr/dist/token", "ExternalTokenizer")
  @js.native
  open class ExternalTokenizer protected () extends StObject {
    def this(token: js.Function2[/* input */ InputStream, /* stack */ Stack, Unit]) = this()
    def this(token: js.Function2[/* input */ InputStream, /* stack */ Stack, Unit], options: ExternalOptions) = this()
  }
  
  @JSImport("@lezer/lr/dist/token", "InputStream")
  @js.native
  open class InputStream () extends StObject {
    
    def acceptToken(token: Double): Unit = js.native
    def acceptToken(token: Double, endOffset: Double): Unit = js.native
    
    def advance(): Double = js.native
    def advance(n: Double): Double = js.native
    
    /* private */ var chunk2: Any = js.native
    
    /* private */ var chunk2Pos: Any = js.native
    
    /* private */ var getChunk: Any = js.native
    
    var next: Double = js.native
    
    def peek(offset: Double): Any = js.native
    
    var pos: Double = js.native
    
    /* private */ var range: Any = js.native
    
    /* private */ var rangeIndex: Any = js.native
    
    /* private */ var readNext: Any = js.native
    
    /* private */ var setDone: Any = js.native
  }
  
  trait ExternalOptions extends StObject {
    
    var contextual: js.UndefOr[Boolean] = js.undefined
    
    var extend: js.UndefOr[Boolean] = js.undefined
    
    var fallback: js.UndefOr[Boolean] = js.undefined
  }
  object ExternalOptions {
    
    inline def apply(): ExternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalOptions]
    }
    
    extension [Self <: ExternalOptions](x: Self) {
      
      inline def setContextual(value: Boolean): Self = StObject.set(x, "contextual", value.asInstanceOf[js.Any])
      
      inline def setContextualUndefined: Self = StObject.set(x, "contextual", js.undefined)
      
      inline def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  trait Tokenizer extends StObject
}
