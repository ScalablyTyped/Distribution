package typings.jqueryNicescroll.JQueryNiceScroll

import typings.jqueryNicescroll.anon.Bottom
import typings.jqueryNicescroll.anon.Left
import typings.jqueryNicescroll.jqueryNicescrollStrings.auto
import typings.jqueryNicescroll.jqueryNicescrollStrings.bottom
import typings.jqueryNicescroll.jqueryNicescrollStrings.cursor
import typings.jqueryNicescroll.jqueryNicescrollStrings.hidden
import typings.jqueryNicescroll.jqueryNicescrollStrings.inherit
import typings.jqueryNicescroll.jqueryNicescrollStrings.initial
import typings.jqueryNicescroll.jqueryNicescrollStrings.leave
import typings.jqueryNicescroll.jqueryNicescrollStrings.left
import typings.jqueryNicescroll.jqueryNicescrollStrings.overlay
import typings.jqueryNicescroll.jqueryNicescrollStrings.right
import typings.jqueryNicescroll.jqueryNicescrollStrings.scroll
import typings.jqueryNicescroll.jqueryNicescrollStrings.top
import typings.jqueryNicescroll.jqueryNicescrollStrings.unset
import typings.jqueryNicescroll.jqueryNicescrollStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NiceScrollOptions extends js.Object {
  
  var autohidemode: js.UndefOr[leave | scroll | cursor | hidden | Boolean] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var bouncescroll: js.UndefOr[Boolean] = js.native
  
  var boxzoom: js.UndefOr[Boolean] = js.native
  
  var cursorborder: js.UndefOr[String] = js.native
  
  var cursorborderradius: js.UndefOr[String] = js.native
  
  var cursorcolor: js.UndefOr[String] = js.native
  
  var cursordragontouch: js.UndefOr[Boolean] = js.native
  
  var cursordragspeed: js.UndefOr[Double] = js.native
  
  var cursorfixedheight: js.UndefOr[Double] = js.native
  
  var cursorminheight: js.UndefOr[Double] = js.native
  
  var cursoropacitymax: js.UndefOr[Double] = js.native
  
  var cursoropacitymin: js.UndefOr[Double] = js.native
  
  var cursorwidth: js.UndefOr[String] = js.native
  
  var dblclickzoom: js.UndefOr[Boolean] = js.native
  
  var directionlockdeadzone: js.UndefOr[Double] = js.native
  
  var disablemutationobserver: js.UndefOr[Boolean] = js.native
  
  var disableoutline: js.UndefOr[Boolean] = js.native
  
  var emulatetouch: js.UndefOr[Boolean] = js.native
  
  var enablekeyboard: js.UndefOr[Boolean] = js.native
  
  var enablemouselockapi: js.UndefOr[Boolean] = js.native
  
  var enablemousewheel: js.UndefOr[Boolean] = js.native
  
  var enableobserver: js.UndefOr[Boolean] = js.native
  
  var enablescrollonselection: js.UndefOr[Boolean] = js.native
  
  var enabletranslate3d: js.UndefOr[Boolean] = js.native
  
  var gesturezoom: js.UndefOr[Boolean] = js.native
  
  var grabcursorenabled: js.UndefOr[Boolean] = js.native
  
  var hidecursordelay: js.UndefOr[Double] = js.native
  
  var horizrailenabled: js.UndefOr[Boolean] = js.native
  
  var hwacceleration: js.UndefOr[Boolean] = js.native
  
  var iframeautoresize: js.UndefOr[Boolean] = js.native
  
  var mousescrollstep: js.UndefOr[Double] = js.native
  
  var nativeparentscrolling: js.UndefOr[Boolean] = js.native
  
  var oneaxismousemode: js.UndefOr[auto | Boolean] = js.native
  
  var overflowx: js.UndefOr[auto | hidden | inherit | initial | overlay | scroll | unset | visible] = js.native
  
  var overflowy: js.UndefOr[auto | hidden | inherit | initial | overlay | scroll | unset | visible] = js.native
  
  var preservenativescrolling: js.UndefOr[Boolean] = js.native
  
  var preventmultitouchscrolling: js.UndefOr[Boolean] = js.native
  
  var railalign: js.UndefOr[right | left | top | bottom] = js.native
  
  var railhoffset: js.UndefOr[Boolean | Left] = js.native
  
  var railoffset: js.UndefOr[Boolean | Left] = js.native
  
  var railpadding: js.UndefOr[Bottom] = js.native
  
  var railvalign: js.UndefOr[right | left | top | bottom] = js.native
  
  var rtlmode: js.UndefOr[auto | Boolean] = js.native
  
  var scriptpath: js.UndefOr[String] = js.native
  
  var scrollCLass: js.UndefOr[String] = js.native
  
  var scrollbarid: js.UndefOr[String] = js.native
  
  var scrollspeed: js.UndefOr[Double] = js.native
  
  var sensitiverail: js.UndefOr[Boolean] = js.native
  
  var smoothscroll: js.UndefOr[Boolean] = js.native
  
  var spacebarenabled: js.UndefOr[Boolean] = js.native
  
  var touchbehavior: js.UndefOr[Boolean] = js.native
  
  var usetransition: js.UndefOr[Boolean] = js.native
  
  var zindex: js.UndefOr[auto | Double] = js.native
}
object NiceScrollOptions {
  
  @scala.inline
  def apply(): NiceScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NiceScrollOptions]
  }
  
  @scala.inline
  implicit class NiceScrollOptionsOps[Self <: NiceScrollOptions] (val x: Self) extends AnyVal {
    
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
    def setAutohidemode(value: leave | scroll | cursor | hidden | Boolean): Self = this.set("autohidemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutohidemode: Self = this.set("autohidemode", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBouncescroll(value: Boolean): Self = this.set("bouncescroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBouncescroll: Self = this.set("bouncescroll", js.undefined)
    
    @scala.inline
    def setBoxzoom(value: Boolean): Self = this.set("boxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxzoom: Self = this.set("boxzoom", js.undefined)
    
    @scala.inline
    def setCursorborder(value: String): Self = this.set("cursorborder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorborder: Self = this.set("cursorborder", js.undefined)
    
    @scala.inline
    def setCursorborderradius(value: String): Self = this.set("cursorborderradius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorborderradius: Self = this.set("cursorborderradius", js.undefined)
    
    @scala.inline
    def setCursorcolor(value: String): Self = this.set("cursorcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorcolor: Self = this.set("cursorcolor", js.undefined)
    
    @scala.inline
    def setCursordragontouch(value: Boolean): Self = this.set("cursordragontouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursordragontouch: Self = this.set("cursordragontouch", js.undefined)
    
    @scala.inline
    def setCursordragspeed(value: Double): Self = this.set("cursordragspeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursordragspeed: Self = this.set("cursordragspeed", js.undefined)
    
    @scala.inline
    def setCursorfixedheight(value: Double): Self = this.set("cursorfixedheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorfixedheight: Self = this.set("cursorfixedheight", js.undefined)
    
    @scala.inline
    def setCursorminheight(value: Double): Self = this.set("cursorminheight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorminheight: Self = this.set("cursorminheight", js.undefined)
    
    @scala.inline
    def setCursoropacitymax(value: Double): Self = this.set("cursoropacitymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursoropacitymax: Self = this.set("cursoropacitymax", js.undefined)
    
    @scala.inline
    def setCursoropacitymin(value: Double): Self = this.set("cursoropacitymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursoropacitymin: Self = this.set("cursoropacitymin", js.undefined)
    
    @scala.inline
    def setCursorwidth(value: String): Self = this.set("cursorwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorwidth: Self = this.set("cursorwidth", js.undefined)
    
    @scala.inline
    def setDblclickzoom(value: Boolean): Self = this.set("dblclickzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclickzoom: Self = this.set("dblclickzoom", js.undefined)
    
    @scala.inline
    def setDirectionlockdeadzone(value: Double): Self = this.set("directionlockdeadzone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionlockdeadzone: Self = this.set("directionlockdeadzone", js.undefined)
    
    @scala.inline
    def setDisablemutationobserver(value: Boolean): Self = this.set("disablemutationobserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablemutationobserver: Self = this.set("disablemutationobserver", js.undefined)
    
    @scala.inline
    def setDisableoutline(value: Boolean): Self = this.set("disableoutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableoutline: Self = this.set("disableoutline", js.undefined)
    
    @scala.inline
    def setEmulatetouch(value: Boolean): Self = this.set("emulatetouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulatetouch: Self = this.set("emulatetouch", js.undefined)
    
    @scala.inline
    def setEnablekeyboard(value: Boolean): Self = this.set("enablekeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablekeyboard: Self = this.set("enablekeyboard", js.undefined)
    
    @scala.inline
    def setEnablemouselockapi(value: Boolean): Self = this.set("enablemouselockapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablemouselockapi: Self = this.set("enablemouselockapi", js.undefined)
    
    @scala.inline
    def setEnablemousewheel(value: Boolean): Self = this.set("enablemousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablemousewheel: Self = this.set("enablemousewheel", js.undefined)
    
    @scala.inline
    def setEnableobserver(value: Boolean): Self = this.set("enableobserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableobserver: Self = this.set("enableobserver", js.undefined)
    
    @scala.inline
    def setEnablescrollonselection(value: Boolean): Self = this.set("enablescrollonselection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablescrollonselection: Self = this.set("enablescrollonselection", js.undefined)
    
    @scala.inline
    def setEnabletranslate3d(value: Boolean): Self = this.set("enabletranslate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabletranslate3d: Self = this.set("enabletranslate3d", js.undefined)
    
    @scala.inline
    def setGesturezoom(value: Boolean): Self = this.set("gesturezoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGesturezoom: Self = this.set("gesturezoom", js.undefined)
    
    @scala.inline
    def setGrabcursorenabled(value: Boolean): Self = this.set("grabcursorenabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrabcursorenabled: Self = this.set("grabcursorenabled", js.undefined)
    
    @scala.inline
    def setHidecursordelay(value: Double): Self = this.set("hidecursordelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidecursordelay: Self = this.set("hidecursordelay", js.undefined)
    
    @scala.inline
    def setHorizrailenabled(value: Boolean): Self = this.set("horizrailenabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizrailenabled: Self = this.set("horizrailenabled", js.undefined)
    
    @scala.inline
    def setHwacceleration(value: Boolean): Self = this.set("hwacceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHwacceleration: Self = this.set("hwacceleration", js.undefined)
    
    @scala.inline
    def setIframeautoresize(value: Boolean): Self = this.set("iframeautoresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIframeautoresize: Self = this.set("iframeautoresize", js.undefined)
    
    @scala.inline
    def setMousescrollstep(value: Double): Self = this.set("mousescrollstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousescrollstep: Self = this.set("mousescrollstep", js.undefined)
    
    @scala.inline
    def setNativeparentscrolling(value: Boolean): Self = this.set("nativeparentscrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeparentscrolling: Self = this.set("nativeparentscrolling", js.undefined)
    
    @scala.inline
    def setOneaxismousemode(value: auto | Boolean): Self = this.set("oneaxismousemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneaxismousemode: Self = this.set("oneaxismousemode", js.undefined)
    
    @scala.inline
    def setOverflowx(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = this.set("overflowx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowx: Self = this.set("overflowx", js.undefined)
    
    @scala.inline
    def setOverflowy(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = this.set("overflowy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowy: Self = this.set("overflowy", js.undefined)
    
    @scala.inline
    def setPreservenativescrolling(value: Boolean): Self = this.set("preservenativescrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservenativescrolling: Self = this.set("preservenativescrolling", js.undefined)
    
    @scala.inline
    def setPreventmultitouchscrolling(value: Boolean): Self = this.set("preventmultitouchscrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventmultitouchscrolling: Self = this.set("preventmultitouchscrolling", js.undefined)
    
    @scala.inline
    def setRailalign(value: right | left | top | bottom): Self = this.set("railalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailalign: Self = this.set("railalign", js.undefined)
    
    @scala.inline
    def setRailhoffset(value: Boolean | Left): Self = this.set("railhoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailhoffset: Self = this.set("railhoffset", js.undefined)
    
    @scala.inline
    def setRailoffset(value: Boolean | Left): Self = this.set("railoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailoffset: Self = this.set("railoffset", js.undefined)
    
    @scala.inline
    def setRailpadding(value: Bottom): Self = this.set("railpadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailpadding: Self = this.set("railpadding", js.undefined)
    
    @scala.inline
    def setRailvalign(value: right | left | top | bottom): Self = this.set("railvalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailvalign: Self = this.set("railvalign", js.undefined)
    
    @scala.inline
    def setRtlmode(value: auto | Boolean): Self = this.set("rtlmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtlmode: Self = this.set("rtlmode", js.undefined)
    
    @scala.inline
    def setScriptpath(value: String): Self = this.set("scriptpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptpath: Self = this.set("scriptpath", js.undefined)
    
    @scala.inline
    def setScrollCLass(value: String): Self = this.set("scrollCLass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollCLass: Self = this.set("scrollCLass", js.undefined)
    
    @scala.inline
    def setScrollbarid(value: String): Self = this.set("scrollbarid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarid: Self = this.set("scrollbarid", js.undefined)
    
    @scala.inline
    def setScrollspeed(value: Double): Self = this.set("scrollspeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollspeed: Self = this.set("scrollspeed", js.undefined)
    
    @scala.inline
    def setSensitiverail(value: Boolean): Self = this.set("sensitiverail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiverail: Self = this.set("sensitiverail", js.undefined)
    
    @scala.inline
    def setSmoothscroll(value: Boolean): Self = this.set("smoothscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothscroll: Self = this.set("smoothscroll", js.undefined)
    
    @scala.inline
    def setSpacebarenabled(value: Boolean): Self = this.set("spacebarenabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacebarenabled: Self = this.set("spacebarenabled", js.undefined)
    
    @scala.inline
    def setTouchbehavior(value: Boolean): Self = this.set("touchbehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchbehavior: Self = this.set("touchbehavior", js.undefined)
    
    @scala.inline
    def setUsetransition(value: Boolean): Self = this.set("usetransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsetransition: Self = this.set("usetransition", js.undefined)
    
    @scala.inline
    def setZindex(value: auto | Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
