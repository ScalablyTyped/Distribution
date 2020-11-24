package typings.jsonfile.anon

import typings.jsonfile.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EOL extends js.Object {
  
  var EOL: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var flag: js.UndefOr[String] = js.native
  
  var fs: js.UndefOr[FS] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
  
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  var spaces: js.UndefOr[String | Double] = js.native
}
object EOL {
  
  @scala.inline
  def apply(): EOL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EOL]
  }
  
  @scala.inline
  implicit class EOLOps[Self <: EOL] (val x: Self) extends AnyVal {
    
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
    def setEOL(value: String): Self = this.set("EOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEOL: Self = this.set("EOL", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    
    @scala.inline
    def setFs(value: FS): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSpaces(value: String | Double): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
