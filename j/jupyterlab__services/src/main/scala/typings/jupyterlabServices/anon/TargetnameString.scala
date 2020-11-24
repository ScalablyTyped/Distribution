package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetnameString extends js.Object {
  
  var target_name: String = js.native
}
object TargetnameString {
  
  @scala.inline
  def apply(target_name: String): TargetnameString = {
    val __obj = js.Dynamic.literal(target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetnameString]
  }
  
  @scala.inline
  implicit class TargetnameStringOps[Self <: TargetnameString] (val x: Self) extends AnyVal {
    
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
    def setTarget_name(value: String): Self = this.set("target_name", value.asInstanceOf[js.Any])
  }
}
