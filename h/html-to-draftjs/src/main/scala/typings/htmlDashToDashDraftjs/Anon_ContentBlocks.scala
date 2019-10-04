package typings.htmlDashToDashDraftjs

import typings.draftDashJs.draftDashJsMod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentBlocks extends js.Object {
  var contentBlocks: js.Array[ContentBlock]
  var entityMap: js.UndefOr[js.Any] = js.undefined
}

object Anon_ContentBlocks {
  @scala.inline
  def apply(contentBlocks: js.Array[ContentBlock], entityMap: js.Any = null): Anon_ContentBlocks = {
    val __obj = js.Dynamic.literal(contentBlocks = contentBlocks)
    if (entityMap != null) __obj.updateDynamic("entityMap")(entityMap)
    __obj.asInstanceOf[Anon_ContentBlocks]
  }
}

