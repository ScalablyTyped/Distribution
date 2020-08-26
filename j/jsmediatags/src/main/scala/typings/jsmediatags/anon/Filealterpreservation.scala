package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filealterpreservation extends js.Object {
  var file_alter_preservation: Boolean = js.native
  var read_only: Boolean = js.native
  var tag_alter_preservation: Boolean = js.native
}

object Filealterpreservation {
  @scala.inline
  def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): Filealterpreservation = {
    val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filealterpreservation]
  }
  @scala.inline
  implicit class FilealterpreservationOps[Self <: Filealterpreservation] (val x: Self) extends AnyVal {
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
    def setFile_alter_preservation(value: Boolean): Self = this.set("file_alter_preservation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead_only(value: Boolean): Self = this.set("read_only", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag_alter_preservation(value: Boolean): Self = this.set("tag_alter_preservation", value.asInstanceOf[js.Any])
  }
  
}

