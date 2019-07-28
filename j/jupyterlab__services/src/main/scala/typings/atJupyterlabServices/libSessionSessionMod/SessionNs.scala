package typings.atJupyterlabServices.libSessionSessionMod

import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IAnyMessageArgs
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernelConnection
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.Status
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IIOPubMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IOPubMessageType
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.MessageType
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IKernelChangedArgs
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IManager
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IModel
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IOptions
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.ISession
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/session", "Session")
@js.native
object SessionNs extends js.Object {
  /**
    * An arguments object for the kernel changed signal.
    */
  trait IKernelChangedArgs extends js.Object {
    /**
      * The new kernel.
      */
    var newValue: IKernelConnection | Null
    /**
      * The old kernel.
      */
    var oldValue: IKernelConnection | Null
  }
  
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
  
  /**
    * The session model used by the server.
    *
    * #### Notes
    * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions).
    */
  trait IModel extends JSONObject {
    /**
      * The unique identifier for the session client.
      */
    val id: String
    val kernel: typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IModel
    val name: String
    val path: String
    val `type`: String
  }
  
  /**
    * The session initialization options.
    */
  trait IOptions extends js.Object {
    /**
      * The unique identifier for the session client.
      */
    var clientId: js.UndefOr[String] = js.undefined
    /**
      * The id of an existing kernel.
      */
    var kernelId: js.UndefOr[String] = js.undefined
    /**
      * The type of kernel (e.g. python3).
      */
    var kernelName: js.UndefOr[String] = js.undefined
    /**
      * The name of the session.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The path (not including name) to the session.
      */
    var path: String
    /**
      * The server settings.
      */
    var serverSettings: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
      ] = js.undefined
    /**
      * The type of the session.
      */
    var `type`: js.UndefOr[String] = js.undefined
    /**
      * The username of the session client.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Interface of a session object.
    */
  trait ISession extends IDisposable {
    /**
      * A signal emitted for any kernel message.
      *
      * Note: The behavior is undefined if the message is modified
      * during message handling. As such, it should be treated as read-only.
      */
    var anyMessage: ISignal[this.type, IAnyMessageArgs]
    /**
      * Unique id of the session.
      */
    val id: String
    /**
      * A signal emitted for iopub kernel messages.
      */
    var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]]
    /**
      * The kernel.
      *
      * #### Notes
      * This is a read-only property, and can be altered by [changeKernel].
      */
    val kernel: IKernelConnection
    /**
      * A signal emitted when the kernel changes.
      */
    var kernelChanged: ISignal[this.type, IKernelChangedArgs]
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
      * A signal emitted when a session property changes.
      */
    val propertyChanged: ISignal[
        this.type, 
        typings.atJupyterlabServices.atJupyterlabServicesStrings.path | typings.atJupyterlabServices.atJupyterlabServicesStrings.name | typings.atJupyterlabServices.atJupyterlabServicesStrings.`type`
      ]
    /**
      * The server settings of the session.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
    /**
      * The current status of the session.
      *
      * #### Notes
      * This is a delegate to the kernel status.
      */
    val status: Status
    /**
      * A signal emitted when the session status changes.
      */
    var statusChanged: ISignal[this.type, Status]
    /**
      * A signal emitted when the session is shut down.
      */
    var terminated: ISignal[this.type, Unit]
    /**
      * The type of the session.
      */
    val `type`: String
    /**
      * A signal emitted for unhandled kernel message.
      */
    var unhandledMessage: ISignal[this.type, IMessage[MessageType]]
    /**
      * Change the kernel.
      *
      * @param options - The name or id of the new kernel.
      *
      * @returns A promise that resolves with the new kernel model.
      *
      * #### Notes
      * This shuts down the existing kernel and creates a new kernel,
      * keeping the existing session ID and path.
      */
    def changeKernel(options: Partial[typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IModel]): js.Promise[IKernelConnection]
    /**
      * Change the session name.
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
  }
  
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param settigns - The server settings.
    *
    * @returns The session instance.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object is used as the fulfillment value.
    *
    * Otherwise, we attempt to connect to the existing session.
    */
  def connectTo(model: IModel): ISession = js.native
  def connectTo(
    model: IModel,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): ISession = js.native
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNew`, the existing
    * Session object's information is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing session.
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    */
  def findById(id: String): js.Promise[IModel] = js.native
  def findById(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @param settings: The server settings.
    *
    * @returns A promise that resolves with the session model.
    *
    * #### Notes
    * If the session was already started via `startNewSession`, the existing
    * Session object's info is used in the fulfillment value.
    *
    * Otherwise, we attempt to find to the existing
    * session using [listRunningSessions].
    * The promise is fulfilled when the session is found,
    * otherwise the promise is rejected.
    *
    * If the session was not already started and no `options` are given,
    * the promise is rejected.
    */
  def findByPath(path: String): js.Promise[IModel] = js.native
  def findByPath(
    path: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[IModel] = js.native
  /**
    * List the running sessions.
    *
    * @param settings - The server settings to use for the request.
    *
    * @returns A promise that resolves with the list of session models.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions), and validates the response.
    *
    * All client-side sessions are updated with current information.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[IModel]] = js.native
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target session.
    *
    * @param settings - The server settings.
    *
    * @returns A promise that resolves when the session is shut down.
    *
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  def shutdown(
    id: String,
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  def shutdownAll(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[Unit] = js.native
  /**
    * Start a new session.
    *
    * @param options - The options used to start the session.
    *
    * @returns A promise that resolves with the session instance.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions), and validates the response.
    *
    * A path must be provided.  If a kernel id is given, it will
    * connect to an existing kernel.  If no kernel id or name is given,
    * the server will start the default kernel type.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    *
    * Wrap the result in an Session object. The promise is fulfilled
    * when the session is created on the server, otherwise the promise is
    * rejected.
    */
  def startNew(options: IOptions): js.Promise[ISession] = js.native
}

