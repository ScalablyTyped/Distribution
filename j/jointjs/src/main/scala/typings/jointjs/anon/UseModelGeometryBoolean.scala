package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseModelGeometryBoolean extends js.Object {
  
  var useModelGeometry: Boolean = js.native
}
object UseModelGeometryBoolean {
  
  @scala.inline
  def apply(useModelGeometry: Boolean): UseModelGeometryBoolean = {
    val __obj = js.Dynamic.literal(useModelGeometry = useModelGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseModelGeometryBoolean]
  }
  
  @scala.inline
  implicit class UseModelGeometryBooleanOps[Self <: UseModelGeometryBoolean] (val x: Self) extends AnyVal {
    
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
    def setUseModelGeometry(value: Boolean): Self = this.set("useModelGeometry", value.asInstanceOf[js.Any])
  }
}
