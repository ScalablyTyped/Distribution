package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.encryptedIntentMod.EncryptedIntentOpts
import typings.matrixAppserviceBridge.intentMod.IntentOpts
import typings.matrixBotSdk.mod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedIntent")
@js.native
open class EncryptedIntent protected ()
  extends typings.matrixAppserviceBridge.encryptedIntentMod.EncryptedIntent {
  def this(
    botSdkIntent: typings.matrixBotSdk.mod.Intent,
    botClient: MatrixClient,
    intentOpts: IntentOpts,
    encryptionOpts: EncryptedIntentOpts
  ) = this()
}
