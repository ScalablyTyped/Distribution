package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.matrixJsSdkNumbers.`-1`
import typings.matrixJsSdk.matrixJsSdkNumbers.`0`
import typings.matrixJsSdk.matrixJsSdkNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "CryptoDeviceInfo")
@js.native
open class CryptoDeviceInfo protected () extends StObject {
  def this(deviceId: String) = this()
  
  var algorithms: js.Array[String] = js.native
  
  var deviceId: String = js.native
  
  def getDisplayName(): String | Null = js.native
  
  def getFingerprint(): String = js.native
  
  def getIdentityKey(): String = js.native
  
  def isBlocked(): Boolean = js.native
  
  def isKnown(): Boolean = js.native
  
  def isUnverified(): Boolean = js.native
  
  def isVerified(): Boolean = js.native
  
  var keys: StringDictionary[String] = js.native
  
  var known: Boolean = js.native
  
  def toStorage(): js.Object = js.native
  
  var unsigned: js.Object = js.native
  
  var verified: Double = js.native
}
/* static members */
object CryptoDeviceInfo {
  
  @JSImport("matrix-js-sdk", "CryptoDeviceInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-js-sdk", "CryptoDeviceInfo.BLOCKED")
  @js.native
  def BLOCKED: `-1` = js.native
  inline def BLOCKED_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLOCKED")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-js-sdk", "CryptoDeviceInfo.UNVERIFIED")
  @js.native
  def UNVERIFIED: `0` = js.native
  inline def UNVERIFIED_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNVERIFIED")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-js-sdk", "CryptoDeviceInfo.VERIFIED")
  @js.native
  def VERIFIED: `1` = js.native
  inline def VERIFIED_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERIFIED")(x.asInstanceOf[js.Any])
  
  inline def fromStorage(obj: js.Object, deviceId: String): CryptoDeviceInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStorage")(obj.asInstanceOf[js.Any], deviceId.asInstanceOf[js.Any])).asInstanceOf[CryptoDeviceInfo]
}
