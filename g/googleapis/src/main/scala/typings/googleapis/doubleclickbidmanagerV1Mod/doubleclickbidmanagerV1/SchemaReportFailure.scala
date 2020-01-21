package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An explanation of a report failure.
  */
@js.native
trait SchemaReportFailure extends js.Object {
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String] = js.native
}

object SchemaReportFailure {
  @scala.inline
  def apply(errorCode: String = null): SchemaReportFailure = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportFailure]
  }
}

