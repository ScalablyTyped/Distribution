package typings
package atJupyterlabConsoleLib.libForeignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/foreign", "ForeignHandler")
@js.native
class ForeignHandler protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new foreign message handler.
    */
  def this(options: atJupyterlabConsoleLib.libForeignMod.ForeignHandlerNs.IOptions) = this()
  var _cells: js.Any = js.native
  var _enabled: js.Any = js.native
  var _factory: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Create a new code cell for an input originated from a foreign session.
    */
  var _newCell: js.Any = js.native
  var _parent: js.Any = js.native
  /**
    * Set whether the handler is able to inject foreign cells into a console.
    */
  var enabled: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The foreign handler's parent receiver.
    */
  val parent: atJupyterlabConsoleLib.libForeignMod.ForeignHandlerNs.IReceiver = js.native
  /**
    * The client session used by the foreign handler.
    */
  val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Handler IOPub messages.
    *
    * @returns `true` if the message resulted in a new cell injection or a
    * previously injected cell being updated and `false` for all other messages.
    */
  /* protected */ def onIOPubMessage(
    sender: atJupyterlabApputilsLib.libClientsessionMod.IClientSession,
    msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IIOPubMessage
  ): scala.Boolean = js.native
}

