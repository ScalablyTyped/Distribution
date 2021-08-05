package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IShellSpawnOptions
import typings.ionicUtilsSubprocess.mod.Subprocess
import typings.ionicUtilsSubprocess.mod.SubprocessOptions
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shellMod {
  
  @JSImport("ionic/lib/shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/shell", "Shell")
  @js.native
  class Shell protected ()
    extends StObject
       with IShell {
    def this(e: ShellDeps) = this()
    def this(e: ShellDeps, options: ShellOptions) = this()
    
    def createSubprocess(command: String): js.Promise[Subprocess] = js.native
    def createSubprocess(command: String, args: Unit, options: SubprocessOptions): js.Promise[Subprocess] = js.native
    
    /* protected */ val e: ShellDeps = js.native
    
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
  
  inline def prependNodeModulesBinToPath(projectDir: String, p: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prependNodeModulesBinToPath")(projectDir.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ShellDeps extends StObject {
    
    val log: ILogger
  }
  object ShellDeps {
    
    inline def apply(log: ILogger): ShellDeps = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellDeps]
    }
    
    extension [Self <: ShellDeps](x: Self) {
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShellOptions extends StObject {
    
    val alterPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
  }
  object ShellOptions {
    
    inline def apply(): ShellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellOptions]
    }
    
    extension [Self <: ShellOptions](x: Self) {
      
      inline def setAlterPath(value: /* p */ String => String): Self = StObject.set(x, "alterPath", js.Any.fromFunction1(value))
      
      inline def setAlterPathUndefined: Self = StObject.set(x, "alterPath", js.undefined)
    }
  }
}
