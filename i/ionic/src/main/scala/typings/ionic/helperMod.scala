package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IPCMessage
import typings.ionic.definitionsMod.IonicContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("ionic/lib/helper", "sendMessage")
  @js.native
  def sendMessage(hasConfigCtx: SendMessageDeps, msg: IPCMessage): js.Promise[Unit] = js.native
  
  @js.native
  trait SendMessageDeps extends StObject {
    
    var config: IConfig = js.native
    
    var ctx: IonicContext = js.native
  }
  object SendMessageDeps {
    
    @scala.inline
    def apply(config: IConfig, ctx: IonicContext): SendMessageDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageDeps]
    }
    
    @scala.inline
    implicit class SendMessageDepsMutableBuilder[Self <: SendMessageDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    }
  }
}
