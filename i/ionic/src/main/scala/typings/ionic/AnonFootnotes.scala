package typings.ionic

import typings.ionicCliFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFootnotes extends js.Object {
  var description: String
  var footnotes: js.Array[AnonId]
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object AnonFootnotes {
  @scala.inline
  def apply(
    description: String,
    footnotes: js.Array[AnonId],
    groups: js.Array[MetadataGroup],
    name: String,
    summary: String
  ): AnonFootnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFootnotes]
  }
}

