package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def allowCode(): scala.Boolean = js.native
  /**
    * Set allowCode mode
    * $.views.settings.allowCode(true)
    *
    * @param {boolean}  allowCode
    * @returns {Settings}
    */
  def allowCode(allowCode: scala.Boolean): Settings = js.native
  /**
    * Get debug mode setting
    * debugMode = $.views.settings.debugMode()
    *
    * @returns {boolean}
    */
  def debugMode(): scala.Boolean = js.native
  def debugMode(
    debugMode: js.Function3[
      /* e */ js.UndefOr[js.Any], 
      /* fallback */ js.UndefOr[java.lang.String], 
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
  def debugMode(debugMode: scala.Boolean): Settings = js.native
  /**
    * Get delimiters
    * delimsArray = $.views.settings.delimiters()
    *
    * @returns {string[]}
    */
  def delimiters(): js.Array[java.lang.String] = js.native
  def delimiters(chars: js.Array[java.lang.String]): Settings = js.native
  /**
    * Set delimiters
    * $.views.settings.delimiters(...)
    *
    * @param {string}   openChars
    * @param {string}   [closeChars]
    * @param {string}   [link]
    * @returns {Settings}
    */
  def delimiters(openChars: java.lang.String): Settings = js.native
  def delimiters(openChars: java.lang.String, closeChars: java.lang.String): Settings = js.native
  def delimiters(openChars: java.lang.String, closeChars: java.lang.String, link: java.lang.String): Settings = js.native
}

