package typings.jupyterlabServices

import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernel
import typings.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typings.jupyterlabServices.kernelKernelMod.Kernel.IOptions
import typings.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/default", JSImport.Namespace)
@js.native
object defaultMod extends js.Object {
  @js.native
  class DefaultKernel protected () extends IKernel {
    /**
      * Construct a kernel object.
      */
    def this(options: IOptions, id: String) = this()
    var _anyMessage: js.Any = js.native
    /**
      * Check to make sure it is okay to proceed to handle a message.
      *
      * #### Notes
      * Because we handle messages asynchronously, before a message is handled the
      * kernel might be disposed or restarted (and have a different session id).
      * This function throws an error in each of these cases. This is meant to be
      * called at the start of an asynchronous message handler to cancel message
      * processing if the message no longer is valid.
      */
    var _assertCurrentMessage: js.Any = js.native
    /**
      * Clear the socket state.
      *
      * #### Notes
      * When calling this, you should also set the status to something like
      * 'reconnecting' to reset the kernel ready state.
      */
    var _clearSocket: js.Any = js.native
    /**
      * Clear the internal state.
      */
    var _clearState: js.Any = js.native
    var _clientId: js.Any = js.native
    var _comms: js.Any = js.native
    /**
      * Create the kernel websocket connection and add socket status handlers.
      */
    var _createSocket: js.Any = js.native
    var _displayIdToParentIds: js.Any = js.native
    var _futures: js.Any = js.native
    /**
      * Handle 'comm_close' kernel message.
      */
    var _handleCommClose: js.Any = js.native
    /**
      * Handle a 'comm_msg' kernel message.
      */
    var _handleCommMsg: js.Any = js.native
    /**
      * Handle a `comm_open` kernel message.
      */
    var _handleCommOpen: js.Any = js.native
    /**
      * Handle a message with a display id.
      *
      * @returns Whether the message was handled.
      */
    var _handleDisplayId: js.Any = js.native
    var _handleMessage: js.Any = js.native
    var _id: js.Any = js.native
    var _info: js.Any = js.native
    var _initialized: js.Any = js.native
    var _iopubMessage: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _isReady: js.Any = js.native
    var _kernelSession: js.Any = js.native
    var _msgChain: js.Any = js.native
    var _msgIdToDisplayIds: js.Any = js.native
    var _name: js.Any = js.native
    var _noOp: js.Any = js.native
    /**
      * Handle a websocket close event.
      */
    var _onWSClose: js.Any = js.native
    /**
      * Handle a websocket message, validating and routing appropriately.
      */
    var _onWSMessage: js.Any = js.native
    /**
      * Handle a websocket open event.
      */
    var _onWSOpen: js.Any = js.native
    var _pendingMessages: js.Any = js.native
    var _readyPromise: js.Any = js.native
    var _reconnectAttempt: js.Any = js.native
    var _reconnectLimit: js.Any = js.native
    var _sendKernelShellControl: js.Any = js.native
    /**
      * Send pending messages to the kernel.
      */
    var _sendPending: js.Any = js.native
    var _specPromise: js.Any = js.native
    var _status: js.Any = js.native
    var _statusChanged: js.Any = js.native
    var _targetRegistry: js.Any = js.native
    var _terminated: js.Any = js.native
    var _unhandledMessage: js.Any = js.native
    /**
      * Unregister a comm instance.
      */
    var _unregisterComm: js.Any = js.native
    /**
      * Handle status iopub messages from the kernel.
      */
    var _updateStatus: js.Any = js.native
    var _username: js.Any = js.native
    var _ws: js.Any = js.native
    var _wsStopped: js.Any = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    def clone(options: IOptions): IKernel = js.native
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
      * Handle a restart on the kernel.  This is not part of the `IKernel`
      * interface.
      */
    def handleRestart(): js.Promise[Unit] = js.native
  }
  
  @js.native
  object DefaultKernel extends js.Object {
    /**
      * Connect to a running kernel.
      *
      * @param model - The model of the running kernel.
      *
      * @param settings - The server settings for the request.
      *
      * @returns The kernel object.
      *
      * #### Notes
      * If the kernel was already started via `startNewKernel`, the existing
      * Kernel object info is used to create another instance.
      */
    def connectTo(model: IModel): IKernel = js.native
    def connectTo(model: IModel, settings: ISettings): IKernel = js.native
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the kernel of interest.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the model for the kernel.
      *
      * #### Notes
      * If the kernel was already started via `startNewKernel`, we return its
      * `Kernel.IModel`.
      *
      * Otherwise, we attempt to find an existing kernel by connecting to the
      * server. The promise is fulfilled when the kernel is found, otherwise the
      * promise is rejected.
      */
    def findById(id: String): js.Promise[IModel] = js.native
    def findById(id: String, settings: ISettings): js.Promise[IModel] = js.native
    /**
      * Fetch all of the kernel specs.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the kernel specs.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
      */
    def getSpecs(): js.Promise[ISpecModels] = js.native
    def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
    /**
      * Fetch the running kernels.
      *
      * @param settings - The optional server settings.
      *
      * @returns A promise that resolves with the list of running kernels.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    /**
      * Shut down a kernel by id.
      *
      * @param id - The id of the running kernel.
      *
      * @param settings - The server settings for the request.
      *
      * @returns A promise that resolves when the kernel is shut down.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    def shutdown(id: String, settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Shut down all kernels.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when all the kernels are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Start a new kernel.
      *
      * @param options - The options used to create the kernel.
      *
      * @returns A promise that resolves with a kernel object.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
      *
      * If no options are given or the kernel name is not given, the
      * default kernel will by started by the server.
      *
      * Wraps the result in a Kernel object. The promise is fulfilled
      * when the kernel is started by the server, otherwise the promise is rejected.
      */
    def startNew(options: IOptions): js.Promise[IKernel] = js.native
  }
  
}

