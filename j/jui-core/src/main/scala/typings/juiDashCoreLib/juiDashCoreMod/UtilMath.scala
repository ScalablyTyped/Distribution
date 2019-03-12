package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilMath extends js.Object {
  def angle(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double
  /**
    * convert radian to degree
    *
    * @return degree
    */
  def degree(radian: scala.Double): scala.Double
  def div(a: scala.Double, b: scala.Double): scala.Double
  /**
    * a, b 의 중간값 계산을 위한 callback 함수 만들기
    *
    * @param a	first value
    * @param b 	second value
    */
  def interpolateNumber(a: scala.Double, b: scala.Double): js.Function0[scala.Unit]
  // 중간값 round 해서 계산하기
  def interpolateRound(a: scala.Double, b: scala.Double): js.Function0[scala.Unit]
  def inverseMatrix3d(a: js.Array[_]): js.Array[_]
  def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def minus(a: scala.Double, b: scala.Double): scala.Double
  def multi(a: scala.Double, b: scala.Double): scala.Double
  /**
    * 특정 구간의 값을 자동으로 계산
    */
  def nice(min: scala.Double, max: scala.Double, ticks: scala.Double, isNice: scala.Boolean): js.Any
  def plus(a: scala.Double, b: scala.Double): scala.Double
  /**
    * convert degree to radian
    *
    * @return radian
    */
  def radian(degree: scala.Double): scala.Double
  def remain(a: scala.Double, b: scala.Double): scala.Double
  def resize(
    maxWidth: scala.Double,
    maxHeight: scala.Double,
    objectWidth: scala.Double,
    objectHeight: scala.Double
  ): js.Any
  /**
    * 2d rotate
    *
    * @param radian	roate 할 radian
    * @return return.x  변환된 x
    * @return return.y  변환된 y
    *
    */
  def rotate(x: scala.Double, y: scala.Double, radian: scala.Double): js.Any
  def round(num: scala.Double, fixed: scala.Double): scala.Double
}

object UtilMath {
  @scala.inline
  def apply(
    angle: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Double,
    degree: scala.Double => scala.Double,
    div: (scala.Double, scala.Double) => scala.Double,
    interpolateNumber: (scala.Double, scala.Double) => js.Function0[scala.Unit],
    interpolateRound: (scala.Double, scala.Double) => js.Function0[scala.Unit],
    inverseMatrix3d: js.Array[_] => js.Array[_],
    matrix: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    matrix3d: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
    minus: (scala.Double, scala.Double) => scala.Double,
    multi: (scala.Double, scala.Double) => scala.Double,
    nice: (scala.Double, scala.Double, scala.Double, scala.Boolean) => js.Any,
    plus: (scala.Double, scala.Double) => scala.Double,
    radian: scala.Double => scala.Double,
    remain: (scala.Double, scala.Double) => scala.Double,
    resize: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Any,
    rotate: (scala.Double, scala.Double, scala.Double) => js.Any,
    round: (scala.Double, scala.Double) => scala.Double
  ): UtilMath = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction4(angle), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), interpolateNumber = js.Any.fromFunction2(interpolateNumber), interpolateRound = js.Any.fromFunction2(interpolateRound), inverseMatrix3d = js.Any.fromFunction1(inverseMatrix3d), matrix = js.Any.fromFunction2(matrix), matrix3d = js.Any.fromFunction2(matrix3d), minus = js.Any.fromFunction2(minus), multi = js.Any.fromFunction2(multi), nice = js.Any.fromFunction4(nice), plus = js.Any.fromFunction2(plus), radian = js.Any.fromFunction1(radian), remain = js.Any.fromFunction2(remain), resize = js.Any.fromFunction4(resize), rotate = js.Any.fromFunction3(rotate), round = js.Any.fromFunction2(round))
  
    __obj.asInstanceOf[UtilMath]
  }
}

