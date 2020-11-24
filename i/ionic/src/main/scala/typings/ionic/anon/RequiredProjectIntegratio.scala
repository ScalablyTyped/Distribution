package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<ionic.ionic/definitions.ProjectIntegration> */
@js.native
trait RequiredProjectIntegratio extends js.Object {
  
  var enabled: Boolean = js.native
  
  var root: String = js.native
}
object RequiredProjectIntegratio {
  
  @scala.inline
  def apply(enabled: Boolean, root: String): RequiredProjectIntegratio = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProjectIntegratio]
  }
  
  @scala.inline
  implicit class RequiredProjectIntegratioOps[Self <: RequiredProjectIntegratio] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
