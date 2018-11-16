package typings
package jqueryDotBbqLib.jqueryDotBbqMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryParam extends js.Object {
  @JSName("fragment")
  var fragment_Original: jqueryDotBbqLib.jqueryDotBbqMod.Global.JQueryBbqNs.ParamFragment = js.native
  def fragment(): java.lang.String = js.native
  def fragment(url: java.lang.String): java.lang.String = js.native
  def fragment(url: java.lang.String, params: js.Any): java.lang.String = js.native
  def fragment(url: java.lang.String, params: js.Any, merge_mode: scala.Double): java.lang.String = js.native
  /**
           * Parse the query string from a URL or the current window.location.href,
           * deserializing it into an object, optionally coercing numbers, booleans,
           * null and undefined values.
           *
           * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
           * @name coerce (Boolean) If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
           * @name merge_mode An object representing the deserialized params string.
           */
  def querystring(): java.lang.String = js.native
  /**
           * Parse the query string from a URL or the current window.location.href,
           * deserializing it into an object, optionally coercing numbers, booleans,
           * null and undefined values.
           *
           * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
           * @name coerce (Boolean) If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
           * @name merge_mode An object representing the deserialized params string.
           */
  def querystring(url: java.lang.String): java.lang.String = js.native
  def querystring(url: java.lang.String, coerce: js.Any): java.lang.String = js.native
  def querystring(url: java.lang.String, coerce: js.Any, merge_mode: scala.Double): java.lang.String = js.native
  /**
           * Parse the query string from a URL or the current window.location.href,
           * deserializing it into an object, optionally coercing numbers, booleans,
           * null and undefined values.
           *
           * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
           * @name coerce (Boolean) If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
           * @name merge_mode An object representing the deserialized params string.
           */
  def querystring(url: java.lang.String, coerce: scala.Boolean): java.lang.String = js.native
  /**
           * Parse the query string from a URL or the current window.location.href,
           * deserializing it into an object, optionally coercing numbers, booleans,
           * null and undefined values.
           *
           * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
           * @name coerce (Boolean) If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
           * @name merge_mode An object representing the deserialized params string.
           */
  def querystring(url: java.lang.String, coerce: scala.Boolean, merge_mode: scala.Double): java.lang.String = js.native
  /**
           * Returns a params string equivalent to that returned by the internal
           * jQuery.param method, but sorted, which makes it suitable for use as a
           * cache key.
           *
           * @name obj An object to be serialized.
           * @name traditional Params deep/shallow serialization mode. See the documentation at http://api.jquery.com/jQuery.param/ for more detail.
           */
  def sorted(obj: js.Any): java.lang.String = js.native
  /**
           * Returns a params string equivalent to that returned by the internal
           * jQuery.param method, but sorted, which makes it suitable for use as a
           * cache key.
           *
           * @name obj An object to be serialized.
           * @name traditional Params deep/shallow serialization mode. See the documentation at http://api.jquery.com/jQuery.param/ for more detail.
           */
  def sorted(obj: js.Any, traditional: scala.Boolean): java.lang.String = js.native
}

