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
  
  @scala.inline
  def apply(): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncHostOptions]
  }
  
  @scala.inline
  implicit class SyncHostOptionsMutableBuilder[Self <: SyncHostOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadFileSync(value: LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
    
    @scala.inline
    def setWriteFileSync(value: LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
  }
}
