package typings.libxmljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternalId extends js.Object {
  var externalId: String
  var name: String
  var systemId: String
}

object AnonExternalId {
  @scala.inline
  def apply(externalId: String, name: String, systemId: String): AnonExternalId = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalId]
  }
}

