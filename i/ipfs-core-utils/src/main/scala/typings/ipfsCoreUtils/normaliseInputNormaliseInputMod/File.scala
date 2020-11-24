package typings.ipfsCoreUtils.normaliseInputNormaliseInputMod

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File[Content /* <: Blob | AsyncIterable[Uint8Array] */] extends Entry[Content] {
  
  var content: js.UndefOr[Content] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var mtime: js.UndefOr[typings.ipfsCoreUtils.formatMtimeMod.MTime] = js.native
  
  var path: String = js.native
}
object File {
  
  @scala.inline
  def apply[Content /* <: Blob | AsyncIterable[Uint8Array] */](path: String): File[Content] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[File[Content]]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File[_], Content /* <: Blob | AsyncIterable[Uint8Array] */] (val x: Self with File[Content]) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Content): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: typings.ipfsCoreUtils.formatMtimeMod.MTime): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
}
