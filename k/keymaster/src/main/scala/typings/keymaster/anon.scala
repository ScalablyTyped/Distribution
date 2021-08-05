package typings.keymaster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TagName extends StObject {
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object TagName {
    
    inline def apply(): TagName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagName]
    }
    
    extension [Self <: TagName](x: Self) {
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
