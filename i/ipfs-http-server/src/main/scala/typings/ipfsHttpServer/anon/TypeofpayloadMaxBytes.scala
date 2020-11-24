package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpayloadMaxBytes extends js.Object {
  
  val maxBytes: Double = js.native
  
  val output: String = js.native
  
  val parse: Boolean = js.native
}
object TypeofpayloadMaxBytes {
  
  @scala.inline
  def apply(maxBytes: Double, output: String, parse: Boolean): TypeofpayloadMaxBytes = {
    val __obj = js.Dynamic.literal(maxBytes = maxBytes.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpayloadMaxBytes]
  }
  
  @scala.inline
  implicit class TypeofpayloadMaxBytesOps[Self <: TypeofpayloadMaxBytes] (val x: Self) extends AnyVal {
    
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
