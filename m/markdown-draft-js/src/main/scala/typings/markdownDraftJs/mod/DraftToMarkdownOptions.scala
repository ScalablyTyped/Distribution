package typings.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownDraftJs.AnonClose
import typings.markdownDraftJs.AnonOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftToMarkdownOptions extends js.Object {
  var entityItems: js.UndefOr[StringDictionary[AnonClose]] = js.undefined
  var styleItems: js.UndefOr[StringDictionary[AnonOpen]] = js.undefined
}

object DraftToMarkdownOptions {
  @scala.inline
  def apply(entityItems: StringDictionary[AnonClose] = null, styleItems: StringDictionary[AnonOpen] = null): DraftToMarkdownOptions = {
    val __obj = js.Dynamic.literal()
    if (entityItems != null) __obj.updateDynamic("entityItems")(entityItems.asInstanceOf[js.Any])
    if (styleItems != null) __obj.updateDynamic("styleItems")(styleItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftToMarkdownOptions]
  }
}

