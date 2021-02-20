package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod extends Shortcut {
  
  /**
    * Mount a component and render the output.
    */
  @JSImport("ink/build/render", JSImport.Default)
  @js.native
  val default: RenderFunction = js.native
  
  @js.native
  trait Instance extends StObject {
    
    def cleanup(): Unit = js.native
    
    /**
      * Clear output.
      */
    def clear(): Unit = js.native
    
    /**
      * Replace previous root node with a new one or update props of the current root node.
      */
    var rerender: js.Function1[/* node */ ReactNode, Unit] = js.native
    
    /**
      * Manually unmount the whole Ink app.
      */
    var unmount: js.Function1[/* error */ js.UndefOr[Error | Double | Null], Unit] = js.native
    
    /**
      * Returns a promise, which resolves when app is unmounted.
      */
    var waitUntilExit: js.Function0[js.Promise[Unit]] = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(
      cleanup: () => Unit,
      clear: () => Unit,
      rerender: /* node */ ReactNode => Unit,
      unmount: /* error */ js.UndefOr[Error | Double | Null] => Unit,
      waitUntilExit: () => js.Promise[Unit]
    ): Instance = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), clear = js.Any.fromFunction0(clear), rerender = js.Any.fromFunction1(rerender), unmount = js.Any.fromFunction1(unmount), waitUntilExit = js.Any.fromFunction0(waitUntilExit))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRerender(value: /* node */ ReactNode => Unit): Self = StObject.set(x, "rerender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnmount(value: /* error */ js.UndefOr[Error | Double | Null] => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWaitUntilExit(value: () => js.Promise[Unit]): Self = StObject.set(x, "waitUntilExit", js.Any.fromFunction0(value))
    }
  }
  
  type RenderFunction = js.Function2[
    /* tree */ ReactElement, 
    /* options */ js.UndefOr[WriteStream | RenderOptions], 
    Instance
  ]
  
  @js.native
  trait RenderOptions extends StObject {
    
    /**
      * If true, each update will be rendered as a separate output, without replacing the previous one.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Configure whether Ink should listen to Ctrl+C keyboard input and exit the app. This is needed in case `process.stdin` is in raw mode, because then Ctrl+C is ignored by default and process is expected to handle it manually.
      *
      * @default true
      */
    var exitOnCtrlC: js.UndefOr[Boolean] = js.native
    
    /**
      * Patch console methods to ensure console output doesn't mix with Ink output.
      *
      * @default true
      */
    var patchConsole: js.UndefOr[Boolean] = js.native
    
    /**
      * Error stream.
      * @default process.stderr
      */
    var stderr: js.UndefOr[WriteStream] = js.native
    
    /**
      * Input stream where app will listen for input.
      *
      * @default process.stdin
      */
    var stdin: js.UndefOr[ReadStream] = js.native
    
    /**
      * Output stream where app will be rendered.
      *
      * @default process.stdout
      */
    var stdout: js.UndefOr[WriteStream] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setExitOnCtrlC(value: Boolean): Self = StObject.set(x, "exitOnCtrlC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnCtrlCUndefined: Self = StObject.set(x, "exitOnCtrlC", js.undefined)
      
      @scala.inline
      def setPatchConsole(value: Boolean): Self = StObject.set(x, "patchConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchConsoleUndefined: Self = StObject.set(x, "patchConsole", js.undefined)
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  type _To = RenderFunction
  
  /* This means you don't have to write `default`, but can instead just say `renderMod.foo` */
  override def _to: RenderFunction = default
}
