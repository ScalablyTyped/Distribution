package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStrategiesJoinRoomStrategyMod {
  
  @JSImport("matrix-bot-sdk/lib/strategies/JoinRoomStrategy", "SimpleRetryJoinStrategy")
  @js.native
  open class SimpleRetryJoinStrategy ()
    extends StObject
       with IJoinRoomStrategy {
    
    /* CompleteClass */
    override def joinRoom(
      roomIdOrAlias: String,
      userId: String,
      apiCall: js.Function1[/* targetRoomIdOrAlias */ String, js.Promise[String]]
    ): js.Promise[String] = js.native
    
    /* private */ var schedule: Any = js.native
  }
  
  trait IJoinRoomStrategy extends StObject {
    
    def joinRoom(
      roomIdOrAlias: String,
      userId: String,
      apiCall: js.Function1[/* targetRoomIdOrAlias */ String, js.Promise[String]]
    ): js.Promise[String]
  }
  object IJoinRoomStrategy {
    
    inline def apply(
      joinRoom: (String, String, js.Function1[/* targetRoomIdOrAlias */ String, js.Promise[String]]) => js.Promise[String]
    ): IJoinRoomStrategy = {
      val __obj = js.Dynamic.literal(joinRoom = js.Any.fromFunction3(joinRoom))
      __obj.asInstanceOf[IJoinRoomStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJoinRoomStrategy] (val x: Self) extends AnyVal {
      
      inline def setJoinRoom(
        value: (String, String, js.Function1[/* targetRoomIdOrAlias */ String, js.Promise[String]]) => js.Promise[String]
      ): Self = StObject.set(x, "joinRoom", js.Any.fromFunction3(value))
    }
  }
}
