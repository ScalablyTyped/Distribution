package typings.intlTelInput.mod

import typings.intlTelInput.mod.intlTelInputUtils.CountryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def getCountryData(): js.Array[CountryData] = js.native
  
  /**
    * Load the utils.js script (included in the lib directory) to enable
    * formatting/validation etc.
    */
  def loadUtils(path: String): Unit = js.native
  def loadUtils(path: String, utilsScriptDeferred: Boolean): Unit = js.native
}
