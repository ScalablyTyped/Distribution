package typings.jupyterlabServices

import typings.jupyterlabServices.kernelKernelMod.Kernel.IAnyMessageArgs
import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernel
import typings.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typings.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typings.jupyterlabServices.kernelKernelMod.Kernel.Status
import typings.jupyterlabServices.messagesMod.KernelMessage.IIOPubMessage
import typings.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typings.jupyterlabServices.messagesMod.KernelMessage.IOPubMessageType
import typings.jupyterlabServices.messagesMod.KernelMessage.MessageType
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.Session.IKernelChangedArgs
import typings.jupyterlabServices.sessionSessionMod.Session.IOptions
import typings.jupyterlabServices.sessionSessionMod.Session.ISession
import typings.phosphorSignaling.mod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/default", JSImport.Namespace)
@js.native
object sessionDefaultMod extends js.Object {
  @js.native
  class DefaultSession protected () extends ISession {
    /**
      * Construct a new session.
      */
    def this(options: IOptions, id: String, model: IModel) = this()
    var _anyMessage: js.Any = js.native
    /**
      * Handle a change to the model.
      */
    var _handleModelChange: js.Any = js.native
    var _id: js.Any = js.native
    var _iopubMessage: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _kernel: js.Any = js.native
    var _kernelChanged: js.Any = js.native
    var _name: js.Any = js.native
    /**
      * Send a PATCH to the server, updating the session path or the kernel.
      */
    var _patch: js.Any = js.native
    var _path: js.Any = js.native
    var _propertyChanged: js.Any = js.native
    var _statusChanged: js.Any = js.native
    var _terminated: js.Any = js.native
    var _type: js.Any = js.native
    var _unhandledMessage: js.Any = js.native
    var _updating: js.Any = js.native
    /**
      * A signal emitted for any kernel message.
      *
      * Note: The behavior is undefined if the message is modified
      * during message handling. As such, it should be treated as read-only.
      */
    /* CompleteClass */
    override var anyMessage: ISignal[this.type, IAnyMessageArgs] = js.native
    /**
      * Unique id of the session.
      */
    /* CompleteClass */
    override val id: String = js.native
    /**
      * A signal emitted for iopub kernel messages.
      */
    /* CompleteClass */
    override var iopubMessage: ISignal[this.type, IIOPubMessage[IOPubMessageType]] = js.native
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * The kernel.
      *
      * #### Notes
      * This is a read-only property, and can be altered by [changeKernel].
      */
    /* CompleteClass */
    override val kernel: IKernelConnection = js.native
    /**
      * A signal emitted when the kernel changes.
      */
    /* CompleteClass */
    override var kernelChanged: ISignal[this.type, IKernelChangedArgs] = js.native
    /**
      * The model associated with the session.
      */
    /* CompleteClass */
    override val model: typings.jupyterlabServices.sessionSessionMod.Session.IModel = js.native
    /**
      * The current name associated with the session.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * The current path associated with the session.
      */
    /* CompleteClass */
    override val path: String = js.native
    /**
      * A signal emitted when a session property changes.
      */
    /* CompleteClass */
    override val propertyChanged: ISignal[
        this.type, 
        typings.jupyterlabServices.jupyterlabServicesStrings.path | typings.jupyterlabServices.jupyterlabServicesStrings.name | typings.jupyterlabServices.jupyterlabServicesStrings.`type`
      ] = js.native
    /**
      * The server settings of the session.
      */
    /* CompleteClass */
    override val serverSettings: ISettings = js.native
    /**
      * The current status of the session.
      *
      * #### Notes
      * This is a delegate to the kernel status.
      */
    /* CompleteClass */
    override val status: Status = js.native
    /**
      * A signal emitted when the session status changes.
      */
    /* CompleteClass */
    override var statusChanged: ISignal[this.type, Status] = js.native
    /**
      * A signal emitted when the session is shut down.
      */
    /* CompleteClass */
    override var terminated: ISignal[this.type, Unit] = js.native
    /**
      * The type of the session.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /**
      * A signal emitted for unhandled kernel message.
      */
    /* CompleteClass */
    override var unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
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
    /* CompleteClass */
    override def changeKernel(options: Partial[IModel]): js.Promise[IKernelConnection] = js.native
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
      * Handle any kernel messages.
      */
    /* protected */ def onAnyMessage(sender: IKernel, args: IAnyMessageArgs): Unit = js.native
    /**
      * Handle iopub kernel messages.
      */
    /* protected */ def onIOPubMessage(sender: IKernel, msg: IIOPubMessage[IOPubMessageType]): Unit = js.native
    /**
      * Handle to changes in the Kernel status.
      */
    /* protected */ def onKernelStatus(sender: IKernel, state: Status): Unit = js.native
    /**
      * Handle unhandled kernel messages.
      */
    /* protected */ def onUnhandledMessage(sender: IKernel, msg: IMessage[MessageType]): Unit = js.native
    /**
      * Change the session name.
      */
    /* CompleteClass */
    override def setName(name: String): js.Promise[Unit] = js.native
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
    /* CompleteClass */
    override def setPath(path: String): js.Promise[Unit] = js.native
    /**
      * Change the session type.
      */
    /* CompleteClass */
    override def setType(`type`: String): js.Promise[Unit] = js.native
    /**
      * Create a new kernel connection and hook up to its events.
      *
      * #### Notes
      * This method is not meant to be subclassed.
      */
    /* protected */ def setupKernel(model: IModel): Unit = js.native
    /**
      * Kill the kernel and shutdown the session.
      *
      * @returns A promise that resolves when the session is shut down.
      *
      * #### Notes
      * This uses the Jupyter REST API, and the response is validated.
      * The promise is fulfilled on a valid response and rejected otherwise.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
    /**
      * Update the session based on a session model from the server.
      */
    def update(model: typings.jupyterlabServices.sessionSessionMod.Session.IModel): Unit = js.native
  }
  
  @js.native
  object DefaultSession extends js.Object {
    /**
      * Connect to a running session.
      */
    def connectTo(model: typings.jupyterlabServices.sessionSessionMod.Session.IModel): ISession = js.native
    def connectTo(model: typings.jupyterlabServices.sessionSessionMod.Session.IModel, settings: ISettings): ISession = js.native
    /**
      * Find a session by id.
      */
    def findById(id: String): js.Promise[typings.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    def findById(id: String, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    /**
      * Find a session by path.
      */
    def findByPath(path: String): js.Promise[typings.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    def findByPath(path: String, settings: ISettings): js.Promise[typings.jupyterlabServices.sessionSessionMod.Session.IModel] = js.native
    /**
      * List the running sessions.
      */
    def listRunning(): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.Session.IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[typings.jupyterlabServices.sessionSessionMod.Session.IModel]] = js.native
    /**
      * Shut down a session by id.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    def shutdown(id: String, settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Shut down all sessions.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when all the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Start a new session.
      */
    def startNew(options: IOptions): js.Promise[ISession] = js.native
  }
  
}

