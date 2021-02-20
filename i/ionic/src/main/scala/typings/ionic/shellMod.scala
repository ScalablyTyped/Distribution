package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IShellSpawnOptions
import typings.ionicUtilsSubprocess.mod.Subprocess
import typings.ionicUtilsSubprocess.mod.SubprocessOptions
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shellMod {
  
  @JSImport("ionic/lib/shell", "Shell")
  @js.native
  class Shell protected () extends IShell {
    def this(e: ShellDeps) = this()
    def this(e: ShellDeps, options: ShellOptions) = this()
    
    def createSubprocess(command: String): js.Promise[Subprocess] = js.native
    def createSubprocess(command: String, args: js.UndefOr[scala.Nothing], options: SubprocessOptions): js.Promise[Subprocess] = js.native
    
    val e: ShellDeps = js.native
    
    /* protected */ def prepareSpawnOptions(options: IShellSpawnOptions): Unit = js.native
    
    /**
      * When `child_process.spawn` isn't provided a full path to the command
      * binary, it behaves differently on Windows than other platforms. For
      * Windows, discover the full path to the binary, otherwise fallback to the
      * command provided.
      *
      * @see https://github.com/ionic-team/ionic-cli/issues/3563#issuecomment-425232005
      */
    def resolveCommandPath(command: String, options: SpawnOptions): js.Promise[String] = js.native
  }
  
  @JSImport("ionic/lib/shell", "prependNodeModulesBinToPath")
  @js.native
  def prependNodeModulesBinToPath(projectDir: String, p: String): String = js.native
  
  @js.native
  trait ShellDeps extends StObject {
    
    val log: ILogger = js.native
  }
  object ShellDeps {
    
    @scala.inline
    def apply(log: ILogger): ShellDeps = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellDeps]
    }
    
    @scala.inline
    implicit class ShellDepsMutableBuilder[Self <: ShellDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShellOptions extends StObject {
    
    val alterPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
  }
  object ShellOptions {
    
    @scala.inline
    def apply(): ShellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellOptions]
    }
    
    @scala.inline
    implicit class ShellOptionsMutableBuilder[Self <: ShellOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlterPath(value: /* p */ String => String): Self = StObject.set(x, "alterPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlterPathUndefined: Self = StObject.set(x, "alterPath", js.undefined)
    }
  }
}
