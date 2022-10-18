package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "DeviceKeyAlgorithm")
@js.native
object DeviceKeyAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.matrixBotSdk.libModelsCryptoMod.DeviceKeyAlgorithm & String] = js.native
  
  /* "curve25519" */ val Curve25519: typings.matrixBotSdk.libModelsCryptoMod.DeviceKeyAlgorithm.Curve25519 & String = js.native
  
  /* "ed25519" */ val Ed25519: typings.matrixBotSdk.libModelsCryptoMod.DeviceKeyAlgorithm.Ed25519 & String = js.native
}
