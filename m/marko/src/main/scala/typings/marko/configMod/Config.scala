package typings.marko.configMod

import typings.marko.markoStrings.html
import typings.marko.markoStrings.vdom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var assumeUpToDate: js.UndefOr[Boolean] = js.native
  
  var autoKeyEnabled: js.UndefOr[Boolean] = js.native
  
  var checkUpToDate: js.UndefOr[Boolean] = js.native
  
  var escapeAtTags: js.UndefOr[Boolean] = js.native
  
  var ignoreUnrecognizedTags: js.UndefOr[Boolean] = js.native
  
  var output: js.UndefOr[vdom | html] = js.native
  
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  var writeToDisk: js.UndefOr[Boolean] = js.native
  
  var writeVersionComment: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAssumeUpToDate(value: Boolean): Self = this.set("assumeUpToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeUpToDate: Self = this.set("assumeUpToDate", js.undefined)
    
    @scala.inline
    def setAutoKeyEnabled(value: Boolean): Self = this.set("autoKeyEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoKeyEnabled: Self = this.set("autoKeyEnabled", js.undefined)
    
    @scala.inline
    def setCheckUpToDate(value: Boolean): Self = this.set("checkUpToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckUpToDate: Self = this.set("checkUpToDate", js.undefined)
    
    @scala.inline
    def setEscapeAtTags(value: Boolean): Self = this.set("escapeAtTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeAtTags: Self = this.set("escapeAtTags", js.undefined)
    
    @scala.inline
    def setIgnoreUnrecognizedTags(value: Boolean): Self = this.set("ignoreUnrecognizedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnrecognizedTags: Self = this.set("ignoreUnrecognizedTags", js.undefined)
    
    @scala.inline
    def setOutput(value: vdom | html): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    
    @scala.inline
    def setWriteToDisk(value: Boolean): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
    
    @scala.inline
    def setWriteVersionComment(value: Boolean): Self = this.set("writeVersionComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteVersionComment: Self = this.set("writeVersionComment", js.undefined)
  }
}
