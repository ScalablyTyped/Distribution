package typings.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawArguments extends js.Object {
  
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
  implicit class RawArgumentsOps[Self <: RawArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: RawArgument*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[RawArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestVarargs(value: String*): Self = this.set("rest", js.Array(value :_*))
    
    @scala.inline
    def setRest(value: js.Array[String]): Self = this.set("rest", value.asInstanceOf[js.Any])
  }
}
