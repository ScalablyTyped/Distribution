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
    angle: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    degree: js.Function1[scala.Double, scala.Double],
    div: js.Function2[scala.Double, scala.Double, scala.Double],
    interpolateNumber: js.Function2[scala.Double, scala.Double, js.Function0[scala.Unit]],
    interpolateRound: js.Function2[scala.Double, scala.Double, js.Function0[scala.Unit]],
    inverseMatrix3d: js.Function1[js.Array[_], js.Array[_]],
    matrix: js.Function2[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]],
    matrix3d: js.Function2[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]],
    minus: js.Function2[scala.Double, scala.Double, scala.Double],
    multi: js.Function2[scala.Double, scala.Double, scala.Double],
    nice: js.Function4[scala.Double, scala.Double, scala.Double, scala.Boolean, js.Any],
    plus: js.Function2[scala.Double, scala.Double, scala.Double],
    radian: js.Function1[scala.Double, scala.Double],
    remain: js.Function2[scala.Double, scala.Double, scala.Double],
    resize: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Any],
    rotate: js.Function3[scala.Double, scala.Double, scala.Double, js.Any],
    round: js.Function2[scala.Double, scala.Double, scala.Double]
  ): UtilMath = {
    val __obj = js.Dynamic.literal(angle = angle, degree = degree, div = div, interpolateNumber = interpolateNumber, interpolateRound = interpolateRound, inverseMatrix3d = inverseMatrix3d, matrix = matrix, matrix3d = matrix3d, minus = minus, multi = multi, nice = nice, plus = plus, radian = radian, remain = remain, resize = resize, rotate = rotate, round = round)
  
    __obj.asInstanceOf[UtilMath]
  }
}

