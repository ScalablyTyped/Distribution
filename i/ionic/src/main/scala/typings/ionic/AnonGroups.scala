package typings.ionic

import typings.ionicCliFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var description: String
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object AnonGroups {
  @scala.inline
  def apply(description: String, groups: js.Array[MetadataGroup], name: String, summary: String): AnonGroups = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
}

