package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerBuilderOption extends StObject {
  
  var dicPath: js.UndefOr[String] = js.undefined
}
object TokenizerBuilderOption {
  
  @scala.inline
  def apply(): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
  
  @scala.inline
  implicit class TokenizerBuilderOptionMutableBuilder[Self <: TokenizerBuilderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDicPath(value: String): Self = StObject.set(x, "dicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicPathUndefined: Self = StObject.set(x, "dicPath", js.undefined)
  }
}
