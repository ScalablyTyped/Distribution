package typings.ink

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inkMod {
  
  @JSImport("ink/build/ink", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Ink {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Ink extends StObject {
    
    def clear(): Unit = js.native
    
    val container: js.Any = js.native
    
    var exitPromise: js.Any = js.native
    
    var fullStaticOutput: js.Any = js.native
    
    var isUnmounted: js.Any = js.native
    
    var lastOutput: js.Any = js.native
    
    val log: js.Any = js.native
    
    def onRender(): Unit = js.native
    
    val options: js.Any = js.native
    
    def patchConsole(): Unit = js.native
    
    def rejectExitPromise(): Unit = js.native
    def rejectExitPromise(reason: Error): Unit = js.native
    
    def render(node: ReactNode): Unit = js.native
    
    def resolveExitPromise(): Unit = js.native
    
    var restoreConsole: js.Any = js.native
    
    val rootNode: js.Any = js.native
    
    val throttledLog: js.Any = js.native
    
    def unmount(): Unit = js.native
    def unmount(error: Double): Unit = js.native
    def unmount(error: Error): Unit = js.native
    
    def unsubscribeExit(): Unit = js.native
    
    val unsubscribeResize: js.Any = js.native
    
    def waitUntilExit(): js.Promise[Unit] = js.native
    
    def writeToStderr(data: String): Unit = js.native
    
    def writeToStdout(data: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var debug: Boolean
    
    var exitOnCtrlC: Boolean
    
    var patchConsole: Boolean
    
    var stderr: WriteStream
    
    var stdin: ReadStream
    
    var stdout: WriteStream
    
    var waitUntilExit: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(
      debug: Boolean,
      exitOnCtrlC: Boolean,
      patchConsole: Boolean,
      stderr: WriteStream,
      stdin: ReadStream,
      stdout: WriteStream
    ): Options = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], patchConsole = patchConsole.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnCtrlC(value: Boolean): Self = StObject.set(x, "exitOnCtrlC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchConsole(value: Boolean): Self = StObject.set(x, "patchConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitUntilExit(value: () => js.Promise[Unit]): Self = StObject.set(x, "waitUntilExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWaitUntilExitUndefined: Self = StObject.set(x, "waitUntilExit", js.undefined)
    }
  }
}
