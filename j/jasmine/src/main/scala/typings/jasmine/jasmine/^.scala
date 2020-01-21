package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object ^ extends js.Object {
  /**
    * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
    */
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var HtmlReporter: typings.jasmine.jasmine.HtmlReporter = js.native
  var HtmlSpecFilter: typings.jasmine.jasmine.HtmlSpecFilter = js.native
  /**
    * Maximum number of array elements to display when pretty printing objects.
    * This will also limit the number of keys and values displayed for an object.
    * Elements past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_ARRAY_LENGTH: Double = js.native
  /**
    * Maximum number of charasters to display when pretty printing objects.
    * Characters past this number will be ellipised.
    */
  var MAX_PRETTY_PRINT_CHARS: Double = js.native
  /**
    * Maximum object depth the pretty printer will print to.
    * Set this to a lower value to speed up pretty printing if you have large objects.
    */
  var MAX_PRETTY_PRINT_DEPTH: Double = js.native
  var matchersUtil: MatchersUtil_ = js.native
}

