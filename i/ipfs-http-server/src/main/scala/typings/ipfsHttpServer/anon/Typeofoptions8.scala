package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions8 extends js.Object {
  
  val validate_4: Typeofvalidate4 = js.native
}
object Typeofoptions8 {
  
  @scala.inline
  def apply(validate_4: Typeofvalidate4): Typeofoptions8 = {
    val __obj = js.Dynamic.literal(validate_4 = validate_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions8]
  }
  
  @scala.inline
  implicit class Typeofoptions8Ops[Self <: Typeofoptions8] (val x: Self) extends AnyVal {
    
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
    def setValidate_4(value: Typeofvalidate4): Self = this.set("validate_4", value.asInstanceOf[js.Any])
  }
}
