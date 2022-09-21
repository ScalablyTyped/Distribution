package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.encryptedIntentMod.EncryptedIntentOpts
import typings.matrixAppserviceBridge.intentMod.IntentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedIntent")
@js.native
open class EncryptedIntent protected ()
  extends typings.matrixAppserviceBridge.encryptedIntentMod.EncryptedIntent {
  def this(
    botSdkIntent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BotSdk.Intent */ Any,
    botClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BotSdk.MatrixClient */ Any,
    intentOpts: IntentOpts,
    encryptionOpts: EncryptedIntentOpts
  ) = this()
}
