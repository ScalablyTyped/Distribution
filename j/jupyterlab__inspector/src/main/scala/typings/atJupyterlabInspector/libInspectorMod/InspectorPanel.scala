package typings.atJupyterlabInspector.libInspectorMod

import typings.atJupyterlabApputils.libPrintingMod.PrintingNs.IPrintable
import typings.atJupyterlabInspector.libInspectorMod.InspectorPanelNs.IOptions
import typings.atJupyterlabInspector.libTokensMod.IInspector
import typings.atJupyterlabInspector.libTokensMod.IInspectorNs.IInspectable
import typings.atJupyterlabInspector.libTokensMod.IInspectorNs.IInspectorUpdate
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
@js.native
/**
  * Construct an inspector.
  */
class InspectorPanel ()
  extends Panel
     with IInspector
     with IPrintable {
  def this(options: IOptions) = this()
  var _content: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * The source of events the inspector listens for.
    */
  /* CompleteClass */
  override var source: IInspectable | Null = js.native
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
    * Handle inspector update signals.
    */
  /* protected */ def onInspectorUpdate(sender: js.Any, args: IInspectorUpdate): Unit = js.native
  /**
    * Handle source disposed signals.
    */
  /* protected */ def onSourceDisposed(sender: js.Any, args: Unit): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
}

/* static members */
@JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
@js.native
object InspectorPanel extends js.Object {
  /**
    * Generate content widget from string
    */
  var _generateContentWidget: js.Any = js.native
}

