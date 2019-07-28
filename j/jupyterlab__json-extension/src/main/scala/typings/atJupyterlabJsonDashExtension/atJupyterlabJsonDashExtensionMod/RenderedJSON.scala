package typings.atJupyterlabJsonDashExtension.atJupyterlabJsonDashExtensionMod

import typings.atJupyterlabApputils.libPrintingMod.PrintingNs.IPrintable
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererOptions
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension", "RenderedJSON")
@js.native
class RenderedJSON protected ()
  extends IRenderer
     with IPrintable {
  /**
    * Create a new widget for rendering JSON.
    */
  def this(options: IRendererOptions) = this()
  var _mimeType: js.Any = js.native
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
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
}

