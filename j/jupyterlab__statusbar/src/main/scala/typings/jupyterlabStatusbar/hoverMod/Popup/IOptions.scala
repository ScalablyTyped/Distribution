package typings.jupyterlabStatusbar.hoverMod.Popup

import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
import typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a Popup widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Whether to align the popup to the left or the right of the anchor.
    */
  var align: js.UndefOr[left | right] = js.native
  
  /**
    * The widget to which we are attaching the popup.
    */
  var anchor: Widget = js.native
  
  /**
    * The content of the popup.
    */
  var body: Widget = js.native
}
object IOptions {
  
  @scala.inline
  def apply(anchor: Widget, body: Widget): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
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
    def setAnchor(value: Widget): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Widget): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
}
