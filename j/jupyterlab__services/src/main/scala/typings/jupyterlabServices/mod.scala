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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ConfigSection {
    
    /**
      * Create a config section.
      *
      * @returns A Promise that is fulfilled with the config section is loaded.
      */
    @JSImport("@jupyterlab/services", "ConfigSection.create")
    @js.native
    def create(options: IOptions): js.Promise[IConfigSection] = js.native
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
    
    /**
      * Validates an ICheckpointModel, thowing an error if it does not pass.
      */
    @JSImport("@jupyterlab/services", "Contents.validateCheckpointModel")
    @js.native
    def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = js.native
    
    /**
      * Validates an IModel, thowing an error if it does not pass.
      */
    @JSImport("@jupyterlab/services", "Contents.validateContentsModel")
    @js.native
    def validateContentsModel(contents: IModel): Unit = js.native
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
    
    @JSImport("@jupyterlab/services", "KernelAPI.KERNEL_SERVICE_URL")
    @js.native
    val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.getKernelModel")
    @js.native
    def getKernelModel(id: String): js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.getKernelModel")
    @js.native
    def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[typings.jupyterlabServices.kernelRestapiMod.IModel]] = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.interruptKernel")
    @js.native
    def interruptKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.interruptKernel")
    @js.native
    def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.kernelRestapiMod.IModel]] = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.restartKernel")
    @js.native
    def restartKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.restartKernel")
    @js.native
    def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.shutdownKernel")
    @js.native
    def shutdownKernel(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.shutdownKernel")
    @js.native
    def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.startNew")
    @js.native
    def startNew(): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.startNew")
    @js.native
    def startNew(options: js.UndefOr[scala.Nothing], settings: ISettings): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.startNew")
    @js.native
    def startNew(options: IKernelOptions): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "KernelAPI.startNew")
    @js.native
    def startNew(options: IKernelOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.kernelRestapiMod.IModel] = js.native
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
    
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage[T /* <: IStreamMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICommOpenMsgshell[T /* <: ICommOpenMsg[shell] */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    @JSImport("@jupyterlab/services", "KernelMessage.createMessage")
    @js.native
    def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: typings.jupyterlabServices.messagesMod.IOptions[T]): T = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isClearOutputMsg")
    @js.native
    def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IClearOutputMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isCommCloseMsg")
    @js.native
    def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isCommMsgMsg")
    @js.native
    def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isCommOpenMsg")
    @js.native
    def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isDebugEventMsg")
    @js.native
    def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugEventMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isDebugReplyMsg")
    @js.native
    def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isDebugRequestMsg")
    @js.native
    def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDebugRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isDisplayDataMsg")
    @js.native
    def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isErrorMsg")
    @js.native
    def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IErrorMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isExecuteInputMsg")
    @js.native
    def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteInputMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isExecuteReplyMsg")
    @js.native
    def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isExecuteResultMsg")
    @js.native
    def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IExecuteResultMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isInfoRequestMsg")
    @js.native
    def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInfoRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isInputReplyMsg")
    @js.native
    def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputReplyMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isInputRequestMsg")
    @js.native
    def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IInputRequestMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isStatusMsg")
    @js.native
    def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStatusMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isStreamMsg")
    @js.native
    def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IStreamMsg */ Boolean = js.native
    
    @JSImport("@jupyterlab/services", "KernelMessage.isUpdateDisplayDataMsg")
    @js.native
    def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IUpdateDisplayDataMsg */ Boolean = js.native
  }
  
  object KernelSpecAPI {
    
    @JSImport("@jupyterlab/services", "KernelSpecAPI.getSpecs")
    @js.native
    def getSpecs(): js.Promise[ISpecModels] = js.native
    @JSImport("@jupyterlab/services", "KernelSpecAPI.getSpecs")
    @js.native
    def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
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
      def this(response: Response, message: js.UndefOr[scala.Nothing], traceback: String) = this()
      def this(response: Response, message: String, traceback: String) = this()
    }
    object ResponseError {
      
      /**
        * Create a ResponseError from a response, handling the traceback and message
        * as appropriate.
        *
        * @param response The response object.
        *
        * @returns A promise that resolves with a `ResponseError` object.
        */
      /* static member */
      @JSImport("@jupyterlab/services", "ServerConnection.ResponseError.create")
      @js.native
      def create(response: Response): js.Promise[typings.jupyterlabServices.serverconnectionMod.ServerConnection.ResponseError] = js.native
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
    @JSImport("@jupyterlab/services", "ServerConnection.makeRequest")
    @js.native
    def makeRequest(url: String, init: RequestInit, settings: ISettings): js.Promise[Response] = js.native
    
    /**
      * Create a settings object given a subset of options.
      *
      * @param options - An optional partial set of options.
      *
      * @returns The full settings object.
      */
    @JSImport("@jupyterlab/services", "ServerConnection.makeSettings")
    @js.native
    def makeSettings(): ISettings = js.native
    @JSImport("@jupyterlab/services", "ServerConnection.makeSettings")
    @js.native
    def makeSettings(options: PartialISettings): ISettings = js.native
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
    
    @JSImport("@jupyterlab/services", "SessionAPI.SESSION_SERVICE_URL")
    @js.native
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.getSessionModel")
    @js.native
    def getSessionModel(id: String): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "SessionAPI.getSessionModel")
    @js.native
    def getSessionModel(id: String, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.getSessionUrl")
    @js.native
    def getSessionUrl(baseUrl: String, id: String): String = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]] = js.native
    @JSImport("@jupyterlab/services", "SessionAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.IModel]] = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.shutdownSession")
    @js.native
    def shutdownSession(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services", "SessionAPI.shutdownSession")
    @js.native
    def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.startSession")
    @js.native
    def startSession(options: ISessionOptions): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "SessionAPI.startSession")
    @js.native
    def startSession(options: ISessionOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    
    @JSImport("@jupyterlab/services", "SessionAPI.updateSession")
    @js.native
    def updateSession(model: PickIModelidDeepPartialOm): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "SessionAPI.updateSession")
    @js.native
    def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
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
    
    @JSImport("@jupyterlab/services", "Terminal.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  object TerminalAPI {
    
    @JSImport("@jupyterlab/services", "TerminalAPI.TERMINAL_SERVICE_URL")
    @js.native
    val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
    
    @JSImport("@jupyterlab/services", "TerminalAPI.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
    
    @JSImport("@jupyterlab/services", "TerminalAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]] = js.native
    @JSImport("@jupyterlab/services", "TerminalAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.terminalRestapiMod.IModel]] = js.native
    
    @JSImport("@jupyterlab/services", "TerminalAPI.shutdownTerminal")
    @js.native
    def shutdownTerminal(name: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services", "TerminalAPI.shutdownTerminal")
    @js.native
    def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services", "TerminalAPI.startNew")
    @js.native
    def startNew(): js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel] = js.native
    @JSImport("@jupyterlab/services", "TerminalAPI.startNew")
    @js.native
    def startNew(settings: ISettings): js.Promise[typings.jupyterlabServices.terminalRestapiMod.IModel] = js.native
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
