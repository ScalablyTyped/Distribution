package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs

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
  var data: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
  /**
    * The new metadata object.
    */
  var metadata: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
}

object ISetDataOptions {
  @scala.inline
  def apply(
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null
  ): ISetDataOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ISetDataOptions]
  }
}

