package typings.jimpCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<{  constants :any}> */
@js.native
trait Requiredconstantsany extends js.Object {
  
  var constants: js.Any = js.native
}
object Requiredconstantsany {
  
  @scala.inline
  def apply(constants: js.Any): Requiredconstantsany = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requiredconstantsany]
  }
  
  @scala.inline
  implicit class RequiredconstantsanyOps[Self <: Requiredconstantsany] (val x: Self) extends AnyVal {
    
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
    def setConstants(value: js.Any): Self = this.set("constants", value.asInstanceOf[js.Any])
  }
}
