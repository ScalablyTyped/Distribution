package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileMagic extends js.Object {
  var FileMagic: Double
  var Sig2Kdb: Double
  var Sig2Kdbx: Double
}

object Anon_FileMagic {
  @scala.inline
  def apply(FileMagic: Double, Sig2Kdb: Double, Sig2Kdbx: Double): Anon_FileMagic = {
    val __obj = js.Dynamic.literal(FileMagic = FileMagic, Sig2Kdb = Sig2Kdb, Sig2Kdbx = Sig2Kdbx)
  
    __obj.asInstanceOf[Anon_FileMagic]
  }
}

