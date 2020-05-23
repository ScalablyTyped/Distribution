package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmsilo extends js.Object {
  def mdump(): Double
  def mdump_uri(owner_s: String): Double
  def mstore(): Double
  def mstore_uri(owner_s: String): Double
}

object Typeofmsilo {
  @scala.inline
  def apply(
    mdump: () => Double,
    mdump_uri: String => Double,
    mstore: () => Double,
    mstore_uri: String => Double
  ): Typeofmsilo = {
    val __obj = js.Dynamic.literal(mdump = js.Any.fromFunction0(mdump), mdump_uri = js.Any.fromFunction1(mdump_uri), mstore = js.Any.fromFunction0(mstore), mstore_uri = js.Any.fromFunction1(mstore_uri))
    __obj.asInstanceOf[Typeofmsilo]
  }
}

