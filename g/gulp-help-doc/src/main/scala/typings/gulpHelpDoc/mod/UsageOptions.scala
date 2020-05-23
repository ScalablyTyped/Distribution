package typings.gulpHelpDoc.mod

import typings.gulpHelpDoc.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageOptions extends js.Object {
  /**
    * Path to a gulpfile (default is gulpfile.js)
    * Normally, there is no need to change this option. It may be used
    * for some special cases, like mocking gulpfile for testing.
    */
  var gulpfile: js.UndefOr[String] = js.undefined
  /**
    * Defines max width of the column width tasks or args names
    * (by default is 20 characters long)
    */
  var keysColumnWidth: js.UndefOr[Double] = js.undefined
  /**
    * Defines  max line width for the printed output lines
    * (by default is 80 characters long)
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Printing engine (by default is console). Accepted any device
    * which has log() function defined to do output.
    */
  var logger: js.UndefOr[Log] = js.undefined
  /**
    * Defines number of empty characters for left-padding of the output
    */
  var padding: js.UndefOr[Double] = js.undefined
}

object UsageOptions {
  @scala.inline
  def apply(
    gulpfile: String = null,
    keysColumnWidth: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    logger: Log = null,
    padding: js.UndefOr[Double] = js.undefined
  ): UsageOptions = {
    val __obj = js.Dynamic.literal()
    if (gulpfile != null) __obj.updateDynamic("gulpfile")(gulpfile.asInstanceOf[js.Any])
    if (!js.isUndefined(keysColumnWidth)) __obj.updateDynamic("keysColumnWidth")(keysColumnWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageOptions]
  }
}

