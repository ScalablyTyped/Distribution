package typings.highland.global

import typings.highland.Highland.Stream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Highland")
@js.native
object Highland_ extends js.Object {
  // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
  /**
    * Used as an Error marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  @js.native
  class StreamError protected ()
    extends typings.highland.Highland.StreamError {
    def this(err: Error) = this()
  }
  
  /**
    * Used as a Redirect marker when writing to a Stream's incoming buffer
    */
  // TODO is this public?
  @js.native
  class StreamRedirect[R] protected ()
    extends typings.highland.Highland.StreamRedirect[R] {
    def this(to: Stream[R]) = this()
  }
  
}

