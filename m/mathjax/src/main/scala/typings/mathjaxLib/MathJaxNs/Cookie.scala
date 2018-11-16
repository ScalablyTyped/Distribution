package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var expires: js.UndefOr[scala.Double] = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
  /*Looks up the data for the cookie named name and merges the data into the given obj object, or returns a new
          * object containing the data.
          */
  def Get(name: java.lang.String): js.Any = js.native
  def Get(name: java.lang.String, obj: js.Any): js.Any = js.native
  /*Creates a MathJax cookie using the MathJax.HTML.Cookie.prefix and the name as the cookie name, and the
          * key:value pairs in the data object as the data for the cookie.
          */
  def Set(name: java.lang.String, data: js.Any): scala.Unit = js.native
}

