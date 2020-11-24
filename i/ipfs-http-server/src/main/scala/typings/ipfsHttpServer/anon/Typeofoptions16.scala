package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions16 extends js.Object {
  
  val validate_8: Typeofvalidate8 = js.native
}
object Typeofoptions16 {
  
  @scala.inline
  def apply(validate_8: Typeofvalidate8): Typeofoptions16 = {
    val __obj = js.Dynamic.literal(validate_8 = validate_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions16]
  }
  
  @scala.inline
  implicit class Typeofoptions16Ops[Self <: Typeofoptions16] (val x: Self) extends AnyVal {
    
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
    def setValidate_8(value: Typeofvalidate8): Self = this.set("validate_8", value.asInstanceOf[js.Any])
  }
}
