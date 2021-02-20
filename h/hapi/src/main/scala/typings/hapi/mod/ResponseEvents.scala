package typings.hapi.mod

import typings.hapi.hapiStrings.finish
import typings.hapi.hapiStrings.peek
import typings.podium.mod.Podium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseEvents extends Podium {
  
  @JSName("on")
  def on_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("on")
  def on_peek(criteria: peek, listener: PeekListener): Unit = js.native
  
  @JSName("once")
  def once_finish(criteria: finish, listener: js.Function1[/* data */ js.UndefOr[scala.Nothing], Unit]): Unit = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("once")
  def once_peek(criteria: peek, listener: PeekListener): Unit = js.native
}
