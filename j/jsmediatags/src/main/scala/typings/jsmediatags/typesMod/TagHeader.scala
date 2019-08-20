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
    val __obj = js.Dynamic.literal(flags = flags, major = major, revision = revision, size = size, version = version)
  
    __obj.asInstanceOf[TagHeader]
  }
}

