package typings.hastUtilParseSelector

import typings.hastUtilParseSelector.extractMod.ExtractTagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TagName[Selector /* <: String */, DefaultTagName /* <: String */] extends StObject {
    
    var tagName: ExtractTagName[Selector, DefaultTagName]
  }
  object TagName {
    
    inline def apply[Selector /* <: String */, DefaultTagName /* <: String */](tagName: ExtractTagName[Selector, DefaultTagName]): TagName[Selector, DefaultTagName] = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagName[Selector, DefaultTagName]]
    }
    
    extension [Self <: TagName[?, ?], Selector /* <: String */, DefaultTagName /* <: String */](x: Self & (TagName[Selector, DefaultTagName])) {
      
      inline def setTagName(value: ExtractTagName[Selector, DefaultTagName]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
