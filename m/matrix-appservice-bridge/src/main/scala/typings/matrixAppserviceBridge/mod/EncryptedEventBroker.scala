package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Flows
import typings.matrixAppserviceBridge.anon.TypeString
import typings.matrixAppserviceBridge.eventTypesMod.EphemeralEvent
import typings.matrixAppserviceBridge.eventTypesMod.WeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
@js.native
class EncryptedEventBroker protected ()
  extends typings.matrixAppserviceBridge.encryptionMod.EncryptedEventBroker {
  def this(
    membership: typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache,
    asBot: typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    onEphemeralEvent: js.Function1[/* event */ EphemeralEvent, Unit],
    getIntent: js.Function1[/* userId */ String, typings.matrixAppserviceBridge.intentMod.Intent]
  ) = this()
  def this(
    membership: typings.matrixAppserviceBridge.membershipCacheMod.MembershipCache,
    asBot: typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    onEphemeralEvent: Unit,
    getIntent: js.Function1[/* userId */ String, typings.matrixAppserviceBridge.intentMod.Intent]
  ) = this()
}
/* static members */
object EncryptedEventBroker {
  
  @JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportsLoginFlow(loginFlows: Flows): js.UndefOr[TypeString] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsLoginFlow")(loginFlows.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeString]]
}
