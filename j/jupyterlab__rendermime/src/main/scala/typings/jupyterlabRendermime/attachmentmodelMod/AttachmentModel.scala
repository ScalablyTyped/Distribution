package typings.jupyterlabRendermime.attachmentmodelMod

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSName("changed")
  def changed_MAttachmentModel: ISignal[this.type, Unit] = js.native
  
  /**
    * The data associated with the model.
    */
  @JSName("data")
  def data_MAttachmentModel: ReadonlyPartialJSONObject = js.native
  
  /**
    * The metadata associated with the model.
    */
  @JSName("metadata")
  def metadata_MAttachmentModel: ReadonlyPartialJSONObject = js.native
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
  def getData(bundle: IMimeBundle): PartialJSONObject = js.native
}
