package typings.matrixBotSdk

import typings.matrixBotSdk.libAppserviceAppserviceMod.Appservice
import typings.matrixBotSdk.libStrategiesJoinRoomStrategyMod.IJoinRoomStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStrategiesAppserviceJoinRoomStrategyMod {
  
  @JSImport("matrix-bot-sdk/lib/strategies/AppserviceJoinRoomStrategy", "AppserviceJoinRoomStrategy")
  @js.native
  open class AppserviceJoinRoomStrategy protected ()
    extends StObject
       with IJoinRoomStrategy {
    def this(underlyingStrategy: IJoinRoomStrategy, appservice: Appservice) = this()
    
    /* private */ var appservice: Any = js.native
    
    /* CompleteClass */
    override def joinRoom(
      roomIdOrAlias: String,
      userId: String,
      apiCall: js.Function1[/* targetRoomIdOrAlias */ String, js.Promise[String]]
    ): js.Promise[String] = js.native
    
    /* private */ var underlyingStrategy: Any = js.native
  }
}
