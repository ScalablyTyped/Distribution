package typings.heremaps.H.map

import typings.heremaps.H.map.ArrowStyle.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents style attributes for arrows to be rendered along a polyline. A ArrowStyle instance is always treated as immutable to avoid inconstiencies and must not modified.
  */
@js.native
trait ArrowStyle extends StObject {
  
  /**
    * This method checks value-equality with another arrow style.
    * @param other {(H.map.ArrowStyle | H.map.ArrowStyle.Options)} - the arrow style to compare with
    * @returns {boolean} - true if the arrow styles are value-equal, otherwise false
    */
  def equals(other: ArrowStyle): Boolean = js.native
  def equals(other: Options): Boolean = js.native
}
object ArrowStyle {
  
  /**
    * An object type to specify the style of arrows to render along a polyline
    * @property fillColor {string=} - The CSS color value used to fill the arrow shapes. If omitted or the value evaluates to false it defaults to "rgba(255, 255, 255, 0.75)"
    * @property width {number=} - The width of the arrow shape. The value is taken as a factor of the width of the line, where the arrow description is applied.
    * If omitted or the value is <= 0 it defaults to 1.2
    * @property length {number=} - The length of the arrow shapes. The value is taken as a factor of the width of the line at the end of which the arrow is drawn.
    * If omitted or the value is <= 0 it defaults to 1.6
    * @property frequency {number=} - The frequency of arrow shapes. The value is taken as factor of the length of the arrow. A value of 1 results in gapless arrows.
    * If omitted or the value is false it defaults to 5
    */
  trait Options extends StObject {
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
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
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
