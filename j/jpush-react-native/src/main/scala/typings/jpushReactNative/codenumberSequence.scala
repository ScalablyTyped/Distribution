package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  code  :number} & jpush-react-native.jpush-react-native.Sequence */
trait codenumberSequence extends js.Object {
  var code: Double
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}

object codenumberSequence {
  @scala.inline
  def apply(code: Double, sequence: Double): codenumberSequence = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[codenumberSequence]
  }
}

