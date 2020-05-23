package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filealterpreservation extends js.Object {
  var file_alter_preservation: Boolean
  var read_only: Boolean
  var tag_alter_preservation: Boolean
}

object Filealterpreservation {
  @scala.inline
  def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): Filealterpreservation = {
    val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filealterpreservation]
  }
}

