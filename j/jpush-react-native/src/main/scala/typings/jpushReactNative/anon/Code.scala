package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  /**
    * 结果, 0为操作成功
    */
  var code: Double
}

object Code {
  @scala.inline
  def apply(code: Double): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

