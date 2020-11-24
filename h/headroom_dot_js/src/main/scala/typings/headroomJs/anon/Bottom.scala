package typings.headroomJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottom extends js.Object {
  
  /**
    * when at bottom of scroll area
    * @default 'headroom--bottom'
    */
  var bottom: js.UndefOr[String] = js.native
  
  /**
    * when frozen method has been called
    * @default 'headroom--frozen'
    */
  var frozen: js.UndefOr[String] = js.native
  
  /**
    * when element is initialised
    * @default 'headroom'
    */
  var initial: js.UndefOr[String] = js.native
  
  /**
    * when not at bottom of scroll area
    * @default 'headroom--not-bottom'
    */
  var notBottom: js.UndefOr[String] = js.native
  
  /**
    * when below offset
    * @default 'headroom--not-top'
    */
  var notTop: js.UndefOr[String] = js.native
  
  /**
    * when scrolling up
    * @default 'headroom--pinned'
    */
  var pinned: js.UndefOr[String] = js.native
  
  /**
    * when above offset
    * @default 'headroom--top'
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * when scrolling down
    * @default 'headroom--unpinned'
    */
  var unpinned: js.UndefOr[String] = js.native
}
object Bottom {
  
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setFrozen(value: String): Self = this.set("frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    
    @scala.inline
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setNotBottom(value: String): Self = this.set("notBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBottom: Self = this.set("notBottom", js.undefined)
    
    @scala.inline
    def setNotTop(value: String): Self = this.set("notTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotTop: Self = this.set("notTop", js.undefined)
    
    @scala.inline
    def setPinned(value: String): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setUnpinned(value: String): Self = this.set("unpinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnpinned: Self = this.set("unpinned", js.undefined)
  }
}
