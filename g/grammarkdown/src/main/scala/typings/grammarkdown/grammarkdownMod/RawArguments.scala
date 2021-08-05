package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawArguments extends StObject {
  
  var args: js.Array[RawArgument]
  
  var rest: js.Array[String]
}
object RawArguments {
  
  inline def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArguments]
  }
  
  extension [Self <: RawArguments](x: Self) {
    
    inline def setArgs(value: js.Array[RawArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RawArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
