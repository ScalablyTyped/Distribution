package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，应用角标显示需要的通知栏消息的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeBadgeOptions extends js.Object {
  /**
    * 消息的内容
    * 默认值为“您有x条未读消息"”，其中x未设置的角标数字值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 消息的标题
    * 默认值为应用的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlusRuntimeBadgeOptions {
  @scala.inline
  def apply(content: java.lang.String = null, title: java.lang.String = null): PlusRuntimeBadgeOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusRuntimeBadgeOptions]
  }
}

