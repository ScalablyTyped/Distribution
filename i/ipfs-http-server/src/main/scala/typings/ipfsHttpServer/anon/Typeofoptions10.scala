package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions10 extends js.Object {
  
  val validate_5: Typeofvalidate5 = js.native
}
object Typeofoptions10 {
  
  @scala.inline
  def apply(validate_5: Typeofvalidate5): Typeofoptions10 = {
    val __obj = js.Dynamic.literal(validate_5 = validate_5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions10]
  }
  
  @scala.inline
  implicit class Typeofoptions10Ops[Self <: Typeofoptions10] (val x: Self) extends AnyVal {
    
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
    def setValidate_5(value: Typeofvalidate5): Self = this.set("validate_5", value.asInstanceOf[js.Any])
  }
}
