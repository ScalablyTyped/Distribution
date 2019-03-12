package typings
package jdataviewLib.jdataviewMod.jDataViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uint64 extends js.Object {
  var hi: scala.Double
  var lo: scala.Double
}

object Uint64 {
  @scala.inline
  def apply(hi: scala.Double, lo: scala.Double, valueOf: () => scala.Double): Uint64 = {
    val __obj = js.Dynamic.literal(hi = hi, lo = lo, valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Uint64]
  }
}

