package typings.lucene.luceneMod

import typings.lucene.luceneStrings.`<implicit>`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var boost: Null | Double
  var field: String | `<implicit>`
  var fieldLocation: Null
  var prefix: Null | String
  var quoted: Boolean
  var regex: Boolean
  var similarity: Null
  var term: String
  var termLocation: TermLocation
}

object Node {
  @scala.inline
  def apply(
    field: String | `<implicit>`,
    fieldLocation: Null,
    quoted: Boolean,
    regex: Boolean,
    similarity: Null,
    term: String,
    termLocation: TermLocation,
    boost: Int | Double = null,
    prefix: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = fieldLocation.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

