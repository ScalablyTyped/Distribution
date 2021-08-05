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
trait CarouselOption extends StObject {
  
  var anim: js.UndefOr[default | updown | fade] = js.undefined
  
  var arrow: js.UndefOr[hover | always | none] = js.undefined
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var indicator: js.UndefOr[insider | outsider | none] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object CarouselOption {
  
  inline def apply(): CarouselOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOption]
  }
  
  extension [Self <: CarouselOption](x: Self) {
    
    inline def setAnim(value: default | updown | fade): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
    
    inline def setAnimUndefined: Self = StObject.set(x, "anim", js.undefined)
    
    inline def setArrow(value: hover | always | none): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndicator(value: insider | outsider | none): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
