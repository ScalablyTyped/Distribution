package typings.jupyterlabOutputarea.widgetMod

import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.ChangedArgs
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.kernelKernelMod.Kernel.IShellFuture
import typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
import typings.jupyterlabServices.messagesMod.KernelMessage.IInputRequestMsg
import typings.jupyterlabServices.messagesMod.KernelMessage.IShellMessage
import typings.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType
import typings.phosphorSignaling.mod.Signal
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
@js.native
class OutputArea_ protected () extends Widget {
  /**
    * Construct an output area widget.
    */
  def this(options: IOptions) = this()
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
    * Update indices in _displayIdMap in response to element remove from model items
    * *
    * @param startIndex - The index of first element removed
    *
    * @param count - The number of elements removed from model items
    *
    */
  var _moveDisplayIdIndices: js.Any = js.native
  /**
    * Handle an execute reply message.
    */
  var _onExecuteReply: js.Any = js.native
  /**
    * Handle an iopub message.
    */
  var _onIOPub: js.Any = js.native
  var _preventHeightChangeJitter: js.Any = js.native
  /**
    * Update an output in the layout in place.
    */
  var _setOutput: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The kernel future associated with the output area.
    */
  var future: (IShellFuture[IExecuteRequestMsg, IExecuteReplyMsg]) | Null = js.native
  /**
    * The model used by the widget.
    */
  val model: IOutputAreaModel = js.native
  /**
    * A public signal used to indicate the number of outputs has changed.
    *
    * #### Notes
    * This is useful for parents who want to apply styling based on the number
    * of outputs. Emits the current number of outputs.
    */
  val outputLengthChanged: Signal[this.type, Double] = js.native
  /**
    * The rendermime instance used by the widget.
    */
  val rendermime: IRenderMimeRegistry = js.native
  /**
    * A read-only sequence of the chidren widgets in the output area.
    */
  val widgets: js.Array[Widget] = js.native
  /**
    * Create an output item with a prompt and actual output
    *
    * @returns a rendered widget, or null if we cannot render
    * #### Notes
    */
  /* protected */ def createOutputItem(model: IOutputModel): Widget | Null = js.native
  /**
    * Render a mimetype
    */
  /* protected */ def createRenderedMimetype(model: IOutputModel): Widget | Null = js.native
  /**
    * Handle an input request from a kernel.
    */
  /* protected */ def onInputRequest(
    msg: IInputRequestMsg,
    future: IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]]
  ): Unit = js.native
  /**
    * Follow changes on the model state.
    */
  /* protected */ def onModelChanged(sender: IOutputAreaModel, args: ChangedArgs): Unit = js.native
  /**
    * Follow changes on the output model state.
    */
  /* protected */ def onStateChanged(sender: IOutputAreaModel): Unit = js.native
}

