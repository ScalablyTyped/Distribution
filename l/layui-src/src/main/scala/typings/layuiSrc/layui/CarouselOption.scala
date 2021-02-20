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
import org.scalablytyped.runtime.StObject
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
trait CarouselOption extends StObject {
  
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
  implicit class CarouselOptionMutableBuilder[Self <: CarouselOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnim(value: default | updown | fade): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimUndefined: Self = StObject.set(x, "anim", js.undefined)
    
    @scala.inline
    def setArrow(value: hover | always | none): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndicator(value: insider | outsider | none): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
