package typings.heremaps.global.H.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace contains functionality related to internationalization.
  */
@JSGlobal("H.ui.i18n")
@js.native
object i18n extends js.Object {
  /**
    * This class is used for internationalization of UI components.
    */
  @js.native
  class Localization protected ()
    extends typings.heremaps.H.ui.i18n.Localization {
    def this(locale: String) = this()
    def this(locale: String, opt_translationMap: js.Any) = this()
    /**
      * This method returns translation keys for current locale. Keys from this set can be used to get translations via translate method.
      * @returns {Array<string>}
      */
    /* CompleteClass */
    override def getKeys(): js.Array[String] = js.native
    /**
      * This method returns current locale code i.e 'en-US'
      * @returns {string} - locale code
      */
    /* CompleteClass */
    override def getLocale(): String = js.native
    /**
      * This method returns a boolean value indicating whether this localization object has a translation for the specified translation key.
      * @param key {string} - a translation key
      * @returns {boolean} - true if the key exists, otherwise false
      */
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /**
      * This method returns translation for provided key. It throws exception if translation is not available
      * @param key {string} - a translation key
      * @returns {string} - a localized string corresponding to provided key
      */
    /* CompleteClass */
    override def translate(key: String): String = js.native
  }
  
  /**
    * Default available locales. UI provides default translations for this set of locale codes.
    */
  val defaultLocales: js.Array[String] = js.native
}

