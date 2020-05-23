package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFootnotes extends js.Object {
  var description: String
  var footnotes: js.Array[Url]
  var name: String
  var summary: String
}

object DescriptionFootnotes {
  @scala.inline
  def apply(description: String, footnotes: js.Array[Url], name: String, summary: String): DescriptionFootnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFootnotes]
  }
}

