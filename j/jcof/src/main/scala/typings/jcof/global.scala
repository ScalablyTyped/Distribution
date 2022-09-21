package typings.jcof

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jcof {
    
    @JSGlobal("jcof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jcof.ParseError")
    @js.native
    open class ParseError protected ()
      extends typings.jcof.mod.ParseError {
      def this(message: String) = this()
    }
    
    inline def parse(str: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def stringify(value: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
