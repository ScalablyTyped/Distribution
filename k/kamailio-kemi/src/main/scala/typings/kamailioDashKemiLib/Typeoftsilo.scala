package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftsilo extends js.Object {
  def ts_append(_table: java.lang.String, _ruri: java.lang.String): scala.Double
  def ts_append_to(tindex: scala.Double, tlabel: scala.Double, _table: java.lang.String): scala.Double
  def ts_append_to_uri(tindex: scala.Double, tlabel: scala.Double, _table: java.lang.String, _uri: java.lang.String): scala.Double
  def ts_store(): scala.Double
  def ts_store_uri(puri: java.lang.String): scala.Double
}

object Typeoftsilo {
  @scala.inline
  def apply(
    ts_append: (java.lang.String, java.lang.String) => scala.Double,
    ts_append_to: (scala.Double, scala.Double, java.lang.String) => scala.Double,
    ts_append_to_uri: (scala.Double, scala.Double, java.lang.String, java.lang.String) => scala.Double,
    ts_store: () => scala.Double,
    ts_store_uri: java.lang.String => scala.Double
  ): Typeoftsilo = {
    val __obj = js.Dynamic.literal(ts_append = js.Any.fromFunction2(ts_append), ts_append_to = js.Any.fromFunction3(ts_append_to), ts_append_to_uri = js.Any.fromFunction4(ts_append_to_uri), ts_store = js.Any.fromFunction0(ts_store), ts_store_uri = js.Any.fromFunction1(ts_store_uri))
  
    __obj.asInstanceOf[Typeoftsilo]
  }
}

