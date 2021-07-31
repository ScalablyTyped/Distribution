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
  
  @scala.inline
  def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit class TruncateOptionsMutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setNoBreaks(value: Boolean): Self = StObject.set(x, "noBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBreaksUndefined: Self = StObject.set(x, "noBreaks", js.undefined)
    
    @scala.inline
    def setStripTags(value: Boolean): Self = StObject.set(x, "stripTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripTagsUndefined: Self = StObject.set(x, "stripTags", js.undefined)
    
    @scala.inline
    def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
  }
}
