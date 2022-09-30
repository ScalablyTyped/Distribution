package typings.ionicUtilsSubprocess

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.IOType
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStreamMod.Stream
import typings.node.nodeStrings.ipc
import typings.node.nodeUrlMod.URL
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.std.AbortSignal
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node.child_process.ForkOptions & std.Pick<node.child_process.SpawnOptions, 'stdio'> */
  trait ForkOptionsPickSpawnOptio extends StObject {
    
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    var detached: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var execPath: js.UndefOr[String] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * The signal value to be used when the spawned process will be killed by the abort signal.
      * @default 'SIGTERM'
      */
    var killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    /**
      * Specify the kind of serialization used for sending messages between processes.
      * @default 'json'
      */
    var serialization: js.UndefOr[SerializationType] = js.undefined
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var stdio: js.UndefOr[StdioOptions] = js.undefined
    
    /**
      * In milliseconds the maximum amount of time the process is allowed to run.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ForkOptionsPickSpawnOptio {
    
    inline def apply(): ForkOptionsPickSpawnOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkOptionsPickSpawnOptio]
    }
    
    extension [Self <: ForkOptionsPickSpawnOptio](x: Self) {
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  /* Inlined std.Promise<void> & {  p :node.child_process.ChildProcess} */
  @js.native
  trait PromisevoidpChildProcess extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    /* standard es5 */
    def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Unit | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    /* standard es2018.promise */
    def `finally`(): js.Promise[Unit] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    var p: ChildProcess = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    /* standard es5 */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  /* Inlined std.Readonly<node.child_process.SpawnOptions> */
  trait ReadonlySpawnOptions extends StObject {
    
    val argv0: js.UndefOr[String] = js.undefined
    
    val cwd: js.UndefOr[String | URL] = js.undefined
    
    val detached: js.UndefOr[Boolean] = js.undefined
    
    val env: js.UndefOr[ProcessEnv] = js.undefined
    
    val gid: js.UndefOr[Double] = js.undefined
    
    val killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    val serialization: js.UndefOr[SerializationType] = js.undefined
    
    val shell: js.UndefOr[Boolean | String] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val stdio: js.UndefOr[StdioOptions] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
    
    val uid: js.UndefOr[Double] = js.undefined
    
    val windowsHide: js.UndefOr[Boolean] = js.undefined
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlySpawnOptions {
    
    inline def apply(): ReadonlySpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySpawnOptions]
    }
    
    extension [Self <: ReadonlySpawnOptions](x: Self) {
      
      inline def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      inline def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
}
