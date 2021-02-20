package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerspectiveTransform extends StObject {
  
  var a11: Double = js.native
  
  var a12: Double = js.native
  
  var a13: Double = js.native
  
  var a21: Double = js.native
  
  var a22: Double = js.native
  
  var a23: Double = js.native
  
  var a31: Double = js.native
  
  var a32: Double = js.native
  
  var a33: Double = js.native
  
  def buildAdjoint(): PerspectiveTransform = js.native
  
  def times(other: PerspectiveTransform): PerspectiveTransform = js.native
  
  def transformPoints1(points: js.Array[Double]): Unit = js.native
  
  def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit = js.native
}
object PerspectiveTransform {
  
  @scala.inline
  def apply(
    a11: Double,
    a12: Double,
    a13: Double,
    a21: Double,
    a22: Double,
    a23: Double,
    a31: Double,
    a32: Double,
    a33: Double,
    buildAdjoint: () => PerspectiveTransform,
    times: PerspectiveTransform => PerspectiveTransform,
    transformPoints1: js.Array[Double] => Unit,
    transformPoints2: (js.Array[Double], js.Array[Double]) => Unit
  ): PerspectiveTransform = {
    val __obj = js.Dynamic.literal(a11 = a11.asInstanceOf[js.Any], a12 = a12.asInstanceOf[js.Any], a13 = a13.asInstanceOf[js.Any], a21 = a21.asInstanceOf[js.Any], a22 = a22.asInstanceOf[js.Any], a23 = a23.asInstanceOf[js.Any], a31 = a31.asInstanceOf[js.Any], a32 = a32.asInstanceOf[js.Any], a33 = a33.asInstanceOf[js.Any], buildAdjoint = js.Any.fromFunction0(buildAdjoint), times = js.Any.fromFunction1(times), transformPoints1 = js.Any.fromFunction1(transformPoints1), transformPoints2 = js.Any.fromFunction2(transformPoints2))
    __obj.asInstanceOf[PerspectiveTransform]
  }
  
  @scala.inline
  implicit class PerspectiveTransformMutableBuilder[Self <: PerspectiveTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA11(value: Double): Self = StObject.set(x, "a11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA12(value: Double): Self = StObject.set(x, "a12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA13(value: Double): Self = StObject.set(x, "a13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA21(value: Double): Self = StObject.set(x, "a21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA22(value: Double): Self = StObject.set(x, "a22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA23(value: Double): Self = StObject.set(x, "a23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA31(value: Double): Self = StObject.set(x, "a31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA32(value: Double): Self = StObject.set(x, "a32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA33(value: Double): Self = StObject.set(x, "a33", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildAdjoint(value: () => PerspectiveTransform): Self = StObject.set(x, "buildAdjoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimes(value: PerspectiveTransform => PerspectiveTransform): Self = StObject.set(x, "times", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformPoints1(value: js.Array[Double] => Unit): Self = StObject.set(x, "transformPoints1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformPoints2(value: (js.Array[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "transformPoints2", js.Any.fromFunction2(value))
  }
}
