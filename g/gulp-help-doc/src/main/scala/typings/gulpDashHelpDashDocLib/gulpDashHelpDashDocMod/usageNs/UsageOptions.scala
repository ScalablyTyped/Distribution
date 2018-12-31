package typings
package gulpDashHelpDashDocLib.gulpDashHelpDashDocMod.usageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageOptions extends js.Object {
  /**
    * Path to a gulpfile (default is gulpfile.js)
    * Normally, there is no need to change this option. It may be used
    * for some special cases, like mocking gulpfile for testing.
    */
  var gulpfile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines max width of the column width tasks or args names
    * (by default is 20 characters long)
    */
  var keysColumnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines  max line width for the printed output lines
    * (by default is 80 characters long)
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Printing engine (by default is console). Accepted any device
    * which has log() function defined to do output.
    */
  var logger: js.UndefOr[gulpDashHelpDashDocLib.Anon_Log] = js.undefined
  /**
    * Defines number of empty characters for left-padding of the output
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
}

