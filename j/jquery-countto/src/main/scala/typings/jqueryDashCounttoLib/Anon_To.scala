package typings
package jqueryDashCounttoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_To extends js.Object {
  /**
    * The number of decimal places to show when using the default formatter
    */
  var decimals: scala.Double
  /**
    * A handler that is used to format the current value before rendering to the DOM
    */
  var formatter: js.Function2[/* value */ scala.Double, /* options */ js.Object, java.lang.String]
  /**
    * The number to start counting from
    */
  var from: scala.Double
  /**
    * A callback function that is triggered when counting finishes
    */
  var onComplete: js.Function1[/* value */ scala.Double, scala.Unit]
  /**
    * A callback function that is triggered for every iteration that the counter updates
    */
  var onUpdate: js.Function1[/* value */ scala.Double, scala.Unit]
  /**
    * The number of milliseconds to wait between refreshing the counter
    */
  var refreshInterval: scala.Double
  /**
    * The number of milliseconds it should take to finish counting
    */
  var speed: scala.Double
  /**
    * The number to stop counting at
    */
  var to: scala.Double
}

