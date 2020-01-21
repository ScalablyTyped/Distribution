package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database Instance truncate log context.
  */
@js.native
trait SchemaTruncateLogContext extends js.Object {
  /**
    * This is always sql#truncateLogContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of log to truncate. Valid values are MYSQL_GENERAL_TABLE and
    * MYSQL_SLOW_TABLE.
    */
  var logType: js.UndefOr[String] = js.native
}

object SchemaTruncateLogContext {
  @scala.inline
  def apply(kind: String = null, logType: String = null): SchemaTruncateLogContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logType != null) __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTruncateLogContext]
  }
}

