package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNegativeKeyword extends StObject {
  
  /**
    * Required. Immutable. The negatively targeted keyword, for example `car insurance`. Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80. Maximum number of words is 10. Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is for representing whitespace between words. Leading or trailing whitespace is ignored.
    */
  var keywordValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the negative keyword.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaNegativeKeyword {
  
  inline def apply(): SchemaNegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNegativeKeyword]
  }
  
  extension [Self <: SchemaNegativeKeyword](x: Self) {
    
    inline def setKeywordValue(value: String): Self = StObject.set(x, "keywordValue", value.asInstanceOf[js.Any])
    
    inline def setKeywordValueNull: Self = StObject.set(x, "keywordValue", null)
    
    inline def setKeywordValueUndefined: Self = StObject.set(x, "keywordValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
