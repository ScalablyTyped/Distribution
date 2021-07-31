package typings.markdownIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseLinkDestinationMod {
  
  @scala.inline
  def apply(str: String, pos: Double, max: Double): ParseResult = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  
  @JSImport("markdown-it/lib/helpers/parse_link_destination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseResult extends StObject {
    
    var lines: Double
    
    var ok: Boolean
    
    var pos: Double
    
    var str: String
  }
  object ParseResult {
    
    @scala.inline
    def apply(lines: Double, ok: Boolean, pos: Double, str: String): ParseResult = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit class ParseResultMutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
}
