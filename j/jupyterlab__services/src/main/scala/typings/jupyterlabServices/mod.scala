package typings.jupyterlabServices

import typings.jupyterlabServices.anon.PartialISettings
import typings.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typings.jupyterlabServices.configMod.ConfigSection.IOptions
import typings.jupyterlabServices.configMod.IConfigSection
import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typings.jupyterlabServices.messagesMod.IClearOutputMsg
import typings.jupyterlabServices.messagesMod.ICommCloseMsg
import typings.jupyterlabServices.messagesMod.ICommInfoReplyMsg
import typings.jupyterlabServices.messagesMod.ICommInfoRequestMsg
import typings.jupyterlabServices.messagesMod.ICommMsgMsg
import typings.jupyterlabServices.messagesMod.ICommOpenMsg
import typings.jupyterlabServices.messagesMod.ICompleteReplyMsg
import typings.jupyterlabServices.messagesMod.ICompleteRequestMsg
import typings.jupyterlabServices.messagesMod.IDebugEventMsg
import typings.jupyterlabServices.messagesMod.IDebugReplyMsg
import typings.jupyterlabServices.messagesMod.IDebugRequestMsg
import typings.jupyterlabServices.messagesMod.IDisplayDataMsg
import typings.jupyterlabServices.messagesMod.IErrorMsg
import typings.jupyterlabServices.messagesMod.IExecuteInputMsg
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.jupyterlabServices.messagesMod.IExecuteRequestMsg
import typings.jupyterlabServices.messagesMod.IExecuteResultMsg
import typings.jupyterlabServices.messagesMod.IHistoryReplyMsg
import typings.jupyterlabServices.messagesMod.IHistoryRequestMsg
import typings.jupyterlabServices.messagesMod.IInfoReplyMsg
import typings.jupyterlabServices.messagesMod.IInfoRequestMsg
import typings.jupyterlabServices.messagesMod.IInputReplyMsg
import typings.jupyterlabServices.messagesMod.IInputRequestMsg
import typings.jupyterlabServices.messagesMod.IInspectReplyMsg
import typings.jupyterlabServices.messagesMod.IInspectRequestMsg
import typings.jupyterlabServices.messagesMod.IIsCompleteReplyMsg
import typings.jupyterlabServices.messagesMod.IIsCompleteRequestMsg
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IStatusMsg
import typings.jupyterlabServices.messagesMod.IStreamMsg
import typings.jupyterlabServices.messagesMod.IUpdateDisplayDataMsg
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.ISessionOptions
import typings.std.RequestInit
import typings.std.Response
import typings.std.TypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ConfigSection {
    
    @JSImport("@jupyterlab/services", "ConfigSection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a config section.
      *
      * @returns A Promise that is fulfilled with the config section is loaded.
      */
    inline def create(options: IOptions): js.Promise[IConfigSection] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IConfigSection]]
  }
  
  @JSImport("@jupyterlab/services", "ConfigWithDefaults")
  @js.native
  class ConfigWithDefaults protected ()
    extends typings.jupyterlabServices.configMod.ConfigWithDefaults {
    /**
      * Create a new config with defaults.
      */
    def this(options: typings.jupyterlabServices.configMod.ConfigWithDefaults.IOptions) = this()
  }
  
  object Contents {
    
    @JSImport("@jupyterlab/services", "Contents")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates an ICheckpointModel, thowing an error if it does not pass.
      */
    inline def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCheckpointModel")(checkpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Validates an IModel, thowing an error if it does not pass.
      */
    inline def validateContentsModel(contents: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateContentsModel")(contents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/services", "ContentsManager")
  @js.native
  /**
    * Construct a new contents manager object.
    *
    * @param options - The options used to initialize the object.
    */
  class ContentsManager ()
    extends typings.jupyterlabServices.contentsMod.ContentsManager {
    def this(options: typings.jupyterlabServices.contentsMod.ContentsManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "Drive")
  @js.native
  /**
    * Construct a new contents manager object.
    *
    * @param options - The options used to initialize the object.
    */
  class Drive ()
    extends typings.jupyterlabServices.contentsMod.Drive {
    def this(options: typings.jupyterlabServices.contentsMod.Drive.IOptions) = this()
  }
  
  object KernelAPI {
    
    @JSImport("@jupyterlab/services", "KernelAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.KERNEL_SERVICE_URL")
    @js.native
    val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
    
    inline def getKernelModel(id: String): js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]]]
    inline def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]]]
    
    inline def interruptKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]]]
    
    inline def restartKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def shutdownKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel]]
    inline def startNew(options: Unit, settings: ISettings): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel]]
    inline def startNew(options: IKernelOptions): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel]]
    inline def startNew(options: IKernelOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "KernelManager")
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelManager ()
    extends typings.jupyterlabServices.kernelMod.KernelManager {
    def this(options: typings.jupyterlabServices.kernelManagerMod.KernelManager.IOptions) = this()
  }
  
  object KernelMessage {
    
    @JSImport("@jupyterlab/services", "KernelMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessage[T /* <: IStreamMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(options.asInstanceOf[js.Any]).asInstanceOf[T]
    
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
  
  object KernelSpecAPI {
    
    @JSImport("@jupyterlab/services", "KernelSpecAPI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSpecs(): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")().asInstanceOf[js.Promise[ISpecModels]]
    inline def getSpecs(settings: ISettings): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISpecModels]]
  }
  
  @JSImport("@jupyterlab/services", "KernelSpecManager")
  @js.native
  /**
    * Construct a new kernel spec manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelSpecManager ()
    extends typings.jupyterlabServices.kernelspecMod.KernelSpecManager {
    def this(options: typings.jupyterlabServices.managerMod.KernelSpecManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "NbConvertManager")
  @js.native
  /**
    * Create a new nbconvert manager.
    */
  class NbConvertManager ()
    extends typings.jupyterlabServices.nbconvertMod.NbConvertManager {
    def this(options: typings.jupyterlabServices.nbconvertMod.NbConvertManager.IOptions) = this()
  }
  
  object ServerConnection {
    
    @JSImport("@jupyterlab/services", "ServerConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A wrapped error for a network error.
      */
    @JSImport("@jupyterlab/services", "ServerConnection.NetworkError")
    @js.native
    class NetworkError protected ()
      extends typings.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError {
      /**
        * Create a new network error.
        */
      def this(original: TypeError) = this()
    }
    
    /**
      * A wrapped error for a fetch response.
      */
    @JSImport("@jupyterlab/services", "ServerConnection.ResponseError")
    @js.native
    class ResponseError protected ()
      extends typings.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError {
      /**
        * Create a new response error.
        */
      def this(response: Response) = this()
      def this(response: Response, message: String) = this()
      def this(response: Response, message: String, traceback: String) = this()
      def this(response: Response, message: Unit, traceback: String) = this()
    }
    object ResponseError {
      
      @JSImport("@jupyterlab/services", "ServerConnection.ResponseError")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Create a ResponseError from a response, handling the traceback and message
        * as appropriate.
        *
        * @param response The response object.
        *
        * @returns A promise that resolves with a `ResponseError` object.
        */
      /* static member */
      inline def create(response: Response): js.Promise[typings.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError]]
    }
    
    /**
      * Make an request to the notebook server.
      *
      * @param url - The url for the request.
      *
      * @param init - The initialization options for the request.
      *
      * @param settings - The server settings to apply to the request.
      *
      * @returns a Promise that resolves with the response.
      *
      * @throws If the url of the request is not a notebook server url.
      *
      * #### Notes
      * The `url` must start with `settings.baseUrl`.  The `init` settings are
      * merged with `settings.init`, with `init` taking precedence.
      * The headers in the two objects are not merged.
      * If there is no body data, we set the content type to `application/json`
      * because it is required by the Notebook server.
      */
    inline def makeRequest(url: String, init: RequestInit, settings: ISettings): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    /**
      * Create a settings object given a subset of options.
      *
      * @param options - An optional partial set of options.
      *
      * @returns The full settings object.
      */
    inline def makeSettings(): ISettings = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSettings")().asInstanceOf[ISettings]
    inline def makeSettings(options: PartialISettings): ISettings = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSettings")(options.asInstanceOf[js.Any]).asInstanceOf[ISettings]
  }
  
  @JSImport("@jupyterlab/services", "ServiceManager")
  @js.native
  /**
    * Construct a new services provider.
    */
  class ServiceManager ()
    extends typings.jupyterlabServices.libManagerMod.ServiceManager {
    def this(options: typings.jupyterlabServices.libManagerMod.ServiceManager.IOptions) = this()
  }
  
  object SessionAPI {
    
    @JSImport("@jupyterlab/services", "SessionAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.SESSION_SERVICE_URL")
    @js.native
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    
    inline def getSessionModel(id: String): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
    inline def getSessionModel(id: String, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
    
    inline def getSessionUrl(baseUrl: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionUrl")(baseUrl.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]]]
    
    inline def shutdownSession(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startSession(options: ISessionOptions): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
    inline def startSession(options: ISessionOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
    
    inline def updateSession(model: PickIModelidDeepPartialOm): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
    inline def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "SessionManager")
  @js.native
  class SessionManager protected ()
    extends typings.jupyterlabServices.sessionMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: typings.jupyterlabServices.sessionManagerMod.SessionManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "SettingManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  class SettingManager ()
    extends typings.jupyterlabServices.settingMod.SettingManager {
    def this(options: typings.jupyterlabServices.settingMod.SettingManager.IOptions) = this()
  }
  
  object Terminal {
    
    @JSImport("@jupyterlab/services", "Terminal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  object TerminalAPI {
    
    @JSImport("@jupyterlab/services", "TerminalAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services", "TerminalAPI.TERMINAL_SERVICE_URL")
    @js.native
    val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]]]
    
    inline def shutdownTerminal(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel]]
    inline def startNew(settings: ISettings): js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "TerminalManager")
  @js.native
  /**
    * Construct a new terminal manager.
    */
  class TerminalManager ()
    extends typings.jupyterlabServices.terminalMod.TerminalManager {
    def this(options: typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "WorkspaceManager")
  @js.native
  /**
    * Create a new workspace manager.
    */
  class WorkspaceManager ()
    extends typings.jupyterlabServices.workspaceMod.WorkspaceManager {
    def this(options: typings.jupyterlabServices.workspaceMod.WorkspaceManager.IOptions) = this()
  }
}
