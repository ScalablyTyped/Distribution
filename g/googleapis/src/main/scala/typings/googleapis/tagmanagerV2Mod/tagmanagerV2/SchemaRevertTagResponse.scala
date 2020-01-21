package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a tag in a workspace.
  */
@js.native
trait SchemaRevertTagResponse extends js.Object {
  /**
    * Tag as it appears in the latest container version since the last
    * workspace synchronization operation. If no tag is present, that means the
    * tag was deleted in the latest container version.
    */
  var tag: js.UndefOr[SchemaTag] = js.native
}

object SchemaRevertTagResponse {
  @scala.inline
  def apply(tag: SchemaTag = null): SchemaRevertTagResponse = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevertTagResponse]
  }
}

