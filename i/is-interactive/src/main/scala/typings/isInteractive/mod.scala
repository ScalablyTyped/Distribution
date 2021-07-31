package typings.isInteractive

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Check if stdout or stderr is [interactive](https://unix.stackexchange.com/a/43389/7678).
  It checks that the stream is [TTY](https://jameshfisher.com/2017/12/09/what-is-a-tty/), not a dumb terminal, and not running in a CI.
  This can be useful to decide whether to present interactive UI or animations in the terminal.
  @example
  ```
  import isInteractive = require('is-interactive');
  isInteractive();
  //=> true
  ```
  */
  @scala.inline
  def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  @scala.inline
  def apply(options: Options): Boolean = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-interactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		The stream to check.
    		@default process.stdout
    		*/
    val stream: js.UndefOr[WritableStream] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
