package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  mobileNumber  :string} & jpush-react-native.jpush-react-native.Sequence */
trait mobileNumberstringSequenc extends js.Object {
  var mobileNumber: String
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double
}

object mobileNumberstringSequenc {
  @scala.inline
  def apply(mobileNumber: String, sequence: Double): mobileNumberstringSequenc = {
    val __obj = js.Dynamic.literal(mobileNumber = mobileNumber.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[mobileNumberstringSequenc]
  }
}

