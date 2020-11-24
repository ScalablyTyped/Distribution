package typings.grammarkdown.nodeMod

import typings.grammarkdown.hostMod.HostBaseOptions
import typings.grammarkdown.hostMod.LegacyReadFileCallback
import typings.grammarkdown.hostMod.LegacyReadFileSyncCallback
import typings.grammarkdown.hostMod.LegacyWriteFileCallback
import typings.grammarkdown.hostMod.LegacyWriteFileSyncCallback
import typings.grammarkdown.hostMod.ReadFileCallback
import typings.grammarkdown.hostMod.ReadFileSyncCallback
import typings.grammarkdown.hostMod.WriteFileCallback
import typings.grammarkdown.hostMod.WriteFileSyncCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostOptions extends HostBaseOptions {
  
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback] = js.native
  
  var readFileSync: js.UndefOr[ReadFileSyncCallback | LegacyReadFileSyncCallback] = js.native
  
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback] = js.native
  
  var writeFileSync: js.UndefOr[WriteFileSyncCallback | LegacyWriteFileSyncCallback] = js.native
}
object HostOptions {
  
  @scala.inline
  def apply(): HostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostOptions]
  }
  
  @scala.inline
  implicit class HostOptionsOps[Self <: HostOptions] (val x: Self) extends AnyVal {
    
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
    def setReadFile(value: ReadFileCallback | LegacyReadFileCallback): Self = this.set("readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setReadFileSync(value: ReadFileSyncCallback | LegacyReadFileSyncCallback): Self = this.set("readFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFileSync: Self = this.set("readFileSync", js.undefined)
    
    @scala.inline
    def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback): Self = this.set("writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
    
    @scala.inline
    def setWriteFileSync(value: WriteFileSyncCallback | LegacyWriteFileSyncCallback): Self = this.set("writeFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFileSync: Self = this.set("writeFileSync", js.undefined)
  }
}
