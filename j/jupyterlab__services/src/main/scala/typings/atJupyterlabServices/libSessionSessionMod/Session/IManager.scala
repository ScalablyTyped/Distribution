package typings.atJupyterlabServices.libSessionSessionMod.Session

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object which manages session instances.
  *
  * #### Notes
  * The manager is responsible for maintaining the state of running
  * sessions and the initial fetch of kernel specs.
  */
trait IManager extends IDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[
    IManager, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.NetworkError */ _
  ]
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  val ready: js.Promise[Unit]
  /**
    * A signal emitted when the running sessions change.
    */
  var runningChanged: ISignal[this.type, js.Array[IModel]]
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ] = js.undefined
  /**
    * The cached kernel specs.
    *
    * #### Notes
    * This value will be null until the manager is ready.
    */
  val specs: ISpecModels | Null
  /**
    * A signal emitted when the kernel specs change.
    */
  var specsChanged: ISignal[this.type, ISpecModels]
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param options - The session options to use.
    *
    * @returns The new session instance.
    */
  def connectTo(model: IModel): ISession
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findById(id: String): js.Promise[IModel]
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findByPath(path: String): js.Promise[IModel]
  /**
    * Force a refresh of the running sessions.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshRunning(): js.Promise[Unit]
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshSpecs(): js.Promise[Unit]
  /**
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  def running(): IIterator[IModel]
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdown(id: String): js.Promise[Unit]
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit]
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
  def startNew(options: IOptions): js.Promise[ISession]
  /**
    * Find a session associated with a path and stop it is the only session
    * using that kernel.
    *
    * @param path - The path in question.
    *
    * @returns A promise that resolves when the relevant sessions are stopped.
    */
  def stopIfNeeded(path: String): js.Promise[Unit]
}

object IManager {
  @scala.inline
  def apply(
    connectTo: IModel => ISession,
    connectionFailure: ISignal[
      IManager, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.NetworkError */ _
    ],
    dispose: () => Unit,
    findById: String => js.Promise[IModel],
    findByPath: String => js.Promise[IModel],
    isDisposed: Boolean,
    isReady: Boolean,
    ready: js.Promise[Unit],
    refreshRunning: () => js.Promise[Unit],
    refreshSpecs: () => js.Promise[Unit],
    running: () => IIterator[IModel],
    runningChanged: ISignal[IManager, js.Array[IModel]],
    shutdown: String => js.Promise[Unit],
    shutdownAll: () => js.Promise[Unit],
    specsChanged: ISignal[IManager, ISpecModels],
    startNew: IOptions => js.Promise[ISession],
    stopIfNeeded: String => js.Promise[Unit],
    serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = null,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(connectTo = js.Any.fromFunction1(connectTo), connectionFailure = connectionFailure, dispose = js.Any.fromFunction0(dispose), findById = js.Any.fromFunction1(findById), findByPath = js.Any.fromFunction1(findByPath), isDisposed = isDisposed, isReady = isReady, ready = ready, refreshRunning = js.Any.fromFunction0(refreshRunning), refreshSpecs = js.Any.fromFunction0(refreshSpecs), running = js.Any.fromFunction0(running), runningChanged = runningChanged, shutdown = js.Any.fromFunction1(shutdown), shutdownAll = js.Any.fromFunction0(shutdownAll), specsChanged = specsChanged, startNew = js.Any.fromFunction1(startNew), stopIfNeeded = js.Any.fromFunction1(stopIfNeeded))
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[IManager]
  }
}

