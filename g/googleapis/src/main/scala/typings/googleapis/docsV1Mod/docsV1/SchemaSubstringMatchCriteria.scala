package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A criteria that matches a specific string of text in the document.
  */
@js.native
trait SchemaSubstringMatchCriteria extends js.Object {
  /**
    * Indicates whether the search should respect case:  - `True`: the search
    * is case sensitive. - `False`: the search is case insensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * The text to search for in the document.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaSubstringMatchCriteria {
  @scala.inline
  def apply(matchCase: js.UndefOr[Boolean] = js.undefined, text: String = null): SchemaSubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubstringMatchCriteria]
  }
}

