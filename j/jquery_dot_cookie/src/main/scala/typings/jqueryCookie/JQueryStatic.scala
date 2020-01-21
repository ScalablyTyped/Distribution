package typings.jqueryCookie

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  @JSName("cookie")
  var cookie_Original: JQueryCookieStatic = js.native
  /**
    * Gets an object of cookies as key-value pairs
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(): StringDictionary[String] = js.native
  /**
    * Gets a cookie by name
    * @param name The name of the cookie to get
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String): js.Any = js.native
  /**
    * Gets a cookie by name after applying a conversion function to the value
    * @param name The name of the cookie to get
    * @param converter A conversion function to change the cookie's value to a different representation on the fly
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String, converter: js.Function1[/* value */ String, _]): js.Any = js.native
  /**
    * Sets a cookie
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String, value: String): Unit = js.native
  /**
    * Sets a cookie with some options
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    * @param options An object of options that change how the cookie is set
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String, value: String, options: JQueryCookieOptions): Unit = js.native
  /**
    * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String, value: js.Any): Unit = js.native
  /**
    * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    * @param options An object of options that change how the cookie is set
    */
  /**
    * A simple, lightweight jQuery plugin for reading, writing and deleting cookies.
    */
  def cookie(name: String, value: js.Any, options: JQueryCookieOptions): Unit = js.native
  /**
    * Deletes a cookie
    * @param name Name of cookie to delete
    */
  def removeCookie(name: String): Boolean = js.native
  /**
    * Deletes a cookie
    * @param name Name of cookie to delete
    * @param options The same attributes (path, domain) as what the cookie was written with
    */
  def removeCookie(name: String, options: JQueryCookieOptions): Boolean = js.native
}

