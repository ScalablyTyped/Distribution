package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageInfoMetadata
  extends StObject
     with PartialJSONObject {
  
  var codemirror_mode: js.UndefOr[String | PartialJSONObject] = js.undefined
  
  var file_extension: js.UndefOr[String] = js.undefined
  
  var mimetype: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var pygments_lexer: js.UndefOr[String] = js.undefined
}
object ILanguageInfoMetadata {
  
  inline def apply(name: String): ILanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfoMetadata]
  }
  
  extension [Self <: ILanguageInfoMetadata](x: Self) {
    
    inline def setCodemirror_mode(value: String | PartialJSONObject): Self = StObject.set(x, "codemirror_mode", value.asInstanceOf[js.Any])
    
    inline def setCodemirror_modeUndefined: Self = StObject.set(x, "codemirror_mode", js.undefined)
    
    inline def setFile_extension(value: String): Self = StObject.set(x, "file_extension", value.asInstanceOf[js.Any])
    
    inline def setFile_extensionUndefined: Self = StObject.set(x, "file_extension", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPygments_lexer(value: String): Self = StObject.set(x, "pygments_lexer", value.asInstanceOf[js.Any])
    
    inline def setPygments_lexerUndefined: Self = StObject.set(x, "pygments_lexer", js.undefined)
  }
}
