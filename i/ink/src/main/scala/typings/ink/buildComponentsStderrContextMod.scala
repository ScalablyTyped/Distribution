package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsStderrContextMod extends Shortcut {
  
  /**
    * `StderrContext` is a React context, which exposes stderr stream.
    */
  @JSImport("ink/build/components/StderrContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Stderr stream passed to `render()` in `options.stderr` or `process.stderr` by default.
      */
    val stderr: WriteStream
    
    /**
      * Write any string to stderr, while preserving Ink's output.
      * It's useful when you want to display some external information outside of Ink's rendering and ensure there's no conflict between the two.
      * It's similar to `<Static>`, except it can't accept components, it only works with strings.
      */
    def write(data: String): Unit
  }
  object Props {
    
    inline def apply(stderr: WriteStream, write: String => Unit): Props = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsStderrContextMod.foo` */
  override def _to: Context[Props] = default
}
