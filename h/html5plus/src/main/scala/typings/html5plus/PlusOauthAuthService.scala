package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权认证服务对象
  * AuthService对象用于表示登录授权认证服务，在JS中为对象，用于向系统进行登录授权认证操作。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthAuthService extends js.Object {
  /**
    * 授权认证结果数据
    * 用于保存登录授权认证获取的认证信息，如果值为"undefined"则表示未进行授权认证或者是授权认证失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var authResult: js.UndefOr[PlusOauthAuthInfo] = js.native
  /**
    * 登录授权认证服务描述
    * 用于描述登录授权认证服务的信息：
    *         "微信" - 表示微信登录授权；
    *         "QQ" - 表示QQ登录授权；
    *         "新浪微博" - 表示新浪微博登录授权；
    *         "360账号" - 表示360账号登录（仅360手助流应用环境下支持）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * 登录授权认证扩展信息
    * 用于保存登录授权认证服务返回的扩展信息，具体内容由各登录平台决定，如果没有扩展信息则为undefined。
    *     例如“微信”，则可保存以下数据：
    *     state - 用于保持请求和回调的状态参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var extra: js.UndefOr[js.Any] = js.native
  /**
    * 登录授权认证服务标识
    * 用于表示登录授权认证服务标识：
    *         "weixin" - 表示微信登录授权；
    *         "qq" - 表示QQ登录授权；
    *         "sinaweibo" - 表示新浪微博登录授权；
    *         "qihoo" - 表示360账号登录（仅360手助流应用环境下支持）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 登录授权认证用户信息
    * 用于保存登录授权认证获取的用户信息，如果值为"undefined"则表示未获取过用户信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var userInfo: js.UndefOr[PlusOauthUserInfo] = js.native
  /**
    * 添加用户手机号信息
    * 打开登录授权服务的添加用户手机号界面进行操作，添加用户手机号操作成功后通过successCallback回调函数通知，否则通过errorCallback回调函数通知。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def addPhoneNumber(): Unit = js.native
  def addPhoneNumber(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addPhoneNumber(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addPhoneNumber(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 请求授权认证
    * 向开放平台请求进行授权认证，需提供授权域（scope），用户在终端确认后通过成功回调返回授权临时票据（code）。
    *     开发者可以将授权临时票据（code）提交到业务服务器，又业务服务器从微信开放平台获取授权登录等相关信息，避免将appsecret等信息保存在客户端可能引起泄露的问题。
    *     注意：目前仅微信平台支持请求授权认证，其它平台调用此方法将返回错误回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def authorize(): Unit = js.native
  def authorize(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def authorize(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def authorize(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def authorize(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def authorize(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def authorize(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def authorize(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  /**
    * 获取登录授权用户信息
    * 获取登录授权认证的用户信息，在获取前可通过对象的userInfo属性判断是否已经获取过，通常只需要对没有获取过用户信息的服务进行操作。
    *     获取用户信息操作成功后通过successCallback回调函数通知，失败则通过errorCallback回调函数通知。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def getUserInfo(): Unit = js.native
  def getUserInfo(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getUserInfo(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getUserInfo(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 请求登录授权认证操作
    * 对指定的登录授权认证服务进行登录认证操作，在登录前可通过对象的authResult属性判断是否已经登录认证过，通常只需要对没有进行过登录认证的服务进行登录认证操作。
    *     授权认证操作成功后通过successCB回调函数通知，失败则通过errorCB回调函数通知。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def login(): Unit = js.native
  def login(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def login(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def login(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* result */ js.Any, Unit],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def login(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def login(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  def login(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def login(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit],
    options: PlusOauthAuthOptions
  ): Unit = js.native
  /**
    * 注销登录授权认证
    * 对指定的登录授权认证服务注销登录认证操作，注销授权认证后，再次操作时需重新进行登录认证操作。
    *     如果第三方平台不需要注销操作，则情况保存的相关登录认证等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  def logout(): Unit = js.native
  def logout(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def logout(successCallback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def logout(
    successCallback: js.Function1[/* result */ js.Any, Unit],
    errorCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

