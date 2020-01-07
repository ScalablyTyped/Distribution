package typings.jpushDashReactDashNative.jpushDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tags extends js.Object {
  /**
    * 有效的标签组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
    * 限制：每个 tag 命名长度限制为 40 字节,最多支持设置 1000 个 tag,且单次操作总长度不得超过 5000 字节
    *（判断长度需采用 UTF-8 编码）单个设备最多支持设置 1000 个 tag。App 全局 tag 数量无限制
    */
  var tags: js.Array[String]
}

object Tags {
  @scala.inline
  def apply(tags: js.Array[String]): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tags]
  }
}

