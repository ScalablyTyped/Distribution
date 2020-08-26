package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP请求进度事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
@js.native
trait PlusNetProgressEvent extends js.Object {
  /**
    * 进度信息是否可计算
    * HTTP请求进度信息是否有效，如果HTTP请求头中包含Content-Length头信息则为true，否则为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var lengthComputable: js.UndefOr[Double] = js.native
  /**
    * 当前已经接收到的数据长度
    * HTTP请求接收到的数据长度，单位为字节。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var loaded: js.UndefOr[Double] = js.native
  /**
    * 事件的目标对象
    * 通知HTTP请求进度事件的XMLHttpRequest对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var target: js.UndefOr[PlusNetXMLHttpRequest] = js.native
  /**
    * 总数据长度
    * HTTP请求返回的总数据长度，单位为字节。
    *     如果无法获取则设置为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var total: js.UndefOr[Double] = js.native
}

object PlusNetProgressEvent {
  @scala.inline
  def apply(): PlusNetProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNetProgressEvent]
  }
  @scala.inline
  implicit class PlusNetProgressEventOps[Self <: PlusNetProgressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLengthComputable(value: Double): Self = this.set("lengthComputable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthComputable: Self = this.set("lengthComputable", js.undefined)
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setTarget(value: PlusNetXMLHttpRequest): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

