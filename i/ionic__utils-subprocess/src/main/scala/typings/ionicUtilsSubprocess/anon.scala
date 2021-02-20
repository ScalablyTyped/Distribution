package typings.ionicUtilsSubprocess

import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SerializationType
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node.child_process.ForkOptions & std.Pick<node.child_process.SpawnOptions, 'stdio'> */
  @js.native
  trait ForkOptionsPickSpawnOptio extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var detached: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    var execArgv: js.UndefOr[js.Array[String]] = js.native
    
    var execPath: js.UndefOr[String] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    /**
      * Specify the kind of serialization used for sending messages between processes.
      * @default 'json'
      */
    var serialization: js.UndefOr[SerializationType] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var stdio: js.UndefOr[StdioOptions] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ForkOptionsPickSpawnOptio {
    
    @scala.inline
    def apply(): ForkOptionsPickSpawnOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForkOptionsPickSpawnOptio]
    }
    
    @scala.inline
    implicit class ForkOptionsPickSpawnOptioMutableBuilder[Self <: ForkOptionsPickSpawnOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
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
    def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Unit | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[Unit] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    var p: ChildProcess = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Unit, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  /* Inlined std.Readonly<node.child_process.SpawnOptions> */
  @js.native
  trait ReadonlySpawnOptions extends StObject {
    
    val argv0: js.UndefOr[String] = js.native
    
    val cwd: js.UndefOr[String] = js.native
    
    val detached: js.UndefOr[Boolean] = js.native
    
    val env: js.UndefOr[ProcessEnv] = js.native
    
    val gid: js.UndefOr[Double] = js.native
    
    val serialization: js.UndefOr[SerializationType] = js.native
    
    val shell: js.UndefOr[Boolean | String] = js.native
    
    val stdio: js.UndefOr[StdioOptions] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
    
    val uid: js.UndefOr[Double] = js.native
    
    val windowsHide: js.UndefOr[Boolean] = js.native
    
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object ReadonlySpawnOptions {
    
    @scala.inline
    def apply(): ReadonlySpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySpawnOptions]
    }
    
    @scala.inline
    implicit class ReadonlySpawnOptionsMutableBuilder[Self <: ReadonlySpawnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      @scala.inline
      def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
}
