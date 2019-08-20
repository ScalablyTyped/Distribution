package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filealterpreservation extends js.Object {
  var file_alter_preservation: Boolean
  var read_only: Boolean
  var tag_alter_preservation: Boolean
}

object Anon_Filealterpreservation {
  @scala.inline
  def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): Anon_Filealterpreservation = {
    val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation, read_only = read_only, tag_alter_preservation = tag_alter_preservation)
  
    __obj.asInstanceOf[Anon_Filealterpreservation]
  }
}

