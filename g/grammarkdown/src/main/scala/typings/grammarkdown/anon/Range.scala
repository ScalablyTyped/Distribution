package typings.grammarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var range: typings.grammarkdown.coreMod.Range
  var text: String
}

object Range {
  @scala.inline
  def apply(range: typings.grammarkdown.coreMod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

