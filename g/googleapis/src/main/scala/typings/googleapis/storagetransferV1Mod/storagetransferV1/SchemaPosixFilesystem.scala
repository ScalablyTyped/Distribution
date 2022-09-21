package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosixFilesystem extends StObject {
  
  /**
    * Root directory path to the filesystem.
    */
  var rootDirectory: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosixFilesystem {
  
  inline def apply(): SchemaPosixFilesystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixFilesystem]
  }
  
  extension [Self <: SchemaPosixFilesystem](x: Self) {
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryNull: Self = StObject.set(x, "rootDirectory", null)
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
  }
}
