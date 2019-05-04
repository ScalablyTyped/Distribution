package typings
package atJupyterlabServicesLib.libSessionManagerMod

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
class SessionManager ()
  extends atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IManager {
  def this(options: atJupyterlabServicesLib.libSessionManagerMod.SessionManagerNs.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _models: js.Any = js.native
  var _modelsTimer: js.Any = js.native
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
  var _readyPromise: js.Any = js.native
  /**
    * Refresh the running sessions.
    */
  var _refreshRunning: js.Any = js.native
  /**
    * Refresh the specs.
    */
  var _refreshSpecs: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _sessions: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  var _specsTimer: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Test whether the manager is ready.
    */
  /* CompleteClass */
  override val isReady: scala.Boolean = js.native
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[scala.Unit] = js.native
  /**
    * A signal emitted when the running sessions change.
    */
  /* CompleteClass */
  override var runningChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, js.Array[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel]] = js.native
  /**
    * The cached kernel specs.
    *
    * #### Notes
    * This value will be null until the manager is ready.
    */
  /* CompleteClass */
  override val specs: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels | scala.Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  /* CompleteClass */
  override var specsChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.ISpecModels] = js.native
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
  override def connectTo(model: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel): atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  /* CompleteClass */
  override def findById(id: java.lang.String): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  /* CompleteClass */
  override def findByPath(path: java.lang.String): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
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
  override def refreshRunning(): js.Promise[scala.Unit] = js.native
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
  override def refreshSpecs(): js.Promise[scala.Unit] = js.native
  /**
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  /* CompleteClass */
  override def running(): atPhosphorAlgorithmLib.libIterMod.IIterator[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  /* CompleteClass */
  override def shutdown(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  /* CompleteClass */
  override def shutdownAll(): js.Promise[scala.Unit] = js.native
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
  override def startNew(options: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IOptions): js.Promise[atJupyterlabServicesLib.libSessionSessionMod.SessionNs.ISession] = js.native
  /**
    * Find a session associated with a path and stop it is the only session
    * using that kernel.
    *
    * @param path - The path in question.
    *
    * @returns A promise that resolves when the relevant sessions are stopped.
    */
  /* CompleteClass */
  override def stopIfNeeded(path: java.lang.String): js.Promise[scala.Unit] = js.native
}

