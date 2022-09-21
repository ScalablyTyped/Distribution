package typings.ionicUtilsSubprocess

import typings.ionicUtilsSubprocess.anon.ForkOptionsPickSpawnOptio
import typings.ionicUtilsSubprocess.anon.PromisevoidpChildProcess
import typings.ionicUtilsSubprocess.anon.ReadonlySpawnOptions
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-subprocess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-subprocess", "ERROR_COMMAND_NOT_FOUND")
  @js.native
  val ERROR_COMMAND_NOT_FOUND: /* "ERR_SUBPROCESS_COMMAND_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "ERROR_NON_ZERO_EXIT")
  @js.native
  val ERROR_NON_ZERO_EXIT: /* "ERR_SUBPROCESS_NON_ZERO_EXIT" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "ERROR_SIGNAL_EXIT")
  @js.native
  val ERROR_SIGNAL_EXIT: /* "ERR_SUBPROCESS_SIGNAL_EXIT" */ String = js.native
  
  @JSImport("@ionic/utils-subprocess", "Subprocess")
  @js.native
  open class Subprocess protected () extends StObject {
    def this(name: String, args: js.Array[String]) = this()
    def this(name: String, args: js.Array[String], options: SubprocessOptions) = this()
    
    /* protected */ var _options: SpawnOptions = js.native
    
    var args: js.Array[String] = js.native
    
    def bashify(): String = js.native
    def bashify(hasMaskArgv0MaskArgv1ShiftArgv0: SubprocessBashifyOptions): String = js.native
    
    def bashifyArg(arg: String): String = js.native
    
    def combinedOutput(): js.Promise[String] = js.native
    
    def maskArg(arg: String): String = js.native
    
    var name: String = js.native
    
    def options: ReadonlySpawnOptions = js.native
    
    def output(): js.Promise[String] = js.native
    
    /* protected */ val path: js.UndefOr[String] = js.native
    
    def run(): PromisevoidpChildProcess = js.native
    
    def spawn(): ChildProcess = js.native
  }
  
  @JSImport("@ionic/utils-subprocess", "SubprocessError")
  @js.native
  open class SubprocessError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: js.UndefOr[/* "ERR_SUBPROCESS_COMMAND_NOT_FOUND" */ String] = js.native
    
    var error: js.UndefOr[js.Error] = js.native
    
    var exitCode: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var output: js.UndefOr[String] = js.native
    
    var signal: js.UndefOr[String] = js.native
    
    @JSName("stack")
    var stack_SubprocessError: String = js.native
  }
  
  @JSImport("@ionic/utils-subprocess", "TILDE_PATH_REGEX")
  @js.native
  val TILDE_PATH_REGEX: js.RegExp = js.native
  
  inline def convertPATH(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPATH")().asInstanceOf[String]
  inline def convertPATH(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPATH")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def expandTildePath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expandTildePath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findExecutables(program: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findExecutables")(program.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def findExecutables(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findExecutables")(program.asInstanceOf[js.Any], hasPATHPATHEXT.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def fork(modulePath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: js.Array[String], options: ForkOptionsPickSpawnOptio): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def fork(modulePath: String, args: Unit, options: ForkOptionsPickSpawnOptio): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def spawn(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def spawn(command: String, args: Unit, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def which(program: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("which")(program.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def which(program: String, hasPATHPATHEXT: WhichOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("which")(program.asInstanceOf[js.Any], hasPATHPATHEXT.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait SubprocessBashifyOptions extends StObject {
    
    /**
      * Mask file path to first argument.
      *
      * The first argument to subprocesses is the program name or path, e.g.
      * `/path/to/bin/my-program`. If `true`, `bashify()` will return the program
      * name without a file path, e.g. `my-program`.
      *
      * The default is `true`.
      */
    var maskArgv0: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mask file path to second argument.
      *
      * In some subprocesses, the second argument is a script file to run, e.g.
      * `node ./scripts/post-install`. If `true`, `bashify()` will return the
      * script name without a file path, e.g. `node post-install`.
      *
      * The default is `false`.
      */
    var maskArgv1: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove the first argument from output.
      *
      * Useful to make a command such as `node ./scripts/post-install` appear as
      * simply `post-install`.
      *
      * The default is `false`.
      */
    var shiftArgv0: js.UndefOr[Boolean] = js.undefined
  }
  object SubprocessBashifyOptions {
    
    inline def apply(): SubprocessBashifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubprocessBashifyOptions]
    }
    
    extension [Self <: SubprocessBashifyOptions](x: Self) {
      
      inline def setMaskArgv0(value: Boolean): Self = StObject.set(x, "maskArgv0", value.asInstanceOf[js.Any])
      
      inline def setMaskArgv0Undefined: Self = StObject.set(x, "maskArgv0", js.undefined)
      
      inline def setMaskArgv1(value: Boolean): Self = StObject.set(x, "maskArgv1", value.asInstanceOf[js.Any])
      
      inline def setMaskArgv1Undefined: Self = StObject.set(x, "maskArgv1", js.undefined)
      
      inline def setShiftArgv0(value: Boolean): Self = StObject.set(x, "shiftArgv0", value.asInstanceOf[js.Any])
      
      inline def setShiftArgv0Undefined: Self = StObject.set(x, "shiftArgv0", js.undefined)
    }
  }
  
  type SubprocessOptions = SpawnOptions
  
  trait WhichOptions extends StObject {
    
    var PATH: js.UndefOr[String] = js.undefined
    
    var PATHEXT: js.UndefOr[String] = js.undefined
  }
  object WhichOptions {
    
    inline def apply(): WhichOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhichOptions]
    }
    
    extension [Self <: WhichOptions](x: Self) {
      
      inline def setPATH(value: String): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      inline def setPATHEXT(value: String): Self = StObject.set(x, "PATHEXT", value.asInstanceOf[js.Any])
      
      inline def setPATHEXTUndefined: Self = StObject.set(x, "PATHEXT", js.undefined)
      
      inline def setPATHUndefined: Self = StObject.set(x, "PATH", js.undefined)
    }
  }
}
