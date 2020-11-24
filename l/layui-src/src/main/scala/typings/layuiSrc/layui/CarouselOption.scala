package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.always
import typings.layuiSrc.layuiSrcStrings.default
import typings.layuiSrc.layuiSrcStrings.fade
import typings.layuiSrc.layuiSrcStrings.hover
import typings.layuiSrc.layuiSrcStrings.insider
import typings.layuiSrc.layuiSrcStrings.none
import typings.layuiSrc.layuiSrcStrings.outsider
import typings.layuiSrc.layuiSrcStrings.updown
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  interface Layui {
  layer?: Layer;
  element?: Element;
  form?: Form;
  laydate?: Laydate;
  laypage?: Laypage;
  carousel?: Carousel;
  use(mods: string | string[], callback: (...args: any[]) => any): any;
  }
  */
@js.native
trait CarouselOption extends js.Object {
  
  var anim: js.UndefOr[default | updown | fade] = js.native
  
  var arrow: js.UndefOr[hover | always | none] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var full: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var indicator: js.UndefOr[insider | outsider | none] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object CarouselOption {
  
  @scala.inline
  def apply(): CarouselOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOption]
  }
  
  @scala.inline
  implicit class CarouselOptionOps[Self <: CarouselOption] (val x: Self) extends AnyVal {
    
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
    def setAnim(value: default | updown | fade): Self = this.set("anim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnim: Self = this.set("anim", js.undefined)
    
    @scala.inline
    def setArrow(value: hover | always | none): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIndicator(value: insider | outsider | none): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
