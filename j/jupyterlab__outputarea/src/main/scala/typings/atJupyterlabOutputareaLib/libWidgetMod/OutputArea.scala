package typings
package atJupyterlabOutputareaLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
@js.native
class OutputArea protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct an output area widget.
    */
  def this(options: atJupyterlabOutputareaLib.libWidgetMod.OutputAreaNs.IOptions) = this()
  /**
    * Clear the widget inputs and outputs.
    */
  var _clear: js.Any = js.native
  var _displayIdMap: js.Any = js.native
  var _future: js.Any = js.native
  /**
    * Render and insert a single output into the layout.
    */
  var _insertOutput: js.Any = js.native
  var _minHeightTimeout: js.Any = js.native
  /**
    * Handle an execute reply message.
    */
  var _onExecuteReply: js.Any = js.native
  /**
    * Handle an iopub message.
    */
  var _onIOPub: js.Any = js.native
  /**
    * Update an output in the layout in place.
    */
  var _setOutput: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: atJupyterlabOutputareaLib.libWidgetMod.OutputAreaNs.IContentFactory = js.native
  /**
    * The kernel future associated with the output area.
    */
  var future: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IFuture = js.native
  /**
    * The model used by the widget.
    */
  val model: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel = js.native
  /**
    * A public signal used to indicate the number of outputs has changed.
    *
    * #### Notes
    * This is useful for parents who want to apply styling based on the number
    * of outputs. Emits the current number of outputs.
    */
  val outputLengthChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.Signal[this.type, scala.Double] = js.native
  /**
    * The rendermime instance used by the widget.
    */
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = js.native
  /**
    * A read-only sequence of the chidren widgets in the output area.
    */
  val widgets: js.Array[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = js.native
  /**
    * Create an output item with a prompt and actual output
    */
  /* protected */ def createOutputItem(model: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  /**
    * Render a mimetype
    */
  /* protected */ def createRenderedMimetype(model: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  /**
    * Handle an input request from a kernel.
    */
  /* protected */ def onInputRequest(
    msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IInputRequestMsg,
    future: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IFuture
  ): scala.Unit = js.native
  /**
    * Follow changes on the model state.
    */
  /* protected */ def onModelChanged(
    sender: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel,
    args: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs.ChangedArgs
  ): scala.Unit = js.native
  /**
    * Follow changes on the output model state.
    */
  /* protected */ def onStateChanged(sender: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel): scala.Unit = js.native
}

