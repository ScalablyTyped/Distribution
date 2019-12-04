package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionGroups extends js.Object {
  var description: String
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object Anon_DescriptionGroups {
  @scala.inline
  def apply(description: String, groups: js.Array[MetadataGroup], name: String, summary: String): Anon_DescriptionGroups = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionGroups]
  }
}

