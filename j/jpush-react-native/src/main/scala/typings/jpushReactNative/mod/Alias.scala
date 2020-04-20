package typings.jpushReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * 有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|
    * 限制：alias 命名长度限制为 40 字节。（判断长度需采用 UTF-8 编码）
    */
  var alias: String
}

object Alias {
  @scala.inline
  def apply(alias: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

