package typings.jqueryDotBbq.jqueryDotBbqMod.Global.JQueryBbqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamFragment extends js.Object {
  def apply(): String = js.native
  def apply(url: String): String = js.native
  def apply(url: String, params: js.Any): String = js.native
  def apply(url: String, params: js.Any, merge_mode: Double): String = js.native
  /**
    * TODO: DESCRIBE
    *
    * @name state TODO: DESCRIBE
    */
  def ajaxCrawlable(): Boolean = js.native
  def ajaxCrawlable(state: Boolean): Boolean = js.native
  /**
    * Specify characters that will be left unescaped when fragments are created
    * or merged using <jQuery.param.fragment>, or when the fragment is modified
    * using <jQuery.bbq.pushState>. This option only applies to serialized data
    * object fragments, and not set-as-string fragments. Does not affect the
    * query string. Defaults to ",/" (comma, forward slash).
    *
    * @name chars The characters to not escape in the fragment. If unspecified, defaults to empty string (escape all characters).
    */
  def noEscape(): Unit = js.native
  def noEscape(chars: String): Unit = js.native
}

