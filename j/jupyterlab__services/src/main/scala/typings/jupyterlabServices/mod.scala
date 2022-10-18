package typings.jupyterlabServices

import typings.jupyterlabServices.anon.PartialISettings
import typings.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typings.jupyterlabServices.libConfigMod.ConfigSection.IOptions
import typings.jupyterlabServices.libConfigMod.IConfigSection
import typings.jupyterlabServices.libContentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelRestapiMod.IKernelOptions
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libSessionSessionMod.ISessionOptions
import typings.std.RequestInit
import typings.std.Response
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
  open class ConfigWithDefaults protected ()
    extends typings.jupyterlabServices.libConfigMod.ConfigWithDefaults {
    /**
      * Create a new config with defaults.
      */
    def this(options: typings.jupyterlabServices.libConfigMod.ConfigWithDefaults.IOptions) = this()
  }
  
  object Contents {
    
    @JSImport("@jupyterlab/services", "Contents")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates an ICheckpointModel, throwing an error if it does not pass.
      */
    inline def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCheckpointModel")(checkpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Validates an IModel, throwing an error if it does not pass.
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
  open class ContentsManager ()
    extends typings.jupyterlabServices.libContentsMod.ContentsManager {
    def this(options: typings.jupyterlabServices.libContentsMod.ContentsManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "Drive")
  @js.native
  /**
    * Construct a new contents manager object.
    *
    * @param options - The options used to initialize the object.
    */
  open class Drive ()
    extends typings.jupyterlabServices.libContentsMod.Drive {
    def this(options: typings.jupyterlabServices.libContentsMod.Drive.IOptions) = this()
  }
  
  object KernelAPI {
    
    @JSImport("@jupyterlab/services", "KernelAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services", "KernelAPI.KERNEL_SERVICE_URL")
    @js.native
    val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
    
    inline def getKernelModel(id: String): js.Promise[js.UndefOr[typings.jupyterlabServices.libKernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.jupyterlabServices.libKernelRestapiMod.IModel]]]
    inline def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[typings.jupyterlabServices.libKernelRestapiMod.IModel]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[typings.jupyterlabServices.libKernelRestapiMod.IModel]]]
    
    inline def interruptKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.libKernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libKernelRestapiMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.libKernelRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libKernelRestapiMod.IModel]]]
    
    inline def restartKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def shutdownKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel]]
    inline def startNew(options: Unit, settings: ISettings): js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel]]
    inline def startNew(options: IKernelOptions): js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel]]
    inline def startNew(options: IKernelOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libKernelRestapiMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "KernelConnection")
  @js.native
  open class KernelConnection protected ()
    extends typings.jupyterlabServices.libKernelMod.KernelConnection {
    /**
      * Construct a kernel object.
      */
    def this(options: typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "KernelManager")
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  open class KernelManager ()
    extends typings.jupyterlabServices.libKernelMod.KernelManager {
    def this(options: typings.jupyterlabServices.libKernelManagerMod.KernelManager.IOptions) = this()
  }
  
  object KernelMessage {
    
    @JSImport("@jupyterlab/services", "KernelMessage")
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
  open class KernelSpecManager ()
    extends typings.jupyterlabServices.libKernelspecMod.KernelSpecManager {
    def this(options: typings.jupyterlabServices.libKernelspecManagerMod.KernelSpecManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "NbConvertManager")
  @js.native
  /**
    * Create a new nbconvert manager.
    */
  open class NbConvertManager ()
    extends typings.jupyterlabServices.libNbconvertMod.NbConvertManager {
    def this(options: typings.jupyterlabServices.libNbconvertMod.NbConvertManager.IOptions) = this()
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
    open class NetworkError protected ()
      extends typings.jupyterlabServices.libServerconnectionMod.ServerConnection.NetworkError {
      /**
        * Create a new network error.
        */
      def this(original: js.TypeError) = this()
    }
    
    /**
      * A wrapped error for a fetch response.
      */
    @JSImport("@jupyterlab/services", "ServerConnection.ResponseError")
    @js.native
    open class ResponseError protected ()
      extends typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ResponseError {
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
      inline def create(response: Response): js.Promise[typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ResponseError] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ResponseError]]
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
  open class ServiceManager ()
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
    
    inline def getSessionModel(id: String): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
    inline def getSessionModel(id: String, settings: ISettings): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
    
    inline def getSessionUrl(baseUrl: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionUrl")(baseUrl.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.libSessionSessionMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libSessionSessionMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.libSessionSessionMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libSessionSessionMod.IModel]]]
    
    inline def shutdownSession(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startSession(options: ISessionOptions): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
    inline def startSession(options: ISessionOptions, settings: ISettings): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
    
    inline def updateSession(model: PickIModelidDeepPartialOm): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
    inline def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libSessionSessionMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "SessionManager")
  @js.native
  open class SessionManager protected ()
    extends typings.jupyterlabServices.libSessionMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: typings.jupyterlabServices.libSessionManagerMod.SessionManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "SettingManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  open class SettingManager ()
    extends typings.jupyterlabServices.libSettingMod.SettingManager {
    def this(options: typings.jupyterlabServices.libSettingMod.SettingManager.IOptions) = this()
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
    
    inline def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.libTerminalRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.libTerminalRestapiMod.IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]]
    
    inline def shutdownTerminal(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: Unit, name: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: Unit, name: String, cwd: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: Unit, name: Unit, cwd: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: ISettings): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: ISettings, name: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: ISettings, name: String, cwd: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
    inline def startNew(settings: ISettings, name: Unit, cwd: String): js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.jupyterlabServices.libTerminalRestapiMod.IModel]]
  }
  
  @JSImport("@jupyterlab/services", "TerminalManager")
  @js.native
  /**
    * Construct a new terminal manager.
    */
  open class TerminalManager ()
    extends typings.jupyterlabServices.libTerminalMod.TerminalManager {
    def this(options: typings.jupyterlabServices.libTerminalManagerMod.TerminalManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/services", "WorkspaceManager")
  @js.native
  /**
    * Create a new workspace manager.
    */
  open class WorkspaceManager ()
    extends typings.jupyterlabServices.libWorkspaceMod.WorkspaceManager {
    def this(options: typings.jupyterlabServices.libWorkspaceMod.WorkspaceManager.IOptions) = this()
  }
}
