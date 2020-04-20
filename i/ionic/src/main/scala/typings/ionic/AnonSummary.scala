package typings.ionic

import typings.ionicCliFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSummary extends js.Object {
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object AnonSummary {
  @scala.inline
  def apply(groups: js.Array[MetadataGroup], name: String, summary: String): AnonSummary = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSummary]
  }
}

