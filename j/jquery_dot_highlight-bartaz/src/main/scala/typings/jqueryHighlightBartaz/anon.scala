package typings.jqueryHighlightBartaz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CaseSensitive extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var wordsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object CaseSensitive {
    
    @scala.inline
    def apply(): CaseSensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseSensitive]
    }
    
    @scala.inline
    implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setWordsOnly(value: Boolean): Self = StObject.set(x, "wordsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsOnlyUndefined: Self = StObject.set(x, "wordsOnly", js.undefined)
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
