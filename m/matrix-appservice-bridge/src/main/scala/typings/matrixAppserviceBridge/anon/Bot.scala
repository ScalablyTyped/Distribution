package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.intentMod.IntentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bot extends StObject {
  
  /**
    * Options to supply to the bot intent.
    */
  var bot: js.UndefOr[IntentOpts] = js.native
  
  /**
    * Options to supply to the client intents.
    */
  var clients: js.UndefOr[IntentOpts] = js.native
}
object Bot {
  
  @scala.inline
  def apply(): Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bot]
  }
  
  @scala.inline
  implicit class BotMutableBuilder[Self <: Bot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot(value: IntentOpts): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotUndefined: Self = StObject.set(x, "bot", js.undefined)
    
    @scala.inline
    def setClients(value: IntentOpts): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
  }
}
