package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.kernelKernelMod.IComm
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.kernelKernelMod.IShellFuture
import typings.jupyterlabServices.messagesMod.ICommCloseMsg
import typings.jupyterlabServices.messagesMod.ICommMsgMsg
import typings.jupyterlabServices.messagesMod.IShellMessage
import typings.jupyterlabServices.messagesMod.ShellMessageType
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoDisposable.mod.DisposableDelegate
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/comm", "CommHandler")
  @js.native
  class CommHandler protected ()
    extends DisposableDelegate
       with IComm {
    /**
      * Construct a new comm channel.
      */
    def this(target: String, id: String, kernel: IKernelConnection, disposeCb: js.Function0[Unit]) = this()
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _kernel: js.Any = js.native
    
    /* private */ var _onClose: js.Any = js.native
    
    /* private */ var _onMsg: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    def close(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONObject, metadata: Unit, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONObject, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The unique id for the comm channel.
      */
    @JSName("commId")
    def commId_MCommHandler: String = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Get the callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client.
      *
      * **See also:** [[ICommClose]], [[close]]
      */
    def onClose: js.Function1[/* msg */ ICommCloseMsg[iopub | shell], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client. If
      * the function returns a promise, and the kernel was closed from the server,
      * kernel message processing will pause until the returned promise is
      * fulfilled.
      *
      * **See also:** [[close]]
      */
    def onClose_=(cb: js.Function1[/* msg */ ICommCloseMsg[iopub | shell], Unit | js.Thenable[Unit]]): Unit = js.native
    
    /**
      * Get the callback for a comm message received event.
      */
    def onMsg: js.Function1[/* msg */ ICommMsgMsg[iopub | shell], Unit | js.Thenable[Unit]] = js.native
    /**
      * Set the callback for a comm message received event.
      *
      * #### Notes
      * This is called when a comm message is received. If the function returns a
      * promise, kernel message processing will pause until it is fulfilled.
      */
    def onMsg_=(cb: js.Function1[/* msg */ ICommMsgMsg[iopub | shell], Unit | js.Thenable[Unit]]): Unit = js.native
    
    def open(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject, metadata: Unit, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * Send a `comm_msg` message to the kernel.
      *
      * #### Notes
      * This is a no-op if the comm has been closed.
      *
      * **See also:** [[ICommMsg]]
      */
    def send(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: Unit, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: Unit,
      buffers: js.Array[ArrayBuffer | ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: Unit, buffers: Unit, disposeOnDone: Boolean): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject, buffers: js.Array[ArrayBuffer | ArrayBufferView]): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[ArrayBuffer | ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject, buffers: Unit, disposeOnDone: Boolean): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The target name for the comm channel.
      */
    @JSName("targetName")
    def targetName_MCommHandler: String = js.native
  }
}
