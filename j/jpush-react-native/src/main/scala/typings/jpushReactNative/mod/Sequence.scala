package typings.jpushReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequence extends js.Object {
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double = js.native
}

object Sequence {
  @scala.inline
  def apply(sequence: Double): Sequence = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  @scala.inline
  implicit class SequenceOps[Self <: Sequence] (val x: Self) extends AnyVal {
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
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
  
}

