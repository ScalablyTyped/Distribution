package typings.highland

import typings.highland.Highland.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Highland_ {
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    /**
      * Used as an Error marker when writing to a Stream's incoming buffer
      */
    // TODO is this public?
    @JSGlobal("Highland.StreamError")
    @js.native
    class StreamError protected ()
      extends StObject
         with typings.highland.Highland.StreamError {
      def this(err: Error) = this()
      
      /* CompleteClass */
      var error: Error = js.native
    }
    
    /**
      * Used as a Redirect marker when writing to a Stream's incoming buffer
      */
    // TODO is this public?
    @JSGlobal("Highland.StreamRedirect")
    @js.native
    class StreamRedirect[R] protected ()
      extends StObject
         with typings.highland.Highland.StreamRedirect[R] {
      def this(to: Stream[R]) = this()
      
      /* CompleteClass */
      var to: Stream[R] = js.native
    }
  }
  
  @JSGlobal("highland")
  @js.native
  def highland: HighlandStatic = js.native
  inline def highland_=(x: HighlandStatic): Unit = js.Dynamic.global.updateDynamic("highland")(x.asInstanceOf[js.Any])
}
