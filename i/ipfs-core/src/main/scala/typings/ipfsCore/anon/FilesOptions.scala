package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.Files_
import typings.ipfsCore.initMod.PreloadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesOptions extends js.Object {
  
  var files: Files_ = js.native
  
  var options: js.UndefOr[PreloadOptions] = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
}
object FilesOptions {
  
  @scala.inline
  def apply(files: Files_, preload: typings.ipfsCore.componentsMod.Preload): FilesOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesOptions]
  }
  
  @scala.inline
  implicit class FilesOptionsOps[Self <: FilesOptions] (val x: Self) extends AnyVal {
    
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
    def setFiles(value: Files_): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: PreloadOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
