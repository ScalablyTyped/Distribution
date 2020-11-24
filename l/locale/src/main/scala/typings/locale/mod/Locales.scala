package typings.locale.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("locale", "Locales")
@js.native
/**
  * The Locales constructor takes a string compliant with the
  * [`Accept-Language` HTTP header](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4),
  * and returns a list of acceptible locales, optionally sorted in
  * descending order by quality score. Second argument is optional
  * default value used as the fallback when the best language is
  * calculated. Otherwise `locale.Locale["default"]` is used as fallback.
  */
class Locales () extends js.Object {
  def this(str: String) = this()
  def this(str: js.Array[String | Locale]) = this()
  def this(str: Locale) = this()
  def this(str: Locales) = this()
  def this(str: js.UndefOr[scala.Nothing], `def`: String) = this()
  def this(str: String, `def`: String) = this()
  def this(str: js.Array[String | Locale], `def`: String) = this()
  def this(str: Locale, `def`: String) = this()
  def this(str: Locales, `def`: String) = this()
  
  /**
    * This method takes the target locale and compares it against the
    * optionally provided list of supported locales, and returns the most
    * appropriate locale based on the quality scores of the target locale.
    * If no exact match exists (i.e. language+country) then it will
    * fallback to `language` if supported, or if the language isn't
    * supported it will return the default locale.
    *
    * @example
    * const supported = new locale.Locales(['en', 'en_US'], 'en');
    * (new locale.Locales('en')).best(supported).toString();     // 'en'
    * (new locale.Locales('en_GB')).best(supported).toString();  // 'en'
    * (new locale.Locales('en_US')).best(supported).toString();  // 'en_US'
    * (new locale.Locales('jp')).best(supported);                // supported.default || locale.Locale["default"]
    */
  def best(): Locale = js.native
  def best(locales: Locales): Locale = js.native
  
  def index(): StringDictionary[Double] = js.native
  
  def push(items: String*): Double = js.native
  
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
  
  def toJSON(): js.Array[Locale] = js.native
}
