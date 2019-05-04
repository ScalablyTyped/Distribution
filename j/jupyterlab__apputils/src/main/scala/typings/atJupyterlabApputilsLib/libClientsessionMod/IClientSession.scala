package typings
package atJupyterlabApputilsLib.libClientsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientSession
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted for a kernel messages.
    */
  val iopubMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage]
  /**
    * Whether the session is ready.
    */
  val isReady: scala.Boolean
  /**
    * The current kernel associated with the document.
    */
  val kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection | scala.Null
  /**
    * A signal emitted when the kernel changes.
    */
  val kernelChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IKernelChangedArgs
  ]
  /**
    * The display name of the kernel.
    */
  val kernelDisplayName: java.lang.String
  /**
    * The kernel preference.
    */
  var kernelPreference: atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference
  /**
    * The current name associated with the client session.
    */
  val name: java.lang.String
  /**
    * The current path associated with the client session.
    */
  val path: java.lang.String
  /**
    * A signal emitted when a session property changes.
    */
  val propertyChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.path | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.name | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.`type`
  ]
  /**
    * A promise that is fulfilled when the session is ready.
    */
  val ready: js.Promise[scala.Unit]
  /**
    * The current status of the client session.
    */
  val status: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  /**
    * A signal emitted when the kernel status changes.
    */
  val statusChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status]
  /**
    * A signal emitted when the session is shut down.
    */
  val terminated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
  /**
    * The type of the client session.
    */
  val `type`: java.lang.String
  /**
    * A signal emitted for an unhandled kernel message.
    */
  val unhandledMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage]
  /**
    * Change the current kernel associated with the document.
    */
  def changeKernel(options: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel]): js.Promise[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection]
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
  def restart(): js.Promise[scala.Boolean]
  /**
    * Select a kernel for the session.
    */
  def selectKernel(): js.Promise[scala.Unit]
  /**
    * Change the session name.
    */
  def setName(name: java.lang.String): js.Promise[scala.Unit]
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
  def setPath(path: java.lang.String): js.Promise[scala.Unit]
  /**
    * Change the session type.
    */
  def setType(`type`: java.lang.String): js.Promise[scala.Unit]
  /**
    * Kill the kernel and shutdown the session.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def shutdown(): js.Promise[scala.Unit]
}

object IClientSession {
  @scala.inline
  def apply(
    changeKernel: stdLib.Partial[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IModel] => js.Promise[atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection],
    dispose: () => scala.Unit,
    iopubMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IClientSession, 
      atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage
    ],
    isDisposed: scala.Boolean,
    isReady: scala.Boolean,
    kernelChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IClientSession, 
      atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IKernelChangedArgs
    ],
    kernelDisplayName: java.lang.String,
    kernelPreference: atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference,
    name: java.lang.String,
    path: java.lang.String,
    propertyChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IClientSession, 
      atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.path | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.name | atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.`type`
    ],
    ready: js.Promise[scala.Unit],
    restart: () => js.Promise[scala.Boolean],
    selectKernel: () => js.Promise[scala.Unit],
    setName: java.lang.String => js.Promise[scala.Unit],
    setPath: java.lang.String => js.Promise[scala.Unit],
    setType: java.lang.String => js.Promise[scala.Unit],
    shutdown: () => js.Promise[scala.Unit],
    status: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status,
    statusChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IClientSession, atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status],
    terminated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IClientSession, scala.Unit],
    `type`: java.lang.String,
    unhandledMessage: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IClientSession, 
      atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage
    ],
    kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection = null
  ): IClientSession = {
    val __obj = js.Dynamic.literal(changeKernel = js.Any.fromFunction1(changeKernel), dispose = js.Any.fromFunction0(dispose), iopubMessage = iopubMessage, isDisposed = isDisposed, isReady = isReady, kernelChanged = kernelChanged, kernelDisplayName = kernelDisplayName, kernelPreference = kernelPreference, name = name, path = path, propertyChanged = propertyChanged, ready = ready, restart = js.Any.fromFunction0(restart), selectKernel = js.Any.fromFunction0(selectKernel), setName = js.Any.fromFunction1(setName), setPath = js.Any.fromFunction1(setPath), setType = js.Any.fromFunction1(setType), shutdown = js.Any.fromFunction0(shutdown), status = status, statusChanged = statusChanged, terminated = terminated, unhandledMessage = unhandledMessage)
    __obj.updateDynamic("type")(`type`)
    if (kernel != null) __obj.updateDynamic("kernel")(kernel)
    __obj.asInstanceOf[IClientSession]
  }
}

