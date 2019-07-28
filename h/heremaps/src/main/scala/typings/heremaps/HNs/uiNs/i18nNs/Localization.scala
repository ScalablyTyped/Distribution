package typings.heremaps.HNs.uiNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used for internationalization of UI components.
  */
@JSGlobal("H.ui.i18n.Localization")
@js.native
class Localization protected () extends js.Object {
  def this(locale: String) = this()
  def this(locale: String, opt_translationMap: js.Any) = this()
  /**
    * This method returns translation keys for current locale. Keys from this set can be used to get translations via translate method.
    * @returns {Array<string>}
    */
  def getKeys(): js.Array[String] = js.native
  /**
    * This method returns current locale code i.e 'en-US'
    * @returns {string} - locale code
    */
  def getLocale(): String = js.native
  /**
    * This method returns a boolean value indicating whether this localization object has a translation for the specified translation key.
    * @param key {string} - a translation key
    * @returns {boolean} - true if the key exists, otherwise false
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * This method returns translation for provided key. It throws exception if translation is not available
    * @param key {string} - a translation key
    * @returns {string} - a localized string corresponding to provided key
    */
  def translate(key: String): String = js.native
}

