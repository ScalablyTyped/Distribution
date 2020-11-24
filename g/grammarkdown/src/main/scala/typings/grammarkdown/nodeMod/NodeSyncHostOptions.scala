package typings.grammarkdown.nodeMod

import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.grammarkdown.hostMod.HostBaseOptions
import typings.grammarkdown.hostMod.LegacyReadFileSyncCallback
import typings.grammarkdown.hostMod.LegacyWriteFileSyncCallback
import typings.grammarkdown.hostMod.ReadFileSyncCallback
import typings.grammarkdown.hostMod.WriteFileSyncCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeSyncHostOptions extends HostBaseOptions {
  
  var allowUris: js.UndefOr[`false`] = js.native
  
  var readFileSync: js.UndefOr[LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`] = js.native
  
  var writeFileSync: js.UndefOr[LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`] = js.native
}
object NodeSyncHostOptions {
  
  @scala.inline
  def apply(): NodeSyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSyncHostOptions]
  }
  
  @scala.inline
  implicit class NodeSyncHostOptionsOps[Self <: NodeSyncHostOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUris(value: `false`): Self = this.set("allowUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUris: Self = this.set("allowUris", js.undefined)
    
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
