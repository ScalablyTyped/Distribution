package typings.ink.rendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var output: String = js.native
  
  var outputHeight: Double = js.native
  
  var staticOutput: String = js.native
}
object Result {
  
  @scala.inline
  def apply(output: String, outputHeight: Double, staticOutput: String): Result = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], outputHeight = outputHeight.asInstanceOf[js.Any], staticOutput = staticOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputHeight(value: Double): Self = this.set("outputHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticOutput(value: String): Self = this.set("staticOutput", value.asInstanceOf[js.Any])
  }
}
