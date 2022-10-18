package typings.maleptCrossSpawnPromise

import typings.node.childProcessMod.SpawnOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@malept/cross-spawn-promise/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@malept/cross-spawn-promise/dist/src", "CrossSpawnError")
  @js.native
  open class CrossSpawnError protected ()
    extends StObject
       with Error {
    def this(cmd: String, args: CrossSpawnArgs, originalError: js.Error, stderr: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalError: js.Error = js.native
  }
  
  @JSImport("@malept/cross-spawn-promise/dist/src", "ExitCodeError")
  @js.native
  open class ExitCodeError protected () extends ExitError {
    def this(cmd: String, args: CrossSpawnArgs, code: Double, stdout: String, stderr: String) = this()
    
    var code: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@malept/cross-spawn-promise/dist/src", "ExitError")
  @js.native
  open class ExitError protected ()
    extends StObject
       with Error {
    def this(cmd: String, args: CrossSpawnArgs, message: String, stdout: String, stderr: String) = this()
    
    var args: CrossSpawnArgs = js.native
    
    var cmd: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var stderr: String = js.native
    
    var stdout: String = js.native
  }
  
  @JSImport("@malept/cross-spawn-promise/dist/src", "ExitSignalError")
  @js.native
  open class ExitSignalError protected () extends ExitError {
    def this(cmd: String, args: CrossSpawnArgs, signal: String, stdout: String, stderr: String) = this()
    
    var signal: String = js.native
  }
  
  inline def spawn(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawn(cmd: String, args: Unit, options: CrossSpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(cmd: String, args: CrossSpawnArgs): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(cmd: String, args: CrossSpawnArgs, options: CrossSpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  type CrossSpawnArgs = js.UndefOr[js.Array[String]]
  
  trait CrossSpawnOptions
    extends StObject
       with SpawnOptions {
    
    /**
      * A `Function` such as `console.log` or `debug(name)` to log some information about the
      * spawned process.
      */
    var logger: js.UndefOr[LoggerFunction] = js.undefined
    
    /**
      * A callback which mutates the error before it is rethrown. Most commonly, this is used to
      * augment the error message of `ENOENT` errors to provide a more human-friendly message as to
      * how to install the missing executable.
      *
      * @param error - The error thrown from the `spawn` function
      * @param hasLogger - Whether `logger` was set
      */
    var updateErrorCallback: js.UndefOr[js.Function2[/* error */ js.Error, /* hasLogger */ Boolean, Unit]] = js.undefined
  }
  object CrossSpawnOptions {
    
    inline def apply(): CrossSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossSpawnOptions]
    }
    
    extension [Self <: CrossSpawnOptions](x: Self) {
      
      inline def setLogger(value: /* message */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setUpdateErrorCallback(value: (/* error */ js.Error, /* hasLogger */ Boolean) => Unit): Self = StObject.set(x, "updateErrorCallback", js.Any.fromFunction2(value))
      
      inline def setUpdateErrorCallbackUndefined: Self = StObject.set(x, "updateErrorCallback", js.undefined)
    }
  }
  
  type LoggerFunction = js.Function1[/* message */ String, Unit]
}
