package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to update a mime model.
  */
@js.native
trait ISetDataOptions extends js.Object {
  /**
    * The new data object.
    */
  var data: js.UndefOr[ReadonlyPartialJSONObject] = js.native
  /**
    * The new metadata object.
    */
  var metadata: js.UndefOr[ReadonlyPartialJSONObject] = js.native
}

object ISetDataOptions {
  @scala.inline
  def apply(): ISetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetDataOptions]
  }
  @scala.inline
  implicit class ISetDataOptionsOps[Self <: ISetDataOptions] (val x: Self) extends AnyVal {
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
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMetadata(value: ReadonlyPartialJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

