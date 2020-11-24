package typings.magicString.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<magic-string.magic-string.SourceMapOptions> */
@js.native
trait PartialSourceMapOptions extends js.Object {
  
  var file: js.UndefOr[String] = js.native
  
  var hires: js.UndefOr[Boolean] = js.native
  
  var includeContent: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object PartialSourceMapOptions {
  
  @scala.inline
  def apply(): PartialSourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceMapOptions]
  }
  
  @scala.inline
  implicit class PartialSourceMapOptionsOps[Self <: PartialSourceMapOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHires(value: Boolean): Self = this.set("hires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHires: Self = this.set("hires", js.undefined)
    
    @scala.inline
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeContent: Self = this.set("includeContent", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
