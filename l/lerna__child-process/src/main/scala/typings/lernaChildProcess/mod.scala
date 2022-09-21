package typings.lernaChildProcess

import typings.execa.mod.ExecaChildProcess
import typings.execa.mod.ExecaError
import typings.execa.mod.Options
import typings.execa.mod.SyncOptions
import typings.lernaPackage.mod.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/child-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(command: String, args: js.Array[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  inline def exec(command: String, args: js.Array[String], opts: Options[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  
  inline def execSync(command: String, args: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof execa.sync * / any>['stdout'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof execa.sync * / any>['stdout'] */ js.Any]
  inline def execSync(command: String, args: js.Array[String], opts: SyncOptions[String]): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof execa.sync * / any>['stdout'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("execSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof execa.sync * / any>['stdout'] */ js.Any]
  
  inline def getChildProcessCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildProcessCount")().asInstanceOf[Double]
  
  inline def getExitCode(result: ExecaError[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getExitCode")(result.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def spawn(command: String, args: js.Array[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  inline def spawn(command: String, args: js.Array[String], opts: Options[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  
  inline def spawnStreaming(command: String, args: js.Array[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnStreaming")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  inline def spawnStreaming(command: String, args: js.Array[String], opts: Unit, prefix: String): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnStreaming")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  inline def spawnStreaming(command: String, args: js.Array[String], opts: Options[String]): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnStreaming")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  inline def spawnStreaming(command: String, args: js.Array[String], opts: Options[String], prefix: String): ExecutionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnStreaming")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[ExecutionResult]
  
  trait ExecOpts extends StObject {
    
    var cwd: String
    
    var maxBuffer: js.UndefOr[Double] = js.undefined
  }
  object ExecOpts {
    
    inline def apply(cwd: String): ExecOpts = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOpts]
    }
    
    extension [Self <: ExecOpts](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    }
  }
  
  trait ExecutionError
    extends StObject
       with ExecaError[String] {
    
    var pkg: js.UndefOr[Package] = js.undefined
  }
  object ExecutionError {
    
    inline def apply(
      command: String,
      escapedCommand: String,
      exitCode: Double,
      failed: Boolean,
      isCanceled: Boolean,
      killed: Boolean,
      message: String,
      name: String,
      shortMessage: String,
      stderr: String,
      stdout: String,
      timedOut: Boolean
    ): ExecutionError = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], escapedCommand = escapedCommand.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionError]
    }
    
    extension [Self <: ExecutionError](x: Self) {
      
      inline def setPkg(value: Package): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    }
  }
  
  @js.native
  trait ExecutionResult extends ExecaChildProcess[String] {
    
    var pkg: js.UndefOr[Package] = js.native
  }
}
