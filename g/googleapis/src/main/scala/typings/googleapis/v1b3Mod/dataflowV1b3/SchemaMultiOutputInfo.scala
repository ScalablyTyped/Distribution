package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a multi-output DoFn.
  */
@js.native
trait SchemaMultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this should
    * correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaMultiOutputInfo {
  @scala.inline
  def apply(tag: String = null): SchemaMultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMultiOutputInfo]
  }
}

