package typings.hyperformula

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserNamedExpressionMatcherMod {
  
  @JSImport("hyperformula/typings/parser/NamedExpressionMatcher", "NamedExpressionMatcher")
  @js.native
  open class NamedExpressionMatcher () extends StObject {
    
    val POSSIBLE_START_CHARACTERS: js.Array[String] = js.native
    
    /**
      * Method used by the lexer to recognize NamedExpression token in text
      *
      * Note: using 'y' sticky flag for a named expression which is not supported on IE11...
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky
      */
    def `match`(text: String, startOffset: Double): RegExpExecArray | Null = js.native
    
    /* private */ var namedExpressionRegexp: Any = js.native
    
    /* private */ var r1c1CellRefRegexp: Any = js.native
  }
}
