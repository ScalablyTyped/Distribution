package typings.kendoUi.kendo

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effects {
  
  @js.native
  trait Effect extends StObject {
    
    def add(effect: Effect): Effect = js.native
    
    def duration(value: Double): Effect = js.native
    
    def play(): JQueryPromise[_] = js.native
    
    def reverse(): JQueryPromise[_] = js.native
    
    def stop(): Effect = js.native
  }
  object Effect {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): Effect = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Effect]
    }
    
    @scala.inline
    implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Effect => Effect): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDuration(value: Double => Effect): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlay(value: () => JQueryPromise[_]): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverse(value: () => JQueryPromise[_]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Effect): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    def expand(direction: String): Expand = js.native
    
    def expandHorizontal(): Expand = js.native
    
    def expandVertical(): Expand = js.native
    
    def fade(direction: String): Fade = js.native
    
    def fadeIn(): Fade = js.native
    
    def fadeOut(): Fade = js.native
    
    def flip(axis: String, face: JQuery, back: JQuery): Flip = js.native
    
    def flipHorizontal(face: JQuery, back: JQuery): Flip = js.native
    
    def flipVertical(face: JQuery, back: JQuery): Flip = js.native
    
    def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn = js.native
    
    def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn = js.native
    
    def pageturnVertical(face: JQuery, back: JQuery): PageTurn = js.native
    
    def slideIn(direction: String): SlideIn = js.native
    
    def slideInDown(): SlideIn = js.native
    
    def slideInLeft(): SlideIn = js.native
    
    def slideInRight(): SlideIn = js.native
    
    def slideInUp(): SlideIn = js.native
    
    def tile(direction: String, previous: JQuery): Tile = js.native
    
    def tileDown(previous: JQuery): Tile = js.native
    
    def tileLeft(previous: JQuery): Tile = js.native
    
    def tileRight(previous: JQuery): Tile = js.native
    
    def tileUp(previous: JQuery): Tile = js.native
    
    def transfer(target: JQuery): Transfer = js.native
    
    def zoom(direction: String): Zoom = js.native
    
    def zoomIn(): Zoom = js.native
    
    def zoomOut(): Zoom = js.native
  }
  object Element {
    
    @scala.inline
    def apply(
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
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpand(value: String => Expand): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandHorizontal(value: () => Expand): Self = StObject.set(x, "expandHorizontal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpandVertical(value: () => Expand): Self = StObject.set(x, "expandVertical", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFade(value: String => Fade): Self = StObject.set(x, "fade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeIn(value: () => Fade): Self = StObject.set(x, "fadeIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFadeOut(value: () => Fade): Self = StObject.set(x, "fadeOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlip(value: (String, JQuery, JQuery) => Flip): Self = StObject.set(x, "flip", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFlipHorizontal(value: (JQuery, JQuery) => Flip): Self = StObject.set(x, "flipHorizontal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFlipVertical(value: (JQuery, JQuery) => Flip): Self = StObject.set(x, "flipVertical", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageturn(value: (String, JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPageturnHorizontal(value: (JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturnHorizontal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageturnVertical(value: (JQuery, JQuery) => PageTurn): Self = StObject.set(x, "pageturnVertical", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlideIn(value: String => SlideIn): Self = StObject.set(x, "slideIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideInDown(value: () => SlideIn): Self = StObject.set(x, "slideInDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideInLeft(value: () => SlideIn): Self = StObject.set(x, "slideInLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideInRight(value: () => SlideIn): Self = StObject.set(x, "slideInRight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideInUp(value: () => SlideIn): Self = StObject.set(x, "slideInUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTile(value: (String, JQuery) => Tile): Self = StObject.set(x, "tile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTileDown(value: JQuery => Tile): Self = StObject.set(x, "tileDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileLeft(value: JQuery => Tile): Self = StObject.set(x, "tileLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileRight(value: JQuery => Tile): Self = StObject.set(x, "tileRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileUp(value: JQuery => Tile): Self = StObject.set(x, "tileUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransfer(value: JQuery => Transfer): Self = StObject.set(x, "transfer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoom(value: String => Zoom): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomIn(value: () => Zoom): Self = StObject.set(x, "zoomIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomOut(value: () => Zoom): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Expand extends Effect {
    
    def direction(value: String): Expand = js.native
  }
  object Expand {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => Expand,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): Expand = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Expand]
    }
    
    @scala.inline
    implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => Expand): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Fade extends Effect {
    
    def direction(value: String): Fade = js.native
    
    def endValue(value: Double): Fade = js.native
    
    def startValue(value: Double): Fade = js.native
  }
  object Fade {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => Fade,
      duration: Double => Effect,
      endValue: Double => Fade,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      startValue: Double => Fade,
      stop: () => Effect
    ): Fade = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Fade]
    }
    
    @scala.inline
    implicit class FadeMutableBuilder[Self <: Fade] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => Fade): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndValue(value: Double => Fade): Self = StObject.set(x, "endValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartValue(value: Double => Fade): Self = StObject.set(x, "startValue", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Flip extends Effect {
    
    def direction(value: String): Flip = js.native
  }
  object Flip {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => Flip,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): Flip = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Flip]
    }
    
    @scala.inline
    implicit class FlipMutableBuilder[Self <: Flip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => Flip): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PageTurn extends Effect {
    
    def direction(value: String): PageTurn = js.native
  }
  object PageTurn {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => PageTurn,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): PageTurn = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[PageTurn]
    }
    
    @scala.inline
    implicit class PageTurnMutableBuilder[Self <: PageTurn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => PageTurn): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SlideIn extends Effect {
    
    def direction(value: String): SlideIn = js.native
  }
  object SlideIn {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => SlideIn,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): SlideIn = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[SlideIn]
    }
    
    @scala.inline
    implicit class SlideInMutableBuilder[Self <: SlideIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => SlideIn): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Tile extends Effect {
    
    def direction(value: String): Tile = js.native
  }
  object Tile {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => Tile,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): Tile = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit class TileMutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => Tile): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Transfer extends Effect
  object Transfer {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      duration: Double => Effect,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      stop: () => Effect
    ): Transfer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Transfer]
    }
  }
  
  @js.native
  trait Zoom extends Effect {
    
    def direction(value: String): Zoom = js.native
    
    def endValue(value: Double): Zoom = js.native
    
    def startValue(value: Double): Zoom = js.native
  }
  object Zoom {
    
    @scala.inline
    def apply(
      add: Effect => Effect,
      direction: String => Zoom,
      duration: Double => Effect,
      endValue: Double => Zoom,
      play: () => JQueryPromise[_],
      reverse: () => JQueryPromise[_],
      startValue: Double => Zoom,
      stop: () => Effect
    ): Zoom = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Zoom]
    }
    
    @scala.inline
    implicit class ZoomMutableBuilder[Self <: Zoom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String => Zoom): Self = StObject.set(x, "direction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndValue(value: Double => Zoom): Self = StObject.set(x, "endValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartValue(value: Double => Zoom): Self = StObject.set(x, "startValue", js.Any.fromFunction1(value))
    }
  }
}
