package typings.jupyterlabRendermime.outputmodelMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOutputModel_ extends IMimeModel {
  
  /**
    * A signal emitted when the output model changes.
    */
  val changed: ISignal[this.type, Unit] = js.native
  
  /**
    * Dispose of the resources used by the output model.
    */
  def dispose(): Unit = js.native
  
  /**
    * The execution count of the model.
    */
  val executionCount: ExecutionCount = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IOutput = js.native
  
  /**
    * The output type.
    */
  val `type`: String = js.native
}
object IOutputModel_ {
  
  @scala.inline
  def apply(
    changed: ISignal[IOutputModel_, Unit],
    data: ReadonlyPartialJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyPartialJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IOutput,
    trusted: Boolean,
    `type`: String
  ): IOutputModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputModel_]
  }
  
  @scala.inline
  implicit class IOutputModel_Ops[Self <: IOutputModel_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChanged(value: ISignal[IOutputModel_, Unit]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => IOutput): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCount(value: ExecutionCount): Self = this.set("executionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCountNull: Self = this.set("executionCount", null)
  }
}
