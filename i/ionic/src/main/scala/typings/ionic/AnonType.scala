package typings.ionic

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var id: String
  var name: String
  var `type`: ProjectType
}

object AnonType {
  @scala.inline
  def apply(id: String, name: String, `type`: ProjectType): AnonType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

