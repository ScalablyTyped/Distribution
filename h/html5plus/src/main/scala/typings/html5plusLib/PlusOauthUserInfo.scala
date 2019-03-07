package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权用户信息
  * 用于保存登录授权用户的信息。
  * 	此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  * 	例如“微信”登录授权服务，可能包括以下自定义数据：
  * 	privilege - 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）；
  * 	unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
trait PlusOauthUserInfo extends js.Object {
  /**
    * 登录授权用户注册的城市信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户注册的国家信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的邮箱地址
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的头像图片地址
    * 要求为"http://"或"https://"开头的地址，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var headimgurl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的昵称
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的电话号码
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var phonenumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户注册的省份信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 登录授权用户的性别
    * 1为男性，2为女性。
    * 	如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var sex: js.UndefOr[java.lang.String] = js.undefined
}

object PlusOauthUserInfo {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    country: java.lang.String = null,
    email: java.lang.String = null,
    headimgurl: java.lang.String = null,
    nickname: java.lang.String = null,
    openid: java.lang.String = null,
    phonenumber: java.lang.String = null,
    province: java.lang.String = null,
    sex: java.lang.String = null
  ): PlusOauthUserInfo = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (email != null) __obj.updateDynamic("email")(email)
    if (headimgurl != null) __obj.updateDynamic("headimgurl")(headimgurl)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (openid != null) __obj.updateDynamic("openid")(openid)
    if (phonenumber != null) __obj.updateDynamic("phonenumber")(phonenumber)
    if (province != null) __obj.updateDynamic("province")(province)
    if (sex != null) __obj.updateDynamic("sex")(sex)
    __obj.asInstanceOf[PlusOauthUserInfo]
  }
}

