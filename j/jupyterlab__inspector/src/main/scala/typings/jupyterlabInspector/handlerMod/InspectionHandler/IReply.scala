package typings.jupyterlabInspector.handlerMod.InspectionHandler

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
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
  var data: ReadonlyJSONObject
  /**
    * Any metadata that accompanies the MIME bundle returning from a request.
    */
  var metadata: ReadonlyJSONObject
}

object IReply {
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: ReadonlyJSONObject): IReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReply]
  }
}

