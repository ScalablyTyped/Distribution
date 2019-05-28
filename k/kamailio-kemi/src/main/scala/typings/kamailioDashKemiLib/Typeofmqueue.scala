package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmqueue extends js.Object {
  def mq_add(mq: java.lang.String, key: java.lang.String, `val`: java.lang.String): scala.Double
  def mq_fetch(mq: java.lang.String): scala.Double
  def mq_pv_free(mq: java.lang.String): scala.Double
  def mq_size(mq: java.lang.String): scala.Double
}

object Typeofmqueue {
  @scala.inline
  def apply(
    mq_add: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    mq_fetch: java.lang.String => scala.Double,
    mq_pv_free: java.lang.String => scala.Double,
    mq_size: java.lang.String => scala.Double
  ): Typeofmqueue = {
    val __obj = js.Dynamic.literal(mq_add = js.Any.fromFunction3(mq_add), mq_fetch = js.Any.fromFunction1(mq_fetch), mq_pv_free = js.Any.fromFunction1(mq_pv_free), mq_size = js.Any.fromFunction1(mq_size))
  
    __obj.asInstanceOf[Typeofmqueue]
  }
}

