package typings.atJupyterlabLogconsole.libLoggerMod.Logger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * The maximum number of messages to store.
    */
  var maxLength: Double
  /**
    * The log source identifier.
    */
  var source: String
}

object IOptions {
  @scala.inline
  def apply(maxLength: Double, source: String): IOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

