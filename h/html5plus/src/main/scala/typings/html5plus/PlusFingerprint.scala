package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fingerprint模块管理指纹识别。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
@js.native
trait PlusFingerprint extends js.Object {
  
  /**
    * JSON对象，指纹识别认证参数
    * 用于设置指纹识别认证界面显示的提示信息等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AuthenticateOptions: js.UndefOr[PlusFingerprintAuthenticateOptions] = js.native
  
  /**
    * JSON对象，指纹识别错误信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var FingerprintError: js.UndefOr[PlusFingerprintFingerprintError] = js.native
  
  /**
    * 指纹识别认证
    * 用户可以开始输入指纹进行识别，如果认证成功则触发successCB回调，识别失败则触发errorCB回调返回错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  def authenticate(): Unit = js.native
  def authenticate(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    options: PlusFingerprintAuthenticateOptions
  ): Unit = js.native
  def authenticate(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ PlusFingerprintFingerprintError, Unit]
  ): Unit = js.native
  def authenticate(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ PlusFingerprintFingerprintError, Unit],
    options: PlusFingerprintAuthenticateOptions
  ): Unit = js.native
  def authenticate(successCB: js.Function0[Unit]): Unit = js.native
  def authenticate(
    successCB: js.Function0[Unit],
    errorCB: js.UndefOr[scala.Nothing],
    options: PlusFingerprintAuthenticateOptions
  ): Unit = js.native
  def authenticate(
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ PlusFingerprintFingerprintError, Unit]
  ): Unit = js.native
  def authenticate(
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ PlusFingerprintFingerprintError, Unit],
    options: PlusFingerprintAuthenticateOptions
  ): Unit = js.native
  
  /**
    * 取消指纹识别认证
    * 取消当前正在处理的指纹识别认证操作。
    *     如果当前没有进行指纹识别则不进行任何操作；如果当前正在进行指纹识别则触发错误回调（错误码为“CANCEL”）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  def cancel(): Unit = js.native
  
  /**
    * 当前设备是否已经录入指纹
    * 如果设备没有录入指纹，则无法使用指纹识别功能，建议调用指纹识别前先使用此接口检查。
    *     调用plus.fingerprint.authenticate会返回失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  def isEnrolledFingerprints(): Boolean = js.native
  
  /**
    * 当前设备是否设置密码锁屏
    * 如果设备没有设置密码锁屏，则无法使用指纹识别功能，建议调用指纹识别前先使用此接口检查。
    *     调用plus.fingerprint.authenticate会返回失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  def isKeyguardSecure(): Boolean = js.native
  
  /**
    * 当前设备环境是否支持指纹识别
    * 目前还有很多设备没有指纹识别模块，需要调用此方法判断是否可使用指纹识别功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  def isSupport(): Boolean = js.native
}
