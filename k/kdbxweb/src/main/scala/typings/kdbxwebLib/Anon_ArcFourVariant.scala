package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArcFourVariant extends js.Object {
  var ArcFourVariant: scala.Double
  var ChaCha20: scala.Double
  var Null: scala.Double
  var Salsa20: scala.Double
}

object Anon_ArcFourVariant {
  @scala.inline
  def apply(ArcFourVariant: scala.Double, ChaCha20: scala.Double, Null: scala.Double, Salsa20: scala.Double): Anon_ArcFourVariant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArcFourVariant")(ArcFourVariant)
    __obj.updateDynamic("ChaCha20")(ChaCha20)
    __obj.updateDynamic("Null")(Null)
    __obj.updateDynamic("Salsa20")(Salsa20)
    __obj.asInstanceOf[Anon_ArcFourVariant]
  }
}

