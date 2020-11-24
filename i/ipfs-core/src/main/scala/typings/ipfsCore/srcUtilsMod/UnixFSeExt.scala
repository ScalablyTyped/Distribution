package typings.ipfsCore.srcUtilsMod

import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixFSeExt extends js.Object {
  
  def content(): AsyncIterable[Uint8Array] = js.native
  
  var unixfs: UnixFS = js.native
}
object UnixFSeExt {
  
  @scala.inline
  def apply(content: () => AsyncIterable[Uint8Array], unixfs: UnixFS): UnixFSeExt = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), unixfs = unixfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixFSeExt]
  }
  
  @scala.inline
  implicit class UnixFSeExtOps[Self <: UnixFSeExt] (val x: Self) extends AnyVal {
    
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
    def setUnixfs(value: UnixFS): Self = this.set("unixfs", value.asInstanceOf[js.Any])
  }
}
