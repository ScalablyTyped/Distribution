package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilMath extends js.Object {
  
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  /**
    * convert radian to degree
    *
    * @return degree
    */
  def degree(radian: Double): Double = js.native
  
  def div(a: Double, b: Double): Double = js.native
  
  /**
    * a, b 의 중간값 계산을 위한 callback 함수 만들기
    *
    * @param a    first value
    * @param b     second value
    */
  def interpolateNumber(a: Double, b: Double): js.Function0[Unit] = js.native
  
  // 중간값 round 해서 계산하기
  def interpolateRound(a: Double, b: Double): js.Function0[Unit] = js.native
  
  def inverseMatrix3d(a: js.Array[_]): js.Array[_] = js.native
  
  def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  
  def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  
  def minus(a: Double, b: Double): Double = js.native
  
  def multi(a: Double, b: Double): Double = js.native
  
  /**
    * 특정 구간의 값을 자동으로 계산
    */
  def nice(min: Double, max: Double, ticks: Double, isNice: Boolean): js.Any = js.native
  
  def plus(a: Double, b: Double): Double = js.native
  
  /**
    * convert degree to radian
    *
    * @return radian
    */
  def radian(degree: Double): Double = js.native
  
  def remain(a: Double, b: Double): Double = js.native
  
  def resize(maxWidth: Double, maxHeight: Double, objectWidth: Double, objectHeight: Double): js.Any = js.native
  
  /**
    * 2d rotate
    *
    * @param radian    roate 할 radian
    * @return return.x  변환된 x
    * @return return.y  변환된 y
    *
    */
  def rotate(x: Double, y: Double, radian: Double): js.Any = js.native
  
  def round(num: Double, fixed: Double): Double = js.native
}
object UtilMath {
  
  @scala.inline
  def apply(
    angle: (Double, Double, Double, Double) => Double,
    degree: Double => Double,
    div: (Double, Double) => Double,
    interpolateNumber: (Double, Double) => js.Function0[Unit],
    interpolateRound: (Double, Double) => js.Function0[Unit],
    inverseMatrix3d: js.Array[_] => js.Array[_],
    matrix: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    matrix3d: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    minus: (Double, Double) => Double,
    multi: (Double, Double) => Double,
    nice: (Double, Double, Double, Boolean) => js.Any,
    plus: (Double, Double) => Double,
    radian: Double => Double,
    remain: (Double, Double) => Double,
    resize: (Double, Double, Double, Double) => js.Any,
    rotate: (Double, Double, Double) => js.Any,
    round: (Double, Double) => Double
  ): UtilMath = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction4(angle), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), interpolateNumber = js.Any.fromFunction2(interpolateNumber), interpolateRound = js.Any.fromFunction2(interpolateRound), inverseMatrix3d = js.Any.fromFunction1(inverseMatrix3d), matrix = js.Any.fromFunction2(matrix), matrix3d = js.Any.fromFunction2(matrix3d), minus = js.Any.fromFunction2(minus), multi = js.Any.fromFunction2(multi), nice = js.Any.fromFunction4(nice), plus = js.Any.fromFunction2(plus), radian = js.Any.fromFunction1(radian), remain = js.Any.fromFunction2(remain), resize = js.Any.fromFunction4(resize), rotate = js.Any.fromFunction3(rotate), round = js.Any.fromFunction2(round))
    __obj.asInstanceOf[UtilMath]
  }
  
  @scala.inline
  implicit class UtilMathOps[Self <: UtilMath] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: (Double, Double, Double, Double) => Double): Self = this.set("angle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDegree(value: Double => Double): Self = this.set("degree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiv(value: (Double, Double) => Double): Self = this.set("div", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterpolateNumber(value: (Double, Double) => js.Function0[Unit]): Self = this.set("interpolateNumber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterpolateRound(value: (Double, Double) => js.Function0[Unit]): Self = this.set("interpolateRound", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInverseMatrix3d(value: js.Array[_] => js.Array[_]): Self = this.set("inverseMatrix3d", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatrix(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = this.set("matrix", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrix3d(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = this.set("matrix3d", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMinus(value: (Double, Double) => Double): Self = this.set("minus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMulti(value: (Double, Double) => Double): Self = this.set("multi", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNice(value: (Double, Double, Double, Boolean) => js.Any): Self = this.set("nice", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPlus(value: (Double, Double) => Double): Self = this.set("plus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRadian(value: Double => Double): Self = this.set("radian", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemain(value: (Double, Double) => Double): Self = this.set("remain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResize(value: (Double, Double, Double, Double) => js.Any): Self = this.set("resize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRotate(value: (Double, Double, Double) => js.Any): Self = this.set("rotate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRound(value: (Double, Double) => Double): Self = this.set("round", js.Any.fromFunction2(value))
  }
}
