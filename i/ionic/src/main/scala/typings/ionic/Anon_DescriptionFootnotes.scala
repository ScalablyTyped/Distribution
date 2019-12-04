package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionFootnotes extends js.Object {
  var description: String
  var footnotes: js.Array[Anon_Id]
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object Anon_DescriptionFootnotes {
  @scala.inline
  def apply(
    description: String,
    footnotes: js.Array[Anon_Id],
    groups: js.Array[MetadataGroup],
    name: String,
    summary: String
  ): Anon_DescriptionFootnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionFootnotes]
  }
}

