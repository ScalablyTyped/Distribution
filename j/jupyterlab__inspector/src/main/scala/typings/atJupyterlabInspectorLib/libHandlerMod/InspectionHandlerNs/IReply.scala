package typings
package atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to an inspection request.
  */
trait IReply extends js.Object {
  /**
    * The MIME bundle data returned from an inspection request.
    */
  var data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  /**
    * Any metadata that accompanies the MIME bundle returning from a request.
    */
  var metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
}

object IReply {
  @scala.inline
  def apply(
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  ): IReply = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
  
    __obj.asInstanceOf[IReply]
  }
}

