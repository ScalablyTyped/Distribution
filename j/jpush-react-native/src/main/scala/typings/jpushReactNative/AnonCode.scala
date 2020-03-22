package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  /**
    * 结果, 0为操作成功
    */
  var code: Double
}

object AnonCode {
  @scala.inline
  def apply(code: Double): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

