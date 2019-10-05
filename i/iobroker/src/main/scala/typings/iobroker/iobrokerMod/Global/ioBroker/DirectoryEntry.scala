package typings.iobroker.iobrokerMod.Global.ioBroker

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryEntry extends js.Object {
  var acl: js.Any
  var createdAt: Double
  var file: String
  var isDir: Boolean
   // access control list object
  var modifiedAt: Double
  var stats: Stats
}

object DirectoryEntry {
  @scala.inline
  def apply(acl: js.Any, createdAt: Double, file: String, isDir: Boolean, modifiedAt: Double, stats: Stats): DirectoryEntry = {
    val __obj = js.Dynamic.literal(acl = acl, createdAt = createdAt, file = file, isDir = isDir, modifiedAt = modifiedAt, stats = stats)
  
    __obj.asInstanceOf[DirectoryEntry]
  }
}

