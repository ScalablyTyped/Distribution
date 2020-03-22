package typings.jupyterlabConsole.foreignMod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IOptions
import typings.jupyterlabConsole.foreignMod.ForeignHandler.IReceiver
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The client session used by the foreign handler.
    */
  val sessionContext: ISessionContext = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Set whether the handler is able to inject foreign cells into a console.
    */
  def enabled(): Boolean = js.native
  def enabled(value: Boolean): js.Any = js.native
  /**
    * Test whether the handler is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MForeignHandler_(): Boolean = js.native
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
  def parent(): IReceiver = js.native
}

