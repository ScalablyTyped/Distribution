package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model for mime data.
  */
@js.native
trait IMimeModel_ extends js.Object {
  /**
    * The data associated with the model.
    */
  val data: ReadonlyPartialJSONObject = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  val metadata: ReadonlyPartialJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  val trusted: Boolean = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  def setData(options: ISetDataOptions): Unit = js.native
}

object IMimeModel_ {
  @scala.inline
  def apply(
    data: ReadonlyPartialJSONObject,
    metadata: ReadonlyPartialJSONObject,
    setData: ISetDataOptions => Unit,
    trusted: Boolean
  ): IMimeModel_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMimeModel_]
  }
  @scala.inline
  implicit class IMimeModel_Ops[Self <: IMimeModel_] (val x: Self) extends AnyVal {
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
    def setData(value: ReadonlyPartialJSONObject): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ReadonlyPartialJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetData(value: ISetDataOptions => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
  }
  
}

