package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapOptions extends js.Object {
  
  var file: String = js.native
  
  var hires: Boolean = js.native
  
  var includeContent: Boolean = js.native
  
  var source: String = js.native
}
object SourceMapOptions {
  
  @scala.inline
  def apply(file: String, hires: Boolean, includeContent: Boolean, source: String): SourceMapOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], hires = hires.asInstanceOf[js.Any], includeContent = includeContent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOptions]
  }
  
  @scala.inline
  implicit class SourceMapOptionsOps[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
    
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
    def setHires(value: Boolean): Self = this.set("hires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeContent(value: Boolean): Self = this.set("includeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
