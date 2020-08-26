package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMagic extends js.Object {
  var FileMagic: Double = js.native
  var Sig2Kdb: Double = js.native
  var Sig2Kdbx: Double = js.native
}

object FileMagic {
  @scala.inline
  def apply(FileMagic: Double, Sig2Kdb: Double, Sig2Kdbx: Double): FileMagic = {
    val __obj = js.Dynamic.literal(FileMagic = FileMagic.asInstanceOf[js.Any], Sig2Kdb = Sig2Kdb.asInstanceOf[js.Any], Sig2Kdbx = Sig2Kdbx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMagic]
  }
  @scala.inline
  implicit class FileMagicOps[Self <: FileMagic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileMagic(value: Double): Self = this.set("FileMagic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig2Kdb(value: Double): Self = this.set("Sig2Kdb", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig2Kdbx(value: Double): Self = this.set("Sig2Kdbx", value.asInstanceOf[js.Any])
  }
  
}

