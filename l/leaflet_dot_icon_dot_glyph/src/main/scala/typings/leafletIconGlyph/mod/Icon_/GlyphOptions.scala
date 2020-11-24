package typings.leafletIconGlyph.mod.Icon_

import typings.leaflet.mod.BaseIconOptions
import typings.leaflet.mod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlyphOptions extends BaseIconOptions {
  
  var bgPos: js.UndefOr[PointExpression] = js.native
  
  var bgSize: js.UndefOr[PointExpression] = js.native
  
  var glyph: js.UndefOr[String] = js.native
  
  var glyphAnchor: js.UndefOr[PointExpression] = js.native
  
  var glyphColor: js.UndefOr[String] = js.native
  
  var glyphSize: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object GlyphOptions {
  
  @scala.inline
  def apply(): GlyphOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlyphOptions]
  }
  
  @scala.inline
  implicit class GlyphOptionsOps[Self <: GlyphOptions] (val x: Self) extends AnyVal {
    
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
    def setBgPos(value: PointExpression): Self = this.set("bgPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgPos: Self = this.set("bgPos", js.undefined)
    
    @scala.inline
    def setBgSize(value: PointExpression): Self = this.set("bgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgSize: Self = this.set("bgSize", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setGlyphAnchor(value: PointExpression): Self = this.set("glyphAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphAnchor: Self = this.set("glyphAnchor", js.undefined)
    
    @scala.inline
    def setGlyphColor(value: String): Self = this.set("glyphColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphColor: Self = this.set("glyphColor", js.undefined)
    
    @scala.inline
    def setGlyphSize(value: String): Self = this.set("glyphSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphSize: Self = this.set("glyphSize", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
