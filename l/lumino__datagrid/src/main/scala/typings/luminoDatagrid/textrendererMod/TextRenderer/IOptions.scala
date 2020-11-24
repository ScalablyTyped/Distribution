package typings.luminoDatagrid.textrendererMod.TextRenderer

import typings.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a text renderer.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The background color for the cells.
    *
    * The default is `''`.
    */
  var backgroundColor: js.UndefOr[ConfigOption[String]] = js.native
  
  /**
    * The font for drawing the cell text.
    *
    * The default is `'12px sans-serif'`.
    */
  var font: js.UndefOr[ConfigOption[String]] = js.native
  
  /**
    * The format function for the renderer.
    *
    * The default is `TextRenderer.formatGeneric()`.
    */
  var format: js.UndefOr[FormatFunc] = js.native
  
  /**
    * The horizontal alignment for the cell text.
    *
    * The default is `'left'`.
    */
  var horizontalAlignment: js.UndefOr[ConfigOption[HorizontalAlignment]] = js.native
  
  /**
    * The color for the drawing the cell text.
    *
    * The default `'#000000'`.
    */
  var textColor: js.UndefOr[ConfigOption[String]] = js.native
  
  /**
    * The vertical alignment for the cell text.
    *
    * The default is `'center'`.
    */
  var verticalAlignment: js.UndefOr[ConfigOption[VerticalAlignment]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColorFunction1(value: /* config */ CellConfig => String): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColor(value: ConfigOption[String]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFontFunction1(value: /* config */ CellConfig => String): Self = this.set("font", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFont(value: ConfigOption[String]): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormat(value: /* config */ CellConfig => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHorizontalAlignmentFunction1(value: /* config */ CellConfig => HorizontalAlignment): Self = this.set("horizontalAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHorizontalAlignment(value: ConfigOption[HorizontalAlignment]): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setTextColorFunction1(value: /* config */ CellConfig => String): Self = this.set("textColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextColor(value: ConfigOption[String]): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setVerticalAlignmentFunction1(value: /* config */ CellConfig => VerticalAlignment): Self = this.set("verticalAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerticalAlignment(value: ConfigOption[VerticalAlignment]): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
}
