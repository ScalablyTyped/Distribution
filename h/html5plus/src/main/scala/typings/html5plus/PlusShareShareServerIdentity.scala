package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 分享服务标识
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
@js.native
trait PlusShareShareServerIdentity extends js.Object {
  /**
    * 新浪微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var sinaweibo: js.UndefOr[String] = js.native
  /**
    * 腾讯微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var tencentweibo: js.UndefOr[String] = js.native
  /**
    * 微信
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var weixin: js.UndefOr[String] = js.native
}

object PlusShareShareServerIdentity {
  @scala.inline
  def apply(): PlusShareShareServerIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusShareShareServerIdentity]
  }
  @scala.inline
  implicit class PlusShareShareServerIdentityOps[Self <: PlusShareShareServerIdentity] (val x: Self) extends AnyVal {
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
    def setSinaweibo(value: String): Self = this.set("sinaweibo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinaweibo: Self = this.set("sinaweibo", js.undefined)
    @scala.inline
    def setTencentweibo(value: String): Self = this.set("tencentweibo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTencentweibo: Self = this.set("tencentweibo", js.undefined)
    @scala.inline
    def setWeixin(value: String): Self = this.set("weixin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeixin: Self = this.set("weixin", js.undefined)
  }
  
}

