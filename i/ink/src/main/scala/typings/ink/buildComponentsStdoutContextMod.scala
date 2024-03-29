package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsStdoutContextMod extends Shortcut {
  
  /**
    * `StdoutContext` is a React context, which exposes stdout stream, where Ink renders your app.
    */
  @JSImport("ink/build/components/StdoutContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Stdout stream passed to `render()` in `options.stdout` or `process.stdout` by default.
      */
    val stdout: WriteStream
    
    /**
      * Write any string to stdout, while preserving Ink's output.
      * It's useful when you want to display some external information outside of Ink's rendering and ensure there's no conflict between the two.
      * It's similar to `<Static>`, except it can't accept components, it only works with strings.
      */
    def write(data: String): Unit
  }
  object Props {
    
    inline def apply(stdout: WriteStream, write: String => Unit): Props = {
      val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsStdoutContextMod.foo` */
  override def _to: Context[Props] = default
}
