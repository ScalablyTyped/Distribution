package typings.ldapFilters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute_ extends js.Object {
  var escapeChars: js.Array[String] = js.native
  var name: String = js.native
  def approx(value: String): Filter = js.native
  def contains(value: String): Filter = js.native
  def endsWith(value: String): Filter = js.native
  def equalTo(value: String): Filter = js.native
  def escape(value: String): String = js.native
  def gte(value: String): Filter = js.native
  def lte(value: String): Filter = js.native
  def present(): Filter = js.native
  def raw(value: String): Filter = js.native
  def startsWith(value: String): Filter = js.native
}

object Attribute_ {
  @scala.inline
  def apply(
    approx: String => Filter,
    contains: String => Filter,
    endsWith: String => Filter,
    equalTo: String => Filter,
    escape: String => String,
    escapeChars: js.Array[String],
    gte: String => Filter,
    lte: String => Filter,
    name: String,
    present: () => Filter,
    raw: String => Filter,
    startsWith: String => Filter
  ): Attribute_ = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars.asInstanceOf[js.Any], gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name.asInstanceOf[js.Any], present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
    __obj.asInstanceOf[Attribute_]
  }
  @scala.inline
  implicit class Attribute_Ops[Self <: Attribute_] (val x: Self) extends AnyVal {
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
    def setApprox(value: String => Filter): Self = this.set("approx", js.Any.fromFunction1(value))
    @scala.inline
    def setContains(value: String => Filter): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setEndsWith(value: String => Filter): Self = this.set("endsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setEqualTo(value: String => Filter): Self = this.set("equalTo", js.Any.fromFunction1(value))
    @scala.inline
    def setEscape(value: String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    @scala.inline
    def setEscapeCharsVarargs(value: String*): Self = this.set("escapeChars", js.Array(value :_*))
    @scala.inline
    def setEscapeChars(value: js.Array[String]): Self = this.set("escapeChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setGte(value: String => Filter): Self = this.set("gte", js.Any.fromFunction1(value))
    @scala.inline
    def setLte(value: String => Filter): Self = this.set("lte", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresent(value: () => Filter): Self = this.set("present", js.Any.fromFunction0(value))
    @scala.inline
    def setRaw(value: String => Filter): Self = this.set("raw", js.Any.fromFunction1(value))
    @scala.inline
    def setStartsWith(value: String => Filter): Self = this.set("startsWith", js.Any.fromFunction1(value))
  }
  
}

