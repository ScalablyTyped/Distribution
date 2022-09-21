package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiStrings.disconnect
import typings.hapiHapi.hapiHapiStrings.finish
import typings.hapiHapi.hapiHapiStrings.peek
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Podium * / any */ @js.native
trait RequestEvents extends StObject {
  
  def on(criteria: finish | disconnect, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
  /**
    * Access: read only and the public podium interface.
    * The request.events supports the following events:
    * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
    * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
    * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
    */
  @JSName("on")
  def on_peek(criteria: peek, listener: PeekListener): this.type = js.native
  
  def once(criteria: finish | disconnect, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
  @JSName("once")
  def once_peek(criteria: peek): js.Promise[Parameters[PeekListener]] = js.native
  /**
    * Access: read only and the public podium interface.
    * The request.events supports the following events:
    * * 'peek' - emitted for each chunk of payload data read from the client connection. The event method signature is function(chunk, encoding).
    * * 'finish' - emitted when the request payload finished reading. The event method signature is function ().
    * * 'disconnect' - emitted when a request errors or aborts unexpectedly.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-requestevents)
    */
  @JSName("once")
  def once_peek(criteria: peek, listener: PeekListener): this.type = js.native
}
