package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIModel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.kernel
import typings.jupyterlabApputils.jupyterlabApputilsStrings.session
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.KernelDisplayStatus
import typings.jupyterlabApputils.libSessioncontextMod.SessionContext.IOptions
import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
import typings.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typings.jupyterlabServices.libKernelMessagesMod.IIOPubMessage
import typings.jupyterlabServices.libKernelMessagesMod.IMessage
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelMessagesMod.Status
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.jupyterlabServices.libSessionSessionMod.IManager
import typings.jupyterlabServices.libSessionSessionMod.IModel
import typings.jupyterlabServices.libSessionSessionMod.ISessionConnection
import typings.jupyterlabServices.libSessionSessionMod.ISessionConnection.IKernelChangedArgs
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoAlgorithm.typesIterMod.IterableOrArrayLike
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessioncontextMod {
  
  @JSImport("@jupyterlab/apputils/lib/sessioncontext", "SessionContext")
  @js.native
  open class SessionContext protected ()
    extends StObject
       with ISessionContext {
    /**
      * Construct a new session context.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _busyDisposable: Any = js.native
    
    /**
      * Change the kernel.
      */
    /* private */ var _changeKernel: Any = js.native
    
    /* private */ var _connectionStatusChanged: Any = js.native
    
    /* private */ var _dialog: Any = js.native
    
    /**
      * Display kernel error
      */
    /* private */ var _displayKernelError: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * Handle a new session object.
      */
    /* private */ var _handleNewSession: Any = js.native
    
    /**
      * Handle an error in session startup.
      */
    /* private */ var _handleSessionError: Any = js.native
    
    /* private */ var _initPromise: Any = js.native
    
    /* private */ var _initStarted: Any = js.native
    
    /**
      * Inner initialize function that doesn't handle promises.
      * This makes it easier to consolidate promise handling logic.
      */
    def _initialize(): js.Promise[Boolean] = js.native
    
    /* private */ var _initializing: Any = js.native
    
    /* private */ var _iopubMessage: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _isRestarting: Any = js.native
    
    /* private */ var _isTerminating: Any = js.native
    
    /* private */ var _kernelChanged: Any = js.native
    
    /* private */ var _kernelPreference: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /**
      * Handle a change to the session status.
      */
    /* private */ var _onConnectionStatusChanged: Any = js.native
    
    /**
      * Handle an iopub message.
      */
    /* private */ var _onIopubMessage: Any = js.native
    
    /**
      * Handle a change to the kernel.
      */
    /* private */ var _onKernelChanged: Any = js.native
    
    /**
      * Handle a change to the pending input.
      */
    /* private */ var _onPendingInput: Any = js.native
    
    /**
      * Handle a change to a session property.
      */
    /* private */ var _onPropertyChanged: Any = js.native
    
    /**
      * Handle a session termination.
      */
    /* private */ var _onSessionDisposed: Any = js.native
    
    /**
      * Handle a change to the session status.
      */
    /* private */ var _onStatusChanged: Any = js.native
    
    /**
      * Handle an unhandled message.
      */
    /* private */ var _onUnhandledMessage: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _pendingInput: Any = js.native
    
    /* private */ var _pendingKernelName: Any = js.native
    
    /* private */ var _pendingSessionRequest: Any = js.native
    
    /* private */ var _prevKernelName: Any = js.native
    
    /* private */ var _propertyChanged: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _session: Any = js.native
    
    /* private */ var _sessionChanged: Any = js.native
    
    /* private */ var _setBusy: Any = js.native
    
    /**
      * Shut down the current session.
      */
    /* private */ var _shutdownSession: Any = js.native
    
    /**
      * Start the session if necessary.
      *
      * @returns Whether to ask the user to pick a kernel.
      */
    /* private */ var _startIfNecessary: Any = js.native
    
    /* private */ var _statusChanged: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    /* private */ var _unhandledMessage: Any = js.native
    
    /**
      * A signal emitted when the kernel status changes, proxied from the kernel.
      */
    @JSName("connectionStatusChanged")
    def connectionStatusChanged_MSessionContext: ISignal[this.type, ConnectionStatus] = js.native
    
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
    override def dispose(): Unit = js.native
    
    /**
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the poll is disposed.
      */
    @JSName("disposed")
    def disposed_MSessionContext: ISignal[this.type, Unit] = js.native
    
    /**
      * Whether the kernel is "No Kernel" or not.
      *
      * #### Notes
      * As the displayed name is translated, this can be used directly.
      */
    @JSName("hasNoKernel")
    def hasNoKernel_MSessionContext: Boolean = js.native
    
    /**
      * A signal emitted for iopub kernel messages, proxied from the kernel.
      */
    @JSName("iopubMessage")
    def iopubMessage_MSessionContext: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
      * Get the constant displayed name for "No Kernel"
      */
    /* protected */ def noKernelName: String = js.native
    
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
      * A flag indicating if the session has ending input, proxied from the kernel.
      */
    @JSName("pendingInput")
    def pendingInput_MSessionContext: Boolean = js.native
    
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
    
    /* private */ var translator: Any = js.native
    
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
    
    @JSImport("@jupyterlab/apputils/lib/sessioncontext", "SessionContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the default kernel name given select options.
      */
    inline def getDefaultKernel(options: IKernelSearch): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKernel")(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /**
      * An interface for populating a kernel selector.
      */
    trait IKernelSearch extends StObject {
      
      /**
        * The kernel preference.
        */
      var preference: IKernelPreference
      
      /**
        * The current running sessions.
        */
      var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.undefined
      
      /**
        * The Kernel specs.
        */
      var specs: ISpecModels | Null
    }
    object IKernelSearch {
      
      inline def apply(preference: IKernelPreference): IKernelSearch = {
        val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], specs = null)
        __obj.asInstanceOf[IKernelSearch]
      }
      
      extension [Self <: IKernelSearch](x: Self) {
        
        inline def setPreference(value: IKernelPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
        
        inline def setSessions(value: IterableOrArrayLike[IModel]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
        
        inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
        
        inline def setSpecs(value: ISpecModels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
        
        inline def setSpecsNull: Self = StObject.set(x, "specs", null)
      }
    }
    
    /**
      * The options used to initialize a context.
      */
    trait IOptions extends StObject {
      
      /**
        * A kernel preference.
        */
      var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
      
      /**
        * The name of the session.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The initial path of the file.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * A session manager instance.
        */
      var sessionManager: IManager
      
      /**
        * A function to call when the session becomes busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
      
      /**
        * A kernel spec manager instance.
        */
      var specsManager: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * The type of the session.
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        sessionManager: IManager,
        specsManager: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager
      ): IOptions = {
        val __obj = js.Dynamic.literal(sessionManager = sessionManager.asInstanceOf[js.Any], specsManager = specsManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setKernelPreference(value: IKernelPreference): Self = StObject.set(x, "kernelPreference", value.asInstanceOf[js.Any])
        
        inline def setKernelPreferenceUndefined: Self = StObject.set(x, "kernelPreference", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSessionManager(value: IManager): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
        
        inline def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        inline def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
        
        inline def setSpecsManager(value: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager): Self = StObject.set(x, "specsManager", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/sessioncontext", "sessionContextDialogs")
  @js.native
  val sessionContextDialogs: IDialogs = js.native
  
  @js.native
  trait ISessionContext
    extends StObject
       with IObservableDisposable {
    
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
      * Whether the kernel is "No Kernel" or not.
      *
      * #### Notes
      * As the displayed name is translated, this can be used directly.
      */
    val hasNoKernel: Boolean = js.native
    
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
      * The sensible display name for the kernel, or translated "No Kernel"
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
      * A flag indicating if session is has pending input, proxied from the session connection.
      */
    val pendingInput: Boolean = js.native
    
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
    val specsManager: typings.jupyterlabServices.libKernelspecKernelspecMod.IManager = js.native
    
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
      def restart(session: ISessionContext, translator: ITranslator): js.Promise[Boolean] = js.native
      
      /**
        * Select a kernel for the session.
        */
      def selectKernel(session: ISessionContext): js.Promise[Unit] = js.native
      def selectKernel(session: ISessionContext, translator: ITranslator): js.Promise[Unit] = js.native
    }
    
    /**
      * A kernel preference.
      *
      * #### Notes
      * Preferences for a kernel are considered in the order `id`, `name`,
      * `language`. If no matching kernels can be found and `autoStartDefault` is
      * `true`, then the default kernel for the server is preferred.
      */
    trait IKernelPreference extends StObject {
      
      /**
        * Automatically start the default kernel if no other matching kernel is
        * found (default `true`).
        */
      val autoStartDefault: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A kernel can be started (default `true`).
        */
      val canStart: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The id of an existing kernel.
        */
      val id: js.UndefOr[String] = js.undefined
      
      /**
        * The preferred kernel language.
        */
      val language: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the kernel.
        */
      val name: js.UndefOr[String] = js.undefined
      
      /**
        * A kernel should be started automatically (default `true`).
        */
      val shouldStart: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Shut down the session when session context is disposed (default `false`).
        */
      val shutdownOnDispose: js.UndefOr[Boolean] = js.undefined
    }
    object IKernelPreference {
      
      inline def apply(): IKernelPreference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IKernelPreference]
      }
      
      extension [Self <: IKernelPreference](x: Self) {
        
        inline def setAutoStartDefault(value: Boolean): Self = StObject.set(x, "autoStartDefault", value.asInstanceOf[js.Any])
        
        inline def setAutoStartDefaultUndefined: Self = StObject.set(x, "autoStartDefault", js.undefined)
        
        inline def setCanStart(value: Boolean): Self = StObject.set(x, "canStart", value.asInstanceOf[js.Any])
        
        inline def setCanStartUndefined: Self = StObject.set(x, "canStart", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setShouldStart(value: Boolean): Self = StObject.set(x, "shouldStart", value.asInstanceOf[js.Any])
        
        inline def setShouldStartUndefined: Self = StObject.set(x, "shouldStart", js.undefined)
        
        inline def setShutdownOnDispose(value: Boolean): Self = StObject.set(x, "shutdownOnDispose", value.asInstanceOf[js.Any])
        
        inline def setShutdownOnDisposeUndefined: Self = StObject.set(x, "shutdownOnDispose", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabServices.libKernelMessagesMod.Status
      - typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
      - typings.jupyterlabApputils.jupyterlabApputilsStrings.initializing
      - typings.jupyterlabApputils.jupyterlabApputilsStrings._empty
    */
    type KernelDisplayStatus = _KernelDisplayStatus | Status | ConnectionStatus
    
    trait _KernelDisplayStatus extends StObject
  }
}
