package typings.jqueryUiLayout.JQueryUILayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneState extends js.Object {
  
  var isClosed: Boolean = js.native
  
  var isHidden: Boolean = js.native
  
  var isResizing: Boolean = js.native
  
  var isSliding: Boolean = js.native
  
  var maxSize: Double = js.native
  
  var minSize: Double = js.native
  
  var noRoom: Boolean = js.native
  
  var size: Double = js.native
}
object PaneState {
  
  @scala.inline
  def apply(
    isClosed: Boolean,
    isHidden: Boolean,
    isResizing: Boolean,
    isSliding: Boolean,
    maxSize: Double,
    minSize: Double,
    noRoom: Boolean,
    size: Double
  ): PaneState = {
    val __obj = js.Dynamic.literal(isClosed = isClosed.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSliding = isSliding.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noRoom = noRoom.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneState]
  }
  
  @scala.inline
  implicit class PaneStateOps[Self <: PaneState] (val x: Self) extends AnyVal {
    
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
    def setIsClosed(value: Boolean): Self = this.set("isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizing(value: Boolean): Self = this.set("isResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSliding(value: Boolean): Self = this.set("isSliding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRoom(value: Boolean): Self = this.set("noRoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
