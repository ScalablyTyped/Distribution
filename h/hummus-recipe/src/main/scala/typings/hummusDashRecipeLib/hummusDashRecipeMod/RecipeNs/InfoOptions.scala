package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object InfoOptions {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null,
    subject: java.lang.String = null,
    title: java.lang.String = null,
    version: java.lang.String = null
  ): InfoOptions = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[InfoOptions]
  }
}

