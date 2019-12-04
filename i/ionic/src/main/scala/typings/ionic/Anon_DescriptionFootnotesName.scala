package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionFootnotesName extends js.Object {
  var description: String
  var footnotes: js.Array[Anon_IdUrl]
  var name: String
  var summary: String
}

object Anon_DescriptionFootnotesName {
  @scala.inline
  def apply(description: String, footnotes: js.Array[Anon_IdUrl], name: String, summary: String): Anon_DescriptionFootnotesName = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionFootnotesName]
  }
}

