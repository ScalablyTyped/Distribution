package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OAuth模块管理客户端的用户登录授权验证功能，允许应用访问第三方平台的资源。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauth extends StObject {
  
  /**
    * 登录授权认证信息
    * 此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
    *     例如“微信”登录授权服务，则包括以下数据：
    *     unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var AuthInfo: js.UndefOr[PlusOauthAuthInfo] = js.native
  
  /**
    * JSON对象，授权认证参数选项
    * 此对象支持的属性值由登录授权认证服务定义。
    *     例如“微信”，则可配置以下参数：
    *     scope - 应用授权作用域；
    *     state - 用于保持请求和回调的状态参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var AuthOptions: js.UndefOr[PlusOauthAuthOptions] = js.native
  
  /**
    * 登录授权认证服务对象
    * AuthService对象用于表示登录授权认证服务，在JS中为对象，用于向系统进行登录授权认证操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var AuthService: js.UndefOr[PlusOauthAuthService] = js.native
  
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
  var UserInfo: js.UndefOr[PlusOauthUserInfo] = js.native
  
  /**
    * 获取登录授权认证服务列表
    * 获取终端支持的权登录认证服务列表，可用于提示用户进行登录平台的选择。获取登录授权认证服务成功后通过successCB回调返回支持的所有服务列表，获取服务失败则通过errorCB回调返回失败信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def getServices(): Unit = js.native
  def getServices(successCB: js.Function1[/* result */ js.Array[this.type], Unit]): Unit = js.native
  def getServices(
    successCB: js.Function1[/* result */ js.Array[this.type], Unit],
    errorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def getServices(successCB: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
}
