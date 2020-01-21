package typings.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamespace extends js.Object {
  var namespace: String | Null
  var `type`: String
}

object AnonNamespace {
  @scala.inline
  def apply(`type`: String, namespace: String = null): AnonNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNamespace]
  }
}

