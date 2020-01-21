package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.AnonErrorsAnonCodeLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceLastAttempt extends js.Object {
  /**
    * [Output Only] Encountered errors during the last attempt to create or
    * delete the instance.
    */
  var errors: js.UndefOr[AnonErrorsAnonCodeLocation] = js.native
}

object SchemaManagedInstanceLastAttempt {
  @scala.inline
  def apply(errors: AnonErrorsAnonCodeLocation = null): SchemaManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedInstanceLastAttempt]
  }
}

