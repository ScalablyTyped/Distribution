package typings.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownDraftJs.anon.Close
import typings.markdownDraftJs.anon.Open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftToMarkdownOptions extends js.Object {
  var entityItems: js.UndefOr[StringDictionary[Close]] = js.undefined
  var styleItems: js.UndefOr[StringDictionary[Open]] = js.undefined
}

object DraftToMarkdownOptions {
  @scala.inline
  def apply(entityItems: StringDictionary[Close] = null, styleItems: StringDictionary[Open] = null): DraftToMarkdownOptions = {
    val __obj = js.Dynamic.literal()
    if (entityItems != null) __obj.updateDynamic("entityItems")(entityItems.asInstanceOf[js.Any])
    if (styleItems != null) __obj.updateDynamic("styleItems")(styleItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftToMarkdownOptions]
  }
}

