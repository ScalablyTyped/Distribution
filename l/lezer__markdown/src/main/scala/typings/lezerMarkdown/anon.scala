package typings.lezerMarkdown

import typings.lezerCommon.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CodeParser extends StObject {
    
    var codeParser: js.UndefOr[js.Function1[/* info */ String, Null | Parser]] = js.undefined
    
    var htmlParser: js.UndefOr[Parser] = js.undefined
  }
  object CodeParser {
    
    inline def apply(): CodeParser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeParser] (val x: Self) extends AnyVal {
      
      inline def setCodeParser(value: /* info */ String => Null | Parser): Self = StObject.set(x, "codeParser", js.Any.fromFunction1(value))
      
      inline def setCodeParserUndefined: Self = StObject.set(x, "codeParser", js.undefined)
      
      inline def setHtmlParser(value: Parser): Self = StObject.set(x, "htmlParser", value.asInstanceOf[js.Any])
      
      inline def setHtmlParserUndefined: Self = StObject.set(x, "htmlParser", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
