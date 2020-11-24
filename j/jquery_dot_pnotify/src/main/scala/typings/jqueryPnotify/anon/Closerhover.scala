package typings.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closerhover extends js.Object {
  
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.native
  
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.native
  
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.native
}
object Closerhover {
  
  @scala.inline
  def apply(): Closerhover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closerhover]
  }
  
  @scala.inline
  implicit class CloserhoverOps[Self <: Closerhover] (val x: Self) extends AnyVal {
    
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
    def setCloser(value: Boolean): Self = this.set("closer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloser: Self = this.set("closer", js.undefined)
    
    @scala.inline
    def setCloser_hover(value: Boolean): Self = this.set("closer_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloser_hover: Self = this.set("closer_hover", js.undefined)
    
    @scala.inline
    def setSticker(value: Boolean): Self = this.set("sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticker: Self = this.set("sticker", js.undefined)
    
    @scala.inline
    def setSticker_hover(value: Boolean): Self = this.set("sticker_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticker_hover: Self = this.set("sticker_hover", js.undefined)
  }
}
