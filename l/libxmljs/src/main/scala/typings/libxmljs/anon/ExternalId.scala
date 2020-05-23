package typings.libxmljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalId extends js.Object {
  var externalId: String
  var name: String
  var systemId: String
}

object ExternalId {
  @scala.inline
  def apply(externalId: String, name: String, systemId: String): ExternalId = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalId]
  }
}

