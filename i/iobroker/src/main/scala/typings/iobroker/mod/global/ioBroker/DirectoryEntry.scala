package typings.iobroker.mod.global.ioBroker

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Add definition
trait DirectoryEntry extends StObject {
  
  var acl: js.Any
  
  var createdAt: Double
  
  var file: String
  
  var isDir: Boolean
  
  // access control list object
  var modifiedAt: Double
  
  var stats: Stats
}
object DirectoryEntry {
  
  inline def apply(acl: js.Any, createdAt: Double, file: String, isDir: Boolean, modifiedAt: Double, stats: Stats): DirectoryEntry = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryEntry]
  }
  
  extension [Self <: DirectoryEntry](x: Self) {
    
    inline def setAcl(value: js.Any): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
