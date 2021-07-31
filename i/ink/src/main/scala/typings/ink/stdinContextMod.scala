package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.ReadStream
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdinContextMod extends Shortcut {
  
  /**
    * `StdinContext` is a React context, which exposes input stream.
    */
  @JSImport("ink/build/components/StdinContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    val internal_exitOnCtrlC: Boolean
    
    /**
      * A boolean flag determining if the current `stdin` supports `setRawMode`. A component using `setRawMode` might want to use `isRawModeSupported` to nicely fall back in environments where raw mode is not supported.
      */
    val isRawModeSupported: Boolean
    
    /**
      * Ink exposes this function via own `<StdinContext>` to be able to handle Ctrl+C, that's why you should use Ink's `setRawMode` instead of `process.stdin.setRawMode`.
      * If the `stdin` stream passed to Ink does not support setRawMode, this function does nothing.
      */
    def setRawMode(value: Boolean): Unit
    
    /**
      * Stdin stream passed to `render()` in `options.stdin` or `process.stdin` by default. Useful if your app needs to handle user input.
      */
    val stdin: js.UndefOr[ReadStream] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(internal_exitOnCtrlC: Boolean, isRawModeSupported: Boolean, setRawMode: Boolean => Unit): Props = {
      val __obj = js.Dynamic.literal(internal_exitOnCtrlC = internal_exitOnCtrlC.asInstanceOf[js.Any], isRawModeSupported = isRawModeSupported.asInstanceOf[js.Any], setRawMode = js.Any.fromFunction1(setRawMode))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternal_exitOnCtrlC(value: Boolean): Self = StObject.set(x, "internal_exitOnCtrlC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRawModeSupported(value: Boolean): Self = StObject.set(x, "isRawModeSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRawMode(value: Boolean => Unit): Self = StObject.set(x, "setRawMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `stdinContextMod.foo` */
  override def _to: Context[Props] = default
}
