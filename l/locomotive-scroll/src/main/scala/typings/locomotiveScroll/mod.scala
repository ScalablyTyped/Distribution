package typings.locomotiveScroll

import typings.locomotiveScroll.anon.DeviceOptionsbreakpointnu
import typings.locomotiveScroll.anon.El
import typings.locomotiveScroll.locomotiveScrollBooleans.`false`
import typings.locomotiveScroll.locomotiveScrollStrings.call
import typings.locomotiveScroll.locomotiveScrollStrings.scroll
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("locomotive-scroll", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LocomotiveScroll {
    def this(options: InstanceOptions) = this()
  }
  
  trait DeviceOptions extends StObject {
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var gestureDirection: js.UndefOr[Direction] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
  }
  object DeviceOptions {
    
    inline def apply(): DeviceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceOptions] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGestureDirection(value: Direction): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.locomotiveScroll.locomotiveScrollStrings.vertical
    - typings.locomotiveScroll.locomotiveScrollStrings.horizontal
  */
  trait Direction extends StObject
  object Direction {
    
    inline def horizontal: typings.locomotiveScroll.locomotiveScrollStrings.horizontal = "horizontal".asInstanceOf[typings.locomotiveScroll.locomotiveScrollStrings.horizontal]
    
    inline def vertical: typings.locomotiveScroll.locomotiveScrollStrings.vertical = "vertical".asInstanceOf[typings.locomotiveScroll.locomotiveScrollStrings.vertical]
  }
  
  trait InstanceOptions extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var draggingClass: js.UndefOr[String] = js.undefined
    
    var el: js.UndefOr[HTMLElement] = js.undefined
    
    var firefoxMultiplier: js.UndefOr[Double] = js.undefined
    
    var gestureDirection: js.UndefOr[String] = js.undefined
    
    var getDirection: js.UndefOr[Boolean] = js.undefined
    
    var getSpeed: js.UndefOr[Boolean] = js.undefined
    
    var initClass: js.UndefOr[String] = js.undefined
    
    var initPosition: js.UndefOr[Position] = js.undefined
    
    var lerp: js.UndefOr[Double] = js.undefined
    
    var multiplier: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var reloadOnContextChange: js.UndefOr[Boolean] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    var resetNativeScroll: js.UndefOr[Boolean] = js.undefined
    
    var scrollFromAnywhere: js.UndefOr[Boolean] = js.undefined
    
    var scrollbarClass: js.UndefOr[String] = js.undefined
    
    var scrollbarContainer: js.UndefOr[HTMLElement | `false`] = js.undefined
    
    var scrollingClass: js.UndefOr[String] = js.undefined
    
    var smartphone: js.UndefOr[DeviceOptions] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    var smoothClass: js.UndefOr[String] = js.undefined
    
    var tablet: js.UndefOr[DeviceOptionsbreakpointnu] = js.undefined
    
    var touchMultiplier: js.UndefOr[Double] = js.undefined
  }
  object InstanceOptions {
    
    inline def apply(): InstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDraggingClass(value: String): Self = StObject.set(x, "draggingClass", value.asInstanceOf[js.Any])
      
      inline def setDraggingClassUndefined: Self = StObject.set(x, "draggingClass", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setFirefoxMultiplier(value: Double): Self = StObject.set(x, "firefoxMultiplier", value.asInstanceOf[js.Any])
      
      inline def setFirefoxMultiplierUndefined: Self = StObject.set(x, "firefoxMultiplier", js.undefined)
      
      inline def setGestureDirection(value: String): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      inline def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
      
      inline def setGetDirection(value: Boolean): Self = StObject.set(x, "getDirection", value.asInstanceOf[js.Any])
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetSpeed(value: Boolean): Self = StObject.set(x, "getSpeed", value.asInstanceOf[js.Any])
      
      inline def setGetSpeedUndefined: Self = StObject.set(x, "getSpeed", js.undefined)
      
      inline def setInitClass(value: String): Self = StObject.set(x, "initClass", value.asInstanceOf[js.Any])
      
      inline def setInitClassUndefined: Self = StObject.set(x, "initClass", js.undefined)
      
      inline def setInitPosition(value: Position): Self = StObject.set(x, "initPosition", value.asInstanceOf[js.Any])
      
      inline def setInitPositionUndefined: Self = StObject.set(x, "initPosition", js.undefined)
      
      inline def setLerp(value: Double): Self = StObject.set(x, "lerp", value.asInstanceOf[js.Any])
      
      inline def setLerpUndefined: Self = StObject.set(x, "lerp", js.undefined)
      
      inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setReloadOnContextChange(value: Boolean): Self = StObject.set(x, "reloadOnContextChange", value.asInstanceOf[js.Any])
      
      inline def setReloadOnContextChangeUndefined: Self = StObject.set(x, "reloadOnContextChange", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setResetNativeScroll(value: Boolean): Self = StObject.set(x, "resetNativeScroll", value.asInstanceOf[js.Any])
      
      inline def setResetNativeScrollUndefined: Self = StObject.set(x, "resetNativeScroll", js.undefined)
      
      inline def setScrollFromAnywhere(value: Boolean): Self = StObject.set(x, "scrollFromAnywhere", value.asInstanceOf[js.Any])
      
      inline def setScrollFromAnywhereUndefined: Self = StObject.set(x, "scrollFromAnywhere", js.undefined)
      
      inline def setScrollbarClass(value: String): Self = StObject.set(x, "scrollbarClass", value.asInstanceOf[js.Any])
      
      inline def setScrollbarClassUndefined: Self = StObject.set(x, "scrollbarClass", js.undefined)
      
      inline def setScrollbarContainer(value: HTMLElement | `false`): Self = StObject.set(x, "scrollbarContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollbarContainerUndefined: Self = StObject.set(x, "scrollbarContainer", js.undefined)
      
      inline def setScrollingClass(value: String): Self = StObject.set(x, "scrollingClass", value.asInstanceOf[js.Any])
      
      inline def setScrollingClassUndefined: Self = StObject.set(x, "scrollingClass", js.undefined)
      
      inline def setSmartphone(value: DeviceOptions): Self = StObject.set(x, "smartphone", value.asInstanceOf[js.Any])
      
      inline def setSmartphoneUndefined: Self = StObject.set(x, "smartphone", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothClass(value: String): Self = StObject.set(x, "smoothClass", value.asInstanceOf[js.Any])
      
      inline def setSmoothClassUndefined: Self = StObject.set(x, "smoothClass", js.undefined)
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setTablet(value: DeviceOptionsbreakpointnu): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTouchMultiplier(value: Double): Self = StObject.set(x, "touchMultiplier", value.asInstanceOf[js.Any])
      
      inline def setTouchMultiplierUndefined: Self = StObject.set(x, "touchMultiplier", js.undefined)
    }
  }
  
  @js.native
  trait LocomotiveScroll extends StObject {
    
    def destroy(): js.Function0[Unit] = js.native
    
    def init(): js.Function0[Unit] = js.native
    
    @JSName("on")
    def on_scroll[EventName /* <: scroll | call */](
      eventName: EventName,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: EventName extends 'scroll' ? locomotive-scroll.locomotive-scroll.OnScrollEvent : string | std.Array<string> */ /* event */ js.Any, 
          Unit
        ]
    ): js.Function0[Unit] = js.native
    
    def scrollTo(target: ScrollToTarget): js.Function0[Unit] = js.native
    def scrollTo(target: ScrollToTarget, options: ScrollToOptions): js.Function0[Unit] = js.native
    
    def start(): js.Function0[Unit] = js.native
    
    def stop(): js.Function0[Unit] = js.native
    
    def update(): js.Function0[Unit] = js.native
  }
  
  type Offset = js.Tuple2[Double | String, Double | String]
  
  trait OnScrollEvent extends StObject {
    
    var currentElements: Record[String, ScrollElement]
    
    var delta: Position
    
    var limit: Position
    
    var scroll: Position
    
    var speed: Double
  }
  object OnScrollEvent {
    
    inline def apply(
      currentElements: Record[String, ScrollElement],
      delta: Position,
      limit: Position,
      scroll: Position,
      speed: Double
    ): OnScrollEvent = {
      val __obj = js.Dynamic.literal(currentElements = currentElements.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnScrollEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnScrollEvent] (val x: Self) extends AnyVal {
      
      inline def setCurrentElements(value: Record[String, ScrollElement]): Self = StObject.set(x, "currentElements", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Position): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Position): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Position): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollElement extends StObject {
    
    var bottom: Double
    
    var call: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `class`: String
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var el: HTMLElement
    
    var id: String
    
    var inView: Boolean
    
    var left: Double
    
    var middle: Position
    
    var offset: Offset
    
    var position: js.UndefOr[Position] = js.undefined
    
    var progress: Double
    
    var repeat: Boolean
    
    var right: Double
    
    var section: El
    
    var speed: Double | Boolean
    
    var sticky: Boolean
    
    var target: HTMLElement
    
    var top: Double
  }
  object ScrollElement {
    
    inline def apply(
      bottom: Double,
      `class`: String,
      el: HTMLElement,
      id: String,
      inView: Boolean,
      left: Double,
      middle: Position,
      offset: Offset,
      progress: Double,
      repeat: Boolean,
      right: Double,
      section: El,
      speed: Double | Boolean,
      sticky: Boolean,
      target: HTMLElement,
      top: Double
    ): ScrollElement = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inView = inView.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollElement] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setCall(value: () => Unit): Self = StObject.set(x, "call", js.Any.fromFunction0(value))
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInView(value: Boolean): Self = StObject.set(x, "inView", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMiddle(value: Position): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setSection(value: El): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double | Boolean): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollToOptions extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disableLerp: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object ScrollToOptions {
    
    inline def apply(): ScrollToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDisableLerp(value: Boolean): Self = StObject.set(x, "disableLerp", value.asInstanceOf[js.Any])
      
      inline def setDisableLerpUndefined: Self = StObject.set(x, "disableLerp", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type ScrollToTarget = HTMLElement | String | Double
}
