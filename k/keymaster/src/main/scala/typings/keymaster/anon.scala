package typings.keymaster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TagName extends StObject {
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object TagName {
    
    @scala.inline
    def apply(): TagName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagName]
    }
    
    @scala.inline
    implicit class TagNameMutableBuilder[Self <: TagName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
