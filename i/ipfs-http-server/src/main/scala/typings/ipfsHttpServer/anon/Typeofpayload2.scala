package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpayload2 extends js.Object {
  
  val output_2: String = js.native
  
  val parse_2: Boolean = js.native
}
object Typeofpayload2 {
  
  @scala.inline
  def apply(output_2: String, parse_2: Boolean): Typeofpayload2 = {
    val __obj = js.Dynamic.literal(output_2 = output_2.asInstanceOf[js.Any], parse_2 = parse_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload2]
  }
  
  @scala.inline
  implicit class Typeofpayload2Ops[Self <: Typeofpayload2] (val x: Self) extends AnyVal {
    
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
    def setOutput_2(value: String): Self = this.set("output_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_2(value: Boolean): Self = this.set("parse_2", value.asInstanceOf[js.Any])
  }
}
