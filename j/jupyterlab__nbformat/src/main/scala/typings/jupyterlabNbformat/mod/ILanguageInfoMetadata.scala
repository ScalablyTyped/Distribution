package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageInfoMetadata extends PartialJSONObject {
  
  var codemirror_mode: js.UndefOr[String | PartialJSONObject] = js.native
  
  var file_extension: js.UndefOr[String] = js.native
  
  var mimetype: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var pygments_lexer: js.UndefOr[String] = js.native
}
object ILanguageInfoMetadata {
  
  @scala.inline
  def apply(name: String): ILanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfoMetadata]
  }
  
  @scala.inline
  implicit class ILanguageInfoMetadataOps[Self <: ILanguageInfoMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodemirror_mode(value: String | PartialJSONObject): Self = this.set("codemirror_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodemirror_mode: Self = this.set("codemirror_mode", js.undefined)
    
    @scala.inline
    def setFile_extension(value: String): Self = this.set("file_extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_extension: Self = this.set("file_extension", js.undefined)
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimetype: Self = this.set("mimetype", js.undefined)
    
    @scala.inline
    def setPygments_lexer(value: String): Self = this.set("pygments_lexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePygments_lexer: Self = this.set("pygments_lexer", js.undefined)
  }
}
