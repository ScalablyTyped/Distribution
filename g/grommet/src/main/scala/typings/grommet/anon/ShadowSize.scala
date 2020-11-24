package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowSize extends js.Object {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var border: js.UndefOr[Width] = js.native
  
  var shadowSize: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[String] = js.native
}
object ShadowSize {
  
  @scala.inline
  def apply(): ShadowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowSize]
  }
  
  @scala.inline
  implicit class ShadowSizeOps[Self <: ShadowSize] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: Width): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setShadowSize(value: String): Self = this.set("shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowSize: Self = this.set("shadowSize", js.undefined)
    
    @scala.inline
    def setZIndex(value: String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
