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
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = fieldLocation, quoted = quoted, regex = regex, similarity = similarity, term = term, termLocation = termLocation)
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Node]
  }
}

