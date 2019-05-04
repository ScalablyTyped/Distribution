package typings
package atJupyterlabRendermimeLib.libOutputmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
class OutputModel protected () extends IOutputModel {
  /**
    * Construct a new output model.
    */
  def this(options: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModelNs.IOptions) = this()
  var _changed: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  var _raw: js.Any = js.native
  var _rawData: js.Any = js.native
  var _rawMetadata: js.Any = js.native
  /**
    * Update an observable JSON object using a readonly JSON object.
    */
  var _updateObservable: js.Any = js.native
  /**
    * A signal emitted when the output model changes.
    */
  /* CompleteClass */
  override val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  /**
    * The execution count of the model.
    */
  /* CompleteClass */
  override val executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount = js.native
  /**
    * The metadata associated with the model.
    */
  /* CompleteClass */
  override val metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: scala.Boolean = js.native
  /**
    * The output type.
    */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /**
    * Dispose of the resources used by the output model.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  override def setData(
    options: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions
  ): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IOutput = js.native
}

