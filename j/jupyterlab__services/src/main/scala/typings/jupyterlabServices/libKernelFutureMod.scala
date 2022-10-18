package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelKernelMod.IFuture
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabServices.libKernelMessagesMod.ControlMessageType
import typings.jupyterlabServices.libKernelMessagesMod.IControlMessage
import typings.jupyterlabServices.libKernelMessagesMod.IIOPubMessage
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.jupyterlabServices.libKernelMessagesMod.IShellControlMessage
import typings.jupyterlabServices.libKernelMessagesMod.IShellMessage
import typings.jupyterlabServices.libKernelMessagesMod.IStdinMessage
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelMessagesMod.ShellMessageType
import typings.jupyterlabServices.libKernelMessagesMod.StdinMessageType
import typings.luminoDisposable.mod.DisposableDelegate
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelFutureMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/future", "KernelControlFutureHandler")
  @js.native
  open class KernelControlFutureHandler[REQUEST /* <: IControlMessage[ControlMessageType] */, REPLY /* <: IControlMessage[ControlMessageType] */] protected () extends KernelFutureHandler[REQUEST, REPLY] {
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
  }
  
  /* note: abstract class */ @JSImport("@jupyterlab/services/lib/kernel/future", "KernelFutureHandler")
  @js.native
  open class KernelFutureHandler[REQUEST /* <: IShellControlMessage */, REPLY /* <: IShellControlMessage */] protected ()
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
    
    /* private */ var _disposeOnDone: Any = js.native
    
    /* private */ var _done: Any = js.native
    
    /* private */ var _handleDone: Any = js.native
    
    /* private */ var _handleIOPub: Any = js.native
    
    /* private */ var _handleReply: Any = js.native
    
    /* private */ var _handleStdin: Any = js.native
    
    /* private */ var _hooks: Any = js.native
    
    /* private */ var _iopub: Any = js.native
    
    /* private */ var _kernel: Any = js.native
    
    /* private */ var _msg: Any = js.native
    
    /* private */ var _reply: Any = js.native
    
    /* private */ var _replyMsg: Any = js.native
    
    /**
      * Set the given future flag.
      */
    /* private */ var _setFlag: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    /* private */ var _stdin: Any = js.native
    
    /**
      * Test whether the given future flag is set.
      */
    /* private */ var _testFlag: Any = js.native
    
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
    def done_MKernelFutureHandler: js.Promise[REPLY] = js.native
    
    /**
      * Handle an incoming kernel message.
      */
    def handleMsg(msg: IMessage[MessageType]): js.Promise[Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Get the original outgoing message.
      */
    @JSName("msg")
    def msg_MKernelFutureHandler: REQUEST = js.native
    
    /**
      * Get the iopub handler.
      */
    def onIOPub: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | PromiseLike[Unit]] = js.native
    /**
      * Set the iopub handler.
      */
    def onIOPub_=(cb: js.Function1[/* msg */ IIOPubMessage[IOPubMessageType], Unit | PromiseLike[Unit]]): Unit = js.native
    
    /**
      * Get the reply handler.
      */
    def onReply: js.Function1[/* msg */ REPLY, Unit | PromiseLike[Unit]] = js.native
    /**
      * Set the reply handler.
      */
    def onReply_=(cb: js.Function1[/* msg */ REPLY, Unit | PromiseLike[Unit]]): Unit = js.native
    
    /**
      * Get the stdin handler.
      */
    def onStdin: js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | PromiseLike[Unit]] = js.native
    /**
      * Set the stdin handler.
      */
    def onStdin_=(cb: js.Function1[/* msg */ IStdinMessage[StdinMessageType], Unit | PromiseLike[Unit]]): Unit = js.native
  }
  
  @JSImport("@jupyterlab/services/lib/kernel/future", "KernelShellFutureHandler")
  @js.native
  open class KernelShellFutureHandler[REQUEST /* <: IShellMessage[ShellMessageType] */, REPLY /* <: IShellMessage[ShellMessageType] */] protected () extends KernelFutureHandler[REQUEST, REPLY] {
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
  }
}
