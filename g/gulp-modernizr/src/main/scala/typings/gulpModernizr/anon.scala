package typings.gulpModernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassPrefix extends StObject {
    
    var classPrefix: String
    
    var enableClasses: Boolean
    
    var enableJSClass: Boolean
  }
  object ClassPrefix {
    
    inline def apply(classPrefix: String, enableClasses: Boolean, enableJSClass: Boolean): ClassPrefix = {
      val __obj = js.Dynamic.literal(classPrefix = classPrefix.asInstanceOf[js.Any], enableClasses = enableClasses.asInstanceOf[js.Any], enableJSClass = enableJSClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassPrefix]
    }
    
    extension [Self <: ClassPrefix](x: Self) {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setEnableClasses(value: Boolean): Self = StObject.set(x, "enableClasses", value.asInstanceOf[js.Any])
      
      inline def setEnableJSClass(value: Boolean): Self = StObject.set(x, "enableJSClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait Src extends StObject {
    
    var src: js.Array[String]
  }
  object Src {
    
    inline def apply(src: js.Array[String]): Src = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Src]
    }
    
    extension [Self <: Src](x: Self) {
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
}
