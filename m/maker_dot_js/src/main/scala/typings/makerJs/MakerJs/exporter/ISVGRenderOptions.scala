package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVG rendering options.
  */
@js.native
trait ISVGRenderOptions extends IExportOptions {
  
  /**
    *  Indicate that the id's of paths should be rendered as SVG text elements.
    */
  var annotate: js.UndefOr[Boolean] = js.native
  
  /**
    * SVG fill color.
    */
  var fill: js.UndefOr[String] = js.native
  
  /**
    * SVG font size and font size units.
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.native
  
  /**
    * Scale of the SVG rendering.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.native
  
  /**
    * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
    */
  var strokeWidth: js.UndefOr[String] = js.native
  
  /**
    * Optional attributes to add to the root svg tag.
    */
  var svgAttrs: js.UndefOr[IXmlTagAttrs] = js.native
  
  /**
    * Use SVG < path > elements instead of < line >, < circle > etc.
    */
  var useSvgPathOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to use SVG viewbox.
    */
  var viewBox: js.UndefOr[Boolean] = js.native
}
object ISVGRenderOptions {
  
  @scala.inline
  def apply(): ISVGRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISVGRenderOptions]
  }
  
  @scala.inline
  implicit class ISVGRenderOptionsOps[Self <: ISVGRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotate(value: Boolean): Self = this.set("annotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotate: Self = this.set("annotate", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setSvgAttrs(value: IXmlTagAttrs): Self = this.set("svgAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgAttrs: Self = this.set("svgAttrs", js.undefined)
    
    @scala.inline
    def setUseSvgPathOnly(value: Boolean): Self = this.set("useSvgPathOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSvgPathOnly: Self = this.set("useSvgPathOnly", js.undefined)
    
    @scala.inline
    def setViewBox(value: Boolean): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
}
