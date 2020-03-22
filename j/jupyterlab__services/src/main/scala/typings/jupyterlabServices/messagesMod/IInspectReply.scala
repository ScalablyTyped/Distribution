package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspectReply extends IReplyOkContent {
  var data: JSONObject
  var found: Boolean
  var metadata: JSONObject
}

object IInspectReply {
  @scala.inline
  def apply(data: JSONObject, found: Boolean, metadata: JSONObject, status: ok): IInspectReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInspectReply]
  }
}

