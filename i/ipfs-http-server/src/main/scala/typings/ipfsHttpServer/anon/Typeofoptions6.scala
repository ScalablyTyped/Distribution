package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions6 extends js.Object {
  
  val validate_3: Typeofvalidate3 = js.native
}
object Typeofoptions6 {
  
  @scala.inline
  def apply(validate_3: Typeofvalidate3): Typeofoptions6 = {
    val __obj = js.Dynamic.literal(validate_3 = validate_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions6]
  }
  
  @scala.inline
  implicit class Typeofoptions6Ops[Self <: Typeofoptions6] (val x: Self) extends AnyVal {
    
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
    def setValidate_3(value: Typeofvalidate3): Self = this.set("validate_3", value.asInstanceOf[js.Any])
  }
}
