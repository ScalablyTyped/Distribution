package typings.knockoutMapping

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Copy extends StObject {
    
    var copy: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var parentName: js.UndefOr[String] = js.undefined
    
    var visitedObjects: js.UndefOr[js.Any] = js.undefined
  }
  object Copy {
    
    @scala.inline
    def apply(): Copy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Copy]
    }
    
    @scala.inline
    implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: js.Array[String]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setCopyVarargs(value: String*): Self = StObject.set(x, "copy", js.Array(value :_*))
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
      
      @scala.inline
      def setVisitedObjects(value: js.Any): Self = StObject.set(x, "visitedObjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedObjectsUndefined: Self = StObject.set(x, "visitedObjects", js.undefined)
    }
  }
}
