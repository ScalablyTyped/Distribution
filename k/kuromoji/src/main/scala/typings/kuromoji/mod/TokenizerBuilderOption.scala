package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerBuilderOption extends StObject {
  
  var dicPath: js.UndefOr[String] = js.undefined
}
object TokenizerBuilderOption {
  
  inline def apply(): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenizerBuilderOption] (val x: Self) extends AnyVal {
    
    inline def setDicPath(value: String): Self = StObject.set(x, "dicPath", value.asInstanceOf[js.Any])
    
    inline def setDicPathUndefined: Self = StObject.set(x, "dicPath", js.undefined)
  }
}
