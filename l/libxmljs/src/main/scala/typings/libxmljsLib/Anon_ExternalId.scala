package typings
package libxmljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalId extends js.Object {
  var externalId: java.lang.String
  var name: java.lang.String
  var systemId: java.lang.String
}

object Anon_ExternalId {
  @scala.inline
  def apply(externalId: java.lang.String, name: java.lang.String, systemId: java.lang.String): Anon_ExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("externalId")(externalId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("systemId")(systemId)
    __obj.asInstanceOf[Anon_ExternalId]
  }
}

