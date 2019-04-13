package typings
package intlDashTelDashInputLib.intlDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Default options for all instances
    */
  var defaults: Options = js.native
  /**
    * Get all of the plugin's country data - either to re-use elsewhere
    * e.g. to populate a country dropdown.
    */
  def getCountryData(): js.Array[intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.CountryData] = js.native
  /**
    * Load the utils.js script (included in the lib directory) to enable
    * formatting/validation etc.
    */
  def loadUtils(path: java.lang.String): scala.Unit = js.native
  def loadUtils(path: java.lang.String, utilsScriptDeferred: scala.Boolean): scala.Unit = js.native
}

