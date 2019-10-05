package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IMimeModel.ISetDataOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model for mime data.
  */
@JSName("IMimeModel")
trait IMimeModel_ extends js.Object {
  /**
    * The data associated with the model.
    */
  val data: ReadonlyJSONObject
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  val metadata: ReadonlyJSONObject
  /**
    * Whether the data in the model is trusted.
    */
  val trusted: Boolean
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  def setData(options: ISetDataOptions): Unit
}

object IMimeModel_ {
  @scala.inline
  def apply(
    data: ReadonlyJSONObject,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    trusted: Boolean
  ): IMimeModel_ = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata, setData = js.Any.fromFunction1(setData), trusted = trusted)
  
    __obj.asInstanceOf[IMimeModel_]
  }
}

