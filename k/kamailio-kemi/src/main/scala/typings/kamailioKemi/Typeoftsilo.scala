package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftsilo extends js.Object {
  def ts_append(_table: String, _ruri: String): Double
  def ts_append_to(tindex: Double, tlabel: Double, _table: String): Double
  def ts_append_to_uri(tindex: Double, tlabel: Double, _table: String, _uri: String): Double
  def ts_store(): Double
  def ts_store_uri(puri: String): Double
}

object Typeoftsilo {
  @scala.inline
  def apply(
    ts_append: (String, String) => Double,
    ts_append_to: (Double, Double, String) => Double,
    ts_append_to_uri: (Double, Double, String, String) => Double,
    ts_store: () => Double,
    ts_store_uri: String => Double
  ): Typeoftsilo = {
    val __obj = js.Dynamic.literal(ts_append = js.Any.fromFunction2(ts_append), ts_append_to = js.Any.fromFunction3(ts_append_to), ts_append_to_uri = js.Any.fromFunction4(ts_append_to_uri), ts_store = js.Any.fromFunction0(ts_store), ts_store_uri = js.Any.fromFunction1(ts_store_uri))
  
    __obj.asInstanceOf[Typeoftsilo]
  }
}

