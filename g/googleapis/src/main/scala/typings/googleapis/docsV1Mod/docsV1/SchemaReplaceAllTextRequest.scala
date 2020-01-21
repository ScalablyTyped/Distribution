package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait SchemaReplaceAllTextRequest extends js.Object {
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}

object SchemaReplaceAllTextRequest {
  @scala.inline
  def apply(containsText: SchemaSubstringMatchCriteria = null, replaceText: String = null): SchemaReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (replaceText != null) __obj.updateDynamic("replaceText")(replaceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplaceAllTextRequest]
  }
}

