package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  def xcaps_del(uri: java.lang.String, path: java.lang.String): scala.Double
  def xcaps_get(uri: java.lang.String, path: java.lang.String): scala.Double
  def xcaps_put(uri: java.lang.String, path: java.lang.String, pbody: java.lang.String): scala.Double
}

object Anon_Path {
  @scala.inline
  def apply(
    xcaps_del: (java.lang.String, java.lang.String) => scala.Double,
    xcaps_get: (java.lang.String, java.lang.String) => scala.Double,
    xcaps_put: (java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(xcaps_del = js.Any.fromFunction2(xcaps_del), xcaps_get = js.Any.fromFunction2(xcaps_get), xcaps_put = js.Any.fromFunction3(xcaps_put))
  
    __obj.asInstanceOf[Anon_Path]
  }
}

