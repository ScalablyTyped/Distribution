package typings
package atJupyterlabApputilsLib.libClientsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/clientsession", "ClientSession")
@js.native
class ClientSession protected () extends IClientSession {
  /**
    * Construct a new client session.
    */
  def this(options: atJupyterlabApputilsLib.libClientsessionMod.ClientSessionNs.IOptions) = this()
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
  override val iopubMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Whether the session is ready.
    */
  /* CompleteClass */
  override val isReady: scala.Boolean = js.native
  /**
    * The current kernel associated with the document.
    */
  /* CompleteClass */
  override val kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection | scala.Null = js.native
  /**
    * A signal emitted when the kernel changes.
    */
  /* CompleteClass */
  override val kernelChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IKernelChangedArgs
  ] = js.native
  /**
    * The display name of the kernel.
    */
  /* CompleteClass */
  override val kernelDisplayName: java.lang.String = js.native
  /**
    * The kernel preference.
    */
  /* CompleteClass */
  override var kernelPreference: atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference = js.native
  /**
    * The session manager used by the session.
    */
  val manager: atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IManager = js.native
  /**
    * The current name associated with the client session.
    */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /**
    * The current path associated with the client session.
    */
  /* CompleteClass */
  override val path: java.lang.String = js.native
  /**
    * A signal emitted when a session property changes.
    */
  /* CompleteClass */
  override val propertyChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.path | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.name | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.`type`
  ] = js.native
  /**
    * A promise that is fulfilled when the session is ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[scala.Unit] = js.native
  /**
    * The current status of the client session.
    */
  /* CompleteClass */
  override val status: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status = js.native
  /**
    * A signal emitted when the kernel status changes.
    */
  /* CompleteClass */
  override val statusChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status] = js.native
  /**
    * A signal emitted when the session is shut down.
    */
  /* CompleteClass */
  override val terminated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The type of the client session.
    */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /**
    * A signal emitted for an unhandled kernel message.
    */
  /* CompleteClass */
  override val unhandledMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage] = js.native
  /**
    * Change the current kernel associated with the document.
    */
  /* CompleteClass */
  override def changeKernel(options: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]): js.Promise[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection] = js.native
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
  def initialize(): js.Promise[scala.Unit] = js.native
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
  override def restart(): js.Promise[scala.Boolean] = js.native
  /**
    * Select a kernel for the session.
    */
  /* CompleteClass */
  override def selectKernel(): js.Promise[scala.Unit] = js.native
  /**
    * Change the session name.
    */
  /* CompleteClass */
  override def setName(name: java.lang.String): js.Promise[scala.Unit] = js.native
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
  override def setPath(path: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Change the session type.
    */
  /* CompleteClass */
  override def setType(`type`: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  /* CompleteClass */
  override def shutdown(): js.Promise[scala.Unit] = js.native
}

