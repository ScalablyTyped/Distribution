package typings.mathjax.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var expires: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  /*Looks up the data for the cookie named name and merges the data into the given obj object, or returns a new
    * object containing the data.
    */
  def Get(name: String): js.Any = js.native
  def Get(name: String, obj: js.Any): js.Any = js.native
  /*Creates a MathJax cookie using the MathJax.HTML.Cookie.prefix and the name as the cookie name, and the
    * key:value pairs in the data object as the data for the cookie.
    */
  def Set(name: String, data: js.Any): Unit = js.native
}

