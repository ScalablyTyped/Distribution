package typings.jpushReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sequence extends js.Object {
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}

object Sequence {
  @scala.inline
  def apply(sequence: Double): Sequence = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
}

