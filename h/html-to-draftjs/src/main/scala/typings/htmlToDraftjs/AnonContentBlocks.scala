package typings.htmlToDraftjs

import typings.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentBlocks extends js.Object {
  var contentBlocks: js.Array[ContentBlock]
  var entityMap: js.UndefOr[js.Any] = js.undefined
}

object AnonContentBlocks {
  @scala.inline
  def apply(contentBlocks: js.Array[ContentBlock], entityMap: js.Any = null): AnonContentBlocks = {
    val __obj = js.Dynamic.literal(contentBlocks = contentBlocks.asInstanceOf[js.Any])
    if (entityMap != null) __obj.updateDynamic("entityMap")(entityMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentBlocks]
  }
}

