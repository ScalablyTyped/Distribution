package typings.jupyterlabRendermime.outputmodelMod

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
class OutputModel protected () extends IOutputModel {
  /**
    * Construct a new output model.
    */
  def this(options: IOptions) = this()
  
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
  @JSName("changed")
  def changed_MOutputModel: ISignal[this.type, Unit] = js.native
  
  /**
    * The data associated with the model.
    */
  @JSName("data")
  def data_MOutputModel: ReadonlyPartialJSONObject = js.native
  
  /**
    * The metadata associated with the model.
    */
  @JSName("metadata")
  def metadata_MOutputModel: ReadonlyPartialJSONObject = js.native
}
@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
object OutputModel extends js.Object {
  
  /**
    * Get the data for an output.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The data for the payload.
    */
  def getData(output: IOutput): PartialJSONObject = js.native
  
  /**
    * Get the metadata from an output message.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The metadata for the payload.
    */
  def getMetadata(output: IOutput): PartialJSONObject = js.native
}
