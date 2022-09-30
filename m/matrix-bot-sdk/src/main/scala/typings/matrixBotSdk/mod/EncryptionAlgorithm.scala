package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "EncryptionAlgorithm")
@js.native
object EncryptionAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.matrixBotSdk.cryptoMod.EncryptionAlgorithm & String] = js.native
  
  /* "m.megolm.v1.aes-sha2" */ val MegolmV1AesSha2: typings.matrixBotSdk.cryptoMod.EncryptionAlgorithm.MegolmV1AesSha2 & String = js.native
  
  /* "m.olm.v1.curve25519-aes-sha2" */ val OlmV1Curve25519AesSha2: typings.matrixBotSdk.cryptoMod.EncryptionAlgorithm.OlmV1Curve25519AesSha2 & String = js.native
}
