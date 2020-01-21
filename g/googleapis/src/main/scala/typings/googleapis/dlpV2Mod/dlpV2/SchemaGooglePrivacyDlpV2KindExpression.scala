package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a Datastore kind.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KindExpression extends js.Object {
  /**
    * The name of the kind.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KindExpression {
  @scala.inline
  def apply(name: String = null): SchemaGooglePrivacyDlpV2KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KindExpression]
  }
}

