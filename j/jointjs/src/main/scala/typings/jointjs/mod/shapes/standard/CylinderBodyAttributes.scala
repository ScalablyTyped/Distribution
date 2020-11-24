package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGPathAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CylinderBodyAttributes extends SVGPathAttributes {
  
  var lateralArea: js.UndefOr[String | Double] = js.native
}
object CylinderBodyAttributes {
  
  @scala.inline
  def apply(): CylinderBodyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderBodyAttributes]
  }
  
  @scala.inline
  implicit class CylinderBodyAttributesOps[Self <: CylinderBodyAttributes] (val x: Self) extends AnyVal {
    
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
    def setLateralArea(value: String | Double): Self = this.set("lateralArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLateralArea: Self = this.set("lateralArea", js.undefined)
  }
}
