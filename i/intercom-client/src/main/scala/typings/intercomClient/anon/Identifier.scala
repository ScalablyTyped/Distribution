package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.lead
import typings.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: lead
}

object Identifier {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: lead): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

