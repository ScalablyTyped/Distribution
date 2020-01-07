package typings.jpushDashReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagEnable extends js.Object {
  /**
    * 执行查询指定tag(queryTag)操作时会返回是否可用
    */
  var tagEnable: Boolean
}

object Anon_TagEnable {
  @scala.inline
  def apply(tagEnable: Boolean): Anon_TagEnable = {
    val __obj = js.Dynamic.literal(tagEnable = tagEnable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TagEnable]
  }
}

