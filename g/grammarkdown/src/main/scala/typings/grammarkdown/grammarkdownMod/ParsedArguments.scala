package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedArguments
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var argv: js.Array[String]
  
  var rest: js.Array[String]
}
object ParsedArguments {
  
  inline def apply(argv: js.Array[String], rest: js.Array[String]): ParsedArguments = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedArguments]
  }
  
  extension [Self <: ParsedArguments](x: Self) {
    
    inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    inline def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
