package typings.atJupyterlabApputils.libClientsessionMod

import typings.atJupyterlabApputils.libClientsessionMod.ClientSession.IOptions
import typings.atJupyterlabApputils.libClientsessionMod.IClientSession.IKernelPreference
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IKernelConnection
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.Status
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
import typings.atJupyterlabServices.libSessionSessionMod.Session.IKernelChangedArgs
import typings.atJupyterlabServices.libSessionSessionMod.Session.IManager
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession")
@js.native
class ClientSession_ protected () extends IClientSession {
  /**
    * Construct a new client session.
    */
  def this(options: IOptions) = this()
  var _busyDisposable: js.Any = js.native
  /**
    * Change the kernel.
    */
  var _changeKernel: js.Any = js.native
  var _dialog: js.Any = js.native
  /**
    * Handle a new session object.
    */
  var _handleNewSession: js.Any = js.native
  /**
    * Handle an error in session startup.
    */
  var _handleSessionError: js.Any = js.native
  var _initializing: js.Any = js.native
  var _iopubMessage: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _kernelChanged: js.Any = js.native
  var _kernelPreference: js.Any = js.native
  var _name: js.Any = js.native
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
    * Handle a change to the session status.
    */
  var _onStatusChanged: js.Any = js.native
  /**
    * Handle a session termination.
    */
  var _onTerminated: js.Any = js.native
  /**
    * Handle an unhandled message.
    */
  var _onUnhandledMessage: js.Any = js.native
  var _path: js.Any = js.native
  var _prevKernelName: js.Any = js.native
  var _propertyChanged: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Select a kernel.
    *
    * @param cancelable: whether the dialog should have a cancel button.
    */
  var _selectKernel: js.Any = js.native
  var _session: js.Any = js.native
  var _setBusy: js.Any = js.native
  /**
    * Start the session if necessary.
    */
  var _startIfNecessary: js.Any = js.native
  /**
    * Start a session and set up its signals.
    */
  var _startSession: js.Any = js.native
  var _statusChanged: js.Any = js.native
  var _terminated: js.Any = js.native
  var _type: js.Any = js.native
  var _unhandledMessage: js.Any = js.native
  /**
    * A signal emitted for a kernel messages.
    */
  /* CompleteClass */
  override val iopubMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Whether the session is ready.
    */
  /* CompleteClass */
  override val isReady: Boolean = js.native
  /**
    * The current kernel associated with the document.
    */
  /* CompleteClass */
  override val kernel: IKernelConnection | Null = js.native
  /**
    * A signal emitted when the kernel changes.
    */
  /* CompleteClass */
  override val kernelChanged: ISignal[this.type, IKernelChangedArgs] = js.native
  /**
    * The display name of the kernel.
    */
  /* CompleteClass */
  override val kernelDisplayName: String = js.native
  /**
    * The kernel preference.
    */
  /* CompleteClass */
  override var kernelPreference: IKernelPreference = js.native
  /**
    * The session manager used by the session.
    */
  val manager: IManager = js.native
  /**
    * The current name associated with the client session.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * The current path associated with the client session.
    */
  /* CompleteClass */
  override val path: String = js.native
  /**
    * A signal emitted when a session property changes.
    */
  /* CompleteClass */
  override val propertyChanged: ISignal[
    this.type, 
    typings.atJupyterlabApputils.atJupyterlabApputilsStrings.path | typings.atJupyterlabApputils.atJupyterlabApputilsStrings.name | typings.atJupyterlabApputils.atJupyterlabApputilsStrings.`type`
  ] = js.native
  /**
    * A promise that is fulfilled when the session is ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[Unit] = js.native
  /**
    * The current status of the client session.
    */
  /* CompleteClass */
  override val status: Status = js.native
  /**
    * A signal emitted when the kernel status changes.
    */
  /* CompleteClass */
  override val statusChanged: ISignal[this.type, Status] = js.native
  /**
    * A signal emitted when the session is shut down.
    */
  /* CompleteClass */
  override val terminated: ISignal[this.type, Unit] = js.native
  /**
    * The type of the client session.
    */
  /* CompleteClass */
  override val `type`: String = js.native
  /**
    * A signal emitted for an unhandled kernel message.
    */
  /* CompleteClass */
  override val unhandledMessage: ISignal[this.type, IMessage[MessageType]] = js.native
  /**
    * Change the current kernel associated with the document.
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
    * Initialize the session.
    *
    * #### Notes
    * If a server session exists on the current path, we will connect to it.
    * If preferences include disabling `canStart` or `shouldStart`, no
    * server session will be started.
    * If a kernel id is given, we attempt to start a session with that id.
    * If a default kernel is available, we connect to it.
    * Otherwise we ask the user to select a kernel.
    */
  def initialize(): js.Promise[Unit] = js.native
  /**
    * Restart the session.
    *
    * @returns A promise that resolves with whether the kernel has restarted.
    *
    * #### Notes
    * If there is a running kernel, present a dialog.
    * If there is no kernel, we start a kernel with the last run
    * kernel name and resolves with `true`. If no kernel has been started,
    * this is a no-op, and resolves with `false`.
    */
  /* CompleteClass */
  override def restart(): js.Promise[Boolean] = js.native
  /**
    * Select a kernel for the session.
    */
  /* CompleteClass */
  override def selectKernel(): js.Promise[Unit] = js.native
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
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  /* CompleteClass */
  override def shutdown(): js.Promise[Unit] = js.native
}

