package typings.ipfsCore.srcUtilsMod

import typings.ipfsCore.ipfsCoreStrings.dir
import typings.ipfsCore.ipfsCoreStrings.directory
import typings.ipfsCore.ipfsCoreStrings.file
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixFS extends js.Object {
  
  def content(): AsyncIterable[Uint8Array] = js.native
  
  def fileSize(): Double = js.native
  
  var mode: Double = js.native
  
  var mtime: MTime_ = js.native
  
  var `type`: directory | file | dir = js.native
}
object UnixFS {
  
  @scala.inline
  def apply(
    content: () => AsyncIterable[Uint8Array],
    fileSize: () => Double,
    mode: Double,
    mtime: MTime_,
    `type`: directory | file | dir
  ): UnixFS = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), fileSize = js.Any.fromFunction0(fileSize), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixFS]
  }
  
  @scala.inline
  implicit class UnixFSOps[Self <: UnixFS] (val x: Self) extends AnyVal {
    
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
    def setContent(value: () => AsyncIterable[Uint8Array]): Self = this.set("content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileSize(value: () => Double): Self = this.set("fileSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: MTime_): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: directory | file | dir): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
