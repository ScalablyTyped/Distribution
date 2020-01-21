package typings.javascriptObfuscator.iarrayutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayUtils extends js.Object {
  /**
    * @param length
    * @return {number[]}
    */
  def createWithRange(length: Double): js.Array[Double]
  /**
    * @param array
    * @param times
    * @returns {T[]}
    */
  def rotate[T](array: js.Array[T], times: Double): js.Array[T]
  /**
    * @param array
    * @return {T[]}
    */
  def shuffle[T](array: js.Array[T]): js.Array[T]
}

object IArrayUtils {
  @scala.inline
  def apply(
    createWithRange: Double => js.Array[Double],
    rotate: (js.Array[js.Any], Double) => js.Array[js.Any],
    shuffle: js.Array[js.Any] => js.Array[js.Any]
  ): IArrayUtils = {
    val __obj = js.Dynamic.literal(createWithRange = js.Any.fromFunction1(createWithRange), rotate = js.Any.fromFunction2(rotate), shuffle = js.Any.fromFunction1(shuffle))
  
    __obj.asInstanceOf[IArrayUtils]
  }
}

