package typings.lottieWeb

import typings.lottieWeb.mod.CanvasRendererConfig
import typings.lottieWeb.mod.HTMLRendererConfig
import typings.lottieWeb.mod.SVGRendererConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Canvas extends StObject {
    
    var canvas: CanvasRendererConfig
    
    var html: HTMLRendererConfig
    
    var svg: SVGRendererConfig
  }
  object Canvas {
    
    inline def apply(canvas: CanvasRendererConfig, html: HTMLRendererConfig, svg: SVGRendererConfig): Canvas = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Canvas]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
      
      inline def setCanvas(value: CanvasRendererConfig): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HTMLRendererConfig): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: SVGRendererConfig): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Play extends StObject {
    
    def play(): Unit
    
    def playing(): Unit
    
    def rate(): Unit
    
    def seek(): Unit
    
    def setVolume(): Unit
  }
  object Play {
    
    inline def apply(play: () => Unit, playing: () => Unit, rate: () => Unit, seek: () => Unit, setVolume: () => Unit): Play = {
      val __obj = js.Dynamic.literal(play = js.Any.fromFunction0(play), playing = js.Any.fromFunction0(playing), rate = js.Any.fromFunction0(rate), seek = js.Any.fromFunction0(seek), setVolume = js.Any.fromFunction0(setVolume))
      __obj.asInstanceOf[Play]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Play] (val x: Self) extends AnyVal {
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPlaying(value: () => Unit): Self = StObject.set(x, "playing", js.Any.fromFunction0(value))
      
      inline def setRate(value: () => Unit): Self = StObject.set(x, "rate", js.Any.fromFunction0(value))
      
      inline def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
      
      inline def setSetVolume(value: () => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction0(value))
    }
  }
}
