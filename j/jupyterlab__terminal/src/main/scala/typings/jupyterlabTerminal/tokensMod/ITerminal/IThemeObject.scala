package typings.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type for the terminal theme.
  */
@js.native
trait IThemeObject extends js.Object {
  
  var background: String = js.native
  
  var cursor: String = js.native
  
  var cursorAccent: String = js.native
  
  var foreground: String = js.native
  
  var selection: String = js.native
}
object IThemeObject {
  
  @scala.inline
  def apply(background: String, cursor: String, cursorAccent: String, foreground: String, selection: String): IThemeObject = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], cursorAccent = cursorAccent.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeObject]
  }
  
  @scala.inline
  implicit class IThemeObjectOps[Self <: IThemeObject] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorAccent(value: String): Self = this.set("cursorAccent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
}
