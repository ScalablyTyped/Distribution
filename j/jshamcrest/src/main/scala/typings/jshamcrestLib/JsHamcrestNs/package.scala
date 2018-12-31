package typings
package jshamcrestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JsHamcrestNs {
  //
  // Description
  //
  /**
    * Defines the method for describing the object to a description.
    */
  type DescribeTo = js.Function1[/* description */ Description, scala.Unit]
  /**
    * Defines the method for describing a value to a description.
    */
  type DescribeValueTo = js.Function2[/* value */ js.Any, /* description */ Description, scala.Unit]
  //
  // Matcher
  //
  /**
    * Defines the method for testing the matcher against an actual value.
    */
  type Matches = js.Function1[/* value */ js.Any, scala.Boolean]
}
