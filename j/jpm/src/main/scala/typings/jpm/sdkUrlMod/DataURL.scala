package typings.jpm.sdkUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataURL extends js.Object {
  var base64: String
  var data: String
  var mimeType: String
  var parameters: js.Object
}

object DataURL {
  @scala.inline
  def apply(base64: String, data: String, mimeType: String, parameters: js.Object, toString: () => String): DataURL = {
    val __obj = js.Dynamic.literal(base64 = base64, data = data, mimeType = mimeType, parameters = parameters, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[DataURL]
  }
}

