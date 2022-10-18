package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnvironmentMod {
  
  @JSImport("ionic/lib/environment", "Environment")
  @js.native
  open class Environment protected ()
    extends StObject
       with IonicEnvironment {
    def this(hasClientConfigFlagsGetInfoLogCtxPromptSessionShell: EnvironmentDeps) = this()
    
    /* CompleteClass */
    override val client: IClient = js.native
    
    /* CompleteClass */
    override val config: IConfig = js.native
    
    /* CompleteClass */
    override val ctx: IonicContext = js.native
    
    /* CompleteClass */
    override val flags: IonicEnvironmentFlags = js.native
    
    /* CompleteClass */
    override def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    
    /* CompleteClass */
    override val log: ILogger = js.native
    
    /* CompleteClass */
    override def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    /* CompleteClass */
    override def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    /* CompleteClass */
    override def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    /* CompleteClass */
    @JSName("prompt")
    override val prompt_Original: PromptModule = js.native
    
    /* CompleteClass */
    override val session: ISession = js.native
    
    /* CompleteClass */
    override val shell: IShell = js.native
  }
  
  trait EnvironmentDeps extends StObject {
    
    val client: IClient
    
    val config: IConfig
    
    val ctx: IonicContext
    
    val flags: IonicEnvironmentFlags
    
    def getInfo(): js.Promise[js.Array[InfoItem]]
    
    val log: ILogger
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox]
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm]
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther]
    @JSName("prompt")
    val prompt_Original: PromptModule
    
    val session: ISession
    
    val shell: IShell
  }
  object EnvironmentDeps {
    
    inline def apply(
      client: IClient,
      config: IConfig,
      ctx: IonicContext,
      flags: IonicEnvironmentFlags,
      getInfo: () => js.Promise[js.Array[InfoItem]],
      log: ILogger,
      prompt: PromptModule,
      session: ISession,
      shell: IShell
    ): EnvironmentDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), log = log.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentDeps]
    }
    
    extension [Self <: EnvironmentDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setGetInfo(value: () => js.Promise[js.Array[InfoItem]]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptModule): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
