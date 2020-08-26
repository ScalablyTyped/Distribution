package typings.heremaps.H.ui.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used for internationalization of UI components.
  */
@js.native
trait Localization extends js.Object {
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

object Localization {
  @scala.inline
  def apply(
    getKeys: () => js.Array[String],
    getLocale: () => String,
    hasKey: String => Boolean,
    translate: String => String
  ): Localization = {
    val __obj = js.Dynamic.literal(getKeys = js.Any.fromFunction0(getKeys), getLocale = js.Any.fromFunction0(getLocale), hasKey = js.Any.fromFunction1(hasKey), translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[Localization]
  }
  @scala.inline
  implicit class LocalizationOps[Self <: Localization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetKeys(value: () => js.Array[String]): Self = this.set("getKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocale(value: () => String): Self = this.set("getLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setHasKey(value: String => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslate(value: String => String): Self = this.set("translate", js.Any.fromFunction1(value))
  }
  
}

