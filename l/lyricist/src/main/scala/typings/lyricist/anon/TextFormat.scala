package typings.lyricist.anon

import typings.lyricist.mod.LyricistTextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFormat extends StObject {
  
  var textFormat: js.UndefOr[LyricistTextFormat] = js.native
}
object TextFormat {
  
  @scala.inline
  def apply(): TextFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormat]
  }
  
  @scala.inline
  implicit class TextFormatMutableBuilder[Self <: TextFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextFormat(value: LyricistTextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
