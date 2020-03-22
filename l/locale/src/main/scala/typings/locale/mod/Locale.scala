package typings.locale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locale", "Locale")
@js.native
class Locale protected () extends js.Object {
  /**
    * The Locale constructor takes a
    * [language tag](http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.10)
    * string consisting of an ISO-639 language abbreviation and optional
    * two-letter ISO-3166 country code, and returns an object with a
    * `language` property containing the former and a `country` property
    * containing the latter.
    */
  def this(str: String) = this()
  /**
    * returns user-generated input used to construct the Locale. Eg, `en-US`
    */
  var code: String = js.native
  /**
    * returns the second 2 letters of the code if present, uppercased.
    * Returns `undefined` otherwise
    */
  var country: js.UndefOr[String] = js.native
  /** returns the first 2 letters of the code, lowercased */
  var language: String = js.native
  /**
    * returns the language, followed by a `_` and the country, if the
    * country is present
    */
  var normalized: String = js.native
  def toJSON(): String | Null = js.native
}

/* static members */
@JSImport("locale", "Locale")
@js.native
object Locale extends js.Object {
  /**
    * The default locale for the environment, as parsed from
    * `process.env.LANG`. This is used as the fallback when the best
    * language is calculated from the intersection of requested and
    * supported locales and supported languages has not default.
    */
  var default: Locale = js.native
}

