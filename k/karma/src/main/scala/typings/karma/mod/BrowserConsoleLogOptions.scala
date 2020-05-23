package typings.karma.mod

import typings.karma.karmaStrings.debug_
import typings.karma.karmaStrings.error_
import typings.karma.karmaStrings.info_
import typings.karma.karmaStrings.log_
import typings.karma.karmaStrings.warn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserConsoleLogOptions extends js.Object {
  /**
    * The format is a string where `%b`, `%t`, `%T`, and `%m` are replaced with the browser string,
    * log type in lower-case, log type in uppercase, and log message, respectively.
    * This format will only effect the output file
    */
  var format: js.UndefOr[String] = js.undefined
  /** the desired log-level, where level log always is logged */
  var level: js.UndefOr[log_ | error_ | warn_ | info_ | debug_] = js.undefined
  /** output-path of the output-file */
  var path: js.UndefOr[String] = js.undefined
  /** if the log should be written in the terminal, or not */
  var terminal: js.UndefOr[Boolean] = js.undefined
}

object BrowserConsoleLogOptions {
  @scala.inline
  def apply(
    format: String = null,
    level: log_ | error_ | warn_ | info_ | debug_ = null,
    path: String = null,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): BrowserConsoleLogOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserConsoleLogOptions]
  }
}

