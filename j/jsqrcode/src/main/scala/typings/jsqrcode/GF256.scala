package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GF256 extends js.Object {
  
  val One: GF256Poly = js.native
  
  val Zero: GF256Poly = js.native
  
  def buildMonomial(degree: Double, coefficient: Double): GF256Poly = js.native
  
  def exp(a: Double): Double = js.native
  
  var expTable: js.Array[Double] = js.native
  
  def inverse(a: Double): Double = js.native
  
  def log(a: Double): Double = js.native
  
  var logTable: js.Array[Double] = js.native
  
  def multiply(a: Double, b: Double): Double = js.native
  
  var one: GF256Poly = js.native
  
  var zero: GF256Poly = js.native
}
object GF256 {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GF256Ops[Self <: GF256] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOne(value: GF256Poly): Self = this.set("One", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: GF256Poly): Self = this.set("Zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildMonomial(value: (Double, Double) => GF256Poly): Self = this.set("buildMonomial", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExp(value: Double => Double): Self = this.set("exp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpTableVarargs(value: Double*): Self = this.set("expTable", js.Array(value :_*))
    
    @scala.inline
    def setExpTable(value: js.Array[Double]): Self = this.set("expTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverse(value: Double => Double): Self = this.set("inverse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: Double => Double): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogTableVarargs(value: Double*): Self = this.set("logTable", js.Array(value :_*))
    
    @scala.inline
    def setLogTable(value: js.Array[Double]): Self = this.set("logTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiply(value: (Double, Double) => Double): Self = this.set("multiply", js.Any.fromFunction2(value))
  }
}
