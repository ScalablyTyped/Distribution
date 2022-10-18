package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "AutojoinRoomsMixin")
@js.native
open class AutojoinRoomsMixin ()
  extends typings.matrixBotSdk.libMixinsAutojoinRoomsMixinMod.AutojoinRoomsMixin
/* static members */
object AutojoinRoomsMixin {
  
  @JSImport("matrix-bot-sdk", "AutojoinRoomsMixin")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupOnAppservice(appservice: typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnAppservice")(appservice.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setupOnAppservice(
    appservice: typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice,
    conditional: js.Function1[/* inviteEvent */ Any, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupOnAppservice")(appservice.asInstanceOf[js.Any], conditional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupOnClient(client: typings.matrixBotSdk.libMatrixClientMod.MatrixClient): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
