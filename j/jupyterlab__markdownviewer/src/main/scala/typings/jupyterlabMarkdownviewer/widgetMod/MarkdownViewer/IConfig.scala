package typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends js.Object {
  
  /**
    * User preferred font family for markdown viewer.
    */
  var fontFamily: String | Null = js.native
  
  /**
    * User preferred size in pixel of the font used in markdown viewer.
    */
  var fontSize: Double | Null = js.native
  
  /**
    * Whether to hide the YALM front matter.
    */
  var hideFrontMatter: Boolean = js.native
  
  /**
    * User preferred text line height, as a multiplier of font size.
    */
  var lineHeight: Double | Null = js.native
  
  /**
    * User preferred text line width expressed in CSS ch units.
    */
  var lineWidth: Double | Null = js.native
  
  /**
    * The render timeout.
    */
  var renderTimeout: Double = js.native
}
object IConfig {
  
  @scala.inline
  def apply(hideFrontMatter: Boolean, renderTimeout: Double): IConfig = {
    val __obj = js.Dynamic.literal(hideFrontMatter = hideFrontMatter.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setHideFrontMatter(value: Boolean): Self = this.set("hideFrontMatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTimeout(value: Double): Self = this.set("renderTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightNull: Self = this.set("lineHeight", null)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthNull: Self = this.set("lineWidth", null)
  }
}
