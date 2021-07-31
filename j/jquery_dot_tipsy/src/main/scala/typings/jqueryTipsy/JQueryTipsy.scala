package typings.jqueryTipsy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryTipsy {
  
  trait Options extends StObject {
    
    /**
      * delay before showing tooltip (ms)
      *
      * default: 0
      */
    var delayIn: js.UndefOr[Double] = js.undefined
    
    /**
      * delay before hiding  tooltip (ms)
      *
      * default: 0
      */
    var delayOut: js.UndefOr[Double] = js.undefined
    
    /**
      * fade tooltips in/out?
      *
      * default: false
      */
    var fade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * fallback text to use when no tooltip text
      *
      * default: ''
      */
    var fallback: js.UndefOr[String] = js.undefined
    
    /**
      * gravity
      *
      * default: 'n'
      */
    var gravity: js.UndefOr[js.Any] = js.undefined
    
    // string or () => string
    /**
      * is tooltip content HTML?
      *
      * default: false
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /**
      * use live event support?
      *
      * default: false
      */
    var live: js.UndefOr[Boolean] = js.undefined
    
    /**
      * pixel offset of tooltip from element
      *
      * default: 0
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * opacity of tooltip
      *
      * default: 0.8
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * attribute/callback containing tooltip text
      *
      * default: 'title'
      */
    var title: js.UndefOr[js.Any] = js.undefined
    
    // string or () => string
    /**
      * how tooltip is triggered - hover | focus | manual
      *
      * default: 'hover'
      */
    var trigger: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayIn(value: Double): Self = StObject.set(x, "delayIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayInUndefined: Self = StObject.set(x, "delayIn", js.undefined)
      
      @scala.inline
      def setDelayOut(value: Double): Self = StObject.set(x, "delayOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayOutUndefined: Self = StObject.set(x, "delayOut", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setGravity(value: js.Any): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  @js.native
  trait Tipsy extends StObject {
    
    /**
      * initialize tipsy plugin
      */
    def apply(): JQuery = js.native
    def apply(options: Options): JQuery = js.native
    
    /**
      * determine gravity either to North or South automatically based on the element's location in the viewport
      */
    def autoNS(): String = js.native
    
    /**
      * determine gravity either to Northwest or Northeast automatically based on the element's location in the viewport
      */
    def autoNWNE(): String = js.native
    
    /**
      * determine gravity either to Southwest or Southeast automatically based on the element's location in the viewport
      */
    def autoSWSE(): String = js.native
    
    /**
      * determine gravity either to West or East automatically based on the element's location in the viewport
      */
    def autoWE(): String = js.native
  }
}
