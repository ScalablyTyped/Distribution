package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.FileACL
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of chownFile */
trait ChownFileResult extends StObject {
  
  /** Access rights */
  var acl: FileACL
  
  /** Date of creation */
  var createdAt: Double
  
  /** Name of the file or directory */
  var file: String
  
  /** Whether this is a directory or a file */
  var isDir: Boolean
  
  /** Date of last modification */
  var modifiedAt: Double
  
  /** The parent directory of the processed file or directory */
  var path: String
  
  /** File system stats */
  var stats: Stats
}
object ChownFileResult {
  
  inline def apply(
    acl: FileACL,
    createdAt: Double,
    file: String,
    isDir: Boolean,
    modifiedAt: Double,
    path: String,
    stats: Stats
  ): ChownFileResult = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChownFileResult]
  }
  
  extension [Self <: ChownFileResult](x: Self) {
    
    inline def setAcl(value: FileACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
