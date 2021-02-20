package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawArguments extends StObject {
  
  var args: js.Array[RawArgument] = js.native
  
  var rest: js.Array[String] = js.native
}
object RawArguments {
  
  @scala.inline
  def apply(args: js.Array[RawArgument], rest: js.Array[String]): RawArguments = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArguments]
  }
  
  @scala.inline
  implicit class RawArgumentsMutableBuilder[Self <: RawArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[RawArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: RawArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setRest(value: js.Array[String]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestVarargs(value: String*): Self = StObject.set(x, "rest", js.Array(value :_*))
  }
}
