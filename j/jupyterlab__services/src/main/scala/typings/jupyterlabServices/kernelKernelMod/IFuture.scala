package typings.jupyterlabServices.kernelKernelMod

import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IInputReply
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.IShellControlMessage
import typings.jupyterlabServices.messagesMod.IStdinMessage
import typings.jupyterlabServices.messagesMod.ReplyContent
import typings.jupyterlabServices.messagesMod.StdinMessageType
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFuture[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] extends IDisposable {
  
  /**
    * A promise that resolves when the future is done.
    *
    * #### Notes
    * The future is done when there are no more responses expected from the
    * kernel.
    *
    * The `done` promise resolves to the reply message.
    */
  val done: js.Promise[REPLY] = js.native
  
  /**
    * The original outgoing message.
    */
  val msg: REQUEST = js.native
  
  /**
    * The iopub handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit] = js.native
  
  /**
    * The reply handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved. If there is a reply message, the future
    * `done` promise also resolves to the reply message after this handler has
    * been called.
    */
  def onReply(msg: REPLY): Unit | js.Thenable[Unit] = js.native
  
  /**
    * The stdin handler for the kernel future.
    *
    * #### Notes
    * If the handler returns a promise, all kernel message processing pauses
    * until the promise is resolved.
    */
  def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit] = js.native
  
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
  def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
  
  /**
    * Remove a hook for IOPub messages.
    *
    * @param hook - The hook to remove.
    *
    * #### Notes
    * If a hook is removed during the hook processing, it will be deactivated immediately.
    */
  def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
  
  /**
    * Send an `input_reply` message.
    */
  def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
}
object IFuture {
  
  @scala.inline
  def apply[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */](
    dispose: () => Unit,
    done: js.Promise[REPLY],
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
  
  @scala.inline
  implicit class IFutureOps[Self <: IFuture[_, _], REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] (val x: Self with (IFuture[REQUEST, REPLY])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDone(value: js.Promise[REPLY]): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: REQUEST): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIOPub(value: IIOPubMessage[IOPubMessageType] => Unit | js.Thenable[Unit]): Self = this.set("onIOPub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReply(value: REPLY => Unit | js.Thenable[Unit]): Self = this.set("onReply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStdin(value: IStdinMessage[StdinMessageType] => Unit | js.Thenable[Unit]): Self = this.set("onStdin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterMessageHook(
      value: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit
    ): Self = this.set("registerMessageHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMessageHook(
      value: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]] => Unit
    ): Self = this.set("removeMessageHook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendInputReply(value: ReplyContent[IInputReply] => Unit): Self = this.set("sendInputReply", js.Any.fromFunction1(value))
  }
}
