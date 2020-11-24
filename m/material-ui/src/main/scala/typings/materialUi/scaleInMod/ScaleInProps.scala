package typings.materialUi.scaleInMod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleInProps extends Props[ScaleIn] {
  
  var childStyle: js.UndefOr[CSSProperties] = js.native
  
  var enterDelay: js.UndefOr[Double] = js.native
  
  var maxScale: js.UndefOr[Double] = js.native
  
  var minScale: js.UndefOr[Double] = js.native
}
object ScaleInProps {
  
  @scala.inline
  def apply(): ScaleInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleInProps]
  }
  
  @scala.inline
  implicit class ScaleInPropsOps[Self <: ScaleInProps] (val x: Self) extends AnyVal {
    
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
    def setChildStyle(value: CSSProperties): Self = this.set("childStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildStyle: Self = this.set("childStyle", js.undefined)
    
    @scala.inline
    def setEnterDelay(value: Double): Self = this.set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterDelay: Self = this.set("enterDelay", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
  }
}
