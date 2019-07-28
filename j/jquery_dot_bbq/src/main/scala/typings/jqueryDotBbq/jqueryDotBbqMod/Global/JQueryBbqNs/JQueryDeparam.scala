package typings.jqueryDotBbq.jqueryDotBbqMod.Global.JQueryBbqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDeparam extends js.Object {
  /**
    * Deserialize a params string into an object, optionally coercing numbers,
    * booleans, null and undefined values; this method is the counterpart to the
    * internal jQuery.param method.
    *
    * @name params A params string to be parsed.
    * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
    */
  def apply(params: String): js.Any = js.native
  def apply(params: String, coerce: Boolean): js.Any = js.native
  /**
    * Parse the fragment (hash) from a URL or the current window.location.href,
    * deserializing it into an object, optionally coercing numbers, booleans,
    * null and undefined values.
    *
    * @name url An optional params string or URL containing fragment (hash) params to be parsed. If url is omitted, the current window.location.href is used.
    * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
    */
  def fragment(): js.Any = js.native
  def fragment(url: String): js.Any = js.native
  def fragment(url: String, coerce: Boolean): js.Any = js.native
  /**
    * Parse the query string from a URL or the current window.location.href,
    * deserializing it into an object, optionally coercing numbers, booleans,
    * null and undefined values.
    *
    * @name url An optional params string or URL containing query string params to be parsed. If url is omitted, the current window.location.href is used.
    * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false if omitted.
    */
  def querystring(): js.Any = js.native
  def querystring(url: String): js.Any = js.native
  def querystring(url: String, coerce: Boolean): js.Any = js.native
}

