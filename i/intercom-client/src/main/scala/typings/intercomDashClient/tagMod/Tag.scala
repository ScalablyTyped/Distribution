package typings.intercomDashClient.tagMod

import typings.intercomDashClient.intercomDashClientStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof intercom-client.intercom-client/Tag.TagIdentifier ]:? intercom-client.intercom-client/Tag.TagIdentifier[P]} */ trait Tag extends js.Object {
  val id: String
  var name: String
  val `type`: tag
}

object Tag {
  @scala.inline
  def apply(id: String, name: String, `type`: tag): Tag = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tag]
  }
}

