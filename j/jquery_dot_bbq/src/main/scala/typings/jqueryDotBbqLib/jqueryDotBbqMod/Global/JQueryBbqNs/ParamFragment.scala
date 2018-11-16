package typings
package jqueryDotBbqLib.jqueryDotBbqMod.Global.JQueryBbqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamFragment extends js.Object {
  def apply(): java.lang.String = js.native
  def apply(url: java.lang.String): java.lang.String = js.native
  def apply(url: java.lang.String, params: js.Any): java.lang.String = js.native
  def apply(url: java.lang.String, params: js.Any, merge_mode: scala.Double): java.lang.String = js.native
  /**
               * TODO: DESCRIBE
               *
               * @name state TODO: DESCRIBE
               */
  def ajaxCrawlable(): scala.Boolean = js.native
  /**
               * TODO: DESCRIBE
               *
               * @name state TODO: DESCRIBE
               */
  def ajaxCrawlable(state: scala.Boolean): scala.Boolean = js.native
  /**
               * Specify characters that will be left unescaped when fragments are created
               * or merged using <jQuery.param.fragment>, or when the fragment is modified
               * using <jQuery.bbq.pushState>. This option only applies to serialized data
               * object fragments, and not set-as-string fragments. Does not affect the
               * query string. Defaults to ",/" (comma, forward slash).
               *
               * @name chars The characters to not escape in the fragment. If unspecified, defaults to empty string (escape all characters).
               */
  def noEscape(): scala.Unit = js.native
  /**
               * Specify characters that will be left unescaped when fragments are created
               * or merged using <jQuery.param.fragment>, or when the fragment is modified
               * using <jQuery.bbq.pushState>. This option only applies to serialized data
               * object fragments, and not set-as-string fragments. Does not affect the
               * query string. Defaults to ",/" (comma, forward slash).
               *
               * @name chars The characters to not escape in the fragment. If unspecified, defaults to empty string (escape all characters).
               */
  def noEscape(chars: java.lang.String): scala.Unit = js.native
}

