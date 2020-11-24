package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions4 extends js.Object {
  
  val validate_2: Typeofvalidate2 = js.native
}
object Typeofoptions4 {
  
  @scala.inline
  def apply(validate_2: Typeofvalidate2): Typeofoptions4 = {
    val __obj = js.Dynamic.literal(validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4]
  }
  
  @scala.inline
  implicit class Typeofoptions4Ops[Self <: Typeofoptions4] (val x: Self) extends AnyVal {
    
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
    def setValidate_2(value: Typeofvalidate2): Self = this.set("validate_2", value.asInstanceOf[js.Any])
  }
}
