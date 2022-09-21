package typings.intlTelInput.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlTelInputGlobals extends StObject {
  
  /**
    * Default options for all instances
    */
  val defaults: Options = js.native
  
  /**
    * Get all of the plugin's country data - either to re-use elsewhere
    * e.g. to populate a country dropdown.
    */
  def getCountryData(): js.Array[CountryData] = js.native
  
  /**
    * After initialising the plugin, you can always access the instance again using this method,
    * by just passing in the relevant input element.
    */
  def getInstance(node: Element): Plugin = js.native
  
  /**
    * Load the utils.js script (included in the lib directory) to enable
    * formatting/validation etc.
    */
  def loadUtils(path: String): Unit = js.native
  def loadUtils(path: String, utilsScriptDeferred: Boolean): Unit = js.native
  
  /**
    * Plugin version
    */
  val version: String = js.native
}
