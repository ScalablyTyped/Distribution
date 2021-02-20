package typings.gulpModernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassPrefix extends StObject {
    
    var classPrefix: String = js.native
    
    var enableClasses: Boolean = js.native
    
    var enableJSClass: Boolean = js.native
  }
  object ClassPrefix {
    
    @scala.inline
    def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): ClassPrefix = {
      val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassPrefix]
    }
    
    @scala.inline
    implicit class ClassPrefixMutableBuilder[Self <: ClassPrefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableClasses(value: Boolean): Self = StObject.set(x, "enableClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableJSClass(value: Boolean): Self = StObject.set(x, "enableJSClass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Src extends StObject {
    
    var src: js.Array[String] = js.native
  }
  object Src {
    
    @scala.inline
    def apply(src: js.Array[String]): Src = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    @scala.inline
    implicit class SrcMutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    }
  }
}
