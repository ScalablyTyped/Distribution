package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权认证信息
  * 此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  * 	例如“微信”登录授权服务，则包括以下数据：
  * 	unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
trait PlusOauthAuthInfo extends js.Object {
  /**
    * 登录授权的访问令牌
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var access_token: js.UndefOr[String] = js.undefined
  /**
    * 登录授权访问令牌过期时间
    * 单位为秒，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var expires_in: js.UndefOr[String] = js.undefined
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[String] = js.undefined
  /**
    * 登录授权的更新令牌
    * 用来获取下一次的访问令牌，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var refresh_token: js.UndefOr[String] = js.undefined
  /**
    * 登录授权的权限范围
    * 如果存在多个权限，则以","符号分割。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var scope: js.UndefOr[String] = js.undefined
}

object PlusOauthAuthInfo {
  @scala.inline
  def apply(
    access_token: String = null,
    expires_in: String = null,
    openid: String = null,
    refresh_token: String = null,
    scope: String = null
  ): PlusOauthAuthInfo = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (openid != null) __obj.updateDynamic("openid")(openid.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusOauthAuthInfo]
  }
}

