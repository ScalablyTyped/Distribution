package typings.heremaps.H.map

import typings.heremaps.H.map.Imprint.Options
import typings.std.CSSStyleDeclaration
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates the brand, copyright and terms of use elements on the map.
  */
@js.native
trait Imprint extends StObject {
  
  /**
    * Method adds a callback which will be triggered when the object is disposed
    * @param callback {Function}
    * @param opt_scope {Object=}
    */
  def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method is used to capture the element view
    * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
    * @param pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
    * @param callback {function(HTMLCanvasElement=)} - Callback function to call once result of the capturing is ready
    * @param opt_errback {function(string)=} - Callback function to call if error occurred during capturing
    */
  def capture(canvas: HTMLCanvasElement, pixelRatio: Double): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.UndefOr[scala.Nothing],
    opt_errback: js.Function1[/* s */ String, Unit]
  ): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.Function1[/* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.Function1[/* canvas */ HTMLCanvasElement, Unit],
    opt_errback: js.Function1[/* s */ String, Unit]
  ): Unit = js.native
  
  /**
    * This method retrieves the copyright string for the current view of the map.
    * @returns {string} - The copyright string for the current map view
    */
  def getCopyrights(): String = js.native
  
  /**
    * To get the CSS style declaration of the imprint DOM element
    * @returns {CSSStyleDeclaration}
    */
  def getStyle(): CSSStyleDeclaration = js.native
  
  /**
    * To set the imprint options. If no opt_options argument is defined then all values are reset to their defaults.
    * @param opt_options {H.map.Imprint.Options=} - The options to style the imprint
    */
  def setOptions(): Unit = js.native
  def setOptions(opt_options: Options): Unit = js.native
}
object Imprint {
  
  /**
    * Options to style an imprint
    * @property invert {boolean=} - Indicates whether the logo is inverted. If omitted the current value remains, default is false.
    * @property font {string=} - The font of the text. If omitted the current value remains, default is &quot;11px Arial,sans-serif&quot;.
    * @property href {string=} - The URL of the &quot;Terms of use&quot; link. If omitted the current value remains, default is &quot;http://here.com/terms&quot;.
    */
  @js.native
  trait Options extends StObject {
    
    var font: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var invert: js.UndefOr[Boolean] = js.native
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
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    }
  }
}
