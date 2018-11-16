package typings
package jqueryDotCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// The following jsdoc comments are used to add intellisense to editors that support it. Uses snippets
// of documentation from the Github repo when possible.
// 
// The ordering here matters. For example, the read function with the converter parameter is purposefully after
// the set function. This is because the intellisense that shows up after you press comma should be the set first,
// since that is more common, then the conversion function if user starts typing a parameter with a function type
@js.native
trait JQueryCookieStatic extends js.Object {
  /**
       * Cookie attributes can be set globally by setting properties of the $.cookie.defaults object or individually for each call to $.cookie() by passing a plain object to the options argument. Per-call options override the default options.
       */
  var defaults: js.UndefOr[JQueryCookieOptions] = js.native
  /**
       * Turn on automatic storage of JSON objects passed as the cookie value. Assumes JSON.stringify and JSON.parse
       */
  var json: js.UndefOr[scala.Boolean] = js.native
  /**
       * By default the cookie value is encoded/decoded when writing/reading, using encodeURIComponent/decodeURIComponent. Bypass this by setting raw to true:
       */
  var raw: js.UndefOr[scala.Boolean] = js.native
  /**
       * Gets an object of cookies as key-value pairs
       */
  def apply(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
       * Gets a cookie by name
       * @param name The name of the cookie to get
       */
  def apply(name: java.lang.String): js.Any = js.native
  /**
       * Gets a cookie by name after applying a conversion function to the value
       * @param name The name of the cookie to get
       * @param converter A conversion function to change the cookie's value to a different representation on the fly
       */
  def apply(name: java.lang.String, converter: js.Function1[/* value */ java.lang.String, _]): js.Any = js.native
  /**
       * Sets a cookie
       * @param name The name of the cookie to set
       * @param value The value to set the cookie to
       */
  def apply(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * Sets a cookie with some options
       * @param name The name of the cookie to set
       * @param value The value to set the cookie to
       * @param options An object of options that change how the cookie is set
       */
  def apply(name: java.lang.String, value: java.lang.String, options: JQueryCookieOptions): scala.Unit = js.native
  /**
       * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
       * @param name The name of the cookie to set
       * @param value The value to set the cookie to
       */
  def apply(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
       * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
       * @param name The name of the cookie to set
       * @param value The value to set the cookie to
       * @param options An object of options that change how the cookie is set
       */
  def apply(name: java.lang.String, value: js.Any, options: JQueryCookieOptions): scala.Unit = js.native
}

