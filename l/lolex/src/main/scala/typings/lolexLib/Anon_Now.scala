package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  def now(): scala.Double
}

object Anon_Now {
  @scala.inline
  def apply(now: () => scala.Double): Anon_Now = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
  
    __obj.asInstanceOf[Anon_Now]
  }
}

