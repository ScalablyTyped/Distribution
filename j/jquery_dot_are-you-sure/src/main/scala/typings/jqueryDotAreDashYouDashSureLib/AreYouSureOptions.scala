package typings
package jqueryDotAreDashYouDashSureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Options available to control dirty form checking*/
trait AreYouSureOptions extends js.Object {
  /**Callback when form is found to be dirty - allows control of submit/reset buttons etc*/
  var change: js.UndefOr[js.Function] = js.undefined
  /**Class to assign to the form when dirty*/
  var dirtyClass: js.UndefOr[java.lang.String] = js.undefined
  /**Jquery selector to use to find input elements*/
  var fieldSelector: js.UndefOr[java.lang.String] = js.undefined
  /**Message to show when attempting to quit a dirty form without saving*/
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**Make Are-You-Sure "silent" by disabling the warning message*/
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

