package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权认证信息
  * 此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  *     例如“微信”登录授权服务，则包括以下数据：
  *     unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthAuthInfo extends js.Object {
  /**
    * 登录授权的访问令牌
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var access_token: js.UndefOr[String] = js.native
  /**
    * 登录授权访问令牌过期时间
    * 单位为秒，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var expires_in: js.UndefOr[String] = js.native
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[String] = js.native
  /**
    * 登录授权的更新令牌
    * 用来获取下一次的访问令牌，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var refresh_token: js.UndefOr[String] = js.native
  /**
    * 登录授权的权限范围
    * 如果存在多个权限，则以","符号分割。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var scope: js.UndefOr[String] = js.native
}

object PlusOauthAuthInfo {
  @scala.inline
  def apply(): PlusOauthAuthInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthAuthInfo]
  }
  @scala.inline
  implicit class PlusOauthAuthInfoOps[Self <: PlusOauthAuthInfo] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setExpires_in(value: String): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
    @scala.inline
    def setOpenid(value: String): Self = this.set("openid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenid: Self = this.set("openid", js.undefined)
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

