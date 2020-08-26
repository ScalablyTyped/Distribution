package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Sets what kind of respective attributes' content will be compared as JSON objects, but not as strings.
    * In cases when the value of the attribute is an invalid JSON or can not be wrapped into a function, it will be compared as undefined.
    * @default []
    */
  var compareAttributesAsJSON: js.UndefOr[js.Array[_]] = js.native
  /**
    * Sets what kind of respective attributes' content will be ignored during the comparison:
    * @default []
    */
  var ignoreAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Makes html-differ ignore HTML comments during the comparison.
    * @default true
    */
  var ignoreComments: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore tags' duplicate attributes during the comparison.
    * From the list of the same tag's attributes,
    * the attribute which goes the first will be taken for comparison, others will be ignored
    * @default false
    */
  var ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore end tags during the comparison.
    * @default false
    */
  var ignoreEndTags: js.UndefOr[Boolean] = js.native
  /**
    * Makes html-differ ignore whitespaces (spaces, tabs, new lines etc.) during the comparison.
    * @default true
    */
  var ignoreWhitespaces: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCompareAttributesAsJSONVarargs(value: js.Any*): Self = this.set("compareAttributesAsJSON", js.Array(value :_*))
    @scala.inline
    def setCompareAttributesAsJSON(value: js.Array[_]): Self = this.set("compareAttributesAsJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareAttributesAsJSON: Self = this.set("compareAttributesAsJSON", js.undefined)
    @scala.inline
    def setIgnoreAttributesVarargs(value: String*): Self = this.set("ignoreAttributes", js.Array(value :_*))
    @scala.inline
    def setIgnoreAttributes(value: js.Array[String]): Self = this.set("ignoreAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreAttributes: Self = this.set("ignoreAttributes", js.undefined)
    @scala.inline
    def setIgnoreComments(value: Boolean): Self = this.set("ignoreComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreComments: Self = this.set("ignoreComments", js.undefined)
    @scala.inline
    def setIgnoreDuplicateAttributes(value: Boolean): Self = this.set("ignoreDuplicateAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDuplicateAttributes: Self = this.set("ignoreDuplicateAttributes", js.undefined)
    @scala.inline
    def setIgnoreEndTags(value: Boolean): Self = this.set("ignoreEndTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEndTags: Self = this.set("ignoreEndTags", js.undefined)
    @scala.inline
    def setIgnoreWhitespaces(value: Boolean): Self = this.set("ignoreWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWhitespaces: Self = this.set("ignoreWhitespaces", js.undefined)
  }
  
}

