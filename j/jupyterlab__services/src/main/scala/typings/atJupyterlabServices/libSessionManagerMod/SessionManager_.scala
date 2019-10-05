package typings.atJupyterlabServices.libSessionManagerMod

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atJupyterlabServices.libSessionManagerMod.SessionManager.IOptions
import typings.atJupyterlabServices.libSessionSessionMod.Session.IManager
import typings.atJupyterlabServices.libSessionSessionMod.Session.IModel
import typings.atJupyterlabServices.libSessionSessionMod.Session.ISession
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/manager", "SessionManager")
@js.native
/**
  * Construct a new session manager.
  *
  * @param options - The default options for each session.
  */
class SessionManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _models: js.Any = js.native
  /**
    * Handle a change to a session.
    */
  var _onChanged: js.Any = js.native
  /**
    * Handle a session starting.
    */
  var _onStarted: js.Any = js.native
  /**
    * Handle a session terminating.
    */
  var _onTerminated: js.Any = js.native
  var _pollModels: js.Any = js.native
  var _pollSpecs: js.Any = js.native
  var _ready: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _sessions: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  /* CompleteClass */
  override var connectionFailure: ISignal[
    IManager, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.NetworkError */ _
  ] = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  val connectionFailure_SessionManager_ : ISignal[this.type, Error] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Test whether the manager is ready.
    */
  /* CompleteClass */
  override val isReady: Boolean = js.native
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[Unit] = js.native
  /**
    * A signal emitted when the running sessions change.
    */
  /* CompleteClass */
  override var runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
  /**
    * The server settings of the manager.
    */
  @JSName("serverSettings")
  val serverSettings_SessionManager_ : ISettings = js.native
  /**
    * The cached kernel specs.
    *
    * #### Notes
    * This value will be null until the manager is ready.
    */
  /* CompleteClass */
  override val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  /* CompleteClass */
  override var specsChanged: ISignal[this.type, ISpecModels] = js.native
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param options - The session options to use.
    *
    * @returns The new session instance.
    */
  /* CompleteClass */
  override def connectTo(model: IModel): ISession = js.native
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
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  /* CompleteClass */
  override def findById(id: String): js.Promise[IModel] = js.native
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  /* CompleteClass */
  override def findByPath(path: String): js.Promise[IModel] = js.native
  /**
    * Force a refresh of the running sessions.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  /* CompleteClass */
  override def refreshRunning(): js.Promise[Unit] = js.native
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  /* CompleteClass */
  override def refreshSpecs(): js.Promise[Unit] = js.native
  /**
    * Execute a request to the server to poll running kernels and update state.
    */
  /* protected */ def requestRunning(): js.Promise[Unit] = js.native
  /**
    * Execute a request to the server to poll specs and update state.
    */
  /* protected */ def requestSpecs(): js.Promise[Unit] = js.native
  /**
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  /* CompleteClass */
  override def running(): IIterator[IModel] = js.native
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  /* CompleteClass */
  override def shutdown(id: String): js.Promise[Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  /* CompleteClass */
  override def shutdownAll(): js.Promise[Unit] = js.native
  /**
    * Start a new session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    *
    * #### Notes
    * The `serverSettings` of the manager will be used.
    */
  /* CompleteClass */
  override def startNew(options: typings.atJupyterlabServices.libSessionSessionMod.Session.IOptions): js.Promise[ISession] = js.native
  /**
    * Find a session associated with a path and stop it is the only session
    * using that kernel.
    *
    * @param path - The path in question.
    *
    * @returns A promise that resolves when the relevant sessions are stopped.
    */
  /* CompleteClass */
  override def stopIfNeeded(path: String): js.Promise[Unit] = js.native
}

