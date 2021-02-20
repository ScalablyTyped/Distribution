package typings.iobroker.mod.global.ioBroker

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Add definition
@js.native
trait DirectoryEntry extends StObject {
  
  var acl: js.Any = js.native
  
  var createdAt: Double = js.native
  
  var file: String = js.native
  
  var isDir: Boolean = js.native
  
  // access control list object
  var modifiedAt: Double = js.native
  
  var stats: Stats = js.native
}
object DirectoryEntry {
  
  @scala.inline
  def apply(acl: js.Any, createdAt: Double, file: String, isDir: Boolean, modifiedAt: Double, stats: Stats): DirectoryEntry = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryEntry]
  }
  
  @scala.inline
  implicit class DirectoryEntryMutableBuilder[Self <: DirectoryEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: js.Any): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
