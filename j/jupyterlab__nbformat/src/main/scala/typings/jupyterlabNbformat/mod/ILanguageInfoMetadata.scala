package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
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
  implicit class ILanguageInfoMetadataMutableBuilder[Self <: ILanguageInfoMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodemirror_mode(value: String | PartialJSONObject): Self = StObject.set(x, "codemirror_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodemirror_modeUndefined: Self = StObject.set(x, "codemirror_mode", js.undefined)
    
    @scala.inline
    def setFile_extension(value: String): Self = StObject.set(x, "file_extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_extensionUndefined: Self = StObject.set(x, "file_extension", js.undefined)
    
    @scala.inline
    def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPygments_lexer(value: String): Self = StObject.set(x, "pygments_lexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPygments_lexerUndefined: Self = StObject.set(x, "pygments_lexer", js.undefined)
  }
}
