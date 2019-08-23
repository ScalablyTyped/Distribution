package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.lead
import typings.intercomDashClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: lead
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: lead): Anon_Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Identifier]
  }
}

