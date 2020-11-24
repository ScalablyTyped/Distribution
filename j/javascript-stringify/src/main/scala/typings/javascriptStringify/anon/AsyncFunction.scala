package typings.javascriptStringify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncFunction extends js.Object {
  
  var AsyncFunction: String = js.native
  
  var AsyncGeneratorFunction: String = js.native
  
  var Function: String = js.native
  
  var GeneratorFunction: String = js.native
}
object AsyncFunction {
  
  @scala.inline
  def apply(AsyncFunction: String, AsyncGeneratorFunction: String, Function: String, GeneratorFunction: String): AsyncFunction = {
    val __obj = js.Dynamic.literal(AsyncFunction = AsyncFunction.asInstanceOf[js.Any], AsyncGeneratorFunction = AsyncGeneratorFunction.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GeneratorFunction = GeneratorFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncFunction]
  }
  
  @scala.inline
  implicit class AsyncFunctionOps[Self <: AsyncFunction] (val x: Self) extends AnyVal {
    
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
    def setAsyncFunction(value: String): Self = this.set("AsyncFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncGeneratorFunction(value: String): Self = this.set("AsyncGeneratorFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: String): Self = this.set("Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorFunction(value: String): Self = this.set("GeneratorFunction", value.asInstanceOf[js.Any])
  }
}
