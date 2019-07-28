package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOrig extends js.Object {
  var params: js.Object
  var payload: js.Object
  var query: js.Object
}

object RequestOrig {
  @scala.inline
  def apply(params: js.Object, payload: js.Object, query: js.Object): RequestOrig = {
    val __obj = js.Dynamic.literal(params = params, payload = payload, query = query)
  
    __obj.asInstanceOf[RequestOrig]
  }
}

