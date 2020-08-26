package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobileEvents extends js.Object {
  var orientationchange: js.Any = js.native
  var pagebeforechange: js.Any = js.native
  var pagebeforecreate: js.Any = js.native
  var pagebeforehide: js.Any = js.native
  var pagebeforeload: js.Any = js.native
  var pagebeforeshow: js.Any = js.native
  var pagechange: js.Any = js.native
  var pagechangefailed: js.Any = js.native
  var pagecreate: js.Any = js.native
  var pagehide: js.Any = js.native
  var pageinit: js.Any = js.native
  var pageload: js.Any = js.native
  var pageloadfailed: js.Any = js.native
  var pageremove: js.Any = js.native
  var pageshow: js.Any = js.native
  var scrollstart: js.Any = js.native
  var scrollstop: js.Any = js.native
  var swipe: js.Any = js.native
  var swipeleft: js.Any = js.native
  var swiperight: js.Any = js.native
  var tap: js.Any = js.native
  var taphold: js.Any = js.native
  var updatelayout: js.Any = js.native
  var vclick: js.Any = js.native
  var vmousecancel: js.Any = js.native
  var vmousedown: js.Any = js.native
  var vmousemove: js.Any = js.native
  var vmouseout: js.Any = js.native
  var vmouseover: js.Any = js.native
  var vmouseup: js.Any = js.native
}

object JQueryMobileEvents {
  @scala.inline
  def apply(
    orientationchange: js.Any,
    pagebeforechange: js.Any,
    pagebeforecreate: js.Any,
    pagebeforehide: js.Any,
    pagebeforeload: js.Any,
    pagebeforeshow: js.Any,
    pagechange: js.Any,
    pagechangefailed: js.Any,
    pagecreate: js.Any,
    pagehide: js.Any,
    pageinit: js.Any,
    pageload: js.Any,
    pageloadfailed: js.Any,
    pageremove: js.Any,
    pageshow: js.Any,
    scrollstart: js.Any,
    scrollstop: js.Any,
    swipe: js.Any,
    swipeleft: js.Any,
    swiperight: js.Any,
    tap: js.Any,
    taphold: js.Any,
    updatelayout: js.Any,
    vclick: js.Any,
    vmousecancel: js.Any,
    vmousedown: js.Any,
    vmousemove: js.Any,
    vmouseout: js.Any,
    vmouseover: js.Any,
    vmouseup: js.Any
  ): JQueryMobileEvents = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], pagebeforechange = pagebeforechange.asInstanceOf[js.Any], pagebeforecreate = pagebeforecreate.asInstanceOf[js.Any], pagebeforehide = pagebeforehide.asInstanceOf[js.Any], pagebeforeload = pagebeforeload.asInstanceOf[js.Any], pagebeforeshow = pagebeforeshow.asInstanceOf[js.Any], pagechange = pagechange.asInstanceOf[js.Any], pagechangefailed = pagechangefailed.asInstanceOf[js.Any], pagecreate = pagecreate.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageinit = pageinit.asInstanceOf[js.Any], pageload = pageload.asInstanceOf[js.Any], pageloadfailed = pageloadfailed.asInstanceOf[js.Any], pageremove = pageremove.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], scrollstart = scrollstart.asInstanceOf[js.Any], scrollstop = scrollstop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], swipeleft = swipeleft.asInstanceOf[js.Any], swiperight = swiperight.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], taphold = taphold.asInstanceOf[js.Any], updatelayout = updatelayout.asInstanceOf[js.Any], vclick = vclick.asInstanceOf[js.Any], vmousecancel = vmousecancel.asInstanceOf[js.Any], vmousedown = vmousedown.asInstanceOf[js.Any], vmousemove = vmousemove.asInstanceOf[js.Any], vmouseout = vmouseout.asInstanceOf[js.Any], vmouseover = vmouseover.asInstanceOf[js.Any], vmouseup = vmouseup.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMobileEvents]
  }
  @scala.inline
  implicit class JQueryMobileEventsOps[Self <: JQueryMobileEvents] (val x: Self) extends AnyVal {
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
    def setOrientationchange(value: js.Any): Self = this.set("orientationchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagebeforechange(value: js.Any): Self = this.set("pagebeforechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagebeforecreate(value: js.Any): Self = this.set("pagebeforecreate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagebeforehide(value: js.Any): Self = this.set("pagebeforehide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagebeforeload(value: js.Any): Self = this.set("pagebeforeload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagebeforeshow(value: js.Any): Self = this.set("pagebeforeshow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagechange(value: js.Any): Self = this.set("pagechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagechangefailed(value: js.Any): Self = this.set("pagechangefailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagecreate(value: js.Any): Self = this.set("pagecreate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagehide(value: js.Any): Self = this.set("pagehide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageinit(value: js.Any): Self = this.set("pageinit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageload(value: js.Any): Self = this.set("pageload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageloadfailed(value: js.Any): Self = this.set("pageloadfailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageremove(value: js.Any): Self = this.set("pageremove", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageshow(value: js.Any): Self = this.set("pageshow", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollstart(value: js.Any): Self = this.set("scrollstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollstop(value: js.Any): Self = this.set("scrollstop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: js.Any): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeleft(value: js.Any): Self = this.set("swipeleft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwiperight(value: js.Any): Self = this.set("swiperight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTap(value: js.Any): Self = this.set("tap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaphold(value: js.Any): Self = this.set("taphold", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatelayout(value: js.Any): Self = this.set("updatelayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setVclick(value: js.Any): Self = this.set("vclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmousecancel(value: js.Any): Self = this.set("vmousecancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmousedown(value: js.Any): Self = this.set("vmousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmousemove(value: js.Any): Self = this.set("vmousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmouseout(value: js.Any): Self = this.set("vmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmouseover(value: js.Any): Self = this.set("vmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmouseup(value: js.Any): Self = this.set("vmouseup", value.asInstanceOf[js.Any])
  }
  
}

