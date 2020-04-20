package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagHeader extends js.Object {
  var flags: TagHeaderFlags
  var major: Double
  var revision: Double
  var size: Double
  var version: String
}

object TagHeader {
  @scala.inline
  def apply(flags: TagHeaderFlags, major: Double, revision: Double, size: Double, version: String): TagHeader = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeader]
  }
}

