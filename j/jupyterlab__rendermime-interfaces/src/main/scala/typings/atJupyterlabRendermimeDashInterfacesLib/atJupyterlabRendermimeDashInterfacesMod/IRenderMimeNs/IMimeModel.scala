package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model for mime data.
  */
trait IMimeModel extends js.Object {
  /**
    * The data associated with the model.
    */
  val data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  /**
    * The metadata associated with the model.
    */
  val metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  /**
    * Whether the data in the model is trusted.
    */
  val trusted: scala.Boolean
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  def setData(
    options: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions
  ): scala.Unit
}

object IMimeModel {
  @scala.inline
  def apply(
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    setData: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions => scala.Unit,
    trusted: scala.Boolean
  ): IMimeModel = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata, setData = js.Any.fromFunction1(setData), trusted = trusted)
  
    __obj.asInstanceOf[IMimeModel]
  }
}

