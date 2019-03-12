package typings
package localizedDashStringsLib.localizedDashStringsMod

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
  def formatString[T /* <: Formatted */](str: java.lang.String, values: (T | FormatObject[T])*): (js.Array[java.lang.String | T]) | java.lang.String
  /**
    * Return an array containing the available languages passed as props in the constructor
    */
  def getAvailableLanguages(): js.Array[java.lang.String]
  /**
    * The current interface language (could differ from the language displayed)
    */
  def getInterfaceLanguage(): java.lang.String
  /**
    *  The current language displayed (could differ from the interface language
    *  if it has been forced manually and a matching translation has been found)
    */
  def getLanguage(): java.lang.String
  /**
    * Return a string with the passed key in a different language
    * @param key
    * @param language
    * @param omitWarning
    */
  def getString(key: java.lang.String, language: java.lang.String, omitWarning: scala.Boolean): java.lang.String
  /**
    * Replace the NamedLocalization object without reinstantiating the object
    * @param props
    */
  def setContent(props: js.Any): scala.Unit
  /**
    * Can be used from ouside the class to force a particular language
    * indipendently from the interface one
    * @param language
    */
  def setLanguage(language: java.lang.String): scala.Unit
}

object LocalizedStringsMethods {
  @scala.inline
  def apply(
    formatString: (java.lang.String, /* repeated */ js.Any | FormatObject[js.Any]) => (js.Array[java.lang.String | js.Any]) | java.lang.String,
    getAvailableLanguages: () => js.Array[java.lang.String],
    getInterfaceLanguage: () => java.lang.String,
    getLanguage: () => java.lang.String,
    getString: (java.lang.String, java.lang.String, scala.Boolean) => java.lang.String,
    setContent: js.Any => scala.Unit,
    setLanguage: java.lang.String => scala.Unit
  ): LocalizedStringsMethods = {
    val __obj = js.Dynamic.literal(formatString = js.Any.fromFunction2(formatString), getAvailableLanguages = js.Any.fromFunction0(getAvailableLanguages), getInterfaceLanguage = js.Any.fromFunction0(getInterfaceLanguage), getLanguage = js.Any.fromFunction0(getLanguage), getString = js.Any.fromFunction3(getString), setContent = js.Any.fromFunction1(setContent), setLanguage = js.Any.fromFunction1(setLanguage))
  
    __obj.asInstanceOf[LocalizedStringsMethods]
  }
}

