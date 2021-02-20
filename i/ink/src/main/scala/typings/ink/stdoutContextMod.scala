package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdoutContextMod extends Shortcut {
  
  /**
    * `StdoutContext` is a React context, which exposes stdout stream, where Ink renders your app.
    */
  @JSImport("ink/build/components/StdoutContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Stdout stream passed to `render()` in `options.stdout` or `process.stdout` by default.
      */
    val stdout: js.UndefOr[WriteStream] = js.native
    
    /**
      * Write any string to stdout, while preserving Ink's output.
      * It's useful when you want to display some external information outside of Ink's rendering and ensure there's no conflict between the two.
      * It's similar to `<Static>`, except it can't accept components, it only works with strings.
      */
    def write(data: String): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply(write: String => Unit): Props = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `stdoutContextMod.foo` */
  override def _to: Context[Props] = default
}
