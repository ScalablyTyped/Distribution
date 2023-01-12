package typings.jqueryTruncateHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateOptions extends StObject {
  
  var ellipsis: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var noBreaks: js.UndefOr[Boolean] = js.undefined
  
  var stripTags: js.UndefOr[Boolean] = js.undefined
  
  var words: js.UndefOr[Boolean] = js.undefined
}
object TruncateOptions {
  
  inline def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
    inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNoBreaks(value: Boolean): Self = StObject.set(x, "noBreaks", value.asInstanceOf[js.Any])
    
    inline def setNoBreaksUndefined: Self = StObject.set(x, "noBreaks", js.undefined)
    
    inline def setStripTags(value: Boolean): Self = StObject.set(x, "stripTags", value.asInstanceOf[js.Any])
    
    inline def setStripTagsUndefined: Self = StObject.set(x, "stripTags", js.undefined)
    
    inline def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
