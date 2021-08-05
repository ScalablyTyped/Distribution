package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GF256 extends StObject {
  
  val One: GF256Poly
  
  val Zero: GF256Poly
  
  def buildMonomial(degree: Double, coefficient: Double): GF256Poly
  
  def exp(a: Double): Double
  
  var expTable: js.Array[Double]
  
  def inverse(a: Double): Double
  
  def log(a: Double): Double
  
  var logTable: js.Array[Double]
  
  def multiply(a: Double, b: Double): Double
  
  /* private */ var one: GF256Poly
  
  /* private */ var zero: GF256Poly
}
object GF256 {
  
  inline def apply(
    One: GF256Poly,
    Zero: GF256Poly,
    buildMonomial: (Double, Double) => GF256Poly,
    exp: Double => Double,
    expTable: js.Array[Double],
    inverse: Double => Double,
    log: Double => Double,
    logTable: js.Array[Double],
    multiply: (Double, Double) => Double,
    one: GF256Poly,
    zero: GF256Poly
  ): GF256 = {
    val __obj = js.Dynamic.literal(One = One.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], buildMonomial = js.Any.fromFunction2(buildMonomial), exp = js.Any.fromFunction1(exp), expTable = expTable.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse), log = js.Any.fromFunction1(log), logTable = logTable.asInstanceOf[js.Any], multiply = js.Any.fromFunction2(multiply), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[GF256]
  }
  
  extension [Self <: GF256](x: Self) {
    
    inline def setBuildMonomial(value: (Double, Double) => GF256Poly): Self = StObject.set(x, "buildMonomial", js.Any.fromFunction2(value))
    
    inline def setExp(value: Double => Double): Self = StObject.set(x, "exp", js.Any.fromFunction1(value))
    
    inline def setExpTable(value: js.Array[Double]): Self = StObject.set(x, "expTable", value.asInstanceOf[js.Any])
    
    inline def setExpTableVarargs(value: Double*): Self = StObject.set(x, "expTable", js.Array(value :_*))
    
    inline def setInverse(value: Double => Double): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
    
    inline def setLog(value: Double => Double): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogTable(value: js.Array[Double]): Self = StObject.set(x, "logTable", value.asInstanceOf[js.Any])
    
    inline def setLogTableVarargs(value: Double*): Self = StObject.set(x, "logTable", js.Array(value :_*))
    
    inline def setMultiply(value: (Double, Double) => Double): Self = StObject.set(x, "multiply", js.Any.fromFunction2(value))
    
    inline def setOne(value: GF256Poly): Self = StObject.set(x, "One", value.asInstanceOf[js.Any])
    
    inline def setZero(value: GF256Poly): Self = StObject.set(x, "Zero", value.asInstanceOf[js.Any])
  }
}
