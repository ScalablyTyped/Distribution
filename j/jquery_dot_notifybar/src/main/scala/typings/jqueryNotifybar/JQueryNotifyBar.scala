package typings.jqueryNotifybar

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryNotifyBar {
  
  @js.native
  trait NotifyBarOptions extends StObject {
    
    /**
      * How long this bar will be slided up and down.
      *
      * Default: "normal"
      */
    var animationSpeed: js.UndefOr[String | Double] = js.native
    
    /**
      * If set to true close button will be displayed.
      */
    var close: js.UndefOr[Boolean] = js.native
    
    /**
      * If enabled, user can hide notify bar just by click on it.
      */
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    /**
      * If enabled, user can hide notify bar just by moving mouse cursor on it.
      */
    var closeOnOver: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the text to close button.
      */
    var closeText: js.UndefOr[String] = js.native
    
    /**
      * You can define own CSS class for Notify bar. There are too premade classes "error", "warning" and "success".
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /**
      * How long bar will be delayed, doesn't count animation time.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * What text will be inside bar. Can be HTML or just text.
      */
    var html: js.UndefOr[String] = js.native
    
    /**
      * Custom jQuery object for notify bar.
      */
    var jqObject: js.UndefOr[JQuery[HTMLElement]] = js.native
    
    /**
      * Callback on before hide.
      */
    var onBeforeHide: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * Callback on before show.
      */
    var onBeforeShow: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * Callback on hide.
      */
    var onHide: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * Callback on show.
      */
    var onShow: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * Set the position of notify bar. Possible values are "top", "bottom".
      */
    var position: js.UndefOr[String] = js.native
  }
  object NotifyBarOptions {
    
    @scala.inline
    def apply(): NotifyBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptions]
    }
    
    @scala.inline
    implicit class NotifyBarOptionsMutableBuilder[Self <: NotifyBarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: String | Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setCloseOnOver(value: Boolean): Self = StObject.set(x, "closeOnOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnOverUndefined: Self = StObject.set(x, "closeOnOver", js.undefined)
      
      @scala.inline
      def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setJqObject(value: JQuery[HTMLElement]): Self = StObject.set(x, "jqObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJqObjectUndefined: Self = StObject.set(x, "jqObject", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: () => _): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: () => _): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => _): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => _): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait NotifyBarOptionsForAnimationSpeedNumber extends NotifyBarOptions {
    
    /**
      * How long this bar will be slided up and down.
      */
    @JSName("animationSpeed")
    var animationSpeed_NotifyBarOptionsForAnimationSpeedNumber: js.UndefOr[Double] = js.native
  }
  object NotifyBarOptionsForAnimationSpeedNumber {
    
    @scala.inline
    def apply(): NotifyBarOptionsForAnimationSpeedNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
    }
    
    @scala.inline
    implicit class NotifyBarOptionsForAnimationSpeedNumberMutableBuilder[Self <: NotifyBarOptionsForAnimationSpeedNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
    }
  }
  
  @js.native
  trait NotifyBarOptionsForAnimationSpeedString extends NotifyBarOptions {
    
    /**
      * How long this bar will be slided up and down. Possible values are "slow", "default", "normal", "fast".
      */
    @JSName("animationSpeed")
    var animationSpeed_NotifyBarOptionsForAnimationSpeedString: js.UndefOr[String] = js.native
  }
  object NotifyBarOptionsForAnimationSpeedString {
    
    @scala.inline
    def apply(): NotifyBarOptionsForAnimationSpeedString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedString]
    }
    
    @scala.inline
    implicit class NotifyBarOptionsForAnimationSpeedStringMutableBuilder[Self <: NotifyBarOptionsForAnimationSpeedString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: String): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
    }
  }
}
