package typings.matrixBotSdk

import typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice
import typings.matrixBotSdk.libMatrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMixinsAutojoinRoomsMixinMod {
  
  @JSImport("matrix-bot-sdk/lib/mixins/AutojoinRoomsMixin", "AutojoinRoomsMixin")
  @js.native
  open class AutojoinRoomsMixin () extends StObject
  /* static members */
  object AutojoinRoomsMixin {
    
    @JSImport("matrix-bot-sdk/lib/mixins/AutojoinRoomsMixin", "AutojoinRoomsMixin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setupOnAppservice(appservice: Appservice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnAppservice")(appservice.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setupOnAppservice(appservice: Appservice, conditional: js.Function1[/* inviteEvent */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupOnAppservice")(appservice.asInstanceOf[js.Any], conditional.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setupOnClient(client: MatrixClient): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupOnClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
