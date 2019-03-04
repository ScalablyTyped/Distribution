package typings
package intercomDashClientLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof intercom-client.intercom-client/Tag.TagIdentifier ]:? intercom-client.intercom-client/Tag.TagIdentifier[P]} */ trait Tag extends js.Object {
  val id: java.lang.String
  var name: java.lang.String
  val `type`: intercomDashClientLib.intercomDashClientLibStrings.tag
}

object Tag {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.tag
  ): Tag = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tag]
  }
}

