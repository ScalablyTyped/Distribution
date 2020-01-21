package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionFootnotesName extends js.Object {
  var description: String
  var footnotes: js.Array[AnonIdUrl]
  var name: String
  var summary: String
}

object AnonDescriptionFootnotesName {
  @scala.inline
  def apply(description: String, footnotes: js.Array[AnonIdUrl], name: String, summary: String): AnonDescriptionFootnotesName = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptionFootnotesName]
  }
}

