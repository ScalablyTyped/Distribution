package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpayload1 extends js.Object {
  
  val output_1: String = js.native
  
  val parse_1: Boolean = js.native
}
object Typeofpayload1 {
  
  @scala.inline
  def apply(output_1: String, parse_1: Boolean): Typeofpayload1 = {
    val __obj = js.Dynamic.literal(output_1 = output_1.asInstanceOf[js.Any], parse_1 = parse_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload1]
  }
  
  @scala.inline
  implicit class Typeofpayload1Ops[Self <: Typeofpayload1] (val x: Self) extends AnyVal {
    
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
    def setOutput_1(value: String): Self = this.set("output_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_1(value: Boolean): Self = this.set("parse_1", value.asInstanceOf[js.Any])
  }
}
