package typings.jqueryTinyscrollbar.JQueryTinyScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryTinyScrollbarOptions extends js.Object {
  
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.native
  
  /**
    * Enable mobile invert style scrolling. (default: false)
    */
  var invertscroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Return scrollwheel event to browser if there is no more content. (default: true)
    */
  var lockscroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable the mousewheel. (default: true)
    */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the size of the scrollbar to auto or a fixed number. (default: 'auto')
    */
  var size: js.UndefOr[js.Any] = js.native
  
  /**
    * Set the size of the thumb to auto or a fixed number. (default: 'auto')
    */
  var sizethumb: js.UndefOr[js.Any] = js.native
  
  /**
    * How many pixels must the mouswheel scrolls at a time. (default: 40)
    */
  var wheel: js.UndefOr[Double] = js.native
}
object JQueryTinyScrollbarOptions {
  
  @scala.inline
  def apply(): JQueryTinyScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTinyScrollbarOptions]
  }
  
  @scala.inline
  implicit class JQueryTinyScrollbarOptionsOps[Self <: JQueryTinyScrollbarOptions] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setInvertscroll(value: Boolean): Self = this.set("invertscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertscroll: Self = this.set("invertscroll", js.undefined)
    
    @scala.inline
    def setLockscroll(value: Boolean): Self = this.set("lockscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockscroll: Self = this.set("lockscroll", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizethumb(value: js.Any): Self = this.set("sizethumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizethumb: Self = this.set("sizethumb", js.undefined)
    
    @scala.inline
    def setWheel(value: Double): Self = this.set("wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
  }
}
