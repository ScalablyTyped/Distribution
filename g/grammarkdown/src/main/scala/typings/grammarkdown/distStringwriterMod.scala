package typings.grammarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringwriterMod {
  
  @JSImport("grammarkdown/dist/stringwriter", "StringWriter")
  @js.native
  open class StringWriter () extends StObject {
    def this(eol: String) = this()
    
    /* private */ var _character: Any = js.native
    
    /* private */ var _depth: Any = js.native
    
    /* private */ var _eol: Any = js.native
    
    /* private */ var _flags: Any = js.native
    
    /* private */ var _indents: Any = js.native
    
    /* private */ var _line: Any = js.native
    
    /* private */ var _text: Any = js.native
    
    def character: Double = js.native
    
    def commitLine(): Unit = js.native
    
    def dedent(): Unit = js.native
    
    /* private */ var flushIndent: Any = js.native
    
    /* private */ var flushNewLine: Any = js.native
    
    def indent(): Unit = js.native
    
    def line: Double = js.native
    
    def size: Double = js.native
    
    def write(): Unit = js.native
    def write(text: String): Unit = js.native
    
    def writeln(): Unit = js.native
    def writeln(text: String): Unit = js.native
  }
}
