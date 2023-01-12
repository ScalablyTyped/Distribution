package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.FunctionCall
import typings.jexl.jexlStrings.functions
import typings.jexl.jexlStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args
  extends StObject
     with Ast {
  
  var args: js.Array[Ast]
  
  var name: String
  
  var pool: functions | transforms
  
  var `type`: FunctionCall
}
object Args {
  
  inline def apply(args: js.Array[Ast], name: String, pool: functions | transforms): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionCall")
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Ast]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Ast*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPool(value: functions | transforms): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setType(value: FunctionCall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
