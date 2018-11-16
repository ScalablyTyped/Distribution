package typings
package jdataviewLib.jdataviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jdataview", "Uint64")
@js.native
class Uint64 protected ()
  extends jdataviewLib.jdataviewMod.jDataViewNs.Uint64 {
  def this(lo: scala.Double, hi: scala.Double) = this()
  /* CompleteClass */
  override var hi: scala.Double = js.native
  /* CompleteClass */
  override var lo: scala.Double = js.native
}

@JSImport("jdataview", "Uint64")
@js.native
object Uint64 extends js.Object {
  def fromNumber(number: scala.Double): jdataviewLib.jdataviewMod.jDataViewNs.Uint64 = js.native
}

