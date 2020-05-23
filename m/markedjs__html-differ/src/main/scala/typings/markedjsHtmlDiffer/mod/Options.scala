package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Sets what kind of respective attributes' content will be compared as JSON objects, but not as strings.
    * In cases when the value of the attribute is an invalid JSON or can not be wrapped into a function, it will be compared as undefined.
    * @default []
    */
  var compareAttributesAsJSON: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Sets what kind of respective attributes' content will be ignored during the comparison:
    * @default []
    */
  var ignoreAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Makes html-differ ignore HTML comments during the comparison.
    * @default true
    */
  var ignoreComments: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes html-differ ignore tags' duplicate attributes during the comparison.
    * From the list of the same tag's attributes,
    * the attribute which goes the first will be taken for comparison, others will be ignored
    * @default false
    */
  var ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes html-differ ignore end tags during the comparison.
    * @default false
    */
  var ignoreEndTags: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes html-differ ignore whitespaces (spaces, tabs, new lines etc.) during the comparison.
    * @default true
    */
  var ignoreWhitespaces: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compareAttributesAsJSON: js.Array[_] = null,
    ignoreAttributes: js.Array[String] = null,
    ignoreComments: js.UndefOr[Boolean] = js.undefined,
    ignoreDuplicateAttributes: js.UndefOr[Boolean] = js.undefined,
    ignoreEndTags: js.UndefOr[Boolean] = js.undefined,
    ignoreWhitespaces: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compareAttributesAsJSON != null) __obj.updateDynamic("compareAttributesAsJSON")(compareAttributesAsJSON.asInstanceOf[js.Any])
    if (ignoreAttributes != null) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComments)) __obj.updateDynamic("ignoreComments")(ignoreComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDuplicateAttributes)) __obj.updateDynamic("ignoreDuplicateAttributes")(ignoreDuplicateAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEndTags)) __obj.updateDynamic("ignoreEndTags")(ignoreEndTags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWhitespaces)) __obj.updateDynamic("ignoreWhitespaces")(ignoreWhitespaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

