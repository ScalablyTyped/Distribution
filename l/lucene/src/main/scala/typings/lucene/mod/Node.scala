package typings.lucene.mod

import typings.lucene.anon.End
import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var boost: Null | Double = js.native
  var field: String | LessthansignimplicitGreaterthansign = js.native
  var fieldLocation: Null = js.native
  var prefix: Null | String = js.native
  var quoted: Boolean = js.native
  var regex: Boolean = js.native
  var similarity: Null = js.native
  var term: String = js.native
  var termLocation: End = js.native
}

object Node {
  @scala.inline
  def apply(
    field: String | LessthansignimplicitGreaterthansign,
    fieldLocation: Null,
    quoted: Boolean,
    regex: Boolean,
    similarity: Null,
    term: String,
    termLocation: End
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = fieldLocation.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setField(value: String | LessthansignimplicitGreaterthansign): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldLocation(value: Null): Self = this.set("fieldLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimilarity(value: Null): Self = this.set("similarity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermLocation(value: End): Self = this.set("termLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoost(value: Double): Self = this.set("boost", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoostNull: Self = this.set("boost", null)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
  }
  
}

