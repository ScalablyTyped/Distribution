package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IPCMessage
import typings.ionic.definitionsMod.IonicContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("ionic/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sendMessage(hasConfigCtx: SendMessageDeps, msg: IPCMessage): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(hasConfigCtx.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait SendMessageDeps extends StObject {
    
    var config: IConfig
    
    var ctx: IonicContext
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
