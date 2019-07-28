package typings.localizedDashStrings.localizedDashStringsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedStringsMethods extends js.Object {
  /**
    * Format the passed string replacing the numbered placeholders
    * i.e. I'd like some {0} and {1}, or just {0}
    * Use example:
    *   strings.formatString(strings.question, strings.bread, strings.butter)
    */
  def formatString[T /* <: Formatted */](str: String, values: (T | FormatObject[T])*): (js.Array[String | T]) | String
  /**
    * Return an array containing the available languages passed as props in the constructor
    */
  def getAvailableLanguages(): js.Array[String]
  /**
    * The current interface language (could differ from the language displayed)
    */
  def getInterfaceLanguage(): String
  /**
    *  The current language displayed (could differ from the interface language
    *  if it has been forced manually and a matching translation has been found)
    */
  def getLanguage(): String
  /**
    * Return a string with the passed key in a different language
    * @param key
    * @param language
    * @param omitWarning
    */
  def getString(key: String, language: String, omitWarning: Boolean): String
  /**
    * Replace the NamedLocalization object without reinstantiating the object
    * @param props
    */
  def setContent(props: js.Any): Unit
  /**
    * Can be used from ouside the class to force a particular language
    * indipendently from the interface one
    * @param language
    */
  def setLanguage(language: String): Unit
}

object LocalizedStringsMethods {
  @scala.inline
  def apply(
    formatString: (String, /* repeated */ js.Any | FormatObject[js.Any]) => (js.Array[String | js.Any]) | String,
    getAvailableLanguages: () => js.Array[String],
    getInterfaceLanguage: () => String,
    getLanguage: () => String,
    getString: (String, String, Boolean) => String,
    setContent: js.Any => Unit,
    setLanguage: String => Unit
  ): LocalizedStringsMethods = {
    val __obj = js.Dynamic.literal(formatString = js.Any.fromFunction2(formatString), getAvailableLanguages = js.Any.fromFunction0(getAvailableLanguages), getInterfaceLanguage = js.Any.fromFunction0(getInterfaceLanguage), getLanguage = js.Any.fromFunction0(getLanguage), getString = js.Any.fromFunction3(getString), setContent = js.Any.fromFunction1(setContent), setLanguage = js.Any.fromFunction1(setLanguage))
  
    __obj.asInstanceOf[LocalizedStringsMethods]
  }
}

