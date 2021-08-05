package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostOptions
  extends StObject
     with HostBaseOptions {
  
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback] = js.undefined
  
  var readFileSync: js.UndefOr[ReadFileSyncCallback | LegacyReadFileSyncCallback] = js.undefined
  
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback] = js.undefined
  
  var writeFileSync: js.UndefOr[WriteFileSyncCallback | LegacyWriteFileSyncCallback] = js.undefined
}
object HostOptions {
  
  inline def apply(): HostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostOptions]
  }
  
  extension [Self <: HostOptions](x: Self) {
    
    inline def setReadFile(value: ReadFileCallback | LegacyReadFileCallback): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
    
    inline def setReadFileSync(value: ReadFileSyncCallback | LegacyReadFileSyncCallback): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
    
    inline def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
    
    inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    
    inline def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
    
    inline def setWriteFileSync(value: WriteFileSyncCallback | LegacyWriteFileSyncCallback): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
    
    inline def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
    
    inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
