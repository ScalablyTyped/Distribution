package typings
package intlDashRelativeformatLib.intlDashRelativeformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlRelativeFormat extends js.Object {
  /**
       * The format method (which takes a JavaScript date or timestamp) and optional
       * options arguments will compare the date with "now" (or options.now),
       * and returns the formatted string; e.g., "3 hours ago" in the corresponding
       * locale passed into the constructor.
       *
       *    var output = rf.format(new Date());
       *    console.log(output); // => "now"
       *
       * If you wish to specify a "now" value, it can be provided via options.now and
       *  will be used instead of querying Date.now() to get the current "now" value.
       */
  def format(date: stdLib.Date): java.lang.String = js.native
  /**
       * The format method (which takes a JavaScript date or timestamp) and optional
       * options arguments will compare the date with "now" (or options.now),
       * and returns the formatted string; e.g., "3 hours ago" in the corresponding
       * locale passed into the constructor.
       *
       *    var output = rf.format(new Date());
       *    console.log(output); // => "now"
       *
       * If you wish to specify a "now" value, it can be provided via options.now and
       *  will be used instead of querying Date.now() to get the current "now" value.
       */
  def format(date: stdLib.Date, options: intlDashRelativeformatLib.Anon_Now): java.lang.String = js.native
  /**
       * This method returns an object with the options values that were resolved
       * during instance creation. It currently only contains a locale property
       *
       *     var rf = new IntlRelativeFormat('en-us');
       *     console.log(rf.resolvedOptions().locale); // => "en-US"
       *
       * Notice how the specified locale was the all lower-case value: "en-us",
       * but it was resolved and normalized to: "en-US".
       */
  def resolvedOptions(): intlDashRelativeformatLib.Anon_Locale = js.native
}

