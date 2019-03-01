package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileMagic extends js.Object {
  var FileMagic: scala.Double
  var Sig2Kdb: scala.Double
  var Sig2Kdbx: scala.Double
}

object Anon_FileMagic {
  @scala.inline
  def apply(FileMagic: scala.Double, Sig2Kdb: scala.Double, Sig2Kdbx: scala.Double): Anon_FileMagic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FileMagic")(FileMagic)
    __obj.updateDynamic("Sig2Kdb")(Sig2Kdb)
    __obj.updateDynamic("Sig2Kdbx")(Sig2Kdbx)
    __obj.asInstanceOf[Anon_FileMagic]
  }
}

