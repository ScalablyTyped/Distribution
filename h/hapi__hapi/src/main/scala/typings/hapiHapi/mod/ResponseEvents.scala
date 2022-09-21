package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiStrings.finish
import typings.hapiHapi.hapiHapiStrings.peek
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Podium * / any */ @js.native
trait ResponseEvents extends StObject {
  
  @JSName("on")
  def on_finish(criteria: finish, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("on")
  def on_peek(criteria: peek, listener: PeekListener): this.type = js.native
  
  @JSName("once")
  def once_finish(criteria: finish, listener: js.Function1[/* data */ Unit, Unit]): this.type = js.native
  @JSName("once")
  def once_peek(criteria: peek): js.Promise[Parameters[PeekListener]] = js.native
  /**
    * 'peek' - emitted for each chunk of data written back to the client connection. The event method signature is function(chunk, encoding).
    * 'finish' - emitted when the response finished writing but before the client response connection is ended. The event method signature is function ().
    */
  @JSName("once")
  def once_peek(criteria: peek, listener: PeekListener): this.type = js.native
}
