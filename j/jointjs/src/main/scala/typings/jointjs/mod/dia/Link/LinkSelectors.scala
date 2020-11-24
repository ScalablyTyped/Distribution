package typings.jointjs.mod.dia.Link

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkSelectors extends Selectors {
  
  @JSName(".connection")
  var Dotconnection: js.UndefOr[SVGPathAttributes] = js.native
  
  @JSName(".connection-wrap")
  var `Dotconnection-wrap`: js.UndefOr[SVGPathAttributes] = js.native
  
  @JSName(".labels")
  var Dotlabels: js.UndefOr[SVGAttributes] = js.native
  
  @JSName(".link-tools")
  var `Dotlink-tools`: js.UndefOr[SVGAttributes] = js.native
  
  @JSName(".marker-arrowheads")
  var `Dotmarker-arrowheads`: js.UndefOr[SVGAttributes] = js.native
  
  @JSName(".marker-source")
  var `Dotmarker-source`: js.UndefOr[SVGPathAttributes] = js.native
  
  @JSName(".marker-target")
  var `Dotmarker-target`: js.UndefOr[SVGPathAttributes] = js.native
  
  @JSName(".marker-vertices")
  var `Dotmarker-vertices`: js.UndefOr[SVGAttributes] = js.native
}
object LinkSelectors {
  
  @scala.inline
  def apply(): LinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSelectors]
  }
  
  @scala.inline
  implicit class LinkSelectorsOps[Self <: LinkSelectors] (val x: Self) extends AnyVal {
    
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
    def setDotconnection(value: SVGPathAttributes): Self = this.set(".connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotconnection: Self = this.set(".connection", js.undefined)
    
    @scala.inline
    def `setDotconnection-wrap`(value: SVGPathAttributes): Self = this.set(".connection-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotconnection-wrap`: Self = this.set(".connection-wrap", js.undefined)
    
    @scala.inline
    def setDotlabels(value: SVGAttributes): Self = this.set(".labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotlabels: Self = this.set(".labels", js.undefined)
    
    @scala.inline
    def `setDotlink-tools`(value: SVGAttributes): Self = this.set(".link-tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotlink-tools`: Self = this.set(".link-tools", js.undefined)
    
    @scala.inline
    def `setDotmarker-arrowheads`(value: SVGAttributes): Self = this.set(".marker-arrowheads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotmarker-arrowheads`: Self = this.set(".marker-arrowheads", js.undefined)
    
    @scala.inline
    def `setDotmarker-source`(value: SVGPathAttributes): Self = this.set(".marker-source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotmarker-source`: Self = this.set(".marker-source", js.undefined)
    
    @scala.inline
    def `setDotmarker-target`(value: SVGPathAttributes): Self = this.set(".marker-target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotmarker-target`: Self = this.set(".marker-target", js.undefined)
    
    @scala.inline
    def `setDotmarker-vertices`(value: SVGAttributes): Self = this.set(".marker-vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDotmarker-vertices`: Self = this.set(".marker-vertices", js.undefined)
  }
}
