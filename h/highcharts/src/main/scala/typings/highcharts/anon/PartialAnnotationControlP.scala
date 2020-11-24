package typings.highcharts.anon

import typings.highcharts.mod.AnnotationControlPointPositionerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<highcharts.highcharts.AnnotationControlPointOptionsObject> */
@js.native
trait PartialAnnotationControlP extends js.Object {
  
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.native
}
object PartialAnnotationControlP {
  
  @scala.inline
  def apply(): PartialAnnotationControlP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotationControlP]
  }
  
  @scala.inline
  implicit class PartialAnnotationControlPOps[Self <: PartialAnnotationControlP] (val x: Self) extends AnyVal {
    
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
    def setPositioner(value: AnnotationControlPointPositionerFunction): Self = this.set("positioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositioner: Self = this.set("positioner", js.undefined)
  }
}
