package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GF256Poly extends StObject {
  
  val Coefficients: js.Array[Double]
  
  val Degree: Double
  
  val Zero: Boolean
  
  def addOrSubtract(other: GF256Poly): GF256Poly
  
  var coefficients: js.Array[Double]
  
  def divide(other: GF256Poly): js.Tuple2[GF256Poly, GF256Poly]
  
  def evaluateAt(a: Double): Double
  
  var field: GF256
  
  def getCoefficient(degree: Double): Double
  
  def multiply1(other: GF256Poly): GF256Poly
  
  def multiply2(scalar: Double): GF256Poly
  
  def multiplyByMonomial(degree: Double, coefficient: Double): GF256Poly
}
object GF256Poly {
  
  @scala.inline
  def apply(
    Coefficients: js.Array[Double],
    Degree: Double,
    Zero: Boolean,
    addOrSubtract: GF256Poly => GF256Poly,
    coefficients: js.Array[Double],
    divide: GF256Poly => js.Tuple2[GF256Poly, GF256Poly],
    evaluateAt: Double => Double,
    field: GF256,
    getCoefficient: Double => Double,
    multiply1: GF256Poly => GF256Poly,
    multiply2: Double => GF256Poly,
    multiplyByMonomial: (Double, Double) => GF256Poly
  ): GF256Poly = {
    val __obj = js.Dynamic.literal(Coefficients = Coefficients.asInstanceOf[js.Any], Degree = Degree.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], addOrSubtract = js.Any.fromFunction1(addOrSubtract), coefficients = coefficients.asInstanceOf[js.Any], divide = js.Any.fromFunction1(divide), evaluateAt = js.Any.fromFunction1(evaluateAt), field = field.asInstanceOf[js.Any], getCoefficient = js.Any.fromFunction1(getCoefficient), multiply1 = js.Any.fromFunction1(multiply1), multiply2 = js.Any.fromFunction1(multiply2), multiplyByMonomial = js.Any.fromFunction2(multiplyByMonomial))
    __obj.asInstanceOf[GF256Poly]
  }
  
  @scala.inline
  implicit class GF256PolyMutableBuilder[Self <: GF256Poly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOrSubtract(value: GF256Poly => GF256Poly): Self = StObject.set(x, "addOrSubtract", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCoefficients(value: js.Array[Double]): Self = StObject.set(x, "Coefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoefficientsVarargs(value: Double*): Self = StObject.set(x, "Coefficients", js.Array(value :_*))
    
    @scala.inline
    def setDegree(value: Double): Self = StObject.set(x, "Degree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivide(value: GF256Poly => js.Tuple2[GF256Poly, GF256Poly]): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvaluateAt(value: Double => Double): Self = StObject.set(x, "evaluateAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setField(value: GF256): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCoefficient(value: Double => Double): Self = StObject.set(x, "getCoefficient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply1(value: GF256Poly => GF256Poly): Self = StObject.set(x, "multiply1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply2(value: Double => GF256Poly): Self = StObject.set(x, "multiply2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiplyByMonomial(value: (Double, Double) => GF256Poly): Self = StObject.set(x, "multiplyByMonomial", js.Any.fromFunction2(value))
    
    @scala.inline
    def setZero(value: Boolean): Self = StObject.set(x, "Zero", value.asInstanceOf[js.Any])
  }
}
