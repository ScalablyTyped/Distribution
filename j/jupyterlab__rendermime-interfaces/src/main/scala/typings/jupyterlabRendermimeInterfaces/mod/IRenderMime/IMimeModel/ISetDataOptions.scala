package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel

import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to update a mime model.
  */
trait ISetDataOptions extends js.Object {
  /**
    * The new data object.
    */
  var data: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The new metadata object.
    */
  var metadata: js.UndefOr[ReadonlyJSONObject] = js.undefined
}

object ISetDataOptions {
  @scala.inline
  def apply(data: ReadonlyJSONObject = null, metadata: ReadonlyJSONObject = null): ISetDataOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetDataOptions]
  }
}

