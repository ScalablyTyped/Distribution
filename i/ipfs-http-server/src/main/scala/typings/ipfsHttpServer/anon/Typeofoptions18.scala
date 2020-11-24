package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions18 extends js.Object {
  
  val validate_9: Typeofvalidate9 = js.native
}
object Typeofoptions18 {
  
  @scala.inline
  def apply(validate_9: Typeofvalidate9): Typeofoptions18 = {
    val __obj = js.Dynamic.literal(validate_9 = validate_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions18]
  }
  
  @scala.inline
  implicit class Typeofoptions18Ops[Self <: Typeofoptions18] (val x: Self) extends AnyVal {
    
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
    def setValidate_9(value: Typeofvalidate9): Self = this.set("validate_9", value.asInstanceOf[js.Any])
  }
}
