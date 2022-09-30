package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "AutojoinUpgradedRoomsMixin")
@js.native
open class AutojoinUpgradedRoomsMixin ()
  extends typings.matrixBotSdk.autojoinUpgradedRoomsMixinMod.AutojoinUpgradedRoomsMixin
/* static members */
object AutojoinUpgradedRoomsMixin {
  
  @JSImport("matrix-bot-sdk", "AutojoinUpgradedRoomsMixin")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupOnAppservice(appservice: typings.matrixBotSdk.appserviceMod.Appservice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnAppservice")(appservice.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setupOnClient(client: typings.matrixBotSdk.matrixClientMod.MatrixClient): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
