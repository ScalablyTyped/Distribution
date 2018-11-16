package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Localization extends js.Object {
  /*The URL for the localization data files. This can be overridden for individual languages or domains
          * (see below). The default is [MathJax]/localization.
          */
  var directory: java.lang.String = js.native
  /*The currently selected locale, e.g., "fr". This is set by the setLocale() method, and should not be modified
          * by hand.
          */
  var locale: java.lang.String = js.native
  /*This is the main data structure that holds the translation strings. It consists of an entry for each language
          * that MathJax knows about, e.g., there would be an entry with key fr whose value is the data for the French
          * translation. Initially, these simply reference the files that define the translation data, which MathJax will
          * load when needed. After the file is loaded, they will contain the translation data as well. This is described
          * in more detail below.
          */
  var strings: js.Any = js.native
  /*This method runs the function fn with error trapping and if an asynchronous file load is performed (for loading
          * localizaton data), reruns the function again after the file loads. This lets you synchronize actions that
          * require localization with the loading of the needed data (see the section on synchronization above for
          * details). Note that the function should be one that can be run multiple times, if needed. Also note that Try()
          * can return before the fn has been completed, so you should consider fn to be running asynchronously (you can
          * use callbacks to synchronize with other actions, if needed).
          */
  def Try(spec: js.Any): scala.Unit = js.native
  /*The function (described in detail above) that returns the translated string for a given id, substituting the
          * given arguments as needed.
          */
  def `_`(id: scala.Double, message: java.lang.String, args: js.Any*): scala.Unit = js.native
  /*Defines (or adds to) the translation data for the given locale and domain. The def is the definition to be
          * merged with the current translation data (if it exists) or to be used as the complete definition (if not).
          */
  def addTranslation(locale: java.lang.String, domain: java.lang.String, `def`: js.Any): scala.Unit = js.native
  /*Get the direction needed to display text in the selected language. Returns null if no special font is
          * required.*/
  def fontDirection(): java.lang.String = js.native
  /*Get the font-family needed to display text in the selected language. Returns null if no special font is
          * required.
          */
  def fontFamily(): java.lang.String = js.native
  /*This causes MathJax to load the data file for the given domain in the current language, and calls the callback
          * when that is complete. If the domain is already loaded, the callback is called immediately. This lets you
          * synchronize actions that require localization with the loading of the needed data so that you are sure that
          * the needed translations are available. See the section on synchonization above for details.
          */
  def loadDomain(domain: java.lang.String): CallbackObject = js.native
  def loadDomain(domain: java.lang.String, callback: CallbackObject): CallbackObject = js.native
  /*The method that returns the localized version of the number n. This calls the locale’s number() method, if
          * there is one, otherwise it defaults to the English version.
          */
  def number(value: scala.Double): java.lang.String = js.native
  /*The method that returns the index into the list of plural texts for the value n. See the [CLDR rules]
          * (http://unicode.org/cldr/charts/supplemental/language_plural_rules.html) for more information. This calls the
          * locale’s plural() method, if there is one, otherwise it defaults to the English version.
          */
  def plural(value: js.Any): scala.Double = js.native
  /*Sets the CSS for the given div to reflect the needs of the locale. In particular, it sets the font-family,
          * if needed, and the direction (for right-to-left languages).
          */
  def setCSS(div: js.Any): js.Any = js.native
  /*Sets the selected locale to the given one*/
  def setLocale(locale: java.lang.String): scala.Unit = js.native
}

