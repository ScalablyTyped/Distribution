package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2 extends js.Object {
  
  val validate_1: Typeofvalidate1 = js.native
}
object Typeofoptions2 {
  
  @scala.inline
  def apply(validate_1: Typeofvalidate1): Typeofoptions2 = {
    val __obj = js.Dynamic.literal(validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2]
  }
  
  @scala.inline
  implicit class Typeofoptions2Ops[Self <: Typeofoptions2] (val x: Self) extends AnyVal {
    
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
    def setValidate_1(value: Typeofvalidate1): Self = this.set("validate_1", value.asInstanceOf[js.Any])
  }
}
