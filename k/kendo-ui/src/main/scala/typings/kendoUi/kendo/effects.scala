package typings.kendoUi.kendo

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effects {
  
  trait Effect extends StObject {
    
    def add(effect: Effect): Effect
    
    def duration(value: Double): Effect
    
    def play(): JQueryPromise[Any]
    
    def reverse(): JQueryPromise[Any]
    
    def stop(): Effect
  }
  object Effect {
    
    inline def apply(
      add: Effect => Effect,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): Effect = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Effect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Effect => Effect): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Double => Effect): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setPlay(value: () => JQueryPromise[Any]): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setReverse(value: () => JQueryPromise[Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Effect): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait Element extends StObject {
    
    def expand(direction: String): Expand
    
    def expandHorizontal(): Expand
    
    def expandVertical(): Expand
    
    def fade(direction: String): Fade
    
    def fadeIn(): Fade
    
    def fadeOut(): Fade
    
    def flip(axis: String, face: JQuery, back: JQuery): Flip
    
    def flipHorizontal(face: JQuery, back: JQuery): Flip
    
    def flipVertical(face: JQuery, back: JQuery): Flip
    
    def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn
    
    def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn
    
    def pageturnVertical(face: JQuery, back: JQuery): PageTurn
    
    def slideIn(direction: String): SlideIn
    
    def slideInDown(): SlideIn
    
    def slideInLeft(): SlideIn
    
    def slideInRight(): SlideIn
    
    def slideInUp(): SlideIn
    
    def tile(direction: String, previous: JQuery): Tile
    
    def tileDown(previous: JQuery): Tile
    
    def tileLeft(previous: JQuery): Tile
    
    def tileRight(previous: JQuery): Tile
    
    def tileUp(previous: JQuery): Tile
    
    def transfer(target: JQuery): Transfer
    
    def zoom(direction: String): Zoom
    
    def zoomIn(): Zoom
    
    def zoomOut(): Zoom
  }
  object Element {
    
    inline def apply(
      expand: String => Expand,
      expandHorizontal: () => Expand,
      expandVertical: () => Expand,
      fade: String => Fade,
      fadeIn: () => Fade,
      fadeOut: () => Fade,
      flip: (String, JQuery, JQuery) => Flip,
      flipHorizontal: (JQuery, JQuery) => Flip,
      flipVertical: (JQuery, JQuery) => Flip,
      pageturn: (String, JQuery, JQuery) => PageTurn,
      pageturnHorizontal: (JQuery, JQuery) => PageTurn,
      pageturnVertical: (JQuery, JQuery) => PageTurn,
      slideIn: String => SlideIn,
      slideInDown: () => SlideIn,
      slideInLeft: () => SlideIn,
      slideInRight: () => SlideIn,
      slideInUp: () => SlideIn,
      tile: (String, JQuery) => Tile,
      tileDown: JQuery => Tile,
      tileLeft: JQuery => Tile,
      tileRight: JQuery => Tile,
      tileUp: JQuery => Tile,
      transfer: JQuery => Transfer,
      zoom: String => Zoom,
      zoomIn: () => Zoom,
      zoomOut: () => Zoom
    ): Element = {
      val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand), expandHorizontal = js.Any.fromFunction0(expandHorizontal), expandVertical = js.Any.fromFunction0(expandVertical), fade = js.Any.fromFunction1(fade), fadeIn = js.Any.fromFunction0(fadeIn), fadeOut = js.Any.fromFunction0(fadeOut), flip = js.Any.fromFunction3(flip), flipHorizontal = js.Any.fromFunction2(flipHorizontal), flipVertical = js.Any.fromFunction2(flipVertical), pageturn = js.Any.fromFunction3(pageturn), pageturnHorizontal = js.Any.fromFunction2(pageturnHorizontal), pageturnVertical = js.Any.fromFunction2(pageturnVertical), slideIn = js.Any.fromFunction1(slideIn), slideInDown = js.Any.fromFunction0(slideInDown), slideInLeft = js.Any.fromFunction0(slideInLeft), slideInRight = js.Any.fromFunction0(slideInRight), slideInUp = js.Any.fromFunction0(slideInUp), tile = js.Any.fromFunction2(tile), tileDown = js.Any.fromFunction1(tileDown), tileLeft = js.Any.fromFunction1(tileLeft), tileRight = js.Any.fromFunction1(tileRight), tileUp = js.Any.fromFunction1(tileUp), transfer = js.Any.fromFunction1(transfer), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setExpand(value: String => Expand): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setExpandHorizontal(value: () => Expand): Self = StObject.set(x, "expandHorizontal", js.Any.fromFunction0(value))
      
      inline def setExpandVertical(value: () => Expand): Self = StObject.set(x, "expandVertical", js.Any.fromFunction0(value))
      
      inline def setFade(value: String => Fade): Self = StObject.set(x, "fade", js.Any.fromFunction1(value))
      
      inline def setFadeIn(value: () => Fade): Self = StObject.set(x, "fadeIn", js.Any.fromFunction0(value))
      
      inline def setFadeOut(value: () => Fade): Self = StObject.set(x, "fadeOut", js.Any.fromFunction0(value))
      
      inline def setFlip(value: (String, JQuery, JQuery) => Flip): Self = StObject.set(x, "flip", js.Any.fromFunction3(value))
      
      inline def setFlipHorizontal(value: (JQuery, JQuery) => Flip): Self = StObject.set(x, "flipHorizontal", js.Any.fromFunction2(value))
      
      inline def setFlipVertical(value: (JQuery, JQuery) => Flip): Self = StObject.set(x, "flipVertical", js.Any.fromFunction2(value))
      
      inline def setPageturn(value: (String, JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturn", js.Any.fromFunction3(value))
      
      inline def setPageturnHorizontal(value: (JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturnHorizontal", js.Any.fromFunction2(value))
      
      inline def setPageturnVertical(value: (JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturnVertical", js.Any.fromFunction2(value))
      
      inline def setSlideIn(value: String => SlideIn): Self = StObject.set(x, "slideIn", js.Any.fromFunction1(value))
      
      inline def setSlideInDown(value: () => SlideIn): Self = StObject.set(x, "slideInDown", js.Any.fromFunction0(value))
      
      inline def setSlideInLeft(value: () => SlideIn): Self = StObject.set(x, "slideInLeft", js.Any.fromFunction0(value))
      
      inline def setSlideInRight(value: () => SlideIn): Self = StObject.set(x, "slideInRight", js.Any.fromFunction0(value))
      
      inline def setSlideInUp(value: () => SlideIn): Self = StObject.set(x, "slideInUp", js.Any.fromFunction0(value))
      
      inline def setTile(value: (String, JQuery) => Tile): Self = StObject.set(x, "tile", js.Any.fromFunction2(value))
      
      inline def setTileDown(value: JQuery => Tile): Self = StObject.set(x, "tileDown", js.Any.fromFunction1(value))
      
      inline def setTileLeft(value: JQuery => Tile): Self = StObject.set(x, "tileLeft", js.Any.fromFunction1(value))
      
      inline def setTileRight(value: JQuery => Tile): Self = StObject.set(x, "tileRight", js.Any.fromFunction1(value))
      
      inline def setTileUp(value: JQuery => Tile): Self = StObject.set(x, "tileUp", js.Any.fromFunction1(value))
      
      inline def setTransfer(value: JQuery => Transfer): Self = StObject.set(x, "transfer", js.Any.fromFunction1(value))
      
      inline def setZoom(value: String => Zoom): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      inline def setZoomIn(value: () => Zoom): Self = StObject.set(x, "zoomIn", js.Any.fromFunction0(value))
      
      inline def setZoomOut(value: () => Zoom): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
    }
  }
  
  trait Expand
    extends StObject
       with Effect {
    
    def direction(value: String): Expand
  }
  object Expand {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => Expand,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): Expand = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Expand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => Expand): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  trait Fade
    extends StObject
       with Effect {
    
    def direction(value: String): Fade
    
    def endValue(value: Double): Fade
    
    def startValue(value: Double): Fade
  }
  object Fade {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => Fade,
      duration: Double => Effect,
      endValue: Double => Fade,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      startValue: Double => Fade,
      stop: () => Effect
    ): Fade = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Fade]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fade] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => Fade): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
      
      inline def setEndValue(value: Double => Fade): Self = StObject.set(x, "endValue", js.Any.fromFunction1(value))
      
      inline def setStartValue(value: Double => Fade): Self = StObject.set(x, "startValue", js.Any.fromFunction1(value))
    }
  }
  
  trait Flip
    extends StObject
       with Effect {
    
    def direction(value: String): Flip
  }
  object Flip {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => Flip,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): Flip = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Flip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flip] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => Flip): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  trait PageTurn
    extends StObject
       with Effect {
    
    def direction(value: String): PageTurn
  }
  object PageTurn {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => PageTurn,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): PageTurn = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[PageTurn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageTurn] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => PageTurn): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  trait SlideIn
    extends StObject
       with Effect {
    
    def direction(value: String): SlideIn
  }
  object SlideIn {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => SlideIn,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): SlideIn = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[SlideIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideIn] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => SlideIn): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  trait Tile
    extends StObject
       with Effect {
    
    def direction(value: String): Tile
  }
  object Tile {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => Tile,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): Tile = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => Tile): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  trait Transfer
    extends StObject
       with Effect
  object Transfer {
    
    inline def apply(
      add: Effect => Effect,
      duration: Double => Effect,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      stop: () => Effect
    ): Transfer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Transfer]
    }
  }
  
  trait Zoom
    extends StObject
       with Effect {
    
    def direction(value: String): Zoom
    
    def endValue(value: Double): Zoom
    
    def startValue(value: Double): Zoom
  }
  object Zoom {
    
    inline def apply(
      add: Effect => Effect,
      direction: String => Zoom,
      duration: Double => Effect,
      endValue: Double => Zoom,
      play: () => JQueryPromise[Any],
      reverse: () => JQueryPromise[Any],
      startValue: Double => Zoom,
      stop: () => Effect
    ): Zoom = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Zoom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Zoom] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String => Zoom): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
      
      inline def setEndValue(value: Double => Zoom): Self = StObject.set(x, "endValue", js.Any.fromFunction1(value))
      
      inline def setStartValue(value: Double => Zoom): Self = StObject.set(x, "startValue", js.Any.fromFunction1(value))
    }
  }
}
