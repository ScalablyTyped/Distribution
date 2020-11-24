package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxBytes extends js.Object {
  
  var maxBytes: Double = js.native
  
  var output: String = js.native
  
  var parse: Boolean = js.native
}
object MaxBytes {
  
  @scala.inline
  def apply(maxBytes: Double, output: String, parse: Boolean): MaxBytes = {
    val __obj = js.Dynamic.literal(maxBytes = maxBytes.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBytes]
  }
  
  @scala.inline
  implicit class MaxBytesOps[Self <: MaxBytes] (val x: Self) extends AnyVal {
    
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
    def setMaxBytes(value: Double): Self = this.set("maxBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: Boolean): Self = this.set("parse", value.asInstanceOf[js.Any])
  }
}
