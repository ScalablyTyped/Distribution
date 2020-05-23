package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileMagic extends js.Object {
  var FileMagic: Double
  var Sig2Kdb: Double
  var Sig2Kdbx: Double
}

object FileMagic {
  @scala.inline
  def apply(FileMagic: Double, Sig2Kdb: Double, Sig2Kdbx: Double): FileMagic = {
    val __obj = js.Dynamic.literal(FileMagic = FileMagic.asInstanceOf[js.Any], Sig2Kdb = Sig2Kdb.asInstanceOf[js.Any], Sig2Kdbx = Sig2Kdbx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMagic]
  }
}

