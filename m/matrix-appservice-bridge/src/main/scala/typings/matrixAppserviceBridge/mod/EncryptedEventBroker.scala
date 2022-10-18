package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Flows
import typings.matrixAppserviceBridge.libComponentsEncryptionMod.ClientEncryptionStore
import typings.matrixAppserviceBridge.libComponentsEventTypesMod.WeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
@js.native
open class EncryptedEventBroker protected ()
  extends typings.matrixAppserviceBridge.libComponentsEncryptionMod.EncryptedEventBroker {
  def this(
    membership: typings.matrixAppserviceBridge.libComponentsMembershipCacheMod.MembershipCache,
    asBot: typings.matrixAppserviceBridge.libComponentsAppServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    getIntent: js.Function1[/* userId */ String, typings.matrixAppserviceBridge.libComponentsIntentMod.Intent],
    store: ClientEncryptionStore
  ) = this()
}
/* static members */
object EncryptedEventBroker {
  
  @JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportsLoginFlow(loginFlows: Flows): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsLoginFlow")(loginFlows.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
