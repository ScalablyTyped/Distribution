package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagEnable extends js.Object {
  /**
    * 执行查询指定tag(queryTag)操作时会返回是否可用
    */
  var tagEnable: Boolean
}

object AnonTagEnable {
  @scala.inline
  def apply(tagEnable: Boolean): AnonTagEnable = {
    val __obj = js.Dynamic.literal(tagEnable = tagEnable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTagEnable]
  }
}

