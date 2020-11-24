package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollerOptions extends js.Object {
  
  var elastic: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[ScrollerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  
  var pullOffset: js.UndefOr[Double] = js.native
  
  var pullToRefresh: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, Unit]] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
  
  var visibleScrollHints: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Boolean] = js.native
}
object ScrollerOptions {
  
  @scala.inline
  def apply(): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerOptions]
  }
  
  @scala.inline
  implicit class ScrollerOptionsOps[Self <: ScrollerOptions] (val x: Self) extends AnyVal {
    
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
    def setElastic(value: Boolean): Self = this.set("elastic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElastic: Self = this.set("elastic", js.undefined)
    
    @scala.inline
    def setMessages(value: ScrollerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPull(value: /* e */ ScrollerEvent => Unit): Self = this.set("pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setPullOffset(value: Double): Self = this.set("pullOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullOffset: Self = this.set("pullOffset", js.undefined)
    
    @scala.inline
    def setPullToRefresh(value: Boolean): Self = this.set("pullToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullToRefresh: Self = this.set("pullToRefresh", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ ScrollerEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScroll(value: /* e */ ScrollerScrollEvent => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
    
    @scala.inline
    def setVisibleScrollHints(value: Boolean): Self = this.set("visibleScrollHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleScrollHints: Self = this.set("visibleScrollHints", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
