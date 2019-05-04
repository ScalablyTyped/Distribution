package typings
package atJupyterlabInspectorLib.libInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
@js.native
/**
  * Construct an inspector.
  */
class InspectorPanel ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.TabPanel
     with IInspector {
  var _items: js.Any = js.native
  var _source: js.Any = js.native
  /**
    * The source of events the inspector listens for.
    */
  /* CompleteClass */
  override var source: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectable | scala.Null = js.native
  /**
    * Create an inspector child item and return a disposable to remove it.
    *
    * @param item - The inspector child item being added to the inspector.
    *
    * @returns A disposable that removes the child item from the inspector.
    */
  /* CompleteClass */
  override def add(item: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorItem): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
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
  override def dispose(): scala.Unit = js.native
  /**
    * Handle inspector update signals.
    */
  /* protected */ def onInspectorUpdate(sender: js.Any, args: atJupyterlabInspectorLib.libInspectorMod.IInspectorNs.IInspectorUpdate): scala.Unit = js.native
  /**
    * Handle source disposed signals.
    */
  /* protected */ def onSourceDisposed(sender: js.Any, args: scala.Unit): scala.Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
}

