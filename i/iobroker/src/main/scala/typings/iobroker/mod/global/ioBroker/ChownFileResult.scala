package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.FileACL
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of chownFile */
@js.native
trait ChownFileResult extends StObject {
  
  /** Access rights */
  var acl: FileACL = js.native
  
  /** Date of creation */
  var createdAt: Double = js.native
  
  /** Name of the file or directory */
  var file: String = js.native
  
  /** Whether this is a directory or a file */
  var isDir: Boolean = js.native
  
  /** Date of last modification */
  var modifiedAt: Double = js.native
  
  /** The parent directory of the processed file or directory */
  var path: String = js.native
  
  /** File system stats */
  var stats: Stats = js.native
}
object ChownFileResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ChownFileResultMutableBuilder[Self <: ChownFileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: FileACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
