package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to atag that fires before another tag in order to
  * set up dependencies.
  */
@js.native
trait SchemaSetupTag extends js.Object {
  /**
    * If true, fire the main tag if and only if the setup tag fires
    * successfully. If false, fire the main tag regardless of setup tag firing
    * status.
    */
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.native
  /**
    * The name of the setup tag.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaSetupTag {
  @scala.inline
  def apply(stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined, tagName: String = null): SchemaSetupTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopOnSetupFailure)) __obj.updateDynamic("stopOnSetupFailure")(stopOnSetupFailure.get.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetupTag]
  }
}

