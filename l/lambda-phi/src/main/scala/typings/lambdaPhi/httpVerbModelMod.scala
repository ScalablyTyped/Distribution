package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpVerbModelMod {
  
  @JSImport("lambda-phi/lib/http-verb-model", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with HttpVerbModel {
    
    /* CompleteClass */
    var _methodName: js.Any = js.native
    
    /* CompleteClass */
    var _name: js.Any = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait HttpVerbModel extends StObject {
    
    var _methodName: js.Any
    
    var _name: js.Any
    
    var methodName: String
    
    var name: String
  }
  object HttpVerbModel {
    
    @scala.inline
    def apply(_methodName: js.Any, _name: js.Any, methodName: String, name: String): HttpVerbModel = {
      val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpVerbModel]
    }
    
    @scala.inline
    implicit class HttpVerbModelMutableBuilder[Self <: HttpVerbModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_methodName(value: js.Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_name(value: js.Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
