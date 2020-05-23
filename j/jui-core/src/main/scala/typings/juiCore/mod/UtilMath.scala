package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilMath extends js.Object {
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double
  /**
    * convert radian to degree
    *
    * @return degree
    */
  def degree(radian: Double): Double
  def div(a: Double, b: Double): Double
  /**
    * a, b 의 중간값 계산을 위한 callback 함수 만들기
    *
    * @param a    first value
    * @param b     second value
    */
  def interpolateNumber(a: Double, b: Double): js.Function0[Unit]
  // 중간값 round 해서 계산하기
  def interpolateRound(a: Double, b: Double): js.Function0[Unit]
  def inverseMatrix3d(a: js.Array[_]): js.Array[_]
  def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def minus(a: Double, b: Double): Double
  def multi(a: Double, b: Double): Double
  /**
    * 특정 구간의 값을 자동으로 계산
    */
  def nice(min: Double, max: Double, ticks: Double, isNice: Boolean): js.Any
  def plus(a: Double, b: Double): Double
  /**
    * convert degree to radian
    *
    * @return radian
    */
  def radian(degree: Double): Double
  def remain(a: Double, b: Double): Double
  def resize(maxWidth: Double, maxHeight: Double, objectWidth: Double, objectHeight: Double): js.Any
  /**
    * 2d rotate
    *
    * @param radian    roate 할 radian
    * @return return.x  변환된 x
    * @return return.y  변환된 y
    *
    */
  def rotate(x: Double, y: Double, radian: Double): js.Any
  def round(num: Double, fixed: Double): Double
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
}

