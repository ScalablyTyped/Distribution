package typings.iobroker.mod._Global_.ioBroker

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
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryEntry]
  }
}

