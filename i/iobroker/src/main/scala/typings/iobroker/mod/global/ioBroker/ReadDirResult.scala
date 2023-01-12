package typings.iobroker.mod.global.ioBroker

import typings.iobroker.objectsMod.global.ioBroker.EvaluatedFileACL
import typings.node.fsMod.Stats
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the return values of readDir */
trait ReadDirResult extends StObject {
  
  /** Access rights */
  var acl: js.UndefOr[EvaluatedFileACL] = js.undefined
  
  /** Date of creation */
  var createdAt: js.UndefOr[Double] = js.undefined
  
  /** Name of the file or directory */
  var file: String
  
  /** Whether this is a directory or a file */
  var isDir: Boolean
  
  /** Date of last modification */
  var modifiedAt: js.UndefOr[Double] = js.undefined
  
  /** File system stats */
  // https://github.com/ioBroker/adapter-core/issues/455
  // Sometimes the objects db just returns an empty object
  var stats: Stats | (Record[String, scala.Nothing])
}
object ReadDirResult {
  
  inline def apply(file: String, isDir: Boolean, stats: Stats | (Record[String, scala.Nothing])): ReadDirResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadDirResult] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: EvaluatedFileACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: Double): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "modifiedAt", js.undefined)
    
    inline def setStats(value: Stats | (Record[String, scala.Nothing])): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
