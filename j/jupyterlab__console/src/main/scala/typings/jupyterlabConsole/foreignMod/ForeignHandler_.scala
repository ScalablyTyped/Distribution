package typings.jupyterlabConsole.foreignMod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IOptions
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IReceiver
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console/lib/foreign", "ForeignHandler")
@js.native
class ForeignHandler_ protected () extends IDisposable {
  /**
    * Construct a new foreign message handler.
    */
  def this(options: IOptions) = this()
  
  var _enabled: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Create a new code cell for an input originated from a foreign session.
    */
  var _newCell: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  /**
    * Set whether the handler is able to inject foreign cells into a console.
    */
  def enabled: Boolean = js.native
  def enabled_=(value: Boolean): Unit = js.native
  
  /**
    * Test whether the handler is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MForeignHandler_ : Boolean = js.native
  
  /**
    * Handler IOPub messages.
    *
    * @returns `true` if the message resulted in a new cell injection or a
    * previously injected cell being updated and `false` for all other messages.
    */
  /* protected */ def onIOPubMessage(sender: ISessionContext, msg: IIOPubMessage[IOPubMessageType]): Boolean = js.native
  
  /**
    * The foreign handler's parent receiver.
    */
  def parent: IReceiver = js.native
  
  /**
    * The client session used by the foreign handler.
    */
  val sessionContext: ISessionContext = js.native
}
