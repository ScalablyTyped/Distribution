package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full interface of a kernel.
  */
@js.native
trait IKernel extends IKernelConnection {
  /**
    * A signal emitted when any kernel message is sent or received.
    *
    * #### Notes
    * This signal is emitted before any message handling has happened. The
    * message should be treated as read-only.
    */
  var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
  /**
    * A signal emitted after an iopub kernel message is handled.
    */
  var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
  /**
    * The server settings for the kernel.
    */
  val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
  /**
    * A signal emitted when the kernel status changes.
    */
  var statusChanged: ISignal[this.type, Status] = js.native
  /**
    * A signal emitted when the kernel is shut down.
    */
  var terminated: ISignal[this.type, Unit] = js.native
  /**
    * A signal emitted for unhandled non-iopub kernel messages that claimed to
    * be responses for messages we sent using this kernel object.
    */
  var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Shutdown a kernel.
    *
    * @returns A promise that resolves when the kernel has shut down.
    *
    * #### Notes
    * Uses the [Jupyter Notebook
    * API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
    *
    * On a valid response, closes the websocket, emits the [[terminated]]
    * signal, disposes of the kernel object, and fulfills the promise.
    *
    * The promise will be rejected if the kernel status is `'dead'`, the
    * request fails, or the response is invalid.
    */
  def shutdown(): js.Promise[Unit] = js.native
}

