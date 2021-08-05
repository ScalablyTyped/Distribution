package typings.jqueryTools

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jqueryTools.JQueryTools.overlay.OverlayStatic
import typings.jqueryTools.jqueryToolsStrings.center
import typings.jqueryTools.jqueryToolsStrings.fast
import typings.jqueryTools.jqueryToolsStrings.normal
import typings.jqueryTools.jqueryToolsStrings.slow
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** jQuery Tools (http://jquerytools.github.io/documentation/overlay/index.html) */
object JQueryTools {
  
  trait ToolsStatic extends StObject {
    
    var overlay: OverlayStatic
  }
  object ToolsStatic {
    
    inline def apply(overlay: OverlayStatic): ToolsStatic = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolsStatic]
    }
    
    extension [Self <: ToolsStatic](x: Self) {
      
      inline def setOverlay(value: OverlayStatic): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    }
  }
  
  object overlay {
    
    type CssOptions = StringDictionary[js.Any]
    
    trait MaskOptions extends StObject {
      
      /** CSS color string (i.e. hex value) */
      var color: js.UndefOr[String] = js.undefined
      
      /** load speed in milliseconds */
      var loadSpeed: js.UndefOr[Double] = js.undefined
      
      /** Opacity of mask.  Between 0 and 1. */
      var opacity: js.UndefOr[Double] = js.undefined
    }
    object MaskOptions {
      
      inline def apply(): MaskOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MaskOptions]
      }
      
      extension [Self <: MaskOptions](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setLoadSpeed(value: Double): Self = StObject.set(x, "loadSpeed", value.asInstanceOf[js.Any])
        
        inline def setLoadSpeedUndefined: Self = StObject.set(x, "loadSpeed", js.undefined)
        
        inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      }
    }
    
    trait Overlay extends StObject {
      
      /** Closes the overlay. */
      def close(): Overlay
      
      /** Returns the closing element(s) as a jQuery object. */
      def getClosers(): JQuery
      
      /** Returns the configuration for the overlay. */
      def getConf(): OverlayOptions
      
      /** Returns the overlayed element as a jQuery object. */
      def getOverlay(): JQuery
      
      /** Returns the triggering element as a jQuery object. */
      def getTrigger(): JQuery
      
      /** Returns `true` if the overlay is opened. */
      def isOpened(): Boolean
      
      /** Opens the overlay. */
      def load(): Overlay
    }
    object Overlay {
      
      inline def apply(
        close: () => Overlay,
        getClosers: () => JQuery,
        getConf: () => OverlayOptions,
        getOverlay: () => JQuery,
        getTrigger: () => JQuery,
        isOpened: () => Boolean,
        load: () => Overlay
      ): Overlay = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getClosers = js.Any.fromFunction0(getClosers), getConf = js.Any.fromFunction0(getConf), getOverlay = js.Any.fromFunction0(getOverlay), getTrigger = js.Any.fromFunction0(getTrigger), isOpened = js.Any.fromFunction0(isOpened), load = js.Any.fromFunction0(load))
        __obj.asInstanceOf[Overlay]
      }
      
      extension [Self <: Overlay](x: Self) {
        
        inline def setClose(value: () => Overlay): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setGetClosers(value: () => JQuery): Self = StObject.set(x, "getClosers", js.Any.fromFunction0(value))
        
        inline def setGetConf(value: () => OverlayOptions): Self = StObject.set(x, "getConf", js.Any.fromFunction0(value))
        
        inline def setGetOverlay(value: () => JQuery): Self = StObject.set(x, "getOverlay", js.Any.fromFunction0(value))
        
        inline def setGetTrigger(value: () => JQuery): Self = StObject.set(x, "getTrigger", js.Any.fromFunction0(value))
        
        inline def setIsOpened(value: () => Boolean): Self = StObject.set(x, "isOpened", js.Any.fromFunction0(value))
        
        inline def setLoad(value: () => Overlay): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      }
    }
    
    trait OverlayOptions extends StObject {
      
      /**
        * A jQuery selector for the closing elements inside the overlay. These
        * can be any elements such as links, buttons or images. If this is not
        * supplied, a close element is auto-generated. Read more about this in
        * defining close actions.
        */
      var close: js.UndefOr[JQuery] = js.undefined
      
      /**
        * By default, overlays are closed when the mouse is clicked outside the
        * overlay area. Setting this property to false suppresses this behaviour
        * which is suitable for modal dialogs.
        * @default true
        */
      var closeOnClick: js.UndefOr[Boolean] = js.undefined
      
      /**
        * By default, overlays are closed when the ESC keyboard key is pressed.
        * Setting this property to false suppresses this behaviour.
        * @default true
        */
      var closeOnEsc: js.UndefOr[Boolean] = js.undefined
      
      /** The speed to close the overlay, in milliseconds */
      var closeSpeed: js.UndefOr[Double] = js.undefined
      
      /**
        * The effect to be used when an overlay is opened and closed. This can
        * dramatically change the behaviour of the overlay. By default this tool
        * uses an effect called "default" which is a simple show/hide effect.
        * @default 'default'
        */
      var effect: js.UndefOr[String] = js.undefined
      
      /**
        * since 1.2.0. whether overlay stays in the same position while the screen
        * is scrolled. This is the default behaviour for all browsers except IE6
        * and below. IE6 does not support fixed positioning. If this property is
        * set to false then the overlay is positioned in relationship to the document
        * so that when the screen is scrolled then the overlay moves along with the document.
        * @default true
        */
      var fixed: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Specifies how far from the left-hand edge of the screen the overlay should be
        * placed. By default the overlay is horizontally centered with the value "center"
        * but you can also supply a numerical value specifying a distance in pixels.
        * @default 'center'
        */
      var left: js.UndefOr[center | Double] = js.undefined
      
      /**
        * If enabled then the overlay loads immediately after it has been initialized.
        * @default false
        */
      var load: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Previously known as expose. Overlay is very often used together with the
        * Mask Tool. Because of this, the support for this feature has been built
        * inside the tool. This option accepts the mask configuration. This is either
        * a simple string specifying the background color of the mask or a more complex
        * object literal specifying more configuration variables. See an example of an
        * overlay together with mask. By default masking is disabled.
        */
      var mask: js.UndefOr[String | MaskOptions] = js.undefined
      
      /** before the overlay is closed */
      var onBeforeClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
      
      /**
        * before the overlay is displayed. The overlay has already been positioned at the
        * location from where it will start animating.
        */
      var onBeforeLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
      
      /** when the overlay is closed  */
      var onClose: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
      
      /** when the overlay has completely been displayed  */
      var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]] = js.undefined
      
      /**
        * By default, there can be only one overlay on the page at once. Setting this
        * property to false allows you to have multiple overlay instances.
        * @default true
        */
      var oneInstance: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The speed of the fade-in animation on the "default" effect. Valid values are
        * 'slow', 'normal' and 'fast', or you can supply a numerical value (in milliseconds).
        * By setting this property to 0, the overlay will appear immediately without any animation.
        * @default 'normal'
        */
      var speed: js.UndefOr[slow | normal | fast | Double] = js.undefined
      
      /**
        * The element to be overlayed (if not specified in the rel attribute of the triggering element).
        */
      var target: js.UndefOr[Element] = js.undefined
      
      /**
        * Specifies how far from the top edge of the screen the overlay should be placed.
        * Acceptable values are an integer number specifying a distance in pixels, a string
        * (such as '15%') specifying a percentage value or "center" in which case the overlay
        * is vertically centered. Percentage values work consistently at different screen resolutions.
        * @default '10%'
        */
      var top: js.UndefOr[String | Double] = js.undefined
    }
    object OverlayOptions {
      
      inline def apply(): OverlayOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OverlayOptions]
      }
      
      extension [Self <: OverlayOptions](x: Self) {
        
        inline def setClose(value: JQuery): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
        
        inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
        
        inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
        
        inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
        
        inline def setCloseSpeed(value: Double): Self = StObject.set(x, "closeSpeed", value.asInstanceOf[js.Any])
        
        inline def setCloseSpeedUndefined: Self = StObject.set(x, "closeSpeed", js.undefined)
        
        inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
        
        inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
        
        inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        
        inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
        
        inline def setLeft(value: center | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setLoad(value: Boolean): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
        
        inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
        
        inline def setMask(value: String | MaskOptions): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
        
        inline def setOnBeforeClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = StObject.set(x, "onBeforeClose", value.asInstanceOf[js.Any])
        
        inline def setOnBeforeCloseUndefined: Self = StObject.set(x, "onBeforeClose", js.undefined)
        
        inline def setOnBeforeLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = StObject.set(x, "onBeforeLoad", value.asInstanceOf[js.Any])
        
        inline def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
        
        inline def setOnClose(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnLoad(value: js.ThisFunction1[/* this */ Overlay, /* event */ JQueryEventObject, Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
        
        inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        inline def setOneInstance(value: Boolean): Self = StObject.set(x, "oneInstance", value.asInstanceOf[js.Any])
        
        inline def setOneInstanceUndefined: Self = StObject.set(x, "oneInstance", js.undefined)
        
        inline def setSpeed(value: slow | normal | fast | Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
        
        inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    trait OverlayStatic extends StObject {
      
      def addEffect(
        effectName: String,
        effectFn: js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit],
        closeFn: js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]
      ): Unit
    }
    object OverlayStatic {
      
      inline def apply(
        addEffect: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Unit
      ): OverlayStatic = {
        val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction3(addEffect))
        __obj.asInstanceOf[OverlayStatic]
      }
      
      extension [Self <: OverlayStatic](x: Self) {
        
        inline def setAddEffect(
          value: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Unit
        ): Self = StObject.set(x, "addEffect", js.Any.fromFunction3(value))
      }
    }
  }
}
