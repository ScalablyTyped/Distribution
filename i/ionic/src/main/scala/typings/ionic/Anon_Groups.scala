package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.Array[MetadataGroup]
  var name: String
  var summary: String
}

object Anon_Groups {
  @scala.inline
  def apply(groups: js.Array[MetadataGroup], name: String, summary: String): Anon_Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Groups]
  }
}

