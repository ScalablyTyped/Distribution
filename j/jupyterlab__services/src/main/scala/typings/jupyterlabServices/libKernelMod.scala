package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions
import typings.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelRestapiMod.IKernelOptions
import typings.jupyterlabServices.libKernelRestapiMod.IModel
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelMod {
  
  object KernelAPI {
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelAPI.KERNEL_SERVICE_URL")
    @js.native
    val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
    
    inline def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IModel]]]
    inline def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IModel]]]
    
    inline def interruptKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def listRunning(): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IModel]]]
    
    inline def restartKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def shutdownKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[IModel]]
    inline def startNew(options: Unit, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
    inline def startNew(options: IKernelOptions): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
    inline def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  }
  
  @JSImport("@jupyterlab/services/lib/kernel", "KernelConnection")
  @js.native
  open class KernelConnection protected ()
    extends typings.jupyterlabServices.libKernelDefaultMod.KernelConnection {
    /**
      * Construct a kernel object.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services/lib/kernel", "KernelManager")
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  open class KernelManager ()
    extends typings.jupyterlabServices.libKernelManagerMod.KernelManager {
    def this(options: typings.jupyterlabServices.libKernelManagerMod.KernelManager.IOptions) = this()
  }
  
  object KernelMessage {
    
    @JSImport("@jupyterlab/services/lib/kernel", "KernelMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessage[T /* <: IClearOutputMsg */](options: typings.jupyterlabServices.libKernelMessagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClearOutputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean]
    
    inline def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommCloseMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean]
    
    inline def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommMsgMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean]
    
    inline def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommOpenMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean]
    
    inline def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugEventMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean]
    
    inline def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean]
    
    inline def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebugRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean]
    
    inline def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean]
    
    inline def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean]
    
    inline def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteInputMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean]
    
    inline def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean]
    
    inline def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResultMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean]
    
    inline def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInfoRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean]
    
    inline def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputReplyMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean]
    
    inline def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputRequestMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean]
    
    inline def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatusMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean]
    
    inline def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStreamMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean]
    
    inline def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpdateDisplayDataMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean]
  }
}
