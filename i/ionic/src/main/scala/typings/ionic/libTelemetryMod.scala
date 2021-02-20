package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.ITelemetry
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTelemetryMod {
  
  @JSImport("ionic/lib/telemetry", "Telemetry")
  @js.native
  class Telemetry protected () extends ITelemetry {
    def this(hasConfigClientGetInfoCtxProjectSession: TelemetryDeps) = this()
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
    
    val ctx: IonicContext = js.native
    
    /* protected */ def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    
    val project: js.UndefOr[IProject] = js.native
    
    val session: ISession = js.native
  }
  
  @JSImport("ionic/lib/telemetry", "sendCommand")
  @js.native
  def sendCommand(hasConfigClientGetInfoCtxSessionProject: TelemetryDeps, command: String, args: js.Array[String]): js.Promise[Unit] = js.native
  
  @js.native
  trait TelemetryDeps extends StObject {
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
    
    val ctx: IonicContext = js.native
    
    def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    
    val project: js.UndefOr[IProject] = js.native
    
    val session: ISession = js.native
  }
  object TelemetryDeps {
    
    @scala.inline
    def apply(
      client: IClient,
      config: IConfig,
      ctx: IonicContext,
      getInfo: () => js.Promise[js.Array[InfoItem]],
      session: ISession
    ): TelemetryDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryDeps]
    }
    
    @scala.inline
    implicit class TelemetryDepsMutableBuilder[Self <: TelemetryDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetInfo(value: () => js.Promise[js.Array[InfoItem]]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
