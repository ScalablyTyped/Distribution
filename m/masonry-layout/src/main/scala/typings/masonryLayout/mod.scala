package typings.masonryLayout

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("masonry-layout", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Masonry {
    def this(options: Options) = this()
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: Element, options: Options) = this()
    
    /* CompleteClass */
    var masonry: js.UndefOr[js.Function0[Unit]] & (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]]) = js.native
  }
  
  trait HiddenOrVisibleStyleOption extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
  }
  object HiddenOrVisibleStyleOption {
    
    inline def apply(): HiddenOrVisibleStyleOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenOrVisibleStyleOption]
    }
    
    extension [Self <: HiddenOrVisibleStyleOption](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait Masonry extends StObject {
    
    var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
    
    // add and remove items
    var appended: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
    
    var data: js.UndefOr[js.Function1[/* element */ Element, this.type]] = js.undefined
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getItemElements: js.UndefOr[js.Function0[js.Array[js.Any]]] = js.undefined
    
    // layout
    var layout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var layoutItems: js.UndefOr[
        js.Function2[/* items */ js.Array[js.Any], /* isStill */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    var masonry: js.UndefOr[js.Function0[Unit]] & (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]])
    
    var off: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
    
    // events
    var on: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
    
    var once: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
    
    var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
    
    // utilities
    var reloadItems: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var remove: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
    
    var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
    
    var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[js.Any], Unit]] = js.undefined
  }
  object Masonry {
    
    inline def apply(
      masonry: js.UndefOr[js.Function0[Unit]] & (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]])
    ): Masonry = {
      val __obj = js.Dynamic.literal(masonry = masonry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Masonry]
    }
    
    extension [Self <: Masonry](x: Self) {
      
      inline def setAddItems(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction1(value))
      
      inline def setAddItemsUndefined: Self = StObject.set(x, "addItems", js.undefined)
      
      inline def setAppended(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "appended", js.Any.fromFunction1(value))
      
      inline def setAppendedUndefined: Self = StObject.set(x, "appended", js.undefined)
      
      inline def setData(value: /* element */ Element => Masonry): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetItemElements(value: () => js.Array[js.Any]): Self = StObject.set(x, "getItemElements", js.Any.fromFunction0(value))
      
      inline def setGetItemElementsUndefined: Self = StObject.set(x, "getItemElements", js.undefined)
      
      inline def setLayout(value: () => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction0(value))
      
      inline def setLayoutItems(value: (/* items */ js.Array[js.Any], /* isStill */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "layoutItems", js.Any.fromFunction2(value))
      
      inline def setLayoutItemsUndefined: Self = StObject.set(x, "layoutItems", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMasonry(
        value: js.UndefOr[js.Function0[Unit]] & (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]])
      ): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
      
      inline def setOff(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnce(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPrepended(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "prepended", js.Any.fromFunction1(value))
      
      inline def setPrependedUndefined: Self = StObject.set(x, "prepended", js.undefined)
      
      inline def setReloadItems(value: () => Unit): Self = StObject.set(x, "reloadItems", js.Any.fromFunction0(value))
      
      inline def setReloadItemsUndefined: Self = StObject.set(x, "reloadItems", js.undefined)
      
      inline def setRemove(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setStamp(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "stamp", js.Any.fromFunction1(value))
      
      inline def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
      
      inline def setUnstamp(value: /* elements */ js.Array[js.Any] => Unit): Self = StObject.set(x, "unstamp", js.Any.fromFunction1(value))
      
      inline def setUnstampUndefined: Self = StObject.set(x, "unstamp", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var columnWidth: js.UndefOr[js.Any] = js.undefined
    
    // setup
    var containerStyle: js.UndefOr[js.Object] = js.undefined
    
    var fitWidth: js.UndefOr[Boolean] = js.undefined
    
    var gutter: js.UndefOr[js.Any] = js.undefined
    
    var hiddenStyle: js.UndefOr[HiddenOrVisibleStyleOption] = js.undefined
    
    var horizontalOrder: js.UndefOr[Boolean] = js.undefined
    
    var initLayout: js.UndefOr[Boolean] = js.undefined
    
    // layout
    var itemSelector: js.UndefOr[String] = js.undefined
    
    var originLeft: js.UndefOr[Boolean] = js.undefined
    
    var originTop: js.UndefOr[Boolean] = js.undefined
    
    var percentPosition: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Boolean] = js.undefined
    
    var stagger: js.UndefOr[String | Double] = js.undefined
    
    var stamp: js.UndefOr[String] = js.undefined
    
    var transitionDuration: js.UndefOr[js.Any] = js.undefined
    
    var visibleStyle: js.UndefOr[HiddenOrVisibleStyleOption] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColumnWidth(value: js.Any): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setContainerStyle(value: js.Object): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setFitWidth(value: Boolean): Self = StObject.set(x, "fitWidth", value.asInstanceOf[js.Any])
      
      inline def setFitWidthUndefined: Self = StObject.set(x, "fitWidth", js.undefined)
      
      inline def setGutter(value: js.Any): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHiddenStyle(value: HiddenOrVisibleStyleOption): Self = StObject.set(x, "hiddenStyle", value.asInstanceOf[js.Any])
      
      inline def setHiddenStyleUndefined: Self = StObject.set(x, "hiddenStyle", js.undefined)
      
      inline def setHorizontalOrder(value: Boolean): Self = StObject.set(x, "horizontalOrder", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOrderUndefined: Self = StObject.set(x, "horizontalOrder", js.undefined)
      
      inline def setInitLayout(value: Boolean): Self = StObject.set(x, "initLayout", value.asInstanceOf[js.Any])
      
      inline def setInitLayoutUndefined: Self = StObject.set(x, "initLayout", js.undefined)
      
      inline def setItemSelector(value: String): Self = StObject.set(x, "itemSelector", value.asInstanceOf[js.Any])
      
      inline def setItemSelectorUndefined: Self = StObject.set(x, "itemSelector", js.undefined)
      
      inline def setOriginLeft(value: Boolean): Self = StObject.set(x, "originLeft", value.asInstanceOf[js.Any])
      
      inline def setOriginLeftUndefined: Self = StObject.set(x, "originLeft", js.undefined)
      
      inline def setOriginTop(value: Boolean): Self = StObject.set(x, "originTop", value.asInstanceOf[js.Any])
      
      inline def setOriginTopUndefined: Self = StObject.set(x, "originTop", js.undefined)
      
      inline def setPercentPosition(value: Boolean): Self = StObject.set(x, "percentPosition", value.asInstanceOf[js.Any])
      
      inline def setPercentPositionUndefined: Self = StObject.set(x, "percentPosition", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setStagger(value: String | Double): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
      
      inline def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
      
      inline def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      inline def setStampUndefined: Self = StObject.set(x, "stamp", js.undefined)
      
      inline def setTransitionDuration(value: js.Any): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setVisibleStyle(value: HiddenOrVisibleStyleOption): Self = StObject.set(x, "visibleStyle", value.asInstanceOf[js.Any])
      
      inline def setVisibleStyleUndefined: Self = StObject.set(x, "visibleStyle", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def masonry(): JQuery = js.native
      def masonry(options: Options): JQuery = js.native
    }
  }
}
