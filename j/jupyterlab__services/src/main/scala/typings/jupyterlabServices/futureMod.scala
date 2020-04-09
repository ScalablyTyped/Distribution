package typings.jupyterlabServices

import typings.jupyterlabServices.kernelKernelMod.IFuture
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.messagesMod.ControlMessageType
import typings.jupyterlabServices.messagesMod.IControlMessage
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IInputReply
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.IShellControlMessage
import typings.jupyterlabServices.messagesMod.IShellMessage
import typings.jupyterlabServices.messagesMod.IStdinMessage
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.ReplyContent
import typings.jupyterlabServices.messagesMod.ShellMessageType
import typings.jupyterlabServices.messagesMod.StdinMessageType
import typings.luminoDisposable.mod.DisposableDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/future", JSImport.Namespace)
@js.native
object futureMod extends js.Object {
  @js.native
  class KernelControlFutureHandler[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] () extends KernelFutureHandler[REQUEST, REPLY]
  
  @js.native
  abstract class KernelFutureHandler[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] protected ()
    extends DisposableDelegate
       with IFuture[REQUEST, REPLY] {
    /**
      * Construct a new KernelFutureHandler.
      */
    def this(
      cb: js.Function0[Unit],
      msg: REQUEST,
      expectReply: Boolean,
      disposeOnDone: Boolean,
      kernel: IKernelConnection
    ) = this()
    var _disposeOnDone: js.Any = js.native
    var _done: js.Any = js.native
    var _handleDone: js.Any = js.native
    var _handleIOPub: js.Any = js.native
    var _handleReply: js.Any = js.native
    var _handleStdin: js.Any = js.native
    var _hooks: js.Any = js.native
    var _iopub: js.Any = js.native
    var _kernel: js.Any = js.native
    var _msg: js.Any = js.native
    var _reply: js.Any = js.native
    var _replyMsg: js.Any = js.native
    /**
      * Set the given future flag.
      */
    var _setFlag: js.Any = js.native
    var _status: js.Any = js.native
    var _stdin: js.Any = js.native
    /**
      * Test whether the given future flag is set.
      */
    var _testFlag: js.Any = js.native
    /**
      * A promise that resolves when the future is done.
      *
      * #### Notes
      * The future is done when there are no more responses expected from the
      * kernel.
      *
      * The `done` promise resolves to the reply message.
      */
    /* CompleteClass */
    override val done: js.Promise[REPLY] = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * The original outgoing message.
      */
    /* CompleteClass */
    override val msg: REQUEST = js.native
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
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    /**
      * A promise that resolves when the future is done.
      */
    @JSName("done")
    def done_MKernelFutureHandler(): js.Promise[REPLY] = js.native
    /**
      * Handle an incoming kernel message.
      */
    def handleMsg(msg: IMessage[MessageType]): js.Promise[Unit] = js.native
    /**
      * Get the original outgoing message.
      */
    @JSName("msg")
    def msg_MKernelFutureHandler(): REQUEST = js.native
    /**
      * Get the iopub handler.
      */
    def onIOPub(): js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the iopub handler.
      */
    def onIOPub(cb: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | js.Thenable[Unit]]): Unit | js.Thenable[Unit] = js.native
    /**
      * The iopub handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    /* CompleteClass */
    override def onIOPub(msg: IIOPubMessage[IOPubMessageType]): Unit | js.Thenable[Unit] = js.native
    /**
      * Get the reply handler.
      */
    def onReply(): js.Function1[/* msg */ REPLY, Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the reply handler.
      */
    def onReply(cb: js.Function1[/* msg */ REPLY, Unit | js.Thenable[Unit]]): Unit | js.Thenable[Unit] = js.native
    /**
      * The reply handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved. If there is a reply message, the future
      * `done` promise also resolves to the reply message after this handler has
      * been called.
      */
    /* CompleteClass */
    override def onReply(msg: REPLY): Unit | js.Thenable[Unit] = js.native
    /**
      * Get the stdin handler.
      */
    def onStdin(): js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the stdin handler.
      */
    def onStdin(cb: js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | js.Thenable[Unit]]): Unit | js.Thenable[Unit] = js.native
    /**
      * The stdin handler for the kernel future.
      *
      * #### Notes
      * If the handler returns a promise, all kernel message processing pauses
      * until the promise is resolved.
      */
    /* CompleteClass */
    override def onStdin(msg: IStdinMessage[StdinMessageType]): Unit | js.Thenable[Unit] = js.native
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
    /* CompleteClass */
    override def registerMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
    /**
      * Remove a hook for IOPub messages.
      *
      * @param hook - The hook to remove.
      *
      * #### Notes
      * If a hook is removed during the hook processing, it will be deactivated immediately.
      */
    /* CompleteClass */
    override def removeMessageHook(hook: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Boolean | js.Thenable[Boolean]]): Unit = js.native
    /**
      * Send an `input_reply` message.
      */
    /* CompleteClass */
    override def sendInputReply(content: ReplyContent[IInputReply]): Unit = js.native
  }
  
  @js.native
  class KernelShellFutureHandler[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] () extends KernelFutureHandler[REQUEST, REPLY]
  
}

