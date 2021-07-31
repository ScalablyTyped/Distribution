package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsEpubBubbles extends StObject {
  
  var containsEpubBubbles: js.UndefOr[Boolean] = js.undefined
  
  var containsImageBubbles: js.UndefOr[Boolean] = js.undefined
  
  var epubBubbleVersion: js.UndefOr[String] = js.undefined
  
  var imageBubbleVersion: js.UndefOr[String] = js.undefined
}
object ContainsEpubBubbles {
  
  @scala.inline
  def apply(): ContainsEpubBubbles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsEpubBubbles]
  }
  
  @scala.inline
  implicit class ContainsEpubBubblesMutableBuilder[Self <: ContainsEpubBubbles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsEpubBubbles(value: Boolean): Self = StObject.set(x, "containsEpubBubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsEpubBubblesUndefined: Self = StObject.set(x, "containsEpubBubbles", js.undefined)
    
    @scala.inline
    def setContainsImageBubbles(value: Boolean): Self = StObject.set(x, "containsImageBubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsImageBubblesUndefined: Self = StObject.set(x, "containsImageBubbles", js.undefined)
    
    @scala.inline
    def setEpubBubbleVersion(value: String): Self = StObject.set(x, "epubBubbleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpubBubbleVersionUndefined: Self = StObject.set(x, "epubBubbleVersion", js.undefined)
    
    @scala.inline
    def setImageBubbleVersion(value: String): Self = StObject.set(x, "imageBubbleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBubbleVersionUndefined: Self = StObject.set(x, "imageBubbleVersion", js.undefined)
  }
}
