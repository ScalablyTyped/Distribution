package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilealterpreservation extends js.Object {
  var file_alter_preservation: Boolean
  var read_only: Boolean
  var tag_alter_preservation: Boolean
}

object AnonFilealterpreservation {
  @scala.inline
  def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): AnonFilealterpreservation = {
    val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilealterpreservation]
  }
}

