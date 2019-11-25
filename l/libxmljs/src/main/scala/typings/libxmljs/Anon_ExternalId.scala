package typings.libxmljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalId extends js.Object {
  var externalId: String
  var name: String
  var systemId: String
}

object Anon_ExternalId {
  @scala.inline
  def apply(externalId: String, name: String, systemId: String): Anon_ExternalId = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExternalId]
  }
}

