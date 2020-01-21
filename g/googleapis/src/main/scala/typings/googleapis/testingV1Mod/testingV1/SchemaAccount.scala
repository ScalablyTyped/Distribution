package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies an account and how to log into it.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * An automatic google login account.
    */
  var googleAuto: js.UndefOr[SchemaGoogleAuto] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(googleAuto: SchemaGoogleAuto = null): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (googleAuto != null) __obj.updateDynamic("googleAuto")(googleAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

