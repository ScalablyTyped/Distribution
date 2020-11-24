package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncHostOptions extends HostBaseOptions {
  
  var readFileSync: js.UndefOr[LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`] = js.native
  
  var writeFileSync: js.UndefOr[LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`] = js.native
}
object SyncHostOptions {
  
  @scala.inline
  def apply(): SyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncHostOptions]
  }
  
  @scala.inline
  implicit class SyncHostOptionsOps[Self <: SyncHostOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReadFileSync(value: LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`): Self = this.set("readFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFileSync: Self = this.set("readFileSync", js.undefined)
    
    @scala.inline
    def setWriteFileSync(value: LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`): Self = this.set("writeFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFileSync: Self = this.set("writeFileSync", js.undefined)
  }
}
