package typings
package jestDashAxeLib.jestDashAxeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionsResult extends js.Object {
  /**
    * Actual checked aXe verification results.
    */
  var actual: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  /**
    * Whether the assertion passed.
    */
  var pass: scala.Boolean
  /**
    * @returns Message from the Jest assertion.
    */
  def message(): java.lang.String
}

