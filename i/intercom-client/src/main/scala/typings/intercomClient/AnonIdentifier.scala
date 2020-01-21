package typings.intercomClient

import typings.intercomClient.intercomClientStrings.lead
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentifier extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: lead
}

object AnonIdentifier {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: lead): AnonIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentifier]
  }
}

