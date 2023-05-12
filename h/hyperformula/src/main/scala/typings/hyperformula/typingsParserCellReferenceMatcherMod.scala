package typings.hyperformula

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserCellReferenceMatcherMod {
  
  @JSImport("hyperformula/typings/parser/CellReferenceMatcher", "CellReferenceMatcher")
  @js.native
  open class CellReferenceMatcher () extends StObject {
    
    val POSSIBLE_START_CHARACTERS: js.Array[String] = js.native
    
    /* private */ var cellReferenceRegexp: Any = js.native
    
    /**
      * Method used by the lexer to recognize CellReference token in text
      *
      * Note: using 'y' sticky flag for a named expression which is not supported on IE11...
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky
      */
    def `match`(text: String, startOffset: Double): RegExpExecArray | Null = js.native
  }
}
