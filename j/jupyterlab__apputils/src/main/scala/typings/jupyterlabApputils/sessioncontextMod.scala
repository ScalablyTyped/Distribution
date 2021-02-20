package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIModel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.kernel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.session
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.KernelDisplayStatus
import typings.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.kernelKernelMod.IKernelConnection
import typings.jupyterlabServices.messagesMod.IIOPubMessage
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.sessionSessionMod.IManager
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection.IKernelChangedArgs
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessioncontextMod {
  
  @JSImport("@jupyterlab/apputils/lib/sessioncontext", "SessionContext")
  @js.native
  class SessionContext protected () extends ISessionContext {
    /**
      * Construct a new session context.
      */
    def this(options: IOptions) = this()
    
    var _busyDisposable: js.Any = js.native
    
    /**
      * Change the kernel.
      */
    var _changeKernel: js.Any = js.native
    
    var _connectionStatusChanged: js.Any = js.native
    
    var _dialog: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    /**
      * Handle a new session object.
      */
    var _handleNewSession: js.Any = js.native
    
    /**
      * Handle an error in session startup.
      */
    var _handleSessionError: js.Any = js.native
    
    var _initPromise: js.Any = js.native
    
    var _initStarted: js.Any = js.native
    
    /**
      * Inner initialize function that doesn't handle promises.
      * This makes it easier to consolidate promise handling logic.
      */
    def _initialize(): js.Promise[Boolean] = js.native
    
    var _initializing: js.Any = js.native
    
    var _iopubMessage: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _isReady: js.Any = js.native
    
    var _isRestarting: js.Any = js.native
    
    var _isTerminating: js.Any = js.native
    
    var _kernelChanged: js.Any = js.native
    
    var _kernelPreference: js.Any = js.native
    
    var _name: js.Any = js.native
    
    /**
      * Handle a change to the session status.
      */
    var _onConnectionStatusChanged: js.Any = js.native
    
    /**
      * Handle an iopub message.
      */
    var _onIopubMessage: js.Any = js.native
    
    /**
      * Handle a change to the kernel.
      */
    var _onKernelChanged: js.Any = js.native
    
    /**
      * Handle a change to a session property.
      */
    var _onPropertyChanged: js.Any = js.native
    
    /**
      * Handle a session termination.
      */
    var _onSessionDisposed: js.Any = js.native
    
    /**
      * Handle a change to the session status.
      */
    var _onStatusChanged: js.Any = js.native
    
    /**
      * Handle an unhandled message.
      */
    var _onUnhandledMessage: js.Any = js.native
    
    var _path: js.Any = js.native
    
    var _pendingKernelName: js.Any = js.native
    
    var _pendingSessionRequest: js.Any = js.native
    
    var _prevKernelName: js.Any = js.native
    
    var _propertyChanged: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    var _session: js.Any = js.native
    
    var _sessionChanged: js.Any = js.native
    
    var _setBusy: js.Any = js.native
    
    /**
      * Shut down the current session.
      */
    var _shutdownSession: js.Any = js.native
    
    /**
      * Start the session if necessary.
      *
      * @returns Whether to ask the user to pick a kernel.
      */
    var _startIfNecessary: js.Any = js.native
    
    var _statusChanged: js.Any = js.native
    
    var _type: js.Any = js.native
    
    var _unhandledMessage: js.Any = js.native
    
    /**
      * A signal emitted when the kernel status changes, proxied from the kernel.
      */
    @JSName("connectionStatusChanged")
    def connectionStatusChanged_MSessionContext: ISignal[this.type, ConnectionStatus] = js.native
    
    /**
      * A signal emitted when the poll is disposed.
      */
    @JSName("disposed")
    def disposed_MSessionContext: ISignal[this.type, Unit] = js.native
    
    /**
      * A signal emitted for iopub kernel messages, proxied from the kernel.
      */
    @JSName("iopubMessage")
    def iopubMessage_MSessionContext: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    
    /**
      * Test whether the context is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSessionContext: Boolean = js.native
    
    /**
      * Whether the context is ready.
      */
    @JSName("isReady")
    def isReady_MSessionContext: Boolean = js.native
    
    /**
      * Whether the context is restarting.
      */
    @JSName("isRestarting")
    def isRestarting_MSessionContext: Boolean = js.native
    
    /**
      * Whether the context is terminating.
      */
    @JSName("isTerminating")
    def isTerminating_MSessionContext: Boolean = js.native
    
    /**
      * A signal emitted when the kernel connection changes, proxied from the session connection.
      */
    @JSName("kernelChanged")
    def kernelChanged_MSessionContext: ISignal[this.type, IKernelChangedArgs] = js.native
    
    /**
      * The display name of the current kernel, or a sensible alternative.
      *
      * #### Notes
      * This is a convenience function to have a consistent sensible name for the
      * kernel.
      */
    @JSName("kernelDisplayName")
    def kernelDisplayName_MSessionContext: String = js.native
    
    /**
      * A sensible status to display
      *
      * #### Notes
      * This combines the status and connection status into a single status for
      * the user.
      */
    @JSName("kernelDisplayStatus")
    def kernelDisplayStatus_MSessionContext: KernelDisplayStatus = js.native
    
    /**
      * The kernel preference of this client session.
      *
      * This is used when selecting a new kernel, and should reflect the sort of
      * kernel the activity prefers.
      */
    @JSName("kernelPreference")
    def kernelPreference_MSessionContext: IKernelPreference = js.native
    
    /**
      * The session name.
      *
      * #### Notes
      * Typically `.session.name` should be used. This attribute is useful if
      * there is no current session.
      */
    @JSName("name")
    def name_MSessionContext: String = js.native
    
    /**
      * The session path.
      *
      * #### Notes
      * Typically `.session.path` should be used. This attribute is useful if
      * there is no current session.
      */
    @JSName("path")
    def path_MSessionContext: String = js.native
    
    /**
      * The name of the previously started kernel.
      */
    @JSName("prevKernelName")
    def prevKernelName_MSessionContext: String = js.native
    
    /**
      * A signal emitted when a session property changes, proxied from the current session.
      */
    @JSName("propertyChanged")
    def propertyChanged_MSessionContext: ISignal[
        this.type, 
        typings.jupyterlabApputils.jupyterlabApputilsStrings.path | typings.jupyterlabApputils.jupyterlabApputilsStrings.name | typings.jupyterlabApputils.jupyterlabApputilsStrings.`type`
      ] = js.native
    
    /**
      * A promise that is fulfilled when the context is ready.
      */
    @JSName("ready")
    def ready_MSessionContext: js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the session connection changes.
      */
    @JSName("sessionChanged")
    def sessionChanged_MSessionContext: ISignal[
        this.type, 
        IChangedArgs[ISessionConnection | Null, ISessionConnection | Null, session]
      ] = js.native
    
    /**
      * The current session connection.
      */
    @JSName("session")
    def session_MSessionContext: ISessionConnection | Null = js.native
    
    /**
      * A signal emitted when the kernel status changes, proxied from the kernel.
      */
    @JSName("statusChanged")
    def statusChanged_MSessionContext: ISignal[this.type, Status] = js.native
    
    /**
      * The session type.
      *
      * #### Notes
      * Typically `.session.type` should be used. This attribute is useful if
      * there is no current session.
      */
    @JSName("type")
    def type_MSessionContext: String = js.native
    
    /**
      * A signal emitted for an unhandled kernel message, proxied from the kernel.
      */
    @JSName("unhandledMessage")
    def unhandledMessage_MSessionContext: ISignal[this.type, IMessage[MessageType]] = js.native
  }
  object SessionContext {
    
    /**
      * Get the default kernel name given select options.
      */
    @JSImport("@jupyterlab/apputils/lib/sessioncontext", "SessionContext.getDefaultKernel")
    @js.native
    def getDefaultKernel(options: IKernelSearch): String | Null = js.native
    
    /**
      * An interface for populating a kernel selector.
      */
    @js.native
    trait IKernelSearch extends StObject {
      
      /**
        * The kernel preference.
        */
      var preference: IKernelPreference = js.native
      
      /**
        * The current running sessions.
        */
      var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.native
      
      /**
        * The Kernel specs.
        */
      var specs: ISpecModels | Null = js.native
    }
    object IKernelSearch {
      
      @scala.inline
      def apply(preference: IKernelPreference): IKernelSearch = {
        val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
        __obj.asInstanceOf[IKernelSearch]
      }
      
      @scala.inline
      implicit class IKernelSearchMutableBuilder[Self <: IKernelSearch] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPreference(value: IKernelPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessions(value: IterableOrArrayLike[IModel]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
        
        @scala.inline
        def setSpecs(value: ISpecModels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecsNull: Self = StObject.set(x, "specs", null)
      }
    }
    
    /**
      * The options used to initialize a context.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A kernel preference.
        */
      var kernelPreference: js.UndefOr[IKernelPreference] = js.native
      
      /**
        * The name of the session.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The initial path of the file.
        */
      var path: js.UndefOr[String] = js.native
      
      /**
        * A session manager instance.
        */
      var sessionManager: IManager = js.native
      
      /**
        * A function to call when the session becomes busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
      
      /**
        * A kernel spec manager instance.
        */
      var specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager = js.native
      
      /**
        * The type of the session.
        */
      var `type`: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        sessionManager: IManager,
        specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager
      ): IOptions = {
        val __obj = js.Dynamic.literal(sessionManager = sessionManager.asInstanceOf[js.Any], specsManager = specsManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKernelPreference(value: IKernelPreference): Self = StObject.set(x, "kernelPreference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelPreferenceUndefined: Self = StObject.set(x, "kernelPreference", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSessionManager(value: IManager): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
        
        @scala.inline
        def setSpecsManager(value: typings.jupyterlabServices.kernelspecKernelspecMod.IManager): Self = StObject.set(x, "specsManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/sessioncontext", "sessionContextDialogs")
  @js.native
  val sessionContextDialogs: IDialogs = js.native
  
  @js.native
  trait ISessionContext extends IObservableDisposable {
    
    /**
      * Change the kernel associated with the session.
      *
      * @param options The optional kernel model parameters to use for the new kernel.
      *
      * @returns A promise that resolves with the new kernel connection.
      */
    def changeKernel(): js.Promise[IKernelConnection | Null] = js.native
    def changeKernel(options: PartialIModel): js.Promise[IKernelConnection | Null] = js.native
    
    /**
      * A signal emitted when the kernel connection status changes, proxied from the session connection.
      */
    val connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
    
    /**
      * Initialize the session context.
      *
      * @returns A promise that resolves with whether to ask the user to select a kernel.
      *
      * #### Notes
      * This includes starting up an initial kernel if needed.
      */
    def initialize(): js.Promise[Boolean] = js.native
    
    /**
      * A signal emitted for a kernel messages, proxied from the session connection.
      */
    val iopubMessage: ISignal[this.type, IMessage[MessageType]] = js.native
    
    /**
      * Whether the session context is ready.
      */
    val isReady: Boolean = js.native
    
    /**
      * Whether the session context is restarting.
      */
    val isRestarting: Boolean = js.native
    
    /**
      * Whether the session context is terminating.
      */
    val isTerminating: Boolean = js.native
    
    /**
      * A signal emitted when the kernel changes, proxied from the session connection.
      */
    val kernelChanged: ISignal[
        this.type, 
        IChangedArgs[IKernelConnection | Null, IKernelConnection | Null, kernel]
      ] = js.native
    
    /**
      * The sensible display name for the kernel, or Private.NO_KERNEL
      *
      * #### Notes
      * This is at this level since the underlying kernel connection does not
      * have access to the kernel spec manager.
      */
    val kernelDisplayName: String = js.native
    
    /**
      * A sensible status to display
      *
      * #### Notes
      * This combines the status and connection status into a single status for the user.
      */
    val kernelDisplayStatus: KernelDisplayStatus = js.native
    
    /**
      * The kernel preference for starting new kernels.
      */
    var kernelPreference: IKernelPreference = js.native
    
    /**
      * The session name.
      *
      * #### Notes
      * Typically `.session.name` should be used. This attribute is useful if
      * there is no current session.
      */
    val name: String = js.native
    
    /**
      * The session path.
      *
      * #### Notes
      * Typically `.session.path` should be used. This attribute is useful if
      * there is no current session.
      */
    val path: String = js.native
    
    /**
      * The previous kernel name.
      */
    val prevKernelName: String = js.native
    
    /**
      * A signal emitted when a session property changes, proxied from the session connection.
      */
    val propertyChanged: ISignal[
        this.type, 
        typings.jupyterlabApputils.jupyterlabApputilsStrings.path | typings.jupyterlabApputils.jupyterlabApputilsStrings.name | typings.jupyterlabApputils.jupyterlabApputilsStrings.`type`
      ] = js.native
    
    /**
      * A promise that is fulfilled when the session context is ready.
      */
    val ready: js.Promise[Unit] = js.native
    
    /**
      * Restart the current Kernel.
      *
      * @returns A promise that resolves when the kernel is restarted.
      */
    def restartKernel(): js.Promise[Unit] = js.native
    
    /**
      * The current session connection.
      */
    var session: ISessionConnection | Null = js.native
    
    /**
      * A signal emitted when the session connection changes.
      */
    val sessionChanged: ISignal[
        this.type, 
        IChangedArgs[ISessionConnection | Null, ISessionConnection | Null, session]
      ] = js.native
    
    /**
      * The session manager used by the session.
      */
    val sessionManager: IManager = js.native
    
    /**
      * Kill the kernel and shutdown the session.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(): js.Promise[Unit] = js.native
    
    /**
      * The kernel spec manager
      */
    val specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager = js.native
    
    /**
      * A signal emitted when the kernel status changes, proxied from the session connection.
      */
    val statusChanged: ISignal[this.type, Status] = js.native
    
    /**
      * The session type.
      *
      * #### Notes
      * Typically `.session.type` should be used. This attribute is useful if
      * there is no current session.
      */
    val `type`: String = js.native
    
    /**
      * A signal emitted for an unhandled kernel message, proxied from the session connection.
      */
    val unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  }
  object ISessionContext {
    
    /**
      * An interface for a session context dialog provider.
      */
    @js.native
    trait IDialogs extends StObject {
      
      /**
        * Restart the session context.
        *
        * @returns A promise that resolves with whether the kernel has restarted.
        *
        * #### Notes
        * If there is a running kernel, present a dialog.
        * If there is no kernel, we start a kernel with the last run
        * kernel name and resolves with `true`. If no kernel has been started,
        * this is a no-op, and resolves with `false`.
        */
      def restart(session: ISessionContext): js.Promise[Boolean] = js.native
      
      /**
        * Select a kernel for the session.
        */
      def selectKernel(session: ISessionContext): js.Promise[Unit] = js.native
    }
    object IDialogs {
      
      @scala.inline
      def apply(restart: ISessionContext => js.Promise[Boolean], selectKernel: ISessionContext => js.Promise[Unit]): IDialogs = {
        val __obj = js.Dynamic.literal(restart = js.Any.fromFunction1(restart), selectKernel = js.Any.fromFunction1(selectKernel))
        __obj.asInstanceOf[IDialogs]
      }
      
      @scala.inline
      implicit class IDialogsMutableBuilder[Self <: IDialogs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRestart(value: ISessionContext => js.Promise[Boolean]): Self = StObject.set(x, "restart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSelectKernel(value: ISessionContext => js.Promise[Unit]): Self = StObject.set(x, "selectKernel", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A kernel preference.
      *
      * #### Notes
      * Preferences for a kernel are considered in the order `id`, `name`,
      * `language`. If no matching kernels can be found and `autoStartDefault` is
      * `true`, then the default kernel for the server is preferred.
      */
    @js.native
    trait IKernelPreference extends StObject {
      
      /**
        * Automatically start the default kernel if no other matching kernel is
        * found (default `true`).
        */
      val autoStartDefault: js.UndefOr[Boolean] = js.native
      
      /**
        * A kernel can be started (default `true`).
        */
      val canStart: js.UndefOr[Boolean] = js.native
      
      /**
        * The id of an existing kernel.
        */
      val id: js.UndefOr[String] = js.native
      
      /**
        * The preferred kernel language.
        */
      val language: js.UndefOr[String] = js.native
      
      /**
        * The name of the kernel.
        */
      val name: js.UndefOr[String] = js.native
      
      /**
        * A kernel should be started automatically (default `true`).
        */
      val shouldStart: js.UndefOr[Boolean] = js.native
      
      /**
        * Shut down the session when session context is disposed (default `false`).
        */
      val shutdownOnDispose: js.UndefOr[Boolean] = js.native
    }
    object IKernelPreference {
      
      @scala.inline
      def apply(): IKernelPreference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IKernelPreference]
      }
      
      @scala.inline
      implicit class IKernelPreferenceMutableBuilder[Self <: IKernelPreference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoStartDefault(value: Boolean): Self = StObject.set(x, "autoStartDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoStartDefaultUndefined: Self = StObject.set(x, "autoStartDefault", js.undefined)
        
        @scala.inline
        def setCanStart(value: Boolean): Self = StObject.set(x, "canStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanStartUndefined: Self = StObject.set(x, "canStart", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setShouldStart(value: Boolean): Self = StObject.set(x, "shouldStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShouldStartUndefined: Self = StObject.set(x, "shouldStart", js.undefined)
        
        @scala.inline
        def setShutdownOnDispose(value: Boolean): Self = StObject.set(x, "shutdownOnDispose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShutdownOnDisposeUndefined: Self = StObject.set(x, "shutdownOnDispose", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabServices.messagesMod.Status
      - typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.initializing
      - typings.jupyterlabApputils.jupyterlabApputilsStrings._empty
    */
    type KernelDisplayStatus = _KernelDisplayStatus | Status | ConnectionStatus
    
    trait _KernelDisplayStatus extends StObject
  }
}
