package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权用户信息
  * 用于保存登录授权用户的信息。
  *     此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  *     例如“微信”登录授权服务，可能包括以下自定义数据：
  *     privilege - 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）；
  *     unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthUserInfo extends js.Object {
  /**
    * 登录授权用户注册的城市信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 登录授权用户注册的国家信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var country: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的邮箱地址
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的头像图片地址
    * 要求为"http://"或"https://"开头的地址，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var headimgurl: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的昵称
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的电话号码
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var phonenumber: js.UndefOr[String] = js.native
  /**
    * 登录授权用户注册的省份信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var province: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的性别
    * 1为男性，2为女性。
    *     如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var sex: js.UndefOr[String] = js.native
}

object PlusOauthUserInfo {
  @scala.inline
  def apply(): PlusOauthUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthUserInfo]
  }
  @scala.inline
  implicit class PlusOauthUserInfoOps[Self <: PlusOauthUserInfo] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHeadimgurl(value: String): Self = this.set("headimgurl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadimgurl: Self = this.set("headimgurl", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setOpenid(value: String): Self = this.set("openid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenid: Self = this.set("openid", js.undefined)
    @scala.inline
    def setPhonenumber(value: String): Self = this.set("phonenumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhonenumber: Self = this.set("phonenumber", js.undefined)
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    @scala.inline
    def setSex(value: String): Self = this.set("sex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSex: Self = this.set("sex", js.undefined)
  }
  
}

