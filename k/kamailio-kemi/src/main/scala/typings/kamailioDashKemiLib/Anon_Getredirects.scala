package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Getredirects extends js.Object {
  def get_redirects(max_c: scala.Double, max_b: scala.Double): scala.Double
  def get_redirects_acc(max_c: scala.Double, max_b: scala.Double, reason: java.lang.String): scala.Double
  def get_redirects_all(): scala.Double
}

object Anon_Getredirects {
  @scala.inline
  def apply(
    get_redirects: (scala.Double, scala.Double) => scala.Double,
    get_redirects_acc: (scala.Double, scala.Double, java.lang.String) => scala.Double,
    get_redirects_all: () => scala.Double
  ): Anon_Getredirects = {
    val __obj = js.Dynamic.literal(get_redirects = js.Any.fromFunction2(get_redirects), get_redirects_acc = js.Any.fromFunction3(get_redirects_acc), get_redirects_all = js.Any.fromFunction0(get_redirects_all))
  
    __obj.asInstanceOf[Anon_Getredirects]
  }
}

