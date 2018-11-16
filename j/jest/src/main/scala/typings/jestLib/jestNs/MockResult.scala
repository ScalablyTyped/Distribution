package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the result of a single call to a mock function.
     */

trait MockResult extends js.Object {
  /**
           * True if the function threw.
           * False if the function returned.
           */
  var isThrow: scala.Boolean
  /**
           * The value that was either thrown or returned by the function.
           */
  var value: js.Any
}

