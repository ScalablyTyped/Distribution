package typings.ivViewer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreenElements extends Elements {
  
  var fullScreen: Element | Null = js.native
}
object FullScreenElements {
  
  @scala.inline
  def apply(): FullScreenElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreenElements]
  }
  
  @scala.inline
  implicit class FullScreenElementsOps[Self <: FullScreenElements] (val x: Self) extends AnyVal {
    
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
    def setFullScreen(value: Element): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenNull: Self = this.set("fullScreen", null)
  }
}
