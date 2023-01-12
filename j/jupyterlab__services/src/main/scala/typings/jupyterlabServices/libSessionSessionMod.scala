package typings.jupyterlabServices

import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabServices.anon.OmitIOptionsconnectToKern
import typings.jupyterlabServices.anon.OmitIOptionsmodelconnectT
import typings.jupyterlabServices.anon.OmitIOptionsmodelusername
import typings.jupyterlabServices.anon.PartialIModelConnections
import typings.jupyterlabServices.anon.PartialPickIModelname
import typings.jupyterlabServices.jupyterlabServicesStrings.`type`
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel
import typings.jupyterlabServices.jupyterlabServicesStrings.name
import typings.jupyterlabServices.jupyterlabServicesStrings.path
import typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.libKernelKernelMod.IAnyMessageArgs
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabServices.libKernelMessagesMod.IIOPubMessage
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelMessagesMod.Status
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.mod.ServerConnection.NetworkError
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionSessionMod {
  
  @js.native
  trait IManager
    extends StObject
       with IDisposable {
    
    /**
      * Connect to a running session.
      *
      * @param model - The model of the target session.
      *
      * @param options - The session options to use.
      *
      * @returns The new session instance.
      */
    def connectTo(options: OmitIOptionsconnectToKern): ISessionConnection = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    var connectionFailure: ISignal[IManager, NetworkError] = js.native
    
    /**
      * Find a session by id.
      *
      * @param id - The id of the target session.
      *
      * @returns A promise that resolves with the session's model.
      */
    def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Find a session by path.
      *
      * @param path - The path of the target session.
      *
      * @returns A promise that resolves with the session's model.
      */
    def findByPath(path: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Test whether the manager is ready.
      */
    val isReady: Boolean = js.native
    
    /**
      * A promise that is fulfilled when the manager is ready.
      */
    val ready: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the running sessions.
      *
      * @returns A promise that resolves when the models are refreshed.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the known running sessions.
      *
      * @returns A new iterator over the running sessions.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running sessions change.
      */
    var runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
    
    /**
      * The server settings for the manager.
      */
    var serverSettings: js.UndefOr[ISettings] = js.native
    
    /**
      * Shut down a session by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Start a new session.
      *
      * @param createOptions - Options for creating the session
      *
      * @param connectOptions - Options for connecting to the session
      *
      * @returns A promise that resolves with a session connection instance.
      *
      * #### Notes
      * The `serverSettings` and `connectToKernel` options of the manager will be used.
      */
    def startNew(createOptions: ISessionOptions): js.Promise[ISessionConnection] = js.native
    def startNew(createOptions: ISessionOptions, connectOptions: OmitIOptionsmodelconnectT): js.Promise[ISessionConnection] = js.native
    
    /**
      * Find a session associated with a path and stop it is the only session
      * using that kernel.
      *
      * @param path - The path in question.
      *
      * @returns A promise that resolves when the relevant sessions are stopped.
      */
    def stopIfNeeded(path: String): js.Promise[Unit] = js.native
  }
  
  trait IModel extends StObject {
    
    /**
      * The unique identifier for the session client.
      */
    val id: String
    
    val kernel: typings.jupyterlabServices.libKernelRestapiMod.IModel | Null
    
    val name: String
    
    val path: String
    
    val `type`: String
  }
  object IModel {
    
    inline def apply(id: String, name: String, path: String, `type`: String): IModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], kernel = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKernel(value: typings.jupyterlabServices.libKernelRestapiMod.IModel): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelNull: Self = StObject.set(x, "kernel", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISessionConnection
    extends StObject
       with IObservableDisposable {
    
    /**
      * The kernel anyMessage signal, proxied from the current kernel.
      */
    var anyMessage: ISignal[this.type, IAnyMessageArgs]
    
    /**
      * Change the kernel.
      *
      * @param options - The name or id of the new kernel.
      *
      * @returns A promise that resolves with the new kernel model.
      *
      * #### Notes
      * This shuts down the existing kernel and creates a new kernel, keeping
      * the existing session ID and path. The session assumes it owns the
      * kernel.
      *
      * To start now kernel, pass an empty dictionary.
      */
    def changeKernel(options: PartialIModelConnections): js.Promise[IKernelConnection | Null]
    
    /**
      * The kernel connectionStatusChanged signal, proxied from the current
      * kernel.
      */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus]
    
    /**
      * Unique id of the session.
      */
    val id: String
    
    /**
      * The kernel iopubMessage signal, proxied from the current kernel.
      */
    var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]]
    
    /**
      * The kernel.
      *
      * #### Notes
      * This is a read-only property, and can be altered by [changeKernel].
      *
      * A number of kernel signals are proxied through the session from
      * whatever the current kernel is for convenience.
      */
    val kernel: IKernelConnection | Null
    
    /**
      * A signal emitted when the kernel changes.
      */
    var kernelChanged: ISignal[
        this.type, 
        IChangedArgs[
          IKernelConnection | Null, 
          IKernelConnection | Null, 
          typings.jupyterlabServices.jupyterlabServicesStrings.kernel
        ]
      ]
    
    /**
      * The model associated with the session.
      */
    val model: IModel
    
    /**
      * The current name associated with the session.
      */
    val name: String
    
    /**
      * The current path associated with the session.
      */
    val path: String
    
    /**
      * The kernel pendingInput signal, proxied from the current
      * kernel.
      */
    var pendingInput: ISignal[this.type, Boolean]
    
    /**
      * A signal emitted when a session property changes.
      */
    val propertyChanged: ISignal[
        this.type, 
        typings.jupyterlabServices.jupyterlabServicesStrings.path | typings.jupyterlabServices.jupyterlabServicesStrings.name | typings.jupyterlabServices.jupyterlabServicesStrings.`type`
      ]
    
    /**
      * The server settings of the session.
      */
    val serverSettings: ISettings
    
    /**
      * Change the session name.
      *
      * @returns A promise that resolves when the session has renamed.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def setName(name: String): js.Promise[Unit]
    
    /**
      * Change the session path.
      *
      * @param path - The new session path.
      *
      * @returns A promise that resolves when the session has renamed.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def setPath(path: String): js.Promise[Unit]
    
    /**
      * Change the session type.
      *
      * @returns A promise that resolves when the session has renamed.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def setType(`type`: String): js.Promise[Unit]
    
    /**
      * Kill the kernel and shutdown the session.
      *
      * @returns A promise that resolves when the session is shut down.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def shutdown(): js.Promise[Unit]
    
    /**
      * The kernel statusChanged signal, proxied from the current kernel.
      */
    var statusChanged: ISignal[this.type, Status]
    
    /**
      * The type of the session.
      */
    val `type`: String
    
    /**
      * The kernel unhandledMessage signal, proxied from the current kernel.
      */
    var unhandledMessage: ISignal[this.type, IMessage[MessageType]]
  }
  object ISessionConnection {
    
    inline def apply(
      anyMessage: ISignal[ISessionConnection, IAnyMessageArgs],
      changeKernel: PartialIModelConnections => js.Promise[IKernelConnection | Null],
      connectionStatusChanged: ISignal[ISessionConnection, ConnectionStatus],
      dispose: () => Unit,
      disposed: ISignal[ISessionConnection, Unit],
      id: String,
      iopubMessage: ISignal[ISessionConnection, IIOPubMessage[IOPubMessageType]],
      isDisposed: Boolean,
      kernelChanged: ISignal[
          ISessionConnection, 
          IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
        ],
      model: IModel,
      name: String,
      path: String,
      pendingInput: ISignal[ISessionConnection, Boolean],
      propertyChanged: ISignal[ISessionConnection, path | name | `type`],
      serverSettings: ISettings,
      setName: String => js.Promise[Unit],
      setPath: String => js.Promise[Unit],
      setType: String => js.Promise[Unit],
      shutdown: () => js.Promise[Unit],
      statusChanged: ISignal[ISessionConnection, Status],
      `type`: String,
      unhandledMessage: ISignal[ISessionConnection, IMessage[MessageType]]
    ): ISessionConnection = {
      val __obj = js.Dynamic.literal(anyMessage = anyMessage.asInstanceOf[js.Any], changeKernel = js.Any.fromFunction1(changeKernel), connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iopubMessage = iopubMessage.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kernelChanged = kernelChanged.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pendingInput = pendingInput.asInstanceOf[js.Any], propertyChanged = propertyChanged.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), statusChanged = statusChanged.asInstanceOf[js.Any], unhandledMessage = unhandledMessage.asInstanceOf[js.Any], kernel = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISessionConnection]
    }
    
    /**
      * An arguments object for the kernel changed signal.
      */
    type IKernelChangedArgs = IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
    
    /**
      * The session initialization options.
      */
    trait IOptions extends StObject {
      
      /**
        * The unique identifier for the session client.
        */
      var clientId: js.UndefOr[String] = js.undefined
      
      /**
        * Connects to an existing kernel
        */
      def connectToKernel(options: typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions): IKernelConnection
      
      /**
        * Kernel connection options
        */
      var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
      
      /**
        * Session model.
        */
      var model: IModel
      
      /**
        * The server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
      
      /**
        * The username of the session client.
        */
      var username: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        connectToKernel: typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions => IKernelConnection,
        model: IModel
      ): IOptions = {
        val __obj = js.Dynamic.literal(connectToKernel = js.Any.fromFunction1(connectToKernel), model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
        
        inline def setConnectToKernel(
          value: typings.jupyterlabServices.libKernelKernelMod.IKernelConnection.IOptions => IKernelConnection
        ): Self = StObject.set(x, "connectToKernel", js.Any.fromFunction1(value))
        
        inline def setKernelConnectionOptions(value: OmitIOptionsmodelusername): Self = StObject.set(x, "kernelConnectionOptions", value.asInstanceOf[js.Any])
        
        inline def setKernelConnectionOptionsUndefined: Self = StObject.set(x, "kernelConnectionOptions", js.undefined)
        
        inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISessionConnection] (val x: Self) extends AnyVal {
      
      inline def setAnyMessage(value: ISignal[ISessionConnection, IAnyMessageArgs]): Self = StObject.set(x, "anyMessage", value.asInstanceOf[js.Any])
      
      inline def setChangeKernel(value: PartialIModelConnections => js.Promise[IKernelConnection | Null]): Self = StObject.set(x, "changeKernel", js.Any.fromFunction1(value))
      
      inline def setConnectionStatusChanged(value: ISignal[ISessionConnection, ConnectionStatus]): Self = StObject.set(x, "connectionStatusChanged", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIopubMessage(value: ISignal[ISessionConnection, IIOPubMessage[IOPubMessageType]]): Self = StObject.set(x, "iopubMessage", value.asInstanceOf[js.Any])
      
      inline def setKernel(value: IKernelConnection): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelChanged(
        value: ISignal[
              ISessionConnection, 
              IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
            ]
      ): Self = StObject.set(x, "kernelChanged", value.asInstanceOf[js.Any])
      
      inline def setKernelNull: Self = StObject.set(x, "kernel", null)
      
      inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPendingInput(value: ISignal[ISessionConnection, Boolean]): Self = StObject.set(x, "pendingInput", value.asInstanceOf[js.Any])
      
      inline def setPropertyChanged(value: ISignal[ISessionConnection, path | name | `type`]): Self = StObject.set(x, "propertyChanged", value.asInstanceOf[js.Any])
      
      inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      inline def setSetName(value: String => js.Promise[Unit]): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetPath(value: String => js.Promise[Unit]): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
      
      inline def setSetType(value: String => js.Promise[Unit]): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: () => js.Promise[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
      
      inline def setStatusChanged(value: ISignal[ISessionConnection, Status]): Self = StObject.set(x, "statusChanged", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnhandledMessage(value: ISignal[ISessionConnection, IMessage[MessageType]]): Self = StObject.set(x, "unhandledMessage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session/session.IModel, 'path' | 'type' | 'name'> & {  kernel :std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>> | undefined} */
  trait ISessionOptions extends StObject {
    
    var kernel: js.UndefOr[PartialPickIModelname] = js.undefined
    
    var name: String
    
    var path: String
    
    var `type`: String
  }
  object ISessionOptions {
    
    inline def apply(name: String, path: String, `type`: String): ISessionOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISessionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISessionOptions] (val x: Self) extends AnyVal {
      
      inline def setKernel(value: PartialPickIModelname): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
