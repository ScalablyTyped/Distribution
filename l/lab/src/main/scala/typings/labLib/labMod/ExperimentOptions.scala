package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[scala.Boolean] = js.undefined
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[scala.Boolean] = js.undefined
  /** Skip execution? (false) */
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

