package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* $.views.settings*/
@js.native
trait Settings extends js.Object {
  
  /**
    * Get advanced settings
    * advancedSettings = $.views.settings.advanced()
    *
    * @returns {object}
    */
  def advanced(): Hash[_] = js.native
  /**
    * Set advanced settings (useViews, _jsv ...)
    * $.views.settings.advanced({useViews: true})
    *
    * @param {object}  settings
    * @returns {Settings}
    */
  def advanced(settings: Hash[_]): Settings = js.native
  
  /**
    * Get allowCode mode setting
    * allowCode = $.views.settings.allowCode()
    *
    * @returns {boolean}
    */
  def allowCode(): Boolean = js.native
  /**
    * Set allowCode mode
    * $.views.settings.allowCode(true)
    *
    * @param {boolean}  allowCode
    * @returns {Settings}
    */
  def allowCode(allowCode: Boolean): Settings = js.native
  
  /**
    * Get debug mode setting
    * debugMode = $.views.settings.debugMode()
    *
    * @returns {boolean}
    */
  def debugMode(): Boolean = js.native
  def debugMode(
    debugMode: js.Function3[
      /* e */ js.UndefOr[js.Any], 
      /* fallback */ js.UndefOr[String], 
      /* view */ js.UndefOr[View], 
      _
    ]
  ): Settings = js.native
  /**
  	 * Set debug mode
  	 * $.views.settings.debugMode(true)
  	 *
  	 * @param {boolean}  debugMode
  	 * @returns {Settings}
  	 */
  def debugMode(debugMode: Boolean): Settings = js.native
  
  /**
  	 * Get delimiters
  	 * delimsArray = $.views.settings.delimiters()
  	 *
  	 * @returns {string[]}
  	 */
  def delimiters(): js.Array[String] = js.native
  def delimiters(chars: js.Array[String]): Settings = js.native
  /**
  	 * Set delimiters
  	 * $.views.settings.delimiters(...)
  	 *
  	 * @param {string}   openChars
  	 * @param {string}   [closeChars]
  	 * @param {string}   [link]
  	 * @returns {Settings}
  	 */
  def delimiters(openChars: String): Settings = js.native
  def delimiters(openChars: String, closeChars: js.UndefOr[scala.Nothing], link: String): Settings = js.native
  def delimiters(openChars: String, closeChars: String): Settings = js.native
  def delimiters(openChars: String, closeChars: String, link: String): Settings = js.native
}
