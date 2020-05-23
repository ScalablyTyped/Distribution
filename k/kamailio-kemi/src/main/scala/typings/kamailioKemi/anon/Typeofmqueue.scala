package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmqueue extends js.Object {
  def mq_add(mq: String, key: String, `val`: String): Double
  def mq_fetch(mq: String): Double
  def mq_pv_free(mq: String): Double
  def mq_size(mq: String): Double
}

object Typeofmqueue {
  @scala.inline
  def apply(
    mq_add: (String, String, String) => Double,
    mq_fetch: String => Double,
    mq_pv_free: String => Double,
    mq_size: String => Double
  ): Typeofmqueue = {
    val __obj = js.Dynamic.literal(mq_add = js.Any.fromFunction3(mq_add), mq_fetch = js.Any.fromFunction1(mq_fetch), mq_pv_free = js.Any.fromFunction1(mq_pv_free), mq_size = js.Any.fromFunction1(mq_size))
    __obj.asInstanceOf[Typeofmqueue]
  }
}

