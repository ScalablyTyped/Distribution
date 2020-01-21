package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTeardownTag extends js.Object {
  /**
    * If true, fire the teardown tag if and only if the main tag fires
    * successfully. If false, fire the teardown tag regardless of main tag
    * firing status.
    */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * The name of the teardown tag.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaTeardownTag {
  @scala.inline
  def apply(stopTeardownOnFailure: js.UndefOr[Boolean] = js.undefined, tagName: String = null): SchemaTeardownTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopTeardownOnFailure)) __obj.updateDynamic("stopTeardownOnFailure")(stopTeardownOnFailure.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTeardownTag]
  }
}

