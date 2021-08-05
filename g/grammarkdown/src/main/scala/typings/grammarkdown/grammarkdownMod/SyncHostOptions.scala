package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncHostOptions
  extends StObject
     with HostBaseOptions {
  
  var readFileSync: js.UndefOr[LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`] = js.undefined
  
  var writeFileSync: js.UndefOr[LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`] = js.undefined
}
object SyncHostOptions {
  
  inline def apply(): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncHostOptions]
  }
  
  extension [Self <: SyncHostOptions](x: Self) {
    
    inline def setReadFileSync(value: LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
    
    inline def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
    
    inline def setWriteFileSync(value: LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
    
    inline def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
  }
}
