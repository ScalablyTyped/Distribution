package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mail search advanced options
  */
@js.native
trait SchemaMailOptions extends js.Object {
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}

object SchemaMailOptions {
  @scala.inline
  def apply(excludeDrafts: js.UndefOr[Boolean] = js.undefined): SchemaMailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeDrafts)) __obj.updateDynamic("excludeDrafts")(excludeDrafts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMailOptions]
  }
}

