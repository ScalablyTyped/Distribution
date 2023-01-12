package typings.htmltojsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CreateClass extends StObject {
    
    var createClass: js.UndefOr[Boolean] = js.undefined
    
    /** as a string e.g. '    ' or '\t' */
    var indent: js.UndefOr[String] = js.undefined
    
    var outputClassName: js.UndefOr[String] = js.undefined
  }
  object CreateClass {
    
    inline def apply(): CreateClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateClass] (val x: Self) extends AnyVal {
      
      inline def setCreateClass(value: Boolean): Self = StObject.set(x, "createClass", value.asInstanceOf[js.Any])
      
      inline def setCreateClassUndefined: Self = StObject.set(x, "createClass", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setOutputClassName(value: String): Self = StObject.set(x, "outputClassName", value.asInstanceOf[js.Any])
      
      inline def setOutputClassNameUndefined: Self = StObject.set(x, "outputClassName", js.undefined)
    }
  }
}
