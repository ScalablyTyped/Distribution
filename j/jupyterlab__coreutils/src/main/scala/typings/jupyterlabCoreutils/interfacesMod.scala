package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait IChangedArgs[T, OldT, U /* <: String */] extends StObject {
    
    /**
      * The name of the changed attribute.
      */
    var name: U = js.native
    
    /**
      * The new value of the changed attribute.
      */
    var newValue: T = js.native
    
    /**
      * The old value of the changed attribute.
      */
    var oldValue: OldT = js.native
  }
  object IChangedArgs {
    
    @scala.inline
    def apply[T, OldT, U /* <: String */](name: U, newValue: T, oldValue: OldT): IChangedArgs[T, OldT, U] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChangedArgs[T, OldT, U]]
    }
    
    @scala.inline
    implicit class IChangedArgsMutableBuilder[Self <: IChangedArgs[_, _, _], T, OldT, U /* <: String */] (val x: Self with (IChangedArgs[T, OldT, U])) extends AnyVal {
      
      @scala.inline
      def setName(value: U): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: OldT): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
}
