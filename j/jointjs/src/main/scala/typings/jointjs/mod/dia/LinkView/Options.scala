package typings.jointjs.mod.dia.LinkView

import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.mvc.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends ViewOptions[Link] {
  
  var doubleLinkTools: js.UndefOr[Boolean] = js.native
  
  var doubleLinkToolsOffset: js.UndefOr[Double] = js.native
  
  var linkToolsOffset: js.UndefOr[Double] = js.native
  
  var longLinkLength: js.UndefOr[Double] = js.native
  
  var sampleInterval: js.UndefOr[Double] = js.native
  
  var shortLinkLength: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDoubleLinkTools(value: Boolean): Self = this.set("doubleLinkTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleLinkTools: Self = this.set("doubleLinkTools", js.undefined)
    
    @scala.inline
    def setDoubleLinkToolsOffset(value: Double): Self = this.set("doubleLinkToolsOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleLinkToolsOffset: Self = this.set("doubleLinkToolsOffset", js.undefined)
    
    @scala.inline
    def setLinkToolsOffset(value: Double): Self = this.set("linkToolsOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToolsOffset: Self = this.set("linkToolsOffset", js.undefined)
    
    @scala.inline
    def setLongLinkLength(value: Double): Self = this.set("longLinkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongLinkLength: Self = this.set("longLinkLength", js.undefined)
    
    @scala.inline
    def setSampleInterval(value: Double): Self = this.set("sampleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleInterval: Self = this.set("sampleInterval", js.undefined)
    
    @scala.inline
    def setShortLinkLength(value: Double): Self = this.set("shortLinkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortLinkLength: Self = this.set("shortLinkLength", js.undefined)
  }
}
