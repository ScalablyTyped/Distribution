package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionOptions extends js.Object {
  
  var backgroundColor: String = js.native
  
  var backgroundOpacity: Double = js.native
  
  var color: String = js.native
  
  var edgeStyle: String = js.native
  
  var fontFamily: String = js.native
  
  var fontOpacity: Double = js.native
  
  var fontSize: Double = js.native
  
  var windowColor: String = js.native
  
  var windowOpacity: Double = js.native
}
object CaptionOptions {
  
  @scala.inline
  def apply(
    backgroundColor: String,
    backgroundOpacity: Double,
    color: String,
    edgeStyle: String,
    fontFamily: String,
    fontOpacity: Double,
    fontSize: Double,
    windowColor: String,
    windowOpacity: Double
  ): CaptionOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundOpacity = backgroundOpacity.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], edgeStyle = edgeStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontOpacity = fontOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowOpacity = windowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionOptions]
  }
  
  @scala.inline
  implicit class CaptionOptionsOps[Self <: CaptionOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = this.set("backgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeStyle(value: String): Self = this.set("edgeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontOpacity(value: Double): Self = this.set("fontOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowColor(value: String): Self = this.set("windowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowOpacity(value: Double): Self = this.set("windowOpacity", value.asInstanceOf[js.Any])
  }
}
