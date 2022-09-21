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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTelemetryMod {
  
  @JSImport("ionic/lib/telemetry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/telemetry", "Telemetry")
  @js.native
  open class Telemetry protected ()
    extends StObject
       with ITelemetry {
    def this(hasConfigClientGetInfoCtxProjectSession: TelemetryDeps) = this()
    
    /* protected */ val client: IClient = js.native
    
    /* protected */ val config: IConfig = js.native
    
    /* protected */ val ctx: IonicContext = js.native
    
    /* protected */ def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    
    /* protected */ val project: js.UndefOr[IProject] = js.native
    
    /* CompleteClass */
    override def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit] = js.native
    
    /* protected */ val session: ISession = js.native
  }
  
  inline def sendCommand(hasConfigClientGetInfoCtxSessionProject: TelemetryDeps, command: String, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommand")(hasConfigClientGetInfoCtxSessionProject.asInstanceOf[js.Any], command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait TelemetryDeps extends StObject {
    
    val client: IClient
    
    val config: IConfig
    
    val ctx: IonicContext
    
    def getInfo(): js.Promise[js.Array[InfoItem]]
    
    val project: js.UndefOr[IProject] = js.undefined
    
    val session: ISession
  }
  object TelemetryDeps {
    
    inline def apply(
      client: IClient,
      config: IConfig,
      ctx: IonicContext,
      getInfo: () => js.Promise[js.Array[InfoItem]],
      session: ISession
    ): TelemetryDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryDeps]
    }
    
    extension [Self <: TelemetryDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setGetInfo(value: () => js.Promise[js.Array[InfoItem]]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
