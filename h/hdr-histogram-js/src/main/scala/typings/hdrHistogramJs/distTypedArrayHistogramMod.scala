package typings.hdrHistogramJs

import org.scalablytyped.runtime.Instantiable1
import typings.hdrHistogramJs.distJsHistogramMod.JsHistogram
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypedArrayHistogramMod {
  
  @JSImport("hdr-histogram-js/dist/TypedArrayHistogram", JSImport.Default)
  @js.native
  open class default protected () extends TypedArrayHistogram {
    def this(
      arrayCtr: Instantiable1[/* size */ Double, TypedArray],
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  trait TypedArray
    extends StObject
       with ArrayLike[Double] {
    
    val BYTES_PER_ELEMENT: Double
    
    def fill(v: Double): Unit
    
    def set(other: TypedArray): Unit
  }
  object TypedArray {
    
    inline def apply(BYTES_PER_ELEMENT: Double, fill: Double => Unit, length: Double, set: TypedArray => Unit): TypedArray = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], fill = js.Any.fromFunction1(fill), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[TypedArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypedArray] (val x: Self) extends AnyVal {
      
      inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      inline def setFill(value: Double => Unit): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setSet(value: TypedArray => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypedArrayHistogram extends JsHistogram {
    
    var _counts: TypedArray = js.native
    
    /* private */ var arrayCtr: Any = js.native
  }
}
