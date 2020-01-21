package typings.jupyterlabRendermime.attachmentmodelMod

import typings.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
@js.native
class AttachmentModel protected () extends IAttachmentModel {
  /**
    * Construct a new attachment model.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _data: js.Any = js.native
  var _raw: js.Any = js.native
  var _rawData: js.Any = js.native
  /**
    * Update an observable JSON object using a readonly JSON object.
    */
  var _updateObservable: js.Any = js.native
  /**
    * A signal emitted when the attachment model changes.
    */
  /* CompleteClass */
  override val changed: ISignal[this.type, Unit] = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: ReadonlyJSONObject = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  /* CompleteClass */
  override val metadata: ReadonlyJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: Boolean = js.native
  /**
    * Dispose of the resources used by the attachment model.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  override def setData(options: ISetDataOptions): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): IMimeBundle = js.native
}

@JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
@js.native
object AttachmentModel extends js.Object {
  /**
    * Get the data for an attachment.
    *
    * @params bundle - A kernel attachment MIME bundle.
    *
    * @returns - The data for the payload.
    */
  def getData(bundle: IMimeBundle): JSONObject = js.native
}

