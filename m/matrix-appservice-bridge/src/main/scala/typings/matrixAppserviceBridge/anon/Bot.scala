package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libComponentsIntentMod.IntentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bot extends StObject {
  
  /**
    * Options to supply to the bot intent.
    */
  var bot: js.UndefOr[IntentOpts] = js.undefined
  
  /**
    * Options to supply to the client intents.
    */
  var clients: js.UndefOr[IntentOpts] = js.undefined
}
object Bot {
  
  inline def apply(): Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bot] (val x: Self) extends AnyVal {
    
    inline def setBot(value: IntentOpts): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "bot", js.undefined)
    
    inline def setClients(value: IntentOpts): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
  }
}
