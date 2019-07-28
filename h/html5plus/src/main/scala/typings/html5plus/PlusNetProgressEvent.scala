package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP请求进度事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
trait PlusNetProgressEvent extends js.Object {
  /**
    * 进度信息是否可计算
    * HTTP请求进度信息是否有效，如果HTTP请求头中包含Content-Length头信息则为true，否则为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var lengthComputable: js.UndefOr[Double] = js.undefined
  /**
    * 当前已经接收到的数据长度
    * HTTP请求接收到的数据长度，单位为字节。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var loaded: js.UndefOr[Double] = js.undefined
  /**
    * 事件的目标对象
    * 通知HTTP请求进度事件的XMLHttpRequest对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var target: js.UndefOr[PlusNetXMLHttpRequest] = js.undefined
  /**
    * 总数据长度
    * HTTP请求返回的总数据长度，单位为字节。
    * 	如果无法获取则设置为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var total: js.UndefOr[Double] = js.undefined
}

object PlusNetProgressEvent {
  @scala.inline
  def apply(
    lengthComputable: Int | Double = null,
    loaded: Int | Double = null,
    target: PlusNetXMLHttpRequest = null,
    total: Int | Double = null
  ): PlusNetProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (lengthComputable != null) __obj.updateDynamic("lengthComputable")(lengthComputable.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNetProgressEvent]
  }
}

