package typings.jsdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  DISABLED :string,   SILENT :string,   STRICT :string}> */
@js.native
trait ReadonlyDISABLEDstringSIL extends js.Object {
  val DISABLED: String = js.native
  val SILENT: String = js.native
  val STRICT: String = js.native
}

object ReadonlyDISABLEDstringSIL {
  @scala.inline
  def apply(DISABLED: String, SILENT: String, STRICT: String): ReadonlyDISABLEDstringSIL = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], STRICT = STRICT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDISABLEDstringSIL]
  }
  @scala.inline
  implicit class ReadonlyDISABLEDstringSILOps[Self <: ReadonlyDISABLEDstringSIL] (val x: Self) extends AnyVal {
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
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setSILENT(value: String): Self = this.set("SILENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTRICT(value: String): Self = this.set("STRICT", value.asInstanceOf[js.Any])
  }
  
}

