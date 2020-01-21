package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Modification timestamp.
  */
@js.native
trait SchemaLastModifiedInfo extends js.Object {
  /**
    * Timestamp of the last change in milliseconds since epoch.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaLastModifiedInfo {
  @scala.inline
  def apply(time: String = null): SchemaLastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLastModifiedInfo]
  }
}

