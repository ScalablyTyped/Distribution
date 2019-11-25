package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IInputReply
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IShellControlMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IStdinMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.ReplyContent
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.StdinMessageType
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Future interface for responses from the kernel.
  *
  * When a message is sent to a kernel, a Future is created to handle any
  * responses that may come from the kernel.
  */
trait IFuture[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] extends IDisposable {
  /**
    * A promise that resolves when the future is done.
    *
    * #### Notes
    * The future is done when there are no more responses expected from the
    * kernel.
    *
    * The `done` promise resolves to the reply message if there is one,
    * otherwise it resolves to `undefined`.
    */
  val done: js.Promise[js.UndefOr[REPLY]]
  /**
    * The original outgoing message.
    */
  val msg: REQUEST
  /**
    * The iopub handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit]
  /**
    * The reply handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved. If there is a reply message, the future
    * `done` promise also resolves to the reply message after this handler has
    * been called.
    */
  def onReply(msg: REPLY): Unit | js.Thenable[Unit]
  /**
    * The stdin handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit]
  /**
    * Register hook for IOPub messages.
    *
    * @param hook - The callback invoked for an IOPub message.
    *
    * #### Notes
    * The IOPub hook system allows you to preempt the handlers for IOPub
    * messages handled by the future.
    *
    * The most recently registered hook is run first. A hook can return a
    * boolean or a promise to a boolean, in which case all kernel message
    * processing pauses until the promise is fulfilled. If a hook return value
    * resolves to false, any later hooks will not run and the function will
    * return a promise resolving to false. If a hook throws an error, the error
    * is logged to the console and the next hook is run. If a hook is
    * registered during the hook processing, it will not run until the next
    * message. If a hook is removed during the hook processing, it will be
    * deactivated immediately.
    */
  def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
  /**
    * Remove a hook for IOPub messages.
    *
    * @param hook - The hook to remove.
    *
    * #### Notes
    * If a hook is removed during the hook processing, it will be deactivated immediately.
    */
  def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit
  /**
    * Send an `input_reply` message.
    */
  def sendInputReply(content: ReplyContent[IInputReply]): Unit
}

object IFuture {
  @scala.inline
  def apply[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */](
    dispose: () => Unit,
    done: js.Promise[js.UndefOr[REPLY]],
    isDisposed: Boolean,
    msg: REQUEST,
    onIOPub: IIOPubMessage[IOPubMessageType] => Unit | js.Thenable[Unit],
    onReply: REPLY => Unit | js.Thenable[Unit],
    onStdin: IStdinMessage[StdinMessageType] => Unit | js.Thenable[Unit],
    registerMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit,
    removeMessageHook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit,
    sendInputReply: ReplyContent[IInputReply] => Unit
  ): IFuture[REQUEST, REPLY] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), done = done.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], onIOPub = js.Any.fromFunction1(onIOPub), onReply = js.Any.fromFunction1(onReply), onStdin = js.Any.fromFunction1(onStdin), registerMessageHook = js.Any.fromFunction1(registerMessageHook), removeMessageHook = js.Any.fromFunction1(removeMessageHook), sendInputReply = js.Any.fromFunction1(sendInputReply))
  
    __obj.asInstanceOf[IFuture[REQUEST, REPLY]]
  }
}

